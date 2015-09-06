package org.p99.scala

import org.scalatest._

class P06Spec extends UnitSpec {
  "isPalnindrome" should "properly detect if list is a palindrome" in {
    assert(P06.isPalindrome(List(1,2,3,3,2,1)))
    assert(P06.isPalindrome(List(1,2,3,2,1)))
    assert(P06.isPalindrome(List(1)))
    assert(P06.isPalindrome(List()))
    assert(!P06.isPalindrome(List(1,2,3,2,2,1)))
    assert(!P06.isPalindrome(List(1,2,3,2,0)))

  }

}

