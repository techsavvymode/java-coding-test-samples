package com.java.lambda;

import java.util.Scanner;

public class FactoryPatternEx {

        public static void main(String[] args) {
            EmployeeFactory employeeFactory = new EmployeeFactory();
            Employee emp1 = employeeFactory.recruit(EmployeeFactory
                    .EmployeeType.HOURLY);
            Employee emp2 = employeeFactory.recruit(EmployeeFactory
                    .EmployeeType.SALARIED);
            System.out.println("emp1 earns $"+emp1.earnings());
            System.out.println("emp2 earns $"+emp2.earnings());

    }

}

interface Employee {
        double earnings();
 }

class SalariedEmployee implements Employee {
        private double basic;
        private double ta;
        private double da;
        public SalariedEmployee(double basic,
                                double ta, double da){
            this.basic = basic;
            this.ta = ta;
            this.da = da;
        }
        @Override
        public double earnings() {
            return basic+(basic*ta)+(basic*da);
        }
    }

class HourlyEmployee implements Employee {
        private double hoursWorked;
        private double payPerHour;
        public HourlyEmployee(double hoursWorked,
                              double payPerHour){
            this.hoursWorked = hoursWorked;
            this.payPerHour = payPerHour;
        }
        @Override
        public double earnings() {
            return hoursWorked*payPerHour;
        }
    }

class EmployeeFactory {
        public enum EmployeeType {HOURLY, SALARIED};
        public Employee recruit(EmployeeType employeeType){
            Employee emp;
            Scanner scanner = new Scanner(System.in);
            switch(employeeType){
                case HOURLY:
                    System.out.println("Enter Hours:");
                    double h = scanner.nextDouble();
                    System.out.println("Enter pay per hour:");
                    double p = scanner.nextDouble();
                    emp = new HourlyEmployee(h,p);
                    break;
                case SALARIED:
                    System.out.println("Enter Basic:");
                    double basic = scanner.nextDouble();
                    System.out.println("Enter TA:");
                    double ta = scanner.nextDouble();
                    System.out.println("Enter DA:");
                    double da = scanner.nextDouble();
                    emp = new SalariedEmployee(basic,ta,da);
                    break;
                default:
                    emp = null;
                    break;
            }
            return emp;
        }
}

