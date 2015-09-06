package org.p99.scala

import org.scalatest._

class P02Spec extends UnitSpec {
  "penultimate" should "return the 6 in the list 1 2 3 4 5 6 7" in {
    val someList = List(1,2,3,4,5,6,7)
    assert(6 == P02.penultimate(someList))
  }

  "penultimate" should "return the 1 in the list 1 2" in {
    val someList = List(1,2)
    assert(1 == P02.penultimate(someList))
  }

  "penultimate" should "Throw no such element error with list 1" in {
    val someList = List(1) 
    intercept[NoSuchElementException] {
       P02.penultimate(someList)
    }
  }

  "penultimate" should "Throw no such element error" in {
    val someList = List() 
    intercept[NoSuchElementException] {
       P02.penultimate(someList)
    }
  }
}

