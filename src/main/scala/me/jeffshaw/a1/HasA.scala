package me.jeffshaw.a1

trait HasA {

  trait A

  implicit val a: A = new A {}

}
