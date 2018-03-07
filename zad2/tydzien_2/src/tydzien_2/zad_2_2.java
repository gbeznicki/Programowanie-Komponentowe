package tydzien_2;

import javax.swing.*;

public class zad_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i;

		// Deklaracja tablicy
		// int tab[] = new int[10];

		// // Wypelnianie tablicy takimi samymi wartosciami
		// for (i = 1; i < 10; i = i + 1)
		// tab[i] = 5;

		// // Drukowanie zawartosci tablicy
		// for (i = 1; i < 10; i = i + 1)
		// System.out.print(tab[i] + " ");

		// System.out.println(""); // wydruk pustego wiersza

		// Wypelnianie tablicy wartosciami zaleznymi od `i'
		// for (i = 1; i < 10; i = i + 1)
		// tab[i] = 2 * i;
		// tab[i] = 5*i+3
		// tab[i] = 20 -i

		// Tablice o dynamicznie ustalanym rozmiarze
		// int rozmiar = 15; //
		// int tablica_inna[] = new int[rozmiar];

		// for (i = 0; i < rozmiar; i++) {
		// tablica_inna[i] = 20 - 2 * i;
		// System.out.print(tablica_inna[i] + " ");
		// }

		// System.out.println("");

		// // Wypelnianie tablicy liczbami losowymi
		//
		// for (i = 0; i < rozmiar; i++)
		// tablica_inna[i] = (int) (Math.random() * 20);
		//
		// for (i = 0; i < rozmiar; i++)
		// System.out.print(tablica_inna[i] + " ");
		//
		// System.out.println("");
		//
		// // Wypelnianie tablicy liczbami losowymi z dynamicznie ustalanego zakresu
		//
		// int zakres = 30;
		// for (i = 0; i < rozmiar; i++)
		// tablica_inna[i] = (int) (Math.random() * zakres);
		//
		// for (i = 0; i < rozmiar; i++)
		// System.out.print(tablica_inna[i] + " ");
		//
		// System.out.println("");

		// wypelnienie tablicy wartosciami nieparzystymi malejacymi
		// int j = 0;
		// for (i = 10; i > 0; i--) {
		// if (i % 2 != 0) {
		// tab[j] = i;
		// }
		// else {
		// tab[j] = (i + 1);
		// }
		// j++;
		// }
		//
		// for (i = 0; i < 10; i++)
		// System.out.print(tab[i] + " ");

		// pobranie rozmiaru tablicy przez okienko dialogowe
		String txt;
		txt = JOptionPane.showInputDialog("Wprowadz rozmiar tablicy");
		int rozmiar = Integer.parseInt(txt);
		
		// // pobranie poczatku zakresu losowania
		// txt = JOptionPane.showInputDialog("Wprowadz poczatek zakresu losowania");
		// int a = Integer.parseInt(txt);
		// // pobranie konca zakresu losowania
		// txt = JOptionPane.showInputDialog("Wprowadz koniec zakresu losowania");
		// int b = Integer.parseInt(txt);
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		// utworzenie tablicy dynamicznej o rozmiarze "rozmiar"
		int tab1[] = new int[rozmiar];
		// pêtla przypisuj¹ca losowe wartoœci tablicy w zakresie [a, b]
		for (int i = 0; i < rozmiar; i++) {
			tab1[i] = (int) (Math.random() * (b - a + 1)) + a;
		}
		// wypisanie tablicy na konsole
		for (int i = 0; i < rozmiar; i++) {
			System.out.print(tab1[i] + " ");
		}

		System.out.println("");
		
		//posortowanie tablicy i wypisanie na ekran
		int temp;
		for (int i = 0; i < rozmiar-1; i++) {
			for (int j = 0; j < rozmiar-1-i; j++) {
				if(tab1[j]>tab1[j+1])
				{
					temp = tab1[j+1];
					tab1[j+1] = tab1[j];
					tab1[j] = temp;
				}
			}
		}
		for (int i = 0; i < rozmiar; i++) {
			System.out.print(tab1[i] + " ");
		}
	}

}
