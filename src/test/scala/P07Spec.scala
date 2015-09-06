package org.p99.scala

import org.scalatest._

class P07Spec extends UnitSpec {
  "flatten" should "make a list out of list of lists" in {
   val x = P07.flatten(List(List(1, 1), 2, List(3, List(5, 8))))
   val expected = List(1, 1, 2, 3, 5, 8) 
   assert(expected == x)
  }

}
