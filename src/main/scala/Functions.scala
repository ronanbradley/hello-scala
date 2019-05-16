object Functions extends App {

  //Simplest definition with and without type
  def doSomething = println("I did something!")

  def doSomething2: Unit = println("I did something!")

  //we can call parameter-less functions without braces:
  doSomething
  doSomething2

  //simple function with type
  def returnAnInt: Int = 8

  println("I returned an int: " + returnAnInt)

  //function that takes parameters
  def funcWithNamedParams(myInt: Int, myString: String): Unit = {
    println(myString)
  }

  //we pass a function with params inside braces in the order the appear in the defintion
  funcWithNamedParams(1, "hello")
  //we can also name the params to help readability - especially useful for larger function definitions
  funcWithNamedParams(myInt = 1, myString = "hello")

  //function that takes parameters and returns an int value
  //note: a non-unit function will return the value of the last line
  def addTen(myInt: Int): Int = {
    myInt + 10
  }

  val myVal:Int = addTen(1)
  println(addTen(myVal))


  //We can make functions generic to take different types
  def printMyThing[A](myThing: A): Unit = {
    println(myThing)
  }


  printMyThing[String]("I printed a string!")
  printMyThing[Int](1)


  //We can make it take more than  one generic type and return a generic type also
  def printOneThingAndReturnTheOther[A, B](mything: A, myThing2: B): B = {
    println(mything)
    myThing2
  }

  val myBoolean: Boolean = printOneThingAndReturnTheOther[Int, Boolean](5, true)


  //Functions can be made to take an unspecfied number of args of a particular type
  def iTakeAnUndefinedNumberOfArgs(allTheInts: Int*): Unit = {
    allTheInts.foreach(println)
  }

  iTakeAnUndefinedNumberOfArgs(1, 2, 4, 5, 2, 5, 1)

  //This can also be generic
  def printAllTheThings[A](allTheThings: A*): Unit = {
    allTheThings.foreach(println)
  }

  printAllTheThings[String]("I'm", "Printing", "All", "The", "Strings")
  printAllTheThings[Boolean](true, false, false, true, true)


  //functions can also be assigned to values

  val inflateProfit = addTen _

  println("Inflating profit: "+ inflateProfit(1))






}
