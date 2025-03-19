package week2;

import java.util.Date;
import java.util.Scanner;

public class Employee {
    public String name ;
    public double salary;
    public int workHours;
    public int hireDate;

    public Employee(String name, double salary, int workHours, int hireDate) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireDate = hireDate;
    }

    public double Tax(){ // vergi hesaplaması yapar
        if(salary < 1000){
            return 0 ;
        }
        return salary * 0.03;
    }
    public int Bonus(){ //bonus hesaplaması yapar
        if(workHours >= 40){
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public double RaiseSalary(){ //maaş artışı hesaplaması yapar
        int currentYear = 2021;
        int workingYear = currentYear - hireDate;
        if(workingYear < 10 ){
            return salary * 0.05;
        } else if (workingYear > 9 && workingYear < 20) {
            return  salary * 0.1;
        } else if (workingYear > 19) {
            return salary * 0.15;
        }
        return 0;
    }
    public String toString() {  // ekrana yazdırır
        double tax = Tax();
        int bonus = Bonus();
        double raiseSalary = RaiseSalary();
        double salaryTaxBonus = salary - tax + bonus;
        double totalSalary = salaryTaxBonus + raiseSalary;
        return "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireDate + "\n" +
                "Vergi : " + tax + "\n" +
                "Bonus : " + bonus + "\n" +
                "Maaş Artışı : " + raiseSalary + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + salaryTaxBonus + "\n" +
                "Toplam Maaş : " + totalSalary;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adı: ");
        String name = scanner.nextLine();

        System.out.println("Maaşı : ");
        double salary = scanner.nextDouble();

        System.out.println("Çalışma Saati: ");
        int workHours = scanner.nextInt();

        System.out.println("Başlangıç Yılı: ");
        int hireDate = scanner.nextInt();

       Employee employee = new Employee(name, salary, workHours, hireDate);
        System.out.println(employee);







    }
}
