package org.p99.scala

object P06 {

  /*
  * Find out whether a list is a palindrome.
  * Example:
  * scala> isPalindrome(List(1, 2, 3, 2, 1))
  * res0: Boolean = true
  *
  * List.tail: all elements but the first
  * List.init: all elements but the last
  * List.head: first element in list
  * List.last: last element in the list
  */

  def isPalindrome[A](myList: List[A]): Boolean = {
    def helper(ls: List[A]): Boolean = {

      // If there are odd elements in the list then we will be left with
      // one item at the end. A list of one item is a palindrome.
      // If the list is even we will have nothing at the end, this too is a palindrome.
      // This is somewhat a re-phrasing of the other condition in this "or". If the list
      // is of size one, then the first and last item is the same item and thus equal.
      // If the list is empty then the first and last item is nothing and thus equal.
      ((ls.length <= 1) ||
        // If the first and last elements are equal, and this holds true for every
        // iteration where we remove the first and last elements, then we are good.
        (ls.head == ls.last)
      && helper (ls.tail.init))
    }

    // I'm considering lists of length 0 or 1 to also be palindromes
    helper(myList)
  }
}
