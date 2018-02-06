import java.util.regex.Pattern;

public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 145;
		int k =0;
		boolean status;
		String s = String.valueOf(i);
		while(s.contains("4")){
			i--;
			s =  String.valueOf(i);
		}
		System.out.println(s);
		}
		
		

	}


