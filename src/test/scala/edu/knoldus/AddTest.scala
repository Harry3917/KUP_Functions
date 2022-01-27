package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class AddTest extends AnyFlatSpec {

  val addition = new Add

  "A condition" should "give correct output for both positive integers" in {
    assert(3 == addition.add(2, 1))
  }
  "A condition" should "give correct output for one positive and one negative integer" in {
    assert(-1 == addition.add(-2, 1))
  }
  "A condition" should "give correct output for both negative integers" in {
    assert(-3 == addition.add(-2, -1))
  }
}
