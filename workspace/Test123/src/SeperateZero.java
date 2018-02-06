
public class SeperateZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =  {1, -5, 0, 0, 8, 0, 1};
		int temp;
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				for(int j=0;j<i;j++)
				{
						if(a[j]==0){
							
						}
						else{
							temp = a[j];
							a[j] =a[i];
							a[i] =temp;
							
						}						
					}
				}

			}
		for(int k =0;k<a.length;k++)
		System.out.println(a[k]);
		}

	}


