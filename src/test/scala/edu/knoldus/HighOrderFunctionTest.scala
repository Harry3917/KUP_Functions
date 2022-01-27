package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class HighOrderFunctionTest extends AnyFlatSpec {

  val hof = new HighOrderFunction

  "A condition" should "square the element" in {
    assert(9 == hof.highOrderFunction(hof.square, 3))
  }
  "A condition" should "cube the element" in {
    assert(8 == hof.highOrderFunction(hof.cube, 2))
  }
}