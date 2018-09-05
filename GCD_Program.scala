package main.scala

object GCD_Program {

  def gcd(a: Int, b: Int): Int = b match {
    case 0 => a
    case n => gcd(b, a % b)   // tail recursion
  }

  // Should implement extensive tesing externally
  def main(args: Array[String]) {
    println("gcd(20,15) is " + gcd(20,15))
    println("gcd(15,20) is " + gcd(15,20))
    println("gcd(39,42) is " + gcd(39,42))
    println("gcd(13,19) is " + gcd(13,19))
  }

}
