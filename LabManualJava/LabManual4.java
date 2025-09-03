import java.util.*;
public class LabManual4 {
    public static void main(String[] args) {
       EmployeeSalary salary = new EmployeeSalary();
       salary.Salary(); 
    }
}
class EmployeeSalary {
Scanner s = new Scanner(System.in);
float Salary;
int workingHour = 40, workHours, perHour = 100;
void Salary(){
    System.out.println("Enter Your Base salary");
    Salary = s.nextFloat();
    System.out.println("Enter How many Hours did you Worked");
    workHours = s.nextInt();
    if (workHours > workingHour) {
        int extraHours = workHours - workingHour;
       Salary += extraHours*perHour;
    }
    System.out.println("your total salary is : "+Salary);
}
}
