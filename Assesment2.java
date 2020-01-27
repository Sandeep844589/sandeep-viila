import java.util.Scanner;
import java.util.regex.Pattern;

public class Assesment2 {

	public static void main(String[] args) {
		int grYear;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		name=sc.next();
		System.out.println("Enter the graduation year");
		grYear=sc.nextInt();//System.out.println(Pattern.matches("[0-9]", name));
		
		while(!name.matches("^[a-zA-Z,$*]*$"))
		{
			System.out.println("Enter valid name without numbers");
			name=sc.next();
		}
		System.out.print("My name is "+name+" "+ "and I'll graduate in "+grYear);
		
		// TODO Auto-generated method stub

	}

}
