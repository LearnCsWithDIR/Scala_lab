object Q2 {

    def main(args: Array[String]): Unit = {
      PatternMatching(args(0).toInt)
    }

    def PatternMatching(number: Int): Unit = {
      println()
      println(numberChecker(number))
    }

    def numberChecker(number: Int): String = number match {
      case n if number <= 0 =>
        "Negative/Zero is input"
      case n if number % 2 == 0 =>
        "Even number is given"
      case _ =>
        "Odd number is given"
    }

  
}
