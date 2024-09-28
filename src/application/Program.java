package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Salary_Converter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int work_hours, number;
		double price_per_hour;
		
		number = scan.nextInt();
		work_hours = scan.nextInt();
		price_per_hour = scan.nextDouble();
		scan.close();
		
		Salary_Converter converter = new Salary_Converter(price_per_hour,work_hours);
		
		System.out.printf("NUMBER %d\n",number);
		System.out.printf("SALARY: R$ %.2f%n",converter.Salary());

	}

}
