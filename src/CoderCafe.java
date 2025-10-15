// File for your Coder Cafe code!

import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.time.LocalDateTime; // Import the LocalDateTime class


public class CoderCafe{

    public static void main(String[] args) {

        //Establish amount of each item
        int myMatcha = 2;
        int myLatte = 4;
        int myCap = 3;
        int myCoco = 1;

        //Establish price for each item
        double priceMatcha = 4.50;
        double priceLatte = 5.30;
        double priceCap = 3.75;
        double priceCoco = 4.80;

        // Establish total price of item
        double totalMatcha = myMatcha * priceMatcha;
        double totalLatte = myLatte * priceLatte;
        double totalCap = myCap * priceCap;
        double totalCoco = myCoco * priceCoco;

        //Establish subtotal
        double subTotal = totalMatcha + totalLatte + totalCap + totalCoco;

        //Establish sales tax
        double salesT = subTotal * .08875;
        double salesTax = (int) (salesT * 100) / 100.0;

        //Establish service fee
        double serviceFee = 1.21;

        //Establish cafe tax
        double quantityItems = myMatcha + myLatte + myCap + myCoco;
        double unroundedCafeFee = subTotal % quantityItems;
        double cafeFee = (int) (unroundedCafeFee * 100) / 100.0;

        //Establish total price
        double totalTot = subTotal + salesTax + serviceFee + cafeFee;

        // Print top border
        System.out.println(" ");
        System.out.println(" ☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️☕️☕️☕️☕️☕️☕️☕️☕️️");

        // Print welcome message
        System.out.println("-\t\t\tWelcome to Jen's Coder Cafe!\t\t\t-");

        // Print time and date
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("-\t\t\t      dd-MM-yyyy HH:mm:ss\t\t\t\t-");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate);

        //Empty line
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t\t\t-");

        //Print amount of item and cost
        System.out.printf("- \t\t" + myMatcha + " x Matchas " + "\t\t\t\t  $ %.2f " + "\t\t- ", totalMatcha );

        System.out.println(" ");
        System.out.printf("- \t\t" + myLatte + " x Lattes" + "\t\t\t\t\t  $ %.2f" + "\t\t- ", totalLatte);

        System.out.println(" ");
        System.out.printf("- \t\t" + myCap + " x Cappuccinos" + "\t\t\t\t  $ %.2f " + "\t\t- " , totalCap);

        System.out.println(" ");
        System.out.printf("- \t\t" + myCoco + " x Hot Chocolates" + "\t\t\t  $ %.2f " + "\t\t- ", totalCoco);

        //Print filler line
        System.out.println(" ");
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t\t\t-");

        //Print subtotal
        System.out.println("- \t\t" + "Subtotal: \t\t\t\t\t  $ " + subTotal + "\t\t-");

        //Print sales tax
        System.out.printf("- \t\t" + "Sales tax:" + "\t\t\t\t\t  $ %.2f " + "\t\t-", salesTax);

        //Print service fee
        System.out.println(" ");
        System.out.println("- \t\t" + "Service fee: \t\t\t\t  $ " + serviceFee + "\t\t-");

        //Print cafe fee
        System.out.printf("- \t\tCafe fee:\t\t\t\t\t  $ %.2f \t\t-", cafeFee);

        //Print filler lines
        System.out.println(" ");
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t\t\t- ");

        //Print total price
        System.out.printf("- \t\t\t\tTotal Price: $%.2f\t\t\t\t    -", totalTot);

        //Print filler lines
        System.out.println(" ");
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t\t\t- ");

        //Print goodbye message
        System.out.println("- \t\t\t   Thank you come again!\t\t\t\t-");
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t\t\t- ");

        //Print bottom border
        System.out.println(" ☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️☕️☕️☕️☕️☕️☕️☕️☕️");
    }
    }
