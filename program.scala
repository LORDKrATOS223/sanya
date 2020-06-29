import scala.collection.mutable.ArrayBuffer
import scala.language.postfixOps

object program extends App {

  // вопрос 1
  var a = Array.range(0, 11)
  println(a.toList)

  // вопрос 2
  for (i <- 0 to a.length - 1 by 2)
    {
      val tmp = a(i)
      a(i) = a(i + 1)
      a(i + 1) = tmp
    }

  println(a.toList)

  // вопрос 3
  a = Array.range(0, 11)
  println({for (i <- 1 to a.length + 1 by 2; j <- (i - 1 to i reverse) if (j < a.length))  yield a(j)}.toList)


  // вопрос 4
  var list = List(-1, 2, -2, 3, 0, 5)
  val positive = list.filter(_ > 0)
  val negative = list.filterNot(_ > 0)

  val newList = positive ++ negative
  println(newList)

  // вопрос 5
  var b = Array(0.2, 0.5, 0.8)
  println(b.sum / b.length)

  // вопрос 6
  println((a.sorted.reverse).toList)

  (0 to 10).toBuffer.asInstanceOf[ArrayBuffer[Int]].sortWith(_ > _)

  //вопрос 7
  val d = List(1, 2, 2, 3)
  println(d.distinct)
}
