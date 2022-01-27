package edu.knoldus

class HighOrderFunction {

  def square(value: Int): Int = value * value

  def cube(value: Int): Int = value * value * value

  val highOrderFunction: (Int => Int, Int) => Int = (function: Int => Int, anOtherValue: Int) => function(anOtherValue)
}