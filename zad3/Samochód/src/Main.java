import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Garage g1 = new Garage();
		
		Samochod s1 = new Samochod("SX4", "Suzuki", new Engine(EngineType.V10, FuelType.LPG, 1.6), 2008);
		
		Samochod s2 = new Samochod("Thalia", "Renault", new Engine(EngineType.V12, FuelType.GASOLINE, 1.4), 2010);

		Samochod s3 = new Samochod(s2);
		
		s3.setEngine(new Engine(EngineType.V12, FuelType.DIESEL, 1.4));
		
		Engine e1 = new Engine(EngineType.R6, FuelType.DIESEL, 2.0);
		
		Engine e2 = new Engine(e1);
		
		Samochod s4 = new Samochod("Fabia", "Skoda", e2, 2003);
		
		g1.pullCar(s1);
		g1.pullCar(s2);
		g1.pullCar(s3);
		g1.pullCar(s4);
		
		System.out.print(g1);
		
//		System.out.println("***********************");
//		
//		for(Samochod i : g1.getStored())
//		{
//			System.out.println(i.toString());
//			System.out.println("***********************");
//		}
//		
//		System.out.println("");
//		System.out.println("*****************************");
//		System.out.println("SORTOWANIE PO ROKU PRODUKCJI");
//		System.out.println("*****************************");
//		System.out.println("");
//
//			Collections.sort(g1.getStored());
//		
//		for(Samochod i : g1.getStored()) {
//			System.out.println(i.toString());
//			System.out.println("***********************");		
//			}
//		
//		
//		System.out.println("");
//		System.out.println("*****************************");
//		System.out.println("SORTOWANIE PO POJEMNOŒÆI SILNIKA");
//		System.out.println("*****************************");
//		System.out.println("");
//		
//		Collections.sort(g1.getStored(), new ComparatorEngine());
//		
//
//		for(Samochod i : g1.getStored()) {
//			System.out.println(i.toString());
//			System.out.println("***********************");		
//			}
	}

}
