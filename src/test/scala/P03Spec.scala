package org.p99.scala

import org.scalatest._

class P03Spec extends UnitSpec {

  "kthElement" should "find 1 to be in the 0th position List(1,3,5,9)" in {
    val pos = 0
    val k = P03.kthElement(pos, List(1,3,5,9))
    assert(k == 1)
  }

  "kthElement" should "find 3 to be in the 1st position List(1,3,5,9)" in {
    val pos = 1
    val k = P03.kthElement(pos, List(1,3,5,9))
    assert(k == 3)
  }

  "kthElement" should "find 5 to be in the 2nd position List(1,3,5,9)" in {
    val pos = 2
    val k = P03.kthElement(pos, List(1,3,5,9))
    assert(k == 5)
  }

  "kthElement" should "find 9 to be in the 3rd position List(1,3,5,9)" in {
    val pos = 3
    val k = P03.kthElement(pos, List(1,3,5,9))
    assert(k == 9)
  }

  "kthElement" should "handle bad input" in {
    intercept[NoSuchElementException] {
      P03.kthElement(-1, List(1,3,5,9))
    }

    intercept[NoSuchElementException] {
      P03.kthElement(1111, List(1,3,5,9))
    }

    intercept[NoSuchElementException] {
      P03.kthElement(0, List())
    }
  }

  "kthElementV2" should "find 1 to be in the 0th position List(1,3,5,9)" in {
    val pos = 0
    val k = P03.kthElementV2(pos, List(1,3,5,9))
    assert(k == 1)
  }

  "kthElementV2" should "find 3 to be in the 1st position List(1,3,5,9)" in {
    val pos = 1
    val k = P03.kthElementV2(pos, List(1,3,5,9))
    assert(k == 3)
  }

  "kthElementV2" should "find 5 to be in the 2nd position List(1,3,5,9)" in {
    val pos = 2
    val k = P03.kthElementV2(pos, List(1,3,5,9))
    assert(k == 5)
  }

  "kthElementV2" should "find 9 to be in the 3rd position List(1,3,5,9)" in {
    val pos = 3
    val k = P03.kthElementV2(pos, List(1,3,5,9))
    assert(k == 9)
  }

  "kthElementV2" should "handle bad input" in {
    intercept[NoSuchElementException] {
      P03.kthElementV2(-1, List(1,3,5,9))
    }

    intercept[NoSuchElementException] {
      P03.kthElementV2(1111, List(1,3,5,9))
    }

    intercept[NoSuchElementException] {
      P03.kthElementV2(0, List())
    }
  }
}

