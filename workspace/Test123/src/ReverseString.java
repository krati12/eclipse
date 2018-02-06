import java.util.Scanner;

public class ReverseString {
	static StringBuffer s1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value");
		Scanner sc = new Scanner(System.in);
		s1 = new StringBuffer(sc.nextLine());
		s1.reverse();
		System.out.println(s1);

	}

}
