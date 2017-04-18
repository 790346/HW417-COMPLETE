//A+ Computer Science
// www.apluscompsci.com

//generic comparable example

public class Word implements Comparable<Word>
{
  private String orig;

  public Word(String s) { orig = s; };

  public int compareTo(Word other) 
  {

     //must add code to complete 
     if(orig.equals(other))
     {
         return 1;
     }
     return 0; 
  }

  public String toString() { return orig; }
}
