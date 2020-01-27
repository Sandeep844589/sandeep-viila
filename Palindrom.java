//import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
StringBuilder str=new StringBuilder("121");
	System.out.println("Enter the string to check it is palindrome or not");
	//Scanner scan=new Scanner(System.in);

	if(str.reverse()==str)
	{
		System.out.println(str+" is Palindrome");
	}
	else
	{
		System.out.println(str+" is not Palindrome");
	}

	}

}
