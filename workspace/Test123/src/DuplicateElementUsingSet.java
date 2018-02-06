import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElementUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		System.out.println("enter value");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i = 0;i< s.length();i++){
			String k = ""+s.charAt(i);
		if(!set.add(k)){
			System.out.println(" Duplicate Element ");
		}
		
			
		}
		

	}

}
