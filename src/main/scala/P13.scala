package org.p99.scala

/*
* Run-length encoding of a list (direct solution).
* Implement the so-called run-length encoding data compression method directly.
* I.e. don't use other methods you've written (like P09's pack); do all the work directly.
* Example:
*
* scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
* res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
*
* I think this could have been cleaner had I abstracted some of the functionality. The
* solution used the List.span function, I could have made my own List.span function.
*/

object P13 {

  def encodeDirect[A](ls: List[A]): List[(Int, Any)] = {
    def _encodeDirect(acc: List[(Int, Any)], subAcc: Option[(Int, Any)], l: List[A]): List[(Int, Any)] = {
      if (l.isEmpty && subAcc.isDefined) {
        acc :+ subAcc.get

      } else if (l.isEmpty) {
        acc

      } else if (!subAcc.isDefined) {
        _encodeDirect(acc, Some((1, l.head)), l.tail)

      } else if (subAcc.get._2 == l.head) {
        // Not sure how I feel about re-creating that Option several times
        _encodeDirect(acc, Some((subAcc.get._1 + 1, subAcc.get._2)), l.tail)

      } else {
        _encodeDirect(acc :+ subAcc.get, None, l)

      }
    }
    _encodeDirect(Nil, None, ls)
  }
}
