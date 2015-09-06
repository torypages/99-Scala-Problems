package org.p99.scala

import org.scalatest._

class P12Spec extends UnitSpec {

  // TODO
  "decode" should "expand the list of lists from P10" in {
    val actual = P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(actual == expected)
  }
}

