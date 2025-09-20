import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int maxSpeed = 250;
        final int minSpeed = 0;
        Scanner scan = new Scanner(System.in);
        Leader lead = new Leader();
        int speed;
        String name;
        {
            System.out.print("\nВведите название " + 1 + " автомобиля: ");
            name = scan.next();
            do {
                System.out.print("Введите скорость " + 1 + " автомобиля: ");
                speed = scan.nextInt();
                if (speed <= minSpeed || speed > maxSpeed)
                    System.out.println("Скорость должна быть в пределах от 1 до 250 включительно");
            } while (speed <= minSpeed || speed > maxSpeed);
            Car newCar = new Car(name, speed);
            lead.checkChamp(newCar);
        }
        {
            System.out.print("\nВведите название " + 2 + " автомобиля: ");
            name = scan.next();
            do {
                System.out.print("Введите скорость " + 2 + " автомобиля: ");
                speed = scan.nextInt();
                if (speed <= 0 || speed > 250)
                    System.out.println("Скорость должна быть в пределах от 1 до 250 включительно");
            } while (speed <= 0 || speed > 250);
            Car newCar = new Car(name, speed);
            lead.checkChamp(newCar);
        }
        {
            System.out.print("\nВведите название " + 3 + " автомобиля: ");
            name = scan.next();
            do {
                System.out.print("Введите скорость " + 3 + " автомобиля: ");
                speed = scan.nextInt();
                if (speed <= 0 || speed > 250)
                    System.out.println("Скорость должна быть в пределах от 1 до 250 включительно");
            } while (speed <= 0 || speed > 250);
            Car newCar = new Car(name, speed);
            lead.checkChamp(newCar);
        }
        System.out.println("\nСамая быстрая машина: "+lead.champName);
    }
}

