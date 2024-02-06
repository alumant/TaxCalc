package taxx;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);
        double taxCharged;
        double netSalary;

        System.out.println("What is your gross salary?");
        double grossSalary = sal.nextDouble();
        
        while (grossSalary < 0){
            System.out.println("Invalid salary, enter correct salary");
            grossSalary = sal.nextDouble();
        }
        if (grossSalary <= 237100){
            taxCharged = (grossSalary*0.18);

            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "ZA"));
            System.out.println("Your tax is " + currencyFormat.format(taxCharged));
        } else if (grossSalary <= 370500) {
            taxCharged = grossSalary*0.26 + 42678 ;
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "ZA"));
            System.out.println("Your tax is R" + currencyFormat.format(taxCharged));
        }else if (grossSalary <= 673000){
            taxCharged = grossSalary*0.36+121475 ;
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "ZA"));
            System.out.println("Your tax is " + currencyFormat.format(taxCharged));
        }else if (grossSalary <= 857900){
            taxCharged = grossSalary* 0.39 + 179147 ;
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "ZA"));
            System.out.println("Your tax is " + currencyFormat.format(taxCharged));
        }else if (grossSalary <= 1817000) {
            taxCharged = grossSalary *0.41 + 251258  ;
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "ZA"));
            System.out.println("Your tax is " + currencyFormat.format(taxCharged));
        }else {
            taxCharged = grossSalary *0.45 + 644489 ;
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "ZA"));
            System.out.println("Your tax is " + currencyFormat.format(taxCharged));

        }
    }
}
