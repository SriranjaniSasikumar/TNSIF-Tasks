package tnsif;

public class EmployeeDemo {
    public static void main(String[] args) {
        
        Manager manager = new Manager("Sri", 5050, "Human Resource");
        
        Technician technician = new Technician("Ranjani", 5051, "Hardware Technician");

        System.out.println("Manager Details:");
        manager.displayDetails();
        
        System.out.println("\nTechnician Details:");
        technician.displayDetails();
    }
}