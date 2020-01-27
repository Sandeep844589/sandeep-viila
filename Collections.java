import java.util.*;
public class Collections {

	public static void main(String[] args) {
		String str;
		String j;
		
		Scanner scan=new Scanner(System.in);
		ArrayList<String> al=new ArrayList();
		 al.add("Geeks For Geeks"); 
	        al.add("Friends"); 
	        al.add("Dear"); 
	        al.add("Is"); 
	        al.add("Superb"); 
		 Collections.sort(al); 
		  
	        // Let us print the sorted list 
	        System.out.println("List after the use of" + 
	                           " Collection.sort() :\n" + al); 
	}

	private static void sort(ArrayList<String> al) {
		// TODO Auto-generated method stub
		
	}



}
