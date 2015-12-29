package me.jeffshaw.dependent_a

trait HasA {

  trait A

  implicit val a: A = new A {}

}
