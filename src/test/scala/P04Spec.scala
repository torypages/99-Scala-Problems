package org.p99.scala

import org.scalatest._

class P04Spec extends UnitSpec {
  "length" should "count the number of items in a list" in {
    assert(6 == P04.length(List("a", "b", "c", "jake", "g", "l")))
  }
  "length" should "handle an empty list" in {
    assert(0 == P04.length(List()))
  }
}

