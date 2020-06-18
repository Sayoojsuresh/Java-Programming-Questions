import java.util.ArrayList;

public class GivenStringAnagramOrNot {
static String c=null;
static String d=null;
	public static void main(String[] args) {
		String a= "pek";
		String b= "keep";
		ArrayList one=new ArrayList();
		ArrayList two=new ArrayList();
		if(a.contains(" ")&& b.contains(" ")){
			 a=a.replace(" ", "");
			b= b.replace(" ", "");
		}

		else{
			System.out.println("No space between characters");
		}
		
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				one.add(a.charAt(i));
			}
			
			for(int j=0;j<b.length();j++)
			{
				two.add(b.charAt(j));
			}
			
		if(one.containsAll(two))
		{
			System.out.println("These are Anagrams");
		}
		
		else
			
		{
			System.out.println("These are not Anagrams");
		}
		}
		else{
			System.out.println("Count doesnt match,not an anagram");
		}
		

	}

}
