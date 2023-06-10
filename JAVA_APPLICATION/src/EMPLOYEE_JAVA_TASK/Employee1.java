package EMPLOYEE_JAVA_TASK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee1 {
	
	int employeeId;
	String employeeName;
	int Salary;
	Location2 locationId;
	Department1 deptId;
	List<Benefits3>benefitId;
	
	
	public Employee1(int employeeId, String employeeName, int salary, Location2 locationId, Department1 deptId,
			List<Benefits3> benefitId) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		Salary = salary;
		this.locationId = locationId;
		this.deptId = deptId;
		this.benefitId = benefitId;
	}
	
	

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getSalary() {
		return Salary;
	}

	public Location2 getLocationId() {
		return locationId;
	}

	public Department1 getDeptId() {
		return deptId;
	}

	public List<Benefits3> getBenefitId() {
		return benefitId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public void setLocationId(Location2 locationId) {
		this.locationId = locationId;
	}

	public void setDeptId(Department1 deptId) {
		this.deptId = deptId;
	}

	public void setBenefitId(List<Benefits3> benefitId) {
		this.benefitId = benefitId;
	}
	
	
	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", Salary=" + Salary
				+ ", locationId=" + locationId + ", deptId=" + deptId + ", benefitId=" + benefitId + "]";
	}
	
}
