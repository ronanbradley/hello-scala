object DoubleEquality extends App {

  // Define two variables which are mathematically // equal:
  var a = (10.0 / 3.0)
  var b = (1.0 / 3.0) * 2.0 * 5.0
  // This will not work! Testing the exact // values of doubles for equality is often // a waste of time!
  if (a == b)
    println("The two are equal!")
  else
    println("The two are not equal...")

  // Allowing some small error using Math.abs // makes more sense. The following report // that a and b are equal:
  if (Math.abs(a - b) < 0.0001)
    println("The two are equal!")
  else
    println("The two are not equal...")

}
