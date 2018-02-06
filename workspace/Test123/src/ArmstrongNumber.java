
public class ArmstrongNumber {
	public static void main(String[] args) {
		int k =153;
		int c = 0;
		int s =k;
		int j = 1;
		int sum =0;
		while(s!=0){
			s=s/10;
			c++;
		}
		while(k!=0){
			s = k%10;
			k=k/10;
		
		while(c>0){
			j = j *s;
			
			c--;
			
		}
		sum = sum + j;
		System.out.println(sum);
		
	}
		System.out.println(sum);
		
		
	}
	
	
}
