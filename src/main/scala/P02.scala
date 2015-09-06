package org.p99.scala
import org.p99.scala.P01.last
object P02 {
  /*
 * Find the last but one element of a list.
 * e.x.
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 */
  def penultimate[A](someList: List[A]): A = {
    someList match {
      // something called h :: something :: noMoreList
      // could get the third last element by having additional _ placehoders
      case h :: _ :: Nil => h
      // something :: theRestOfTheList, tail is just a variable
      // Means we aren't at the end of the list
      case _ :: tail     => penultimate(tail)
      // default case
      case _             => throw new NoSuchElementException
    }
  }
}
