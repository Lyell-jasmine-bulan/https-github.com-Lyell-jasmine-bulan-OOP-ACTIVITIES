public class inheritance {
    public static void main(String[] args) {
        
        student student = new student("Lyell Jasmine Bulan", "palikpikan", "BSIT", 2);
    
    System.out.println("Student Name:" + student.getName());
    System.out.println("Student Name:" + student.getAddress());
    System.out.println("Student Name:" + student.getProgram());
    System.out.println("Student Name:" + student.getYear());

    staff staff = new staff("Joy", "Sucol", "BSU", 2700);
    System.out.println("\nStaff Name:" + staff.getName());
    System.out.println("staff Name:" + staff.getAddress());
    System.out.println("staff Name:" + staff.getSchool());
    System.out.println("Staff Name:" + staff.getSalary());
    }
}
