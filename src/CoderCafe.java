// File for your Coder Cafe code!

import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.time.LocalDateTime; // Import the LocalDateTime class

public class CoderCafe {
    public static void main(String args[]) {

        // border
        System.out.println(" ");
        System.out.println(" ☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️☕️☕️☕️☕️☕️☕️☕️☕️️");

        // write out jens cafe and welcome message
        System.out.println("-\t\t\tWelcome to Jen's Coder Cafe!\t\t\t-");

        // month-date-year hour:min:sec

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("-\t\t\t      dd-MM-yyyy HH:mm:ss\t\t\t\t-");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate);

        //set vars: myMatcha, myLatte, myCap, myCoco (represent amount of each item)
        int myMatcha = 2;
        int myLatte = 4;
        int myCap = 3;
        int myCoco = 1;

        //set price for each item by first letter
        double priceM = 4.50;
        double priceL = 5.30;
        double priceCa = 3.75;
        double priceHc = 4.80;

        //space line
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t\t\t-");

        //print vars "x item" then spaced out price
        System.out.printf("- \t\t" + myMatcha + " x Matchas " + "\t\t\t\t  $ %.2f " + "\t\t- ", myMatcha * priceM);

        System.out.println(" ");
        System.out.printf("- \t\t" + myLatte + " x Lattes" + "\t\t\t\t\t  $ %.2f" + "\t\t- ", myLatte * priceL);

        System.out.println(" ");
        System.out.printf("- \t\t" + myCap + " x Cappuccinos" + "\t\t\t\t  $ %.2f " + "\t\t- " , myCap * priceCa);

        System.out.println(" ");
        System.out.printf("- \t\t" + myCoco + " x Hot Chocolates" + "\t\t\t  $ %.2f " + "\t\t- ", myCoco * priceHc);

        //set var for sub totals
        double totalM = myMatcha * priceM;
        double totalL = myLatte * priceL;
        double totalCa = myCap * priceCa;
        double totalHc = myCoco * priceHc;

        double subTotal = totalM + totalL + totalCa + totalHc;

        //Subtotal -> addition of all prices
        System.out.println(" ");
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t\t\t-");

        System.out.println("- \t\t" + "Subtotal: \t\t\t\t\t  $ " + subTotal + "\t\t-");

        // set var for sales tax
        double salesTax = subTotal * .08875;
        double salesT = (int) (salesTax * 100) / 100.0;

        // "Sales tax:" 8.875% of all items to the cent
        System.out.printf("- \t\t" + "Sales tax:" + "\t\t\t\t\t  $ %.2f " + "\t\t-", salesT);

        // set var for service fee
        double serviceFee = 1.21;

        // "Service fee:" 1.21 added to complete cost
        System.out.println(" ");
        System.out.println("- \t\t" + "Service fee: \t\t\t\t  $ " + serviceFee + "\t\t-");

       // cafe tax for wi-fi -> divide sub by num
        double myNum = myMatcha + myLatte + myCap + myCoco;
        double cafeTax = (int) ((subTotal / myNum)*100)/100.0;
        System.out.printf("- \t\t" + "Cafe fee:" + "\t\t\t\t\t  $ %.2f" + "\t\t-", cafeTax );

        // print total: addition of sub,sales,service, cafe fees
        double totalTot = subTotal + salesT + serviceFee + cafeTax;
        System.out.println(" ");
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t\t\t- ");
        System.out.printf("- \t\t\t\t" + "Total Price: $%.2f" + "\t\t\t\t    -", totalTot);

        // space between sections
        System.out.println(" ");
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t\t\t- ");

        // goodbye message
        System.out.println("- \t\t\t   " + "Thank you come again!" + "\t\t\t\t-");

        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t\t\t- ");

        // outro receipt line
        System.out.println(" ☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️☕️☕️☕️☕️☕️☕️☕️☕️");
    }
    }
