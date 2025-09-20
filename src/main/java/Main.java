import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        Leader lead = new Leader();
        int speed;
        String name;
        for (int i = 1; i < 4; i++) {
            System.out.print("\nВведите название "+i+" автомобиля: ");
            name = scan.next();
            do {
                System.out.print("Введите скорость " + i + " автомобиля: ");
                speed = scan.nextInt();
                if (speed <= 0 || speed > 250) System.out.println("Скорость должна быть в пределах от 1 до 250 включительно");
            } while (speed <= 0 || speed > 250);
            cars.add(new Car(name,speed));
            lead.checkChamp(cars.get(i-1));
        }
        System.out.println("\nСамая быстрая машина: "+lead.champName);
    }
}

class Car {
    String name;
    int speed;
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}

class Leader {
    String champName;
    int champLength;

    public Leader() {
        champLength = 0;
    }

    public void checkChamp(Car newCar) {
        if(newCar.speed*24 > champLength) {
            champLength = newCar.speed*24;
            champName = newCar.name;
        }
    }
}