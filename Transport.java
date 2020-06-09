package lab2var3;
import static lab2var3.Main.line;

/* СУКИ, ЧИТАЙТЕ КОММЕНТЫ!!!
 * 
 * Создадим абстрактный класс транспорт, от него будут наследоваться все виды транспорта: мотоцикл, автомобиль, грузовик,
 * автобус, прицеп
 * Все они ЯВЛЯЮТСЯ (признак наследования - слово ЯВЛЯЕТСЯ) транспортом, поэтому будут наследоваться от класса транспорт, всё логично.
 * 
 * У всех этих видов транспорта есть ОБЩИЕ свойства: марка, модель, максимальная 
 * допустимая масса перевозимого груза, кол-во пассажиров, максимальная скорость.
 * 
 * Поэтому мы все эти характеристики выгрузим в этот абстрактный класс, чтобы не повторять одно и то же в каждом классе-наследнике
 * 
 * СУКИ, ЧИТАЙТЕ КОММЕНТЫ ДО КОНЦА!!!*/

public abstract class Transport {
	
	private String brand; 
	private String model; 
	private double maxPermissibleMassTransportedCargo = 0; 
	private int numberOfPassengers = 0; 
	private int maxSpeed = 0;
	
	
	//Конструктор:
	public Transport(String brand, String model, double maxPermissibleMassTransportedCargo, int numberOfPassenger, int maxSpeed) {
		
		this.brand = brand;
		this.model = model;
		
		if (maxPermissibleMassTransportedCargo < 0) 
			System.out.println("\n !!! Масса груза " + getClass().getSimpleName() + " не может быть отрицательной. Оставлено значение по умолчанию: 0\n");
		else this.maxPermissibleMassTransportedCargo = maxPermissibleMassTransportedCargo;
		
		if (numberOfPassenger < 0)
			System.out.println("\n !!! Количество пассажиров в " + getClass().getSimpleName() + " не может быть отрицательным. Оставлено значение по умолчанию: 0 \n");
		else this.numberOfPassengers = numberOfPassenger;
		
		if (maxSpeed < 0) 
			System.out.println("\n !!! Cкорость " + getClass().getSimpleName() + " не может быть отрицательной. Оставлено значение по умолчанию: 0 \n");
		else this.maxSpeed = maxSpeed;
		
	}
	
	//Задать методы, с помощью которых можно получить значения свойств.
	/* Так как переменные класса являются приватными, их нельзя просто так взять и вывести в Main. 
	 * Класс Main их тупо не видит, так как они скрыты и доступны только в пределах того класса, в котором объявлены
	 * (это называется инкапсуляция)
	 * Поэтому мы сейчас реализуем методы-"геттеры" - эти методы будут ПРОСТО возвращать значения переменных, а так как методы публичные,
	 * то мы сможем пользоваться ими и в классе Main*/
	
	public String getBrand() {
		
		return brand;
	}
	
	public String getModel() {
		
		return model;
	}
	
	public double getMaxPermissibleMassTransportedCargo() {
		
		return maxPermissibleMassTransportedCargo;
	}
	
	public int getNumberOfPassengers() {
		
		return numberOfPassengers;
	}
	
	public int getMaxSpeed() {
		
		return maxSpeed;
	}
	
	//Максимальную скорость и массу будем выводить в каждом классе-наследнике отдельно
	public String toString() {
		
		return line + "\nДемонстрация транспортного средства: " + getClass().getSimpleName() + "\n" + line
			 + "\n  Марка/модель:  \t\t" + getBrand() + " " + getModel()
			 + "\n  Количество пассажиров:  \t" + getNumberOfPassengers();
	}

}
