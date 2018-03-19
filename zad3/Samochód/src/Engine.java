
public class Engine {

	public Engine(Engine engine) {
		this.displacement = engine.displacement;
		this.eType = engine.eType;
		this.fType = engine.fType;
	}
	
	
	public Engine(EngineType eT, FuelType fT, double disp) {
		this.eType = eT;
		this.fType = fT;
		this.displacement = disp;
	}
	
	private EngineType eType;
	private FuelType fType;
	private double displacement;
	
	@Override
	
	public String toString() {
		return eType+" "+fType+" "+displacement;
	}
	
	

}
