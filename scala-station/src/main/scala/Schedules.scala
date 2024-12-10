package trainstation

case class Station(name: String, arrival: Option[String], departure: Option[String]) {
  override def toString: String = {
    val arrivalStr = arrival.getOrElse("N/A")
    val departureStr = departure.getOrElse("N/A")
    s"$name, $arrivalStr, $departureStr"
  }
}

val pobrzeże: Array[Station] = Array(
  Station("Łódź Fabryczna", None, Some("09:28")),
  Station("Łódź Widzew", Some("09:34"), Some("09:35")),
  Station("Koluszki", Some("09:46"), Some("09:47")),
  Station("Skierniewice", Some("10:05"), Some("10:07")),
  Station("Żyrardów", Some("10:19"), Some("10:21")),
  Station("Warszawa Zachodnia", Some("10:40"), Some("10:41")),
  Station("Warszawa Centralna", Some("10:46"), Some("11:00")),
  Station("Warszawa Wschodnia", Some("11:06"), Some("11:08")),
  Station("Legionowo", Some("11:21"), Some("11:22")),
  Station("Nowy Dwór Mazowiecki", Some("11:30"), Some("11:31")),
  Station("Ciechanów", Some("11:59"), Some("12:02")),
  Station("Mława Miasto", Some("12:17"), Some("12:18")),
  Station("Działdowo", Some("12:28"), Some("12:29")),
  Station("Iława Główna", Some("12:59"), Some("13:08")),
  Station("Prabuty", Some("13:27"), Some("13:28")),
  Station("Malbork", Some("13:46"), Some("13:48")),
  Station("Tczew", Some("13:59"), Some("14:01")),
  Station("Gdańsk Główny", Some("14:17"), Some("14:20")),
  Station("Gdańsk Wrzeszcz", Some("14:24"), Some("14:25")),
  Station("Gdańsk Oliwa", Some("14:28"), Some("14:29")),
  Station("Sopot", Some("14:33"), Some("14:35")),
  Station("Gdynia Główna", Some("14:44"), Some("14:49")),
  Station("Rumia", Some("14:59"), Some("15:00")),
  Station("Wejherowo", Some("15:09"), Some("15:10")),
  Station("Lębork", Some("15:31"), Some("15:34")),
  Station("Słupsk", Some("16:45"), Some("16:46")),
  Station("Sławno", Some("17:12"), Some("17:13")),
  Station("Koszalin", Some("17:38"), Some("17:40")),
  Station("Ustronie Morskie", Some("18:05"), Some("18:06")),
  Station("Kołobrzeg", Some("18:18"), None)
)

