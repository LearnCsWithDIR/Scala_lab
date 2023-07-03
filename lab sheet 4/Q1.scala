object Q1 {

    def main(args:Array[String]): Unit = {

      print("Enter the deposit amount : Rs. ")
      var amount: Double = scala.io.StdIn.readDouble;
      // validate the user entered value
        if (amount > 0.0) {
        findOfInterest(amount)
        }
        else {
        println("\nYou Entered value is wrong ")
        }
    }

  def findOfInterest(depositAmount:Double): Unit = {

      val returnInterest = calcInterest(depositAmount, calcInterestRate(depositAmount))
        val finalAmount = calcTotal(depositAmount, returnInterest)

        println("\nAmount Deposit\t(Rs.): " + depositAmount)
        println("Return Interest\t(Rs.): " + returnInterest)
        println("Final Amount\t(Rs.): " + finalAmount)

    }

    def calcInterestRate(amount:Double): Double = {
      var interestRate = 0.0
      if (amount > 20000000)
        interestRate = 0.065
      else if (amount > 2000000)
        interestRate = 0.035
      else if (amount > 200000)
        interestRate = 0.04
      else
        interestRate = 0.02
      return interestRate
    }

    def calcInterest(amount:Double, interestRate:Double): Double = amount * interestRate
    def calcTotal(amount:Double, interest:Double): Double = amount + interest

}
