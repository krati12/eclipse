import java.io.Serializable;

public class EmployeeSerializable implements Serializable {
	
	
	int employeeId;
	String employeeName;
	public EmployeeSerializable(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

}
