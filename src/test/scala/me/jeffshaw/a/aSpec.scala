package me.jeffshaw.a

import org.scalatest.FunSuite

class aSpec extends FunSuite {

  test("implicit A is found in package object") {
    assertCompiles("implicitly[A]")
  }

}
