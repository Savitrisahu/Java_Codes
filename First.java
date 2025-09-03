//literals - a value which can be assigned to a variable called literal ex- int = 34 (34 is an integer  literal) and literal can be any type int, float char, 
// byte+short = int
//char+int = int
//float+int = float
import java.util.Scanner;
public class First {
public static void main(String[] args) {
    Percentage p = new Percentage();
    p.PerCalc();
    p.subGrading();
    p.grading();
 }
}

class Percentage {
Scanner s = new Scanner(System.in);
int subMarks;
int totalSubjects;
float totalMarks = 0;
int total = 0;
int count =1;
float percent;
void PerCalc(){
    System.out.println("Calculating percentage : ");
    System.out.println("Enter how many subjects you have : ");
    totalSubjects = s.nextInt();
    System.out.println("Enter total marks of your exam : ");
    totalMarks = s.nextFloat();
    System.out.println("Enter your marks to calculate percentage");
    for (int i = 0; i <totalSubjects; i++) {
        System.out.println("Enter your Marks of subject "+count);
        subMarks = s.nextInt();
        total += subMarks;
    
    count++;
    }
    System.out.println("Total marks : "+total);
     percent = (total*100)/(totalSubjects*100);
    System.out.println("Percentage : "+percent+"%");
}

void subGrading(){
    if (subMarks>=80){
        System.out.println("well done you scored very impressive");
        }
        else if (subMarks>=60) {
            System.out.println("Well done");
        }
        else if(subMarks>=40){
            System.out.println("nice, but keep practicing");
        }
        else if(subMarks>=25){
            System.out.println("nice, but keep practicing");
        }

        else{
            System.out.println("you failed in exam, better luck next time.");
        }
}

    void grading(){
        if (percent>=80){
            System.out.println("You got Grade \"A+\"");
        }
        else if (percent>=60){
            System.out.println("You got \"A\" Grade");
        }
        else if (percent<=50){
            System.out.println("You got \"B\" Grade");
        }
        else if (percent<=30) {
            System.out.println("You got \"C\" Grade");
        }
        else{
            System.out.println("You fail");
        }
    }
    

}
