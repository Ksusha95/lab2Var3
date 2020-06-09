package lab2var3;

public class Trailer extends Transport {

	public Trailer(String brand, String model, double maxPermissibleMassTransportedCargo, int numberOfPassenger, int maxSpeed) {
		
		super(brand, model, maxPermissibleMassTransportedCargo, numberOfPassenger, maxSpeed);
	}
	
	@Override
	public double getMaxPermissibleMassTransportedCargo() {
		
		return super.getMaxPermissibleMassTransportedCargo();
	}

	@Override
	public String toString() {
		
		return getClass().getSimpleName() + " " + getBrand() + " " + getModel() + " " + getMaxPermissibleMassTransportedCargo() + " кг";
	}

}
