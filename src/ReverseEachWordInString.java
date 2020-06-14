import java.util.ArrayList;
import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) {
	
	
		String input="enter the string";
		String inputinarray[]=input.split(" ");
		String Output="";
		
	for(int i=0;i<inputinarray.length;i++)
	{
		for(int j=inputinarray[i].length()-1;j>=0;j--)
		{
			
	System.out.print(Output+inputinarray[i].charAt(j));
		
		}
		
	  System.out.print(" ");
	}
	
	

	}
}
