/*

Have the function FindIntersection(strArr) read the array of strings stored in strArr
which will contain 2 elements: the first element will represent a list of comma-separated
numbers sorted in ascending order, the second element will represent a second list of
comma-separated numbers (also sorted). Your goal is to return a comma-separated
string containing the numbers that occur in elements of strArr in sorted order.
If there is no intersection, return the string false.

*/

import java.util.*; 
import java.io.*;

class Main
{
  public static String FindIntersection(String[] strArr)
  {
    int i, j;
    int count = 0;
    char [] strOne = strArr[0].toCharArray();
    char [] strTwo = strArr[1].toCharArray();
    char [] charJoined = new char[3];

    for (i = 0; i < strOne.length; i++)
    {
      for (j = 0; j < strTwo.length; j++)
      {
        if ((strTwo[j] <= '9') && (strTwo[j] >= '0'))
        {
          if (strOne[i] == strTwo[j])
          {
            System.out.println(strOne[i]);
            System.out.println(strTwo[j]);
            charJoined[count++] = strTwo[j];
          }
        }
      }
    }

    String join = new String(charJoined);

    return join;
  }

  public static void main (String[] args)
  {   
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }
}