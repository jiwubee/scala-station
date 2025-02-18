package trainstation

def calculateTime(dep: String, delay: Int): String = {
  val splited = dep.split(":").toList
  val time = List(splited(0).toInt, splited(1).toInt)
  time match {
    case List(h, m) if (m+delay > 60) => List(h + (m+delay)/60, (m+delay)%60).mkString(":")
    case List(h, m) => List(h, m+delay).mkString(":")
    case _ => None
  }
}
