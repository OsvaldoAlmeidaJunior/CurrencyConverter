package Applicattion;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println(" What is te Dollar Price ?");
        double a = sc.nextDouble();
        System.out.println(" how quantity you want buy ?");
        double b = sc.nextDouble();
        double c = CurrencyConverter.Converter(a,b);

        System.out.printf("amounte to pay include IOF is R$ : %.2f%n ", c);




        sc.close();


        }
    }
