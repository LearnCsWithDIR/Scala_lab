object labsheet3
{
  def main(args: Array[String]): Unit = {

    // Q1
    println("Reversed String : "+reverseString("Hello"))

    // Q2
    val data = lengthWithList(Array("apple","Rose","induwara","Sandaruwan","dilum","Hi","ruchira"))
    print("Data length greater than 5 List : ")
    for (item <- data){
      print(item+", ")
    }

    //Q3
    println(f"\nMean (average) of the two number : ${mean(3,4)}%1.2f")

  }

  //Q1
  def reverseString(name: String): String = {
    // If head is name-last character then name-tail is empty
    if (name.isEmpty)
      ""
    else
      reverseString(name.tail) + name.head
  }


  // string revering using loop

  //  def reverseString(name:String):String = {
//    var result = "";
//    // name value read to start index = -1 to that name length
//    // read string value in reverse order then i comes max length index to 0 index
//    for (i<- name.length-1 to 0 by -1)
//          result += name(i)
//    result
//  }

  //Q2
  def lengthWithList(valueList:Array[String]):Array[String]={

    // The _ is a shorthand notation.
    // It is represents each element of the list during the filtering process.
    // new list have only length grater than 5 string values
    var newList = valueList.filter(_.length>5)
    newList
  }

  // Q3
  def mean(num1: Int, num2: Int): Float = {
    val average = ((num1 + num2) / 2.0).toFloat

    average

  }
}