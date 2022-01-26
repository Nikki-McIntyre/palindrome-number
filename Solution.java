import java.util.Scanner;
/**
 * @author Nikki Mcintyre
 * Take in an integer to figure out if it's palindrome
 * That is it is written the same forward and backwards I.E 404 or 1001 
 *  
 */
class Solution {
  public static void main(String[] args) {
    //get input and send it to the method
    System.out.println("What number would you like to see if it's palindrome? ");
    Scanner kbd = new Scanner(System.in);
    try{
      System.out.println(isPalindrome(kbd.nextInt()));
    }
    //if they enter a non int this will trigger
    catch(Exception e){
      System.out.println("Error, make sure you input a valid integer");
    }
  }
  /**
   * This is the method to decide if something is palindrome or not
   * @param normal the initial string to be testing
   * @return a boolean saying if the string is palindome
   */
  public static boolean isPalindrome(int x) {
    //the forward number, converting it to a String
    String normal = Integer.toString(x);
    //converted it so I could do this and build the reverse using string builder 
    String reversed = new StringBuilder(Integer.toString(x)).reverse().toString();
    //if the 2 match
    return normal.equals(reversed);
  }
}