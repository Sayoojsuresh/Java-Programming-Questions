import java.util.Scanner;

public class StringOrNumberIsPaliandrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the input");
		String input =scan.next();
		String Output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
		Output= Output+input.charAt(i);
			
		}
		System.out.println(Output);
		if(Output.equalsIgnoreCase(input)){
			System.out.println("The given input is paliandrome");
		}
		else
		{
			System.out.println("The given input is not paliandrome");
		}

	}

}
