import java.util.*;

public class LabManual {
    public static void main(String[] args) {
        PerscentCalc ps = new PerscentCalc();
        ps.PerCalc();
    }
}

class PerscentCalc {
    Scanner s = new Scanner(System.in);
    int sub1 = 48, sub2 = 46, sub3 = 36, sub4 = 41, sub5 = 39;
    //double subTotal, Percent;

    void PerCalc() {
        System.out.println("calculating percentage and assigning grades");

        // System.out.println("Enter subjects total marks : ");
        // int subTotal = s.nextInt();

        // System.out.println("Enter marks of 1st subject : ");
        // sub1 = s.nextInt();
        // System.out.println("Enter marks of subject 2 : ");
        // sub2 = s.nextInt();
        // System.out.println("Enter marks of subject 3 : ");
        // sub3 = s.nextInt();
        // System.out.println("Enter marks of subject 4 : ");
        // sub4 = s.nextInt();
        // System.out.println("Enter marks of subject 5 : ");
        // sub5 = s.nextInt();

        float totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total marks : "+ totalMarks);
        //System.out.println("total marks out of" + subTotal + "is : " + totalMarks);
        float percentage = (totalMarks * 100) / 250;
        System.out.println("percentage : " + percentage);

        if (percentage >= 90) {
            System.out.println("A");

        } else if (percentage >= 70) {
            System.out.println("B");
        } else if (percentage >= 50) {
            System.out.println("D");
        } else if (percentage >= 35) {
            System.out.println("D");
        } else {
            System.out.println("F Fail");
        }
        s.close();

    }

}
// if ( sub1>100 && sub2>100 && sub3>100 && sub4>100 && sub5>100) {
// System.out.println("invalid marks input please try again");

// }
