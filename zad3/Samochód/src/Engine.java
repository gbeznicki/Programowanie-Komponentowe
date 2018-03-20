
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
	
	public EngineType geteType() {
		return eType;
	}


	public void seteType(EngineType eType) {
		this.eType = eType;
	}


	public FuelType getfType() {
		return fType;
	}


	public void setfType(FuelType fType) {
		this.fType = fType;
	}


	public double getDisplacement() {
		return displacement;
	}


	public void setDisplacement(double displacement) {
		this.displacement = displacement;
	}


	@Override
	
	public String toString() {
		return eType+" "+fType+" "+displacement;
	}
	
	

}
