
/*******************************************************************************
Mokshith bharadwaj
03/13/25
SkillsUSa
********************************************************************************
Problem 
Bracket Matcher

*/
import java.util.*;

public class Main 
{

  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the string with Brackets");// message for the user to enter in the string of brackets 
    String input = in.nextLine();// input from the user
    System.out.println(bracketMatcher(input));// running the method
  }

  public static int bracketMatcher(String str) 
  {
    int parnCompleteCount = 0;
    int output = 0;// reduced if statments
    for (int i = 0; i < str.length(); i++)// iterating through the string
      switch(str.charAt(i))// only checks if the brackets open and close in order respectively
        {
          case  '(':
            parnCompleteCount++;
            break;
          case  ')':
              parnCompleteCount--;
        }
    
    if (parnCompleteCount == 0)//changing output if the brackets actually met the parameters.
      output = 1;
    return output;
  }
}
