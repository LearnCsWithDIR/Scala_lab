import scala.io.StdIn

object Tutorial05 {
  def main(args: Array[String]): Unit = {

    //Question 01
    println(" QUESTION 01 ");
    print("Enter a number: ");
    var number =StdIn.readInt();
    println("Is the input prime ? "+ prime(number));

    //Question 02
    println("\n QUESTION 02 ");
    print("All prime numbers less than the input : ");
    var value = StdIn.readInt();
    primeSeq(value);


    // Question 03
    println("\n\n QUESTION 03 ");
    print("Enter a number (n): ");
    var n = StdIn.readInt();
    println("Addition of numbers from 1 to n: "+sum(1,n));

    // Question 04
    println("\n\n QUESTION 04");
    print("Enter a number: ");
    var x = StdIn.readInt();
    println("Check whether the input number is even: "+isEven(x));

    // Question 05
    println("\n QUESTION 05");
    print("Enter a number: ");
    var y = StdIn.readInt();
    println("Addition of all even numbers less than given input: "+sumEven(y));

    // Question 06
    println("\n QUESTION 06");
    println("First n fibbonacci numbers for given Input: ");
    var z = StdIn.readInt();
    println(FibonaciSeq(z));
  }

  var i: Double = 2;

  def prime(value:Int): Boolean ={
    if(value == i){
      true;
    }
    else if(value % i ==0 ){
       false;
    }
    else{
      i = i+1;
      prime(value)
    }
  }

  //Function 02
  def primeSeq(num: Int):Unit={

    var j =2;
    if(num<2){
      print("Not less than Prime Numbers.")
    }
    else{
      while (j <= num) {
        i=2;
        if (prime(j)) {
          print(j + " ");
        }
        j = j + 1;
      }
    }

  }

  //Function 03
  def sum(n:Int ,m:Int):Int={
    if(m >= n){
       n + sum(n+1, m);
    }
    else{
      return  0;
    }
  }

  //Function 04
  def isEven(i : Int):Boolean= i match {
    case 0 => true;
    case _ => isOdd(i-1);
  }

  def isOdd(i: Int):Boolean= {
    !isEven(i);
  }

  //Function 05
  def sumEven(n : Int):Int= n match {
    case n if n <= 0   => return 0;
    case n if n%2 == 0 => n + sumEven(n-2);
    case _ => sumEven(n -1);
  }

  //Function 06
  def Fibonacci(i: Int):Int=i match {
    case 0 => 0;
    case i if (i==1) => 1;
    case _ =>Fibonacci(i-1) + Fibonacci(i-2);
  }

  def FibonaciSeq(i: Int):Unit={
    if(i > 0){
      FibonaciSeq(i - 1);
    }
     print(Fibonacci(i) + " ");

  }




}
