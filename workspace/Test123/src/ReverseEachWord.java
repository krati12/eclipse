
public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java Concept Of The Day";
		String k ="";
		int j ;
		
		for(int i=0;i<s.length();i++){
			for( j=i;j<s.length()&&s.charAt(j)!=' ';j++)
			{
			}
			
			k = s.substring(i, j);
			
		}

	}

}
