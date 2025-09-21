import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int maxSpeed = 250;
        final int minSpeed = 1;
        Scanner scan = new Scanner(System.in);
        Leader lead = new Leader();
        int speed = -1;
        String name;
        for (int i = 1; i < 4; i++) {
            System.out.print("\nВведите название " + i + " автомобиля: ");
            name = scan.next();
//            System.out.println(name+" "+name.isEmpty());
            while(name.isEmpty()) {
                System.out.print("Название автомобиля не может быть пустым.\nВведите название " + i + " автомобиля: ");
                name = scan.next();
            }

            do {
                System.out.print("Введите скорость " + i + " автомобиля: ");
                while(!scan.hasNextInt()) {
                    scan.next();
                    System.out.print("Скорость должна быть числом.\nВведите скорость " + i + " автомобиля: ");
                }
                speed = scan.nextInt();
                if (speed < minSpeed || speed > maxSpeed)
                    System.out.println("Скорость должна быть числом в пределах от "+(minSpeed)+" до "+maxSpeed+" включительно.");
            } while (speed < minSpeed || speed > maxSpeed);
            lead.checkChamp(new Car(name, speed));
        }

        System.out.println("\nСамая быстрая машина: "+lead.champName);
    }
}

