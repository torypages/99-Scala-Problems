package org.p99.scala

import org.scalatest._

class P09Spec extends UnitSpec {

  // TODO
  "pack" should "group adjacent equal items" in {
    val actual = P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c),
      List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    assert(actual == expected)
  }

  "pack" should "handle strange input" in {
    assert(P09.pack(List()) == List(List()))
    assert(P09.pack(Nil) == List(List()))
    assert(P09.pack(List(1,1,1,1,1,1,1,1,1)) ==
        List(List(1,1,1,1,1,1,1,1,1)))
  }
}

