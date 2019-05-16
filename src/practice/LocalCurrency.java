package practice;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LocalCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = getCur(Locale.US ,payment);
        String india = getCur(new Locale("en", "in") ,payment);
        String china = getCur(Locale.CHINA ,payment);
        String france = getCur(Locale.FRANCE ,payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
	}
	public static String getCur(Locale obj, double amount) {
        NumberFormat formater =NumberFormat.getCurrencyInstance(obj);
        return formater.format(amount);
    }

}
