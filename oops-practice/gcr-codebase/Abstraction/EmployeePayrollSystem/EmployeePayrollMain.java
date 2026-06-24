public class EmployeePayrollMain {

    public static void main(String[] args) {

        FullTimeEmployee ft = new FullTimeEmployee();
        ft.setEmployeeId(101);
        ft.setEmployeeName("Rahul");
        ft.setMonthlySalary(50000);

        PartTimeEmployee pt = new PartTimeEmployee();
        pt.setEmployeeId(102);
        pt.setEmployeeName("Priya");
        pt.setHoursWorked(80);
        pt.setHourlyRate(300);

        System.out.println("Full Time Employee");
        ft.displayEmployeeInfo();
        System.out.println("Salary: " + ft.calculateSalary());

        System.out.println();

        System.out.println("Part Time Employee");
        pt.displayEmployeeInfo();
        System.out.println("Salary: " + pt.calculateSalary());
    }
}