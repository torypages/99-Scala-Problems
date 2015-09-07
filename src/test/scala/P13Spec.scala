package org.p99.scala

import org.scalatest._

class P13Spec extends UnitSpec {

  // TODO

  "encodeDirect" should "directly encode a list of A to a list of (#, A)" in {
    val actual = P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

    assert(actual == expected)
    assert(P13.encodeDirect(List()) == List())
  }

}

