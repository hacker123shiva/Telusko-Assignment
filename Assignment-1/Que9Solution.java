package Assignment_1;

import java.util.*;
public class Que9Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculation of Payroll of Employees");

        // Input hourly rate
        System.out.print("Enter hourly rate for regular hours: ");
        double regularHourRate = sc.nextDouble();

        System.out.print("Enter hourly rate for overtime hours: ");
        double overtimeHourRate = sc.nextDouble();

        // Input hours worked
        System.out.print("Enter total regular hours worked: ");
        double regularHoursWorked = sc.nextDouble();

        System.out.print("Enter total overtime hours worked: ");
        double overtimeHoursWorked = sc.nextDouble();

        // Calculate total pay on regular and overtime respectively
        double regularPay = regularHoursWorked * regularHourRate;
        double overtimePay = overtimeHoursWorked * overtimeHourRate;

        // Calculate total pay including overtime pay
        double totalPay = regularPay + overtimePay;

        System.out.println("Regular Pay: Rs." + regularPay);
        System.out.println("Overtime Pay: Rs." + overtimePay);
        System.out.println("Total Pay: Rs." + totalPay);

        sc.close();
	}
}
