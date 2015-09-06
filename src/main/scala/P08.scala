package org.p99.scala

object P08 {

  /*
   * Eliminate consecutive duplicates of list elements.
   * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
   * Example:

   * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
   * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
   *
   */

  def compress[A](ls: List[A]): List[A] = {
     ls.foldRight(List[A]()){(i: A, acc: List[A]) =>
       // Getting the head of an empty list results in an exception.
       if (!acc.isEmpty && i == acc.head) acc
       else (i :: acc)
     }
  }
}
