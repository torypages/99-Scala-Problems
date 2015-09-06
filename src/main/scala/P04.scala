package org.p99.scala

object P04 {
  /*
   * Find the number of elements of a list.
   * Example:
   * scala> length(List(1, 1, 2, 3, 5, 8))
   * res0: Int = 6
   *
   */
  def length(x: List[Any]): Int = {
    x.foldLeft(0)((acc: Int, _: Any) => acc + 1)
  }
}
