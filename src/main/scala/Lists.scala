object Lists extends App {

  // List of 3 integers:
  var integerList: List[Int] = List(100, 101, 102)
  // List of strings:
  var capitalCities: List[String] = List("Melbourne",
    "Hobart",
    "Brisbane",
    "Sydney")

  // Print out the items of a list (one line):
  println(capitalCities)

  // Traverse a list:
  for (i <- integerList)
    println(i)

  //alternative
  integerList.foreach(println)


  // Empty list:
  var anEmptyList = Nil
  // List with cons(:: - construct) and Nil (denotes end of list)
  var directions = "North" :: "South" :: "East" :: "West" :: Nil

  // Create a list of 100 integers from 1 to 100:
  var rangeList = List.range(1, 100)
  // List filled with 10 copies of String 'Empty'
  var filledList = List.fill(10)("Empty")


  println("First element of directions: " + directions.head)
  println("Final element of directions: " + directions.tail)
  println("Directions is empty? " + directions.isEmpty)
  println("anEmptyList is empty? " + anEmptyList.isEmpty)


  //2 dimensional list (a list of lists)
  var twoDList = List(
    List(1, 2, 3),
    List(4, 5, 6),
    List(7, 8, 9)
  )

  twoDList.foreach(_.foreach(println))

  //for numbers 0-9 produce a list of even or odd
  val tabulatedList= List.tabulate(10)(n=>
    if(n % 2 == 0) "" + n + " is even"
    else "" + n + " is odd")

  tabulatedList.foreach(println)



  // Create some lists
  var list1 = List(1, 2, 3)
  var list2 = List(4, 5, 6)
  // Concatenate list1 and list2
  var list3 = list1 ::: list2
  // Print 1, 2, 3, 4, 5, 6
  for(i <- list3) println(i)

//folding
  // Define a list:
  val myList = List(1, 2, 3, 4, 5)
  // Define the sum with foldLeft (starting at x=0 as initial value)
  var sum = myList.foldLeft(0)((x,y) => x+y)
//  note: we can also do
  var sum2 = myList.sum
  // Output the total:
  println("Sum is: " + sum)


}