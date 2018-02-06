import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Mother In Law";
		String s1="Hitler Woman";
		s=s.replaceAll("\\s", "");
		s1=s1.replaceAll("\\s", "");
		if(s.length()!=s1.length()){
			System.out.println("not a anagram");
		}
		char s1CharArray[] = s1.toLowerCase().toCharArray();
		char sCharArray[] = s.toLowerCase().toCharArray();
		Arrays.sort(s1CharArray);
		Arrays.sort(sCharArray);
		if(Arrays.equals(s1CharArray, sCharArray)){
			System.out.println("anagram");
		}
		
		
		
		
		

	}

}
