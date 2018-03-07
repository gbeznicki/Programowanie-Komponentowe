package zadanie2;

import javax.swing.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// // Zabezpieczenie przed niewlasciwa iloscia argumentow
		//
		// if (args.length < 3) {
		// System.err.print("Za malo argumentow ");
		// } else
		//
		// // drukowanie Pierwszego argumentu wywolania
		// System.out.println(args[0]);
		//
		// // drukowanie DRUGIEGO i TRZECIEGO argumentu wywolania
		// System.out.println(args[1] + " | " + args[2]);
		//
		// //drukowanie pierwszych trzech argumentow wywolania
		// System.out.println(" * " + args[0] + " ** " + args[1] + " *** " + args[2]);
		//
		// // Drukowanie kazdej podanej ilosci argumentow
		// int i;
		// for (i = 0; i < args.length; i++) // ilosc argumentow jako ograniczenie gorne
		// petli
		// System.out.println(args[i]);

		double liczba1, liczba2;
		String znak;
		
		switch (args.length){
		case 3:
			liczba1 = Double.parseDouble(args[0]);
			znak = args[1];
			liczba2 = Double.parseDouble(args[2]);
			switch (znak) {
			case "+":
				System.out.print(liczba1+liczba2);
				break;
			case "-":
				System.out.print(liczba1-liczba2);
				break;
			case "/":
				System.out.print(liczba1/liczba2);
				break;
			case "*":
				System.out.print(liczba1*liczba2);
				break;
				}
			break;
		default: 
			System.err.print("Nieprawidlowa ilosc argumentow. ");
		}


//		// Konwersja tekstu na liczbe
//		double liczba1 = Double.parseDouble(txt1);
//		int liczba2 = Integer.parseInt(txt2);
//
//		System.out.println(liczba1 + liczba2);
	}

}
