package code1;

public class code8 {
	//public class Employee{
	    private int employeeId; 
	    private String employeeName;
	    public code8(int employeeId, String employeeName) {
	        this.employeeId = employeeId;
	        this.employeeName = employeeName;
	    }
	    public int getEmployeeId() {
	        return employeeId;
	    }
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }
	    public String getEmployeeName() {
	        return employeeName;
	    }
	    public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
	    }
	    @Override
	    public boolean equals(Object obj) {
	        if (obj instanceof code8) {
	            return ((code8) obj).employeeId == employeeId;
	        }
	        return false;
	    }
	    @Override
	    public int hashCode() {
	        return this.employeeId;
	    }
	}
}
