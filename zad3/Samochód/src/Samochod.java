
public class Samochod implements Comparable<Samochod>{

	public Samochod (Samochod s) {
		this.make = s.make;
		this.model = s.model;
		this.engine = s.engine;
		this.yearOfProduction = s.yearOfProduction;
	}
	
	public Samochod (String model, String make, Engine engine, int yOP) {
		this.model = model;
		this.make = make;
		this.engine = engine;
		this.yearOfProduction = yOP;
	}
	
	private String model, make;
	private Engine engine; 
	private int yearOfProduction;
	
	public String getModel(){
		return this.model;
	}
	
	public String getMake(){
		return this.make;
	}
	
	public Engine getEngine(){
		return this.engine;
	}
	
	public int getYearOfProduction(){
		return this.yearOfProduction;
	}
	
	public void setModel(String modelName) {
		this.model = modelName;
	}
	
	public void setMake(String makeName) {
		this.make = makeName;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void setYOP(int yOP) {
		this.yearOfProduction = yOP;
	}
	
	@Override
	public String toString() {
		return "Marka: "+make+"\n"+"Model: "+model+"\n"+
	"Silnik: "+engine+"\n"+"Data Produkcji: "+yearOfProduction;
	}
	// metoda z interfejsu Comparable - sprawdz jak j¹ u¿yæ
	@Override
	public int compareTo(Samochod other) {
		return Integer.compare(this.yearOfProduction, other.yearOfProduction);
	}
	
}
