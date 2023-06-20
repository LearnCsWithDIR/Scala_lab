object show {

  def main(args:Array[String]): Unit = {

    // display the area of disk
    println(f"Area of a Disk: ${area(5)}%1.2f");

    // display the temperature
    var x = temperature(35);
    println(s"Fahrenheit: $x");

    // display the volume of a sphere
    println(f"volume of a sphere: ${volume(5)}%1.2f");

    // display the wholeSale cost
    println(f"Total wholesale cost for 60 copies: ${wholeSalePrice()}%1.2f");

    println(s"total running time: ${totalTime()}")
  }

  // lab session Q1 answer
  def area(r: Double): Double = Math.PI * r * r;

  // lab session Q2 answer
  def temperature(x:Double): Double =x*1.8+32.0;

  // lab session Q3 answer
  def volume(r : Double): Double = 4.0/3*Math.PI*r*r*r;

  // lab session Q4 answer
  def totalBookPrice(total : Int):Double = total*24.95;

  def discount(totalAmount: Double):Double = totalAmount*(40.0/100);

  def shippingCost(x:Int):Double = 3.0*x+(x-50)*0.75;

  def wholeSalePrice():Double = totalBookPrice(60)-discount(totalBookPrice(60))+shippingCost(60);

  // lab session Q5 answer
  def pace(distance : Double):Double = distance*8;

  def tempo(distance : Double):Double = distance*7;

  def totalTime(): Double = pace(2)*2 + tempo(3);

}
