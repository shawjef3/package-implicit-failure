package me.jeffshaw.a0

import org.scalatest.FunSuite

class a0Spec extends FunSuite {

  test("implicit A is found in package object") {
    //passes
    assertCompiles("implicitly[A]")
  }

}
