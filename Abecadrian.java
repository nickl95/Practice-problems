/*
An abecedarium (or abecedary) is an inscription consisting of the letters
of an alphabet, almost always listed in order. Typically, abecedaria
(or abecedaries) are practice exercises.

Write a Java program to check if each letter of a given word (Abecadrian word)
is less than the one before it.

EXPECTED OUTPUT:

Input a word:  ABCD
Is Abecadrian word? true
*/

import java.util.Scanner;

public class Abecadrian
{
  public static void main(String[] args)
  {
    // Prompt and store string input
    System.out.print("Input a word: ");
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    
    boolean is_abecadrian = false;
    // Check to see if string input is an abecadrian word
    for (int i = 0; i < str.length()-1; i++)
    {
      if (str.charAt(i) != str.charAt(i + 1)-1)
      {
        is_abecadrian = false;
        break;
      }
      else
      {
        is_abecadrian = true;
      }
    }
    
    System.out.print("Is Abecadrian word? " + is_abecadrian);
  }
}