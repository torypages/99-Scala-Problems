package org.p99.scala

import org.scalatest._

class P05Spec extends UnitSpec {
  "reverse" should "reverse the list" in {
    val in = List(1,2,3,4)
    val out = List(4,3,2,1)
    assert(out == P05.reverse(in))
  }
}

