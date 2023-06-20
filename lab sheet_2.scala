object labsheet2 {
    def main(args: Array[String]): Unit = {

      q1();
      q2();

      println("\nEmployee Salary : Rs." +  homeSalary(40,30));

      println("\nTicket price: "+ profit(30))
    }

  def q1():Unit={

    // Declare and initialize variables
    var k, i, j = 2;
    var m, n = 5;
    var f = 12.0;
    var g = 4.0;
    var c = "X";

    // Do calculations
    println("k + 12 * m = " + (k + 12 * m))

    println(" m / j = " + (m / j))

    println("n % j = " + n % j)

    println("m / j * j = " + m / j * j);

    println("f + 10 * 5 + g = " + f + 10 * 5 + g)

    // ++i operation is not working in scala but java can be used.
    // scala is display the compilation error.

    i += 1;
    println("i * n = " + i * n);
  }
  def q2(): Unit = {
    var (a, b, c, d: Int) = (2, 3, 4, 5)
    var k = 4.3f;

    // --b for we can use below operator and
    // d-- for we can't use another operator.
    b -= 1;
    println("\n--b * a + c * d-- = " + (b * a + c *d));
    d -=1;

    println("a++ = " + a);
    a +=1;

    println("-2 * ( d - k ) + c = "+(-2*(d-k)+c));

    println ("c = c++ : "+ (c == c));
    c +=1;
    println ("c = ++c * a++ : "+ (c == ((c+1)*a)));
    a +=1;

  }

  // Q3 problem for functions

  // employee normal working for pay in week
  def normal(normalHour: Int): Int = 250 * normalHour;

  // employee ot working for pay in week
  def ot(otHour: Int): Int = 85 * otHour;

  def Pay(normalHour:Int,otHour:Int): Int= normal(normalHour)+ot(otHour)

  def tax(income:Int):Double = income*(12.0/100)

  // final Salary
  def homeSalary(normalHour:Int,otHour:Int): Double = Pay(normalHour,otHour) - tax(Pay(normalHour,otHour))


  // Q4 problem for functions
  def attendees(price:Int):Int=120+(15-price)/5*20

  def revenue(price: Int): Int = attendees(price) * price

  def cost(price:Int):Int=500+attendees(price)

  def profit(price: Int): Int = revenue(price) - cost(price)
}

