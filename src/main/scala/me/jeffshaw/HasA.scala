package me.jeffshaw

trait HasA {

  trait A

  implicit val a: A = new A {}

}
