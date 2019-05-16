object ControlStructures extends App {

  val x = 100
  val y = 200

  def comparison(x: Int, y: Int): Unit = {

    if (x < y)
      println(x + " is smaller than " + y)
    else if (x > y) { // Can use { } for multiple lines of code
      println(x + " is greater than " + y)
    }
    else // Can finish if/else if with a final else:
      println(x + " is equal to " + y)

  }

  comparison(x, y)


  //values can be made equal to an expression:

  val resultFromIf = {
    if (x < y) -1
    else if (x > y) 1
    else 0
  }
  println("The result is: " + resultFromIf)


  //for loops expressed as for(variable <- range)
  //here i is initially set to 1 and increments through to and including 10
  def printOneToTen: Unit = {
    for (i <- 1 to 10) {
      println(i)
    }
  }

  printOneToTen

  //here i is initially set to 1 and increments until (ie excluding) 10
  def printOneToNine: Unit = {
    for (i <- 1 until 10) {
      println(i)
    }
  }

  printOneToNine

  def loopThroughVariable = {
    //we can also use a variable to loop
    var myVariable: Int = 0
    // For loop with counter:
    for (myVariable <- 1 to 10) {
      // Output the for loop's myVariable:
      println("Value of counter: " + myVariable)
    }
    // Output the value of the original myVariable.
    println("Value of local myVariable: " + myVariable)
  }

  loopThroughVariable


  //rather than embedding for loops, we can define them in one top level for
  def multiRangeForLoops = {
    for (firstVal <- 1 to 10; secVal <- 1 to 10) {
      println(s"Firstval: $firstVal, Secondval: $secVal")
    }
  }

  multiRangeForLoops

  //this is equivalent to:
  //  for(firstVal <-1 to 10){
  //    for(secVal <-1 to 10){
  //      println(s"Firstval: $firstVal, Secondval: $secVal")
  //    }
  //  }


  //the same can be done with if statements
  def printEvenNumbersConditionalFor ={
    for(i <- 1 to 100 if i % 2 == 0) {
      println(i)
    }
  }

  printEvenNumbersConditionalFor


}
