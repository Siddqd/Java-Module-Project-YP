public class Leader {
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
