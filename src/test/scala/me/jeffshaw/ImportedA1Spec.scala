package me.jeffshaw

import org.scalatest.FunSuite
import me.jeffshaw.a1._

class ImportedA1Spec extends FunSuite {

  test("implicit A is found in imported package object extending HasA") {
    //passes
    assertCompiles("implicitly[A]")
  }

}
