package me.jeffshaw.dependent_a

import org.scalatest.FunSuite

class ObjectASpec extends FunSuite {

  test("implicit A is found in object using object name") {
    assertCompiles("implicitly[DepA.A]")
  }

  test("implicit A is found in object importing object") {
    import DepA._
    assertCompiles("implicitly[A]")
  }

}
