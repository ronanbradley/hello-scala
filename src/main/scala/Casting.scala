object Casting extends App {

  // Casting numerical types to other types and strings:
  var someDouble = 1.3
  println("As a float: " + someDouble.toFloat)
  println("As a char: " + someDouble.toChar)
  println("As an Int: " + someDouble.toInt)
  println("As a String: " + someDouble.toString)

  // Casting strings to numerical types:
  val myInt = "192".toInt
  val myFloat = "192.2".toFloat

}
