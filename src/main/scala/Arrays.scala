object Arrays extends App {

  // Array of 5 Ints
  val myIntArray: Array[Int] = new Array[Int](5)
  // Array of 10 Doubles
  var myDoubleArray = new Array[Double](10)
  // Array of 3 Strings
  val myStringArray = new Array[String](3)

  //setting elements of the array, note zero indexed!
  myIntArray(0) = 1
  myIntArray(1) = 2
  myIntArray(2) = 3
  myIntArray(3) = 4
  myIntArray(4) = 5

  for(x <- myIntArray){
    println(x)
  }
  //shorter way
  myIntArray.foreach(println)

  //elements within a val or var array are variable
  myIntArray(0) = 1

  var myNewIntArray: Array[Int] = new Array[Int](5)

//  val arrays cannot be assigned to point to other arrays
//  myIntArray = myNewIntArray illegal!

  // Declare a 2D array of Int
  val array2D = Array.ofDim[Int](5, 5)
  // Set elements in the array:
  array2D(2)(0) = 100
  array2D(3)(4) = 99


//for loop
  for(row <- array2D; value <- row ){
    println(value)
  }

  //foreach equivalent
  array2D.foreach(
    row => row.foreach(
      value => println(value)
    )
  )

  //shorthand foreach equivalent
  array2D.foreach(_.foreach(println))



}
