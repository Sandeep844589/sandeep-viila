//import java.util.Scanner;

public class Assesment12 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("This is Java Program");
		 int ln = str.length(); 
         
	      
	        for (int i=0; i<ln; i++) 
	        { 
	            Character c = str.charAt(i); 
	            if (Character.isLowerCase(c)) 
	                str.replace(i, i+1, Character.toUpperCase(c)+""); 
	            else
	                str.replace(i, i+1, Character.toLowerCase(c)+""); 
	
		}
System.out.println(str);
}
}