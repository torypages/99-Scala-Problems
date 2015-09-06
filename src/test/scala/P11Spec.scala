package org.p99.scala

import org.scalatest._

class P11Spec extends UnitSpec {

  "encodedModified" should "replace single counted item with just the item" in {
    val actual = P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    assert(actual.map(x => if(x.isRight) x.right.get else x.left.get) == expected)
  }
}

