import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		EmployeeSerializable e = new EmployeeSerializable(1,"krati");
		FileOutputStream File = new FileOutputStream("/Users/rahulsharma/Documents/test.txt");
		ObjectOutputStream out = new ObjectOutputStream(File);
		out.writeObject(e);
		out.flush();
		out.close();
		System.out.println("success");
		FileInputStream File1 = new FileInputStream("/Users/rahulsharma/Documents/test.txt");
		ObjectInputStream in = new ObjectInputStream(File1);
		EmployeeSerializable e1 =(EmployeeSerializable)in.readObject();
		System.out.println(e1.employeeId+" "+e1.employeeName);
		
		

	}

}
