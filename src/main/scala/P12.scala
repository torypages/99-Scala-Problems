package org.p99.scala

/*
 * Decode a run-length encoded list.
 * Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
 * Example:
 *
 * scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
 * res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
 *
 * Apparently there is a function List.make that does something similar to my for loop
 */

object P12 {
  def decode(ls: List[(Int, Any)]): List[Any] = {
    ls.flatMap(x => (for (i <- List.range(0, x._1)) yield x._2))
  }
}
