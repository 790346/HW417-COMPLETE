//A+ Computer Science
// www.apluscompsci.com

//comparable example one

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word x = new Word("dog");
		Word y = new Word("cat");
		System.out.println( x.compareTo(y) );
		
		//make a list of Word
		Word[] list = new Word[4];
		//call Collections.sort() and sort the list
		Collections.sort(list);
		//print the list
		System.out.println(list);
  }
}