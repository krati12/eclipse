
public class EqualityOfTwooArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {45,67,78,89};
		int b[] ={45,67,78,89,7};
		String s = a.toString();
		String s1 = b.toString();
		if(s1.equals(s)){
			System.out.println("same array");
		}
		else
			System.out.println("differet array");

	}

}
