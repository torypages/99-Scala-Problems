package org.p99.scala

import org.scalatest._

class P01Spec extends UnitSpec {
  "last" should "return the 7 in the list 1 2 3 4 5 6 7" in {
    val someList = List(1,2,3,4,5,6,7) 
    val lastVal = P01.last(someList)
    assert(lastVal == 7)
  }

  "last" should "return the 1 in the list 1" in {
    val someList = List(1) 
    val lastVal = P01.last(someList)
    assert(lastVal == 1)
  }

  "last" should "Throw no such element error" in {
    val someList = List() 
    intercept[NoSuchElementException] {
       P01.last(someList)
    }
  }
}

