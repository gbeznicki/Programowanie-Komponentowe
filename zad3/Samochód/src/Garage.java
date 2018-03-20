import java.util.ArrayList;

public class Garage {

	private ArrayList<Samochod> stored;

	public ArrayList<Samochod> getStored() {
		return stored;
	}

	public void setStored(ArrayList<Samochod> stored) {
		this.stored = stored;
	}

	public Garage() {
		stored = new ArrayList<Samochod>();
	}

	public void pullCar(Samochod c1) {
		stored.add(c1);
	}
	
	public Samochod getCar (int index) {
		if(index >= 0)
			return stored.get(index);
		else {
			System.out.println("Nie ma takiego pojazdu");
			return null;
		}
		
	}
	
	//metoda toString()
	public String toString() {
		String out = new String();
		
		for(Samochod i : stored) {
			out += "*********************\n";
			out += "Marka: " + i.getMake()+'\n';
			out += "Model: " + i.getModel()+'\n';
			out += "Silnik: "+ i.getEngine()+'\n';
			out += "Data produkcji: "+ i.getYearOfProduction()+'\n';
			out += "*********************\n";			
		}
		
		return out;
	}
}
