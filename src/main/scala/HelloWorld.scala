

// Main object definition
object HelloWorld {

  def main(args: Array[String]): Unit = {
    println("Hello world!")
  }
}

//Alternate hello world that uses the App trait
//Note: args are still available
object HelloWorld2 extends App {
  println("Hello world!")
}

