	import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
	int count =1;
	
	for(int i =5;i>0;i--){
			for(int j=1;j<=i;j++){
			System.out.print(" ");
			
		}
		for(int j = 1;j<=count;j++){
			System.out.print(count+" ");
		}
		System.out.println();
		count++;
	}
	
	
	
	
	}
	}