import java.util.*;

public class LabManual6 {
    public static void main(String[] args) {
        UnitConverter Unit = new UnitConverter();
        Unit.TakingUnit();
        Unit.converter();
    }
}

class UnitConverter {
    Scanner s = new Scanner(System.in);
    int choice, option;
    double meter, km, miles, unit;

    void TakingUnit() {
        System.out.println("Select one option for unit conversion");
        System.out.println(" 1: Kilo Meter");
        System.out.println("2 : Meter");
        System.out.println(" 3 : Miles");
        option = s.nextInt();

        if (option == 1) {
            System.out.println("Enter unit in kilo meter ");
            unit = s.nextDouble();
        } else if (option == 2) {
            System.out.println("Enter unit in meter");
            unit = s.nextDouble();
        } else if (option == 3) {
            System.out.println("Enter unit in miles");
            unit = s.nextDouble();
        } else {
            System.out.println("You entered wrong choice");
        }

    }

    void converter() {
        do {
            System.out.println("Select the unit you want to convert into");
            System.out.println(" 1 : Kilo meter");
            System.out.println("2 : Meter");
            System.out.println("3 : Miles");
            System.out.println("4 : Exit");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    KM();
                    break;
                case 2:
                    Meter();
                    break;
                case 3:
                    Mile();
                    break;
                case 4:
                    System.out.println("Exiting..............");
                    break;
                default:
                    System.out.println("You entered the wrong choice, please try again");
                    break;
            }
        } while (choice != 4);
    }

    void KM() {
        if (option == 1) {
            System.out.println("your unit is already in kilo meter : " + unit);
        } else if (option == 2) {
            km = unit / 1000;
            System.out.println("Converting your unit meter into km (meter -> km) : " + km);
        } else if (option == 3) {
            km = unit * 1.60934;
            System.out.println("converting your unit miles into km (miles -> km) : " + km);
        } else {
            System.out.println("Cannot convert the units");
        }
    }

    void Meter() {
        if (option == 2) {
            System.out.println("Your unit meter is already in meter  : " + unit);
        } else if (option == 1) {
            meter = unit * 1000;
            System.out.println("converting your unit km into Meter (km -> meter) : " + meter);
        } else if (option == 3) {
            meter = unit * 1609.34;
            System.out.println("Converting your unit miles into Meter (miles -> meter): " + meter);
        } else {
            System.out.println("Cannot convert the units");
        }
        s.close();
    }

    void Mile() {
        if (option == 3) {
            System.out.println("your unit is already in miles: " + unit);
        } else if (option == 1) {
            miles = unit * 0.621371;
            System.out.println("Converting your unit km into Miles (km -> miles) : " + miles);
        } else if (option == 2) {
            miles = unit * 0.000621371;
            System.out.println("Converting your unit meter into Miles (meter -> miles) : " + miles);
        } else {
            System.out.println("Cannot convert the units");
        }
    }

}
