package me.jeffshaw.a1

import org.scalatest.FunSuite

class a1Spec extends FunSuite {

  test("implicit A is found in package object") {
    //fails
    assertCompiles("implicitly[A]")
  }

}
