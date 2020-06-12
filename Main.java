/** ЗАДАНИЕ N3.
 * 
 * 1. Разработать иерархию классов – транспортных средств: мотоцикл, автомобиль, грузовик,
 * автобус, прицеп. У объектов – ТС имеются следующие свойства: марка, модель, максимальная 
 * допустимая масса перевозимого груза, кол-во пассажиров, максимальная скорость.
 * 2. Задать методы, с помощью которых можно получить значения свойств.
 * 3. Разработать программу для демонстрации классов.
 Необходимо учесть, что у ТС с прицепом общая допустимая снаряженная масса состоит из суммы
 значений буксирующего ТС и прицепа. Так же необходимо учесть, что по ПДД максимальная разрешенная 
 скорость ТС с прицепом по на 20км/ч чем без него.
*/

package lab2var3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static final String line = "--".repeat(50);

	public static void main(String[] args) {
		
		try {
		
			Scanner in = new Scanner(System.in);
		
			// Создаём мотоцикл
			Motorcycle motorcycle = new Motorcycle("RACER", "RC50 ALPHA", 150, 2, 100);
			
			//Создаём автомобиль
			Car car = new Car("LADA", "Kalina", 200, 5, 250);
			
			//Создаём грузовик
			Truck truck = new Truck("ХЗ", "E500А", 1000, 2, 150);
			
			//Создаём автобус 
			Bus bus = new Bus("Лиаз", "ЗИЛ-158", 1500, 40, 100);
		
			// Создаём прицеп 
			Trailer trailer = new Trailer("Husqvarna", "9535117-02", 225, 0, 0);
		
			System.out.print ( line + "\nЗапущена программа демонстрации транспортных средств\n" + line + "\n Выберите интересующее транспортное средство:");
			System.out.print (  "\n     [1] Мотоцикл"
						   	   +"\n     [2] АвтомобилЬ"
						   	   +"\n     [3] Грузовик"
						   	   +"\n     [4] Автобус"
						   	   +"\n\n Ваш ввод: ");
		
			switch (in.nextInt()) {

			case 1:
				in.close();
				//Сначала выводим инфу без прицепа
				System.out.print(motorcycle.toString());
			
				//Прицепляем прицеп и выводим инфу уже с прицепом
				motorcycle.trailer = trailer;
				System.out.print(motorcycle.toString());
				break;
				
			case 2:
				in.close();
				//Сначала выводим инфу без прицепа
				System.out.print(car.toString());
			
				//Прицепляем прицеп и выводим инфу уже с прицепом
				car.trailer = trailer;
				System.out.print(car.toString());
				break;
				
			case 3:
				in.close();
				//Сначала выводим инфу без прицепа
				System.out.print(truck.toString());
			
				//Прицепляем прицеп и выводим инфу уже с прицепом
				truck.trailer = trailer;
				System.out.print(truck.toString());
				break;
				
			case 4:
				in.close();
				//Сначала выводим инфу без прицепа
				System.out.print(bus.toString());
			
				//Прицепляем прицеп и выводим инфу уже с прицепом
				bus.trailer = trailer;
				System.out.print(bus.toString());
				break;
				
			default:
				in.close();
				System.out.println("\nВыход");
				break;
			}
		}
		
		catch (InputMismatchException ex) {
			
			System.out.println("\nПрервано");
		}

	}

}
