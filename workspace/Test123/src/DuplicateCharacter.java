import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateCharacter {
	static String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char []a = s.toCharArray();
		for(int i =0;i<a.length;i++){
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1);
			}
			else{
				map.put(a[i], 1);
			}
				
		}
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+":"+m.getValue());
		}

	}

}
