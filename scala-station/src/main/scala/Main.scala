package trainstation

import java.nio.file.{Paths, Files}
import java.nio.charset.StandardCharsets
import org.apache.pekko
import pekko.actor.{ActorSystem, Actor, ActorLogging, ActorRef, Props}
import scala.io.StdIn.readLine
import java.util.HashMap

case class Schedule(list: Map[String, List[Station]])
case class Tour(stations: List[Station])
case object Endstations

class Distributor(drivers: List[ActorRef]) extends Actor with ActorLogging {
  def receive: Receive = {
    case Schedule(list) =>
      println("Choose Tour:")
      val input = "gryf"
      val tour = list.find(_._1 == input) 
      tour match
        case Some((key, stations)) => 
          drivers.head ! Tour(stations)
        case None => log.info("Train not found")
  }
}

class TrainDriver(system: ActorSystem) extends Actor with ActorLogging {
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
      system.terminate()
  }
}

@main
def mainProg: Unit = {
  val system = ActorSystem("TrainStation")
  val kacper = system.actorOf(Props(new TrainDriver(system)), "Kacper")
  val maszyniści = List(kacper)
  val distributor = system.actorOf(Props(new Distributor(maszyniści)), "distributor")
  import trainstation.schedules as trasa
  distributor ! Schedule(trasa)
}
