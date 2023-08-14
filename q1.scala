object BankInterestCalculator {
  def calculateInterest(depositAmount: Double): Double = {

    if (depositAmount <= 20000) {
      depositAmount * 0.02 
    } else if (depositAmount <= 200000) {
      depositAmount * 0.04 
    } else if (depositAmount <= 2000000) {
      depositAmount * 0.035 
    } else {
      depositAmount * 0.065 
    }
  }

  def main(args: Array[String]): Unit = {
    val depositAmount = 50000.0
    val interest = calculateInterest(depositAmount)
    println(s"The interest earned for Rs. $depositAmount is Rs. $interest")
  }
}