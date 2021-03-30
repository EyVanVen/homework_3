package homework3.task3;

public class Plane extends Vehicle{

    int heightInMeters;
    int places;

    public Plane (){
        super.price = 190000;
        super.speed = 870;
        super.year = 2010;
        super.xCoordinate = 839;
        super.yCoordinate = 189;
        heightInMeters = 10000;
        places = 90;
    }

    @Override
    public String toString() {
        System.out.println("Plane: " +
                "height in kilometers=" + heightInMeters/1000 +
                ", places=" + places +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year);
        return null;
    }
}
