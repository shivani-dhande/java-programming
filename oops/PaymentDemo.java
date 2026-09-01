public class PaymentDemo {
    public static void main(String[] args) {
        Payable employee = new EmployeePayment();
        employee.calculatePayment();
        Printable printable = new EmployeePayment();
        printable.print();

        Payable manager = new ManagerPayment();
        manager.calculatePayment();
    }
}
