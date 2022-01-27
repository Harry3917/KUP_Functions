package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class sumOfListTest extends AnyFlatSpec {

  val sum = new sumOfList

  "A condition" should "give sum of all the integers present in the list" in {
    assert(10 == sum.sumOfList(List(2, 3, 1, 4)))
  }
  "A condition" should "give sum of all the integers present in the list with any negative integer" in {
    assert(8 == sum.sumOfList(List(2, 3, -1, 4)))
  }
}