import java.util.Scanner;

public class LabManual5 {
    public static void main(String[] args) {
ElectricityBill eleBill = new ElectricityBill();
eleBill.calculation();
    }
}

class ElectricityBill {
    Scanner s = new Scanner(System.in);
    int unit,  totalBill;

    void calculation() {
        System.out.println("Enter electricity unit consumed");
        unit = s.nextInt();

        if (unit<=100) {
            totalBill = unit*3;
            System.out.println("Your total electricity bill is : "+totalBill);
        }
        else{
            totalBill = unit*5;
            System.out.println("Your total electricity bill is : "+totalBill);
        }
        s.close();
    }

}
