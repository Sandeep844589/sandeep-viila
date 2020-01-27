import java.util.Scanner;

public class Assesment11 {

	public static void main(String[] args) {
		String s1;
		System.out.println("Enter the Sentence");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		Scanner scan=new Scanner(s1);
scan.useDelimiter(" ");
while(scan.hasNext())
{
	System.out.println(scan.next());
}
		
		// TODO Auto-generated method stub

	}

}
