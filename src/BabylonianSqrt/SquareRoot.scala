/*
 * Program to find square root of number using Babylonian method.
 * (https://en.wikipedia.org/wiki/Methods_of_computing_square_roots#Babylonian_method)
 */
 

package BabylonianSqrt

object SquareRoot {
  def main(args: Array[String]): Unit = {
    
    //Get input from the user using scala.io.StdIn.readDouble() function
    println("Enter the number to find the square root:")
    val num = scala.io.StdIn.readDouble()
    println("Square root is : " + findRoot(num))

  }

  def findRoot(number: Double): Double = {
    
    var y: Double = 1;
   // Start with an arbitrary positive start value x (the closer to the root, the better).

    var x: Double = number;
    //This variable decides the accuracy level*/
    val accurate: Double = 0.000001
    // Get the next approximation for root using average of x and y
    while (Math.abs(x - y) > accurate) {
      x = (x + y) / 2
      y = number / x;
    }
    x
  }
}
