import java.util.Scanner;

public class ReplaceWhiteSpace {
	static String s;
	static String s1 ="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		
	char a[] = s.toCharArray();
	for(int  i= 0;i<a.length;i++){
		if(a[i]==' '){
			
		}
		else{
			s1=  s1+a[i];
		}
		
	i++;
	
	}
	System.out.println(s1);
	
	}

}
