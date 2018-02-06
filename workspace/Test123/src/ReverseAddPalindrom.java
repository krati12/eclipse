
public class ReverseAddPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4974;
		String s = ""+i;
		StringBuffer a = new StringBuffer(s);
		StringBuffer b = a;
		System.out.println(b);
		if(a.equals(b)){
			System.out.println("palindrom");
		}
		

	}

}
