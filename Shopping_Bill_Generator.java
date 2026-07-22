
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Shopping_Bill_Generator {

    Scanner sc = new Scanner(System.in);
    static int nextBillNo = 1001;
    int totalProduct;
    String[] productName;
    int[] quantity;
    int[] productPrice;
    int[] pqPrice;
    double subTotal;
    double discount;
    double gst;
    double finalTotal;
    String customerName;
    int billNo;
    String billDate;

    public Shopping_Bill_Generator(int totalProduct) {
        this.totalProduct = totalProduct;
        productName = new String[totalProduct];
        quantity = new int[totalProduct];
        productPrice = new int[totalProduct];
        pqPrice = new int[totalProduct];

        System.out.print("Enter Customer Name: ");
        sc.nextLine();
        customerName = sc.nextLine();
        billNo = nextBillNo;
        nextBillNo++;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        billDate = now.format(format);
    }

    void inputProducts(){
        for (int i = 0; i < totalProduct; i++) {
            System.out.print("\nEnter product "+(i+1) +" Name: ");
            productName[i]= sc.next();

            System.out.print("Enter product "+(i+1) +" Quantity: ");
            quantity[i]= sc.nextInt();

            System.out.print("Enter product "+(i+1) +" Price: ");
            productPrice[i] = sc.nextInt();

        }
    }

    void calculateTotal(){
        subTotal = 0;
        finalTotal = 0;
        discount = 0;
        gst = 0;
        for (int i = 0; i < totalProduct; i++) {
            pqPrice[i]=quantity[i]*productPrice[i];
        }

        for (int i = 0; i < totalProduct; i++) {
            subTotal += pqPrice[i];
        }
        System.out.println("\nTotal Value: "+ subTotal);
        finalTotal = subTotal;
        if (subTotal>=1000){
            discount = subTotal*0.10;
            finalTotal -= discount;

        }
        else{
            System.out.println("There is no Discount.");
        }

        gst = finalTotal*0.05;
        finalTotal += gst;
        System.out.println("Discounted Value "+ finalTotal);
    }

    void printBill(){

        System.out.println("\n=========== BILL ===========\n");

        System.out.println("Bill No  : " + billNo);
        System.out.println("Customer : " + customerName);
        System.out.println("Date     : " + billDate);
        System.out.println();
        System.out.printf("%-12s %-6s  %-6s  %-20s%n",
                "Product","Qty", "Price","Total");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < totalProduct; i++) {
            System.out.printf("%-12s %-5d x %-3d = %-6s%n",productName[i],quantity[i],productPrice[i],pqPrice[i]);
        }

        System.out.println("------------------------------------------------");

        System.out.printf("%-12s :%-12.2f%n",
                "Subtotal", subTotal);
        System.out.printf("%-12s :%-12.2f%n",
                "Discount", discount);
        System.out.printf("%-12s :%-12.2f%n",
                "GST", gst);
        System.out.println("------------------------------------------------");
        System.out.printf("%-12s :%-12.2f%n",
                "Grand Total", finalTotal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total No. of Products: ");
        int n = sc.nextInt();

        Shopping_Bill_Generator bill = new Shopping_Bill_Generator(n);

        bill.inputProducts();
        bill.calculateTotal();
        bill.printBill();
        sc.close();
    }
}
