package tnsif;

public class Student {
    private String name;
    private int rollNumber;
    private static int totalStudents = 0; 
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        totalStudents++; 
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {
        
        Student student1 = new Student("Sri", 5051);
        Student student2 = new Student("Sneha", 5050);

        System.out.println("Student 1 Details:");
        student1.displayDetails();
        System.out.println();

        System.out.println("Student 2 Details:");
        student2.displayDetails();
        System.out.println();

        int total = Student.getTotalStudents();
        System.out.println("Total Students: " + total);
    }
}