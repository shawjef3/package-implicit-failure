package me.jeffshaw.dependent_a

import org.scalatest.FunSuite

class PackageASpec extends FunSuite {

  test("implicit A is found in package object") {
    assertCompiles("implicitly[A]")
  }

}
