import java.util.*;

public class Default_constructor {
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1();
        Constructor1 c2 = new Constructor1();
        c1.input();
        c1.display();
        c2.display();
    }
}

class Constructor1 {
    String StudentName, course;
    int rollNo, count = 1, num;
    Scanner s = new Scanner(System.in);

    Constructor1(String StudentName, String course, int rollNo) {
        this.StudentName = StudentName;
        this.course = course;
        this.rollNo = rollNo;
    }

    void input() {
        System.out.println("Enter number of students details you want to store : ");
         num = s.nextInt();
        System.out.println("Enter students details : ");
        for (int i = 1; i <= num; i++) {
            System.out.println("Students numbers " + count + "details");
         s.nextLine();
            System.out.println("Enter students name : ");
            StudentName = s.nextLine();
            
            System.out.println("Enter students course :");
            course = s.nextLine();
            System.out.println("Enter students roll no : ");
            rollNo = s.nextInt();
            count++;
        }
    }

    void display() {
        for (int i = 1; i <= num; i++) {
        System.out.println("Students Name : " + StudentName);
        System.out.println("Students Course : " + course);
        System.out.println("Students Roll No. : " + rollNo);
        }
    }

    Constructor1() {
        System.out.println("Students hii");
    }

}
