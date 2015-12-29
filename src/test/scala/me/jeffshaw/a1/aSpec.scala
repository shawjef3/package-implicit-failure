package me.jeffshaw.a1

import org.scalatest.FunSuite

class aSpec extends FunSuite {

  test("implicit A is found in package object") {
    assertCompiles("implicitly[A]")
  }

}
