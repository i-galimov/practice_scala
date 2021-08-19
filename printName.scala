// Считайте со входного потока имя (строку) и напечатайте "Hi, *считанное имя*!"

import scala.io.StdIn
object Main {
  def main(args: Array[String]): Unit = {
    val name = readLine()
    print("Hi, ")
    print(name)
    println("!")
  }
}
