package org.p99.scala

object P07 {
  /*
  * Flatten a nested list structure.
  * Example:
  * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  *
  * acc: List()
  * l: List(List(1, 1), 2, List(3, List(5, 8)))
  * case3
  *
  * acc: List(1, 1)
  * l: List(2, List(3, List(5, 8)))
  * case4
  *
  * acc: List(1, 1, 2)
  * l: List(List(3, List(5, 8)))
  * case2
  *
  * acc: List(1, 1, 2)
  * l: List(3, List(5, 8))
  * case4
  *
  * acc: List(1, 1, 2, 3)
  * l: List(List(5, 8))
  * case2
  *
  * acc: List(1, 1, 2, 3)
  * l: List(5, 8)
  * case4
  *
  * acc: List(1, 1, 2, 3, 5)
  * l: List(8)
  * case4
  *
  * acc: List(1, 1, 2, 3, 5, 8)
  * l: List()
  * case1
  *
  */

  def flatten[Any](ls: List[Any]): List[Any] = {
    def _flatten(acc: List[Any], l: List[Any]): List[Any] = {
      println("")
      println("acc: " + acc)  // Stuff we have flattened
      println("l: " + l)  // Stuff left to flatten

      l match {
        // Nothing else to do, just return what we have flattened thus far.
        case Nil                       => println("case1"); acc
        // There is nothing really to flatten here, just make note of what has already
        // been flattened and peel off of of the layers of the onion.
        case (head: List[Any]) :: Nil  => println("case2"); _flatten(acc, head)
        // With the two below, concatenate using the appropriate means and then pass
        // the tail in as being "more stuff to flatten"
        case (head: List[Any]) :: tail => println("case3"); _flatten(acc ::: head, tail)
        case head :: tail              => println("case4"); _flatten(acc :+ head, tail)
      }
    }
    _flatten(Nil, ls)
  }
}
