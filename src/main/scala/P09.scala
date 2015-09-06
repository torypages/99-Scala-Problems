package org.p99.scala

object P09 {

  // TODO
  /*
   * Pack consecutive duplicates of list elements into sublists.
   * If a list contains repeated elements they should be placed in separate sublists.
   * Example:
   *
   * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
   * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c),
   *                                  List('a, 'a), List('d), List('e, 'e, 'e, 'e))
   *
   * I recognize that http://www.scala-lang.org/api/current/index.html
   *   #scala.collection.immutable.List@span(p:A=>Boolean):(List[A],List[A]) exists
   */

  def pack[A](ls: List[A]): List[List[A]] = {
    def _pack(acc: List[List[A]], subAcc: List[A], l: List[A]): List[List[A]] = {
      if (l.isEmpty)
        acc :+ subAcc
      else if (subAcc == Nil)
        _pack(acc, List(l.head), l.tail)
      else if (subAcc.head == l.head)
        _pack(acc, subAcc :+ l.head, l.tail)
      else
        _pack(acc :+ subAcc, Nil, l)
    }
  _pack(Nil, Nil, ls)
  }
}
