// Напишите программу, которая считает произведение трех целых чисел.

import scala.io.StdIn
object Main extends App {
  val a: Int = readInt()
  val b: Int = readInt()
  var c: Int = readInt() * b * a
  println(c)
}
