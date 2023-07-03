object labsheet4 {

  def main(args: Array[String]): Unit = {

    // Q3

    // function for passed values include array
    var str_array: List[String] = List("Benny", "Niroshan", "Saman", "Kumara")
    // function names include array
    var function_array: List[String=>String] = List(toUpper, mixString, toLower, start_End_Caps);

    // All functions call for use this loop
    var i=0;
    while(i <(function_array.length)){

      println(formatFunctionNames(str_array(i), function_array(i)));
      i+=1

    }
  }

  // Q3 functions

  //String Changing Functions
  def toUpper(str: String): String = {
     str.toUpperCase();
  }

  def toLower(str: String): String = {
     str.toLowerCase();
  }

  def mixString(str: String): String = {
    var len = str.length();
    if (len > 2) {
      (str.substring(0, 2).toUpperCase() + str.substring(2, len).toLowerCase());
    }
    else {
      str.toUpperCase();
    }
  }

  def start_End_Caps(str: String): String = {
    var len = str.length();
    if (len > 2) {
       (str.substring(0, 1).toUpperCase() + str.substring(2, len - 1).toLowerCase() + str.substring(len - 1, len).toUpperCase());
    }
    else {
      str.toUpperCase();
    }
  }

  //Function which gives a functions names & that function use parameter
  def formatFunctionNames(name: String, formatFunction: String => String): String = {
    // call that functions one by one
     formatFunction(name);
  }
}
