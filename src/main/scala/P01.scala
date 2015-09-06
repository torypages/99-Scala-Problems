package org.p99.scala

object P01 {
  def last(myList: List[Int]) = {
  /*
   * Find the last element of a list.
   * e.x.
   * scala> last(List(1, 1, 2, 3, 5, 8))
   * res0: Int = 8
   */
    val lenList = myList.length
    val newPos = lenList - 1
    if (newPos >= 0) myList(newPos)
    else throw new NoSuchElementException

  }
}
