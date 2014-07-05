package main;

import service.CalculatorService;
import service.impl.CalculatorServiceImpl;
import java.io.InputStream;
import java.util.Scanner;


public class MainClass{
	public static void main(String[] Malik){
		CalculatorService service = new CalculatorServiceImpl();
		Scanner scanner = new Scanner(System.in);
		
		//"Langkah-langkah Compile"
		//"1. File CalculatorService -> Compile"
		//"2. File CalculatorServiceImpl -> Compile"
		//"3. File MainClass -> Compile"
		
		
		System.out.print("Masukan Bilangan 1 : ");
		Integer bil1 = scanner.nextInt();
		System.out.print("Masukan Bilangan 2 : ");
		Integer bil2 = scanner.nextInt();		
		System.out.print("Masukan Operator   : ");
		String operator = scanner.next();
		
		Integer a = service.tambah(bil1,bil2);
		Integer b = service.kurang(bil1,bil2);
		Integer c = service.kali(bil1,bil2);
		Integer d = service.bagi(bil1,bil2);
		
		System.out.print("Hasil perhitungan dari " + bil1 + " "+ operator + " " + bil2 + " = ");
		switch(operator){
			case "+": System.out.print(" " + a);break;
			case "-": System.out.print(" " + b);break;
			case "*": System.out.print(" " + c);break;
			case "/": System.out.print(" " + d);break;
			default: break;
		}
	}
}
