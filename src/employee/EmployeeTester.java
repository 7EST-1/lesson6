package employee;

import java.util.Scanner;

public class EmployeeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee emp;
        String name, prompt;
        int type;
        double rate;
        int hours;
        do {

            while (true) {
                emp = new Employee();
                System.out.print("Enter name: " + emp.getNameRules());
                name = scan.nextLine();
                if (emp.setName(name)) {
                    break;
                }

            }
            while (true) {
                System.out.println("Enter type: " + emp.getTypeRules());
                type = scan.nextInt();
                if (emp.setType(type)) {
                    break;
                }
            }
            while (true) {
                System.out.println("Enter hours: " + emp.getHourRules());
                hours = scan.nextInt();
                if (emp.setHours(hours)) {
                    break;
                }
            }
            while (true) {
                System.out.println("Enter rate: " + emp.getRateRules());
                rate = scan.nextDouble();
                if (emp.setHours((int) rate)) {
                    break;
                }
            }
            System.out.println("---------------------");
            System.out.println("Pay this week for >" + emp.getName());
            System.out.println("$" + emp.getPay());
            System.out.println("\nEnter another? y or n >");
            prompt = scan.next();
            scan.nextLine();

        } while (prompt.equals("y") || prompt.equals("y"));
        System.out.println("Goodbye");

    }
}

