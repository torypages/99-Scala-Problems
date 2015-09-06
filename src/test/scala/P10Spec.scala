package org.p99.scala

import org.scalatest._

class P10Spec extends UnitSpec {

  "encode" should "count the number of items in groups from p09" in {
    val actual = P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    assert(actual == expected)
  }

}

