package tnsif;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}