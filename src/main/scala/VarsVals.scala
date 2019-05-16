
//demonstrating basics of var and val
object VarsVals extends App {

  // Create a variable called myVariable.
  var myVariable = 0
  // Create a value called myValue.
  val myValue = 0
  // We can change the value that myVariable points to:
  myVariable = 10

  // But we can't change a val! The following line is an error!
  //myValue = 10

}

//Demonstrating types
object VarsVals2 extends App {

  var myInt: Int = 0

  val myString: String = "hello"

  val myDouble: Double = 3.4

  //Note: L in definition
  val myLong: Long = 1235253251532536362L

  //Note: F in definition
  val myFloat: Float = 3.2425291052F

  //keywords can be overridden with backticks,
  //but to aid clarity avoid unless necessary
  val `val`: String = "Just because you can do it, doesn't mean you should"

  //scala is case sensitive
  val scalaiscasesensitive: String = "im a string"
  val scalaIsCaseSensitive: String = "im a different string"
  val SCALAISCASESENSITIVE: String = "im another different string"


}