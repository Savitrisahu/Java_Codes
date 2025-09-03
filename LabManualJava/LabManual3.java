import java.util.*;
public class LabManual3 {
    public static void main(String[] args) {
        GroceryShop shop = new GroceryShop();
        shop.Billing();
        shop.bill();
    }
}

class GroceryShop {
Scanner s = new Scanner(System.in);
float totalBill, Bill;
int itemPrice, qty;
String itemName;

void Billing(){
    System.out.println("Billing counter");
    System.out.println("Enter the name of item");
    itemName = s.nextLine();
    System.out.println("Enter Item Quantity");
    qty = s.nextInt();
    System.out.println("Enter Item Price");
    itemPrice = s.nextInt();
}

    void bill(){
    Bill = qty*itemPrice;
    System.out.println("Bill : "+Bill);
     if (Bill >= 1000) {
        totalBill = Bill - 100;
     }
     else if(totalBill >= 500){
     totalBill = Bill-50;
     }
     else{
        System.out.println("No discount applicable, shop more than 500 to get discount ");
     }

     System.out.println("Total Bill : "+totalBill);
     s.close();
    }
    
}
