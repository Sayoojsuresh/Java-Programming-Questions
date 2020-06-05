import java.util.Scanner;

public class CountNumberofTimesCharAppersInString {
	static int j;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String name=scan.next();
		System.out.println("Please enter the Character to Find");
		char c=scan.next().charAt(0);
		
		for(int i=0;i<name.length();i++)
		{
			
			if(name.charAt(i)==c)
			{
				j++;
			}
		}
		System.out.println("The number of times character appeared in the string is "+ j);
		

	}

}
