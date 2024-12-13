package trainstation

import java.util.HashMap

case class Station(name: String, arrival: Option[String], departure: Option[String]) {
  override def toString: String = {
    val arrivalStr = arrival.getOrElse("N/A")
    val departureStr = departure.getOrElse("N/A")
    s"$name, $arrivalStr, $departureStr"
  }
}

val pobrzeże: List[Station] = List(
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

val gryf = List(
  Station("Olsztyn Główny", None, Some("14:09")),
  Station("Olsztyn Zachodni", Some("14:12"), Some("14:13")),
  Station("Morąg", Some("14:47"), Some("14:48")),
  Station("Pasłęk", Some("15:12"), Some("15:13")),
  Station("Elbląg", Some("15:31"), Some("15:32")),
  Station("Malbork", Some("15:52"), Some("15:53")),
  Station("Tczew", Some("16:06"), Some("16:07")),
  Station("Gdańsk Główny", Some("16:26"), Some("16:29")),
  Station("Gdańsk Wrzeszcz", Some("16:33"), Some("16:34")),
  Station("Gdańsk Oliwa", Some("16:37"), Some("16:38")),
  Station("Sopot", Some("16:42"), Some("16:44")),
  Station("Gdynia Główna", Some("16:53"), Some("16:56")),
  Station("Rumia", Some("17:06"), Some("17:08")),
  Station("Wejherowo", Some("17:17"), Some("17:21")),
  Station("Lębork", Some("17:43"), Some("17:55")),
  Station("Słupsk", Some("18:55"), Some("19:07")),
  Station("Sławno", Some("19:25"), Some("19:26")),
  Station("Koszalin", Some("19:49"), Some("19:52")),
  Station("Białogard", Some("20:08"), Some("20:13")),
  Station("Świdwin", Some("20:41"), Some("20:42")),
  Station("Łobez", Some("20:55"), Some("20:56")),
  Station("Runowo Pomorskie", Some("21:04"), Some("21:05")),
  Station("Chociwel", Some("21:15"), Some("21:16")),
  Station("Stargard", Some("21:33"), Some("21:38")),
  Station("Szczecin Dąbie", Some("21:56"), Some("21:57")),
  Station("Szczecin Główny", Some("22:11"), None)
)

val brzydal = List(
  Station("Gdynia Główna", None, Some("10:34")),
  Station("Gdynia Orłowo", Some("10:38"), Some("10:39")),
  Station("Sopot", Some("10:42"), Some("10:43")),
  Station("Gdańsk Oliwa", Some("10:46"), Some("10:47")),
  Station("Gdańsk Wrzeszcz", Some("10:50"), Some("10:51")),
  Station("Gdańsk Główny", Some("10:55"), Some("10:57")),
  Station("Gdańsk Orunia", Some("10:59"), Some("11:00")),
  Station("Gdańsk Lipce", Some("11:02"), Some("11:02")),
  Station("Pruszcz Gdański", Some("11:06"), Some("11:07")),
  Station("Cieplewo", Some("11:09"), Some("11:09")),
  Station("Różyny", Some("11:11"), Some("11:12")),
  Station("Skowarcz", Some("11:15"), Some("11:15")),
  Station("Pszczółki", Some("11:17"), Some("11:18")),
  Station("Miłobądz", Some("11:21"), Some("11:21")),
  Station("Tczew", Some("11:26"), Some("11:42")),
  Station("Czarlin", Some("11:47"), Some("11:48")),
  Station("Subkowy Centrum", Some("11:51"), Some("11:52")),
  Station("Subkowy", Some("11:54"), Some("11:54")),
  Station("Pelplin", Some("11:59"), Some("11:59")),
  Station("Kulice Tczewskie", Some("12:03"), Some("12:03")),
  Station("Morzeszczyn", Some("12:07"), Some("12:07")),
  Station("Majewo", Some("12:10"), Some("12:11")),
  Station("Smętowo", Some("12:16"), Some("12:16")),
  Station("Twarda Góra", Some("12:21"), Some("12:22")),
  Station("Warlubie", Some("12:28"), Some("12:29")),
  Station("Laskowice Pomorskie", Some("12:38"), Some("12:39")),
  Station("Terespol Pomorski", Some("12:46"), Some("12:47")),
  Station("Parlin", Some("12:51"), Some("12:52")),
  Station("Pruszcz Pomorski", Some("12:56"), Some("12:56")),
  Station("Kotomierz", Some("13:01"), Some("13:02")),
  Station("Maksymilianowo", Some("13:08"), Some("13:09")),
  Station("Rynkowo Wiadukt", Some("13:13"), Some("13:14")),
  Station("Bydgoszcz Główna", Some("13:14"), None)
)

val schedules = Map("pobrzeże"->pobrzeże, "gryf"->gryf, "brzydal"->brzydal)