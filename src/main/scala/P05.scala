package org.p99.scala

object P05 {

  def reverse[A](ls: List[A]): List[A] = {

   /*
    * Reverse a list.
    * Example:
    * scala> reverse(List(1, 1, 2, 3, 5, 8))
    * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
    *
    */

    /*
     * List(1,2,3,4)
     *
     * acc: Nil, ls2: List(1,2,3,4) => helper(List(1) :: Nil, List(2,3,4))
     * acc: List(1), ls2: List(2,3,4) => helper(2 :: List(1), List(3,4))
     * acc: List(2,1), ls2: List(3,4) => helper(3 :: List(2,1), List(4))
     * acc: List(3,2,1), ls2: List(4) => helper(4 :: List(3,2,1), Nil)
     * acc: List(4,3,2,1), ls2: Nil => List(4,3,2,1) (just returns)
     *
     *
     */

    def helper(acc: List[A], ls2: List[A]): List[A] = {
      ls2 match {
        case Nil       => acc
        case x :: tail => helper(x :: acc, tail)
      }

    }

    helper(Nil, ls)
  }

}
