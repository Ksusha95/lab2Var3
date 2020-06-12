package lab2var3;

import static lab2var3.Main.line;

public class Car extends Transport {
	
	/* Так как к каждому транспортному средству можно прицепить прицеп (LOL), то в каждом транспортном средстве будет переменная типа Trailer.
	 * Если прицепа нет, то его значение будет null. Если он есть, то мы создадим объет типа прицеп и кинем этому транспортному
	 * средству ссылку на свежесозданный объект типа прицеп.
	 */
	
	private Trailer trailer = null;

	public Car(String brand, String model, double maxPermissibleMassTransportedCargo, int numberOfPassenger, int maxSpeed) {
		
		super(brand, model, maxPermissibleMassTransportedCargo, numberOfPassenger, maxSpeed);
	}
	
	public void setTrailer(Trailer trailer) {
		this.trailer = trailer;
	}
	
	@Override
	public double getMaxPermissibleMassTransportedCargo() {
		
		//Если прицеп есть, то мы возвращаем МахМассу машины + МахМассу прицепа
		
		if (trailer != null) 
			return super.getMaxPermissibleMassTransportedCargo() + trailer.getMaxPermissibleMassTransportedCargo();
		
		//Если прицепа нет, то мы возвращаем МахМассу машины и всё
		else 
			return super.getMaxPermissibleMassTransportedCargo();
	}
	
	@Override
	public int getMaxSpeed() {
		
		//Если прицеп есть и скорость ТС задана верно, то мы отнимаем от скорости ТС 20км/ч (по условию задачи)
		
		if (trailer != null && super.getMaxSpeed() != 0) 
			return super.getMaxSpeed() - 20;
		
		//Если прицепа нет или скорость ТС была задана некорректно, то мы возвращаем скорость машины и всё
		else 
			return super.getMaxSpeed();
	}

	@Override
	public String toString() {
		
		if (trailer == null)
			return super.toString() 
					+ "\n  Допустимая масса груза:  \t" + getMaxPermissibleMassTransportedCargo() + " кг"
					+ "\n  Максимальная скорость:   \t" + getMaxSpeed() + " км/ч\n";
		
		else 
			return super.toString() 
					+ "\n  *** \n  К " + getClass().getSimpleName() + " добавлен прицеп с характеристиками: " + trailer.toString()
					+ "\n  Допустимая масса груза и скорость ТС будут пересчитаны с учётом прицепа \n  ***"
					+ "\n  Допустимая масса груза:  \t" + getMaxPermissibleMassTransportedCargo() + " кг" 
					+ "\n  Максимальная скорость:   \t" + getMaxSpeed() + " км/ч\n" + line;
	}
}
