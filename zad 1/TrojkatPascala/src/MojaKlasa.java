import javax.swing.*;


public class MojaKlasa {

	public static void main(String[] args) {
		
//		// dodawanie liczb
//		float a=4; // deklaracja zmiennej
//		float b=0;
//		System.out.println(a+b);
//
//		// dzielenie z instrukcja warunkowa
//		if (b!=0)
//			System.out.println(a/b);				
//		else
//			System.out.println("Nie dzielimy przez zero!");	
//		System.out.print("coœ");
//		System.out.print(" innego");
//
//		// Wprowadzanie liczb przez okna dialogowe
//	String txt1; //deklaracja zmiennej tekstowej
//	txt1 = JOptionPane.showInputDialog("Wprowadz pierwsza liczbe");
//	
//	String txt2; //deklaracja zmiennej tekstowej
//	txt2 = JOptionPane.showInputDialog("Wprowadz druga liczbe");
//	
//	System.out.println(txt1 +" "+ txt2); // ???
//	
//	
//	
//	// Konwersja tekstu na liczbe
//	double 	liczba1 = Double.parseDouble(txt1);
//	int		liczba2 = Integer.parseInt(txt2); 
//	
//	System.out.println(dodaj(1,2));
//	Obliczenia oblicz = new Obliczenia();
		
		String n1 = JOptionPane.showInputDialog("Wprowadz ilosc rzedow");
		int w = Integer.parseInt(n1);
		
		for(int i = 0; i<w; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(Obliczenia.dwumian(i, j)+"\t");
			}
			System.out.println(1);
		}
	
		
		
	}
	

}

