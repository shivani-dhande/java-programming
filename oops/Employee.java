public class Employee extends Person {
    String department;
    Employee(String name,int age,String department){
        super(name, age);
        this.department=department;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: "+department);
    }
    void showDepartment() {
        System.out.println("Employee department: "+this.department);
    }
}
