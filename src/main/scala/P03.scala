package org.p99.scala

object P03 {
  /*
   * Find the Kth element of a list.
   * By convention, the first element in the list is element 0.
   * Example:

   * scala> nth(2, List(1, 1, 2, 3, 5, 8))
   * res0: Int = 2
  */

  def kthElement[A](k: Int, someList: List[A]): A = {
    def helper(count: Int, currList: List[A]): A = {
      currList match {
        case _ :: tail if count > 0  => helper(count - 1, tail)
        case x :: tail if count == 0 => x
        case x :: Nil if count == 0  => x
        case _                       => throw new NoSuchElementException
      }
    }
    helper(k, someList)
  }

  def kthElementV2[A](k: Int, someList: List[A]): A = {
    (k, someList) match {
      case (0, elem :: _) => elem
      case (_, Nil)       => throw new NoSuchElementException
      case (k, _ :: tail) => kthElementV2(k - 1, tail)
    }
  }
}
