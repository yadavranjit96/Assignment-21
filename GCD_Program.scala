package main.scala

object GCD_Program {

  /* Function "gcd" computes the greatest common divisor of its two
     nonegative number arguments using Euclid's algorithm.  It is
     based on property: If r is the remainder of a divided by b, then
     the common divisors of a and b are precisely the same as the
     common divisors of b and r.

     Time complexity:  O(log max(a,b))
     Space complexity: O(1) with tail call optimization
  */

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
