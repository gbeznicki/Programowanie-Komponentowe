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
}
