package trainstation

import java.nio.file.{Paths, Files}
import java.nio.charset.StandardCharsets
import org.apache.pekko
import pekko.actor.{ActorSystem, Actor, ActorLogging, ActorRef, Props}

case class Schedule(list: List[Array[Station]])
case class Tour(stations: Array[Station])
case object Endstations

class Distributor(drivers: List[ActorRef]) extends Actor with ActorLogging {
  def receive: Receive = {
    case Schedule(list) =>
      val stations = list.head
      drivers.head ! Tour(stations)
  }
}

class TrainDriver extends Actor with ActorLogging {
  def receive: Receive = {
    case Tour(stations) => 
      context.become(work)
      self ! Tour(stations)
  }
  def work: Receive = {
    case Tour(stations) => 
      val stations_data = stations.map(_.toString).mkString("\n")
      log.info(stations_data)
      Files.write(Paths.get("file.txt"), stations_data.getBytes(StandardCharsets.UTF_8))
  }
}

@main
def mainProg: Unit = {
  import trainstation.pobrzeże as pobrzeże
  val trasa = List(pobrzeże)
  val system = ActorSystem("TrainStation")
  val kacper = system.actorOf(Props[TrainDriver](), "Kacper")
  val maszyniści = List(kacper)
  val distributor = system.actorOf(Props(new Distributor(maszyniści)), "distributor")
  distributor ! Schedule(trasa)
}
