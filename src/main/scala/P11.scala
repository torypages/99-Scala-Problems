package org.p99.scala
/*
* Modified run-length encoding.
* Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
* Example:
*
* scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
* res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
*
*/

object P11 {
  def encodeModified[A](ls: List[Any]): List[Either[Any, (Int, Any)]] = {
    val counted: List[(Int, Any)] = P10.encode(ls)
    counted.map(x => {if (x._1 == 1) Left(x._2) else Right(x)})
  }
}
