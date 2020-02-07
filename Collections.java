import java.util.*;
public class Collections {

	public static void main(String[] args) {
		String str;
		String j;
		
		Scanner scan=new Scanner(System.in);
		ArrayList<String> al=new ArrayList();
		 al.add("Hii"); 
	        al.add("Friends"); 
	        al.add("How"); 
	        al.add("are"); 
	        al.add("you"); 
		 Collections.sort(al); 
		  
	        // Let us print the sorted list 
	        System.out.println("List after the use of" + 
	                           " Collection.sort() :\n" + al); 
	}

	private static void sort(ArrayList<String> al) {
		// TODO Auto-generated method stub
		
	}



}
