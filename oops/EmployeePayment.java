public class EmployeePayment implements Payable, Printable {
    @Override
    public void calculatePayment() {
        System.out.println("Employee payment calculated");
    }
    @Override
    public void print() {
        System.out.println("Employee payment report");
    }
}
