object Main extends App {
  println("hello ,world");
  // val to reference to values
  // values can not be re-assigned
  val x: Int = 1 + 1
  println("values x :", x);
  // in the other hande to create variable
  // you use var keyword
  var m: Int = 6;
  m = 2;
  println("variable m :", m * m);
  // use a blockes {}
  println({
    var p = 5+2;
    p+1 
  })//return 8
  
}
