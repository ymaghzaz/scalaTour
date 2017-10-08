object Main extends App {
  println("hello ,world");

  /** Expressions */
  /** 1- values
    val to reference to values
    values can not be re-assigned **/
  val x: Int = 1 + 1;
  println("values x :", x);

  /** 2- variables
   in the other hande to create variable
  you use var keyword **/
  var m: Int = 6;
  m = 2;
  println("variable m :", m * m);

  /** Blocks */
  println({
    var p = 5 + 2;
    p + 1
  }) //return 8 cool

  /** Functions
      Functions are expressions that take parameters.
    */
  var increment = (gama: Int) => gama + 1;
  println(increment(5)); // 6 god job :p

  val add = (x: Int, y: Int) => {
    var a = x + y;
    a + 1;
  }
  println(add(1, 1));

  /** Methods
      Methods are defined with the def keyword.
      def is followed by a name, parameter lists, a return type, and a body.
    */
  def concatDot(w: String, m: String): String = w + "." + m;
  println(concatDot("youssef", "mag"));

  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int =
    (x + y) * multiplier
  println(addThenMultiply(1, 2)(3)) // 9

  /** Classes */
  class Protocol(name: String) {
    def config(): String = {
      name + " : config done";
    }
    def Init(): Unit = "int";
  }
  val http = new Protocol("http");
  println(http.config());

  /**
    case Class
    */
  case class Point(x: Int, y: Int);
  val point = Point(1, 2);
  val anotherPoint = Point(1, 2);
  val yetAnotherPoint = Point(2, 2);
  if (point == anotherPoint) {
    println(point + " and " + anotherPoint + " are the same.")
  } else {
    println(point + " and " + anotherPoint + " are different.")
  } // Point(1,2) and Point(1,2) are the same.

  if (point == yetAnotherPoint) {
    println(point + " and " + yetAnotherPoint + " are the same.")
  } else {
    println(point + " and " + yetAnotherPoint + " are different.")
  } // Point(1,2) and Point(2,2) are different.

  /***
      Objects
    */
  object IdFactory {
    private var counter = 0
    def create(): Int = {
      counter += 1
      counter
    }
  }
  val newId: Int = IdFactory.create()
  println(newId) // 1
  val newerId: Int = IdFactory.create()
  println(newerId) // 2

}
