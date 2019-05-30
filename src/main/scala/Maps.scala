import scala.collection.mutable.Map

object Maps extends App{

  // Immutable map:
  val staff = Map(1 -> "Tom", 2 -> "Tim", 3 -> "Jenny")
  val staff2 = Map(10 -> "Geoff", 7 -> "Sara")

  // Print out some info from the staff map:
  println("Keys: " + staff.keys)
  println("Values: " + staff.values)
  println("IsEmpty: " + staff.isEmpty)
  // Concatenate two maps with the ++ operator:
  val staffConcat = staff ++ staff2
  println("All staff: " + staffConcat.values)
  // Access values by key:
  println("Element with key 1: " + staffConcat(1))
  println("Element with key 7: " + staffConcat(7))

  // The following will throw an exception because the key // does not exist:
  // println("Element with key 12: " + staffConcat(12))
  // To check if a key exists:
  if(staffConcat.contains(12))
    println("Element with key 12: " + staffConcat(12))
  else
    println("Element with key 12: Does not exist!")



//mutable maps
  // Create a new map object:
  val mutableStaff: Map[Int, String] = Map()
  // Adding tuples (key/value pairs) to a map with +=
  mutableStaff += (5 -> "Teddy")
  mutableStaff += (1 -> "Rene")
  mutableStaff += new Tuple2(3, "Ronnie")
  // Print out some info on the map:
  println("Keys: " + mutableStaff.keys)
  println("Values: " + mutableStaff.values)
  println("IsEmpty? " + mutableStaff.isEmpty)
  // To remove an item by key:
  mutableStaff -= 5
  println(staff) // Teddy got fired!
  mutableStaff += (5 -> "Dean") // Dean took Teddy's old key.


}
