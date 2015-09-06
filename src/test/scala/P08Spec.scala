package org.p99.scala

import org.scalatest._

class P08Spec extends UnitSpec {

  // TODO
  "compress" should "remove adjacent duplicates without changing order" in {
    val actual = P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected = List('a, 'b, 'c, 'a, 'd, 'e)
    
    assert(actual == expected)
  }

}

