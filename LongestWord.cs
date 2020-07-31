/*
 * Have the function LongestWord(sen) take the sen parameter being passed and return
 * the largest word in the string. If there are two or more words that are the same
 * length, return the first word from the string with that length. Ignore punctuation
 * and assume sen will not be empty. 
 */

using System;

class MainClass
{
  public static string LongestWord(string sen)
  {
    int current = 0, max = 0, lastIndex = 0;
    bool maxChanged = false;

    // Parse through the string and determine longest word and the last index of longest word
    for (int i = 0; i < sen.Length; i++)
    {
      if (((sen[i] >= 'A') && (sen[i] <= 'Z')) || ((sen[i] >= 'a') && (sen[i] <= 'z'))) // If a letter...
      {
        // Amount of characters in current word
        current++;

        if (current > max)
        {
          maxChanged = true;
          max = current;
        }
      }

      else
        current = 0;

      // If a new max was established, update the last index
      if (maxChanged)
          lastIndex = i;

      maxChanged = false;
    }
    
    // Storing the longest word from 'sen'
    char[] longestWord = new char[max];
    int firstIndex = lastIndex - max + 1;

    for (int j = 0; j < max; j++)
      longestWord[j] = sen[firstIndex++];
    
    string final = new string(longestWord);

    return final;
  }

  static void Main()
  {
    Console.WriteLine(LongestWord(Console.ReadLine()));
  }
}