//A+ Computer Science
// www.apluscompsci.com

//sort example using an array of Comparable

import static java.lang.System.*;
import java.util.Arrays;

public class Sort
{
	public static void main ( String[] args ){
		Comparable[] creatureList = new Creature[3];
		//add 3 creatures to creatureList
		creatureList[0] = "dog";
		creatureList[1] = "cat";
		creatureList[2] = "whale";
		
		
		Arrays.sort(creatureList);  		//will throw an exception until
											//creatures are added to the array		
		
		for(Comparable it : creatureList)
		{
			out.println(it);
		}		
  }
}