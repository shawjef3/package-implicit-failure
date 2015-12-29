package me.jeffshaw

import org.scalatest.FunSuite

class DepASpec extends FunSuite {

  test("implicit dependent_a.A is found in package object") {
    assertCompiles("implicitly[dependent_a.A]")
  }

}
