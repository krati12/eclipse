
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class StudentMain  {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
			Student s = new Student(1,"krati");
		
			FileOutputStream File = new FileOutputStream("/Users/rahulsharma/Documents/test1.txt");
			ObjectOutputStream out = new ObjectOutputStream(File);
			out.writeObject(s.Name);
			
			out.flush();
			FileInputStream File1 = new FileInputStream("/Users/rahulsharma/Documents/test1.txt");
			ObjectInputStream in = new ObjectInputStream(File1);
			System.out.println("hi");
			Student e1= new Student(0,null);
			e1.Name =(String)in.readObject();
			System.out.println(e1.Name);
	}
	

}
