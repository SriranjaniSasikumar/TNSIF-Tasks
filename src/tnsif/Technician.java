package tnsif;

public class Technician extends Employee {
    private String specialization;

    public Technician(String name, int employeeId, String specialization) {
        super(name, employeeId);
        this.specialization = specialization;
    }

    public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}