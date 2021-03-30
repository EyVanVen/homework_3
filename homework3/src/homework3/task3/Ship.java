package homework3.task3;

public class Ship extends Vehicle{

    int passengers;
    String port;

    public Ship(){
        super.price = 190000;
        super.speed = 870;
        super.year = 2010;
        super.xCoordinate = 839;
        super.yCoordinate = 189;
        passengers = 120;
        port = "Naples";
    }

    @Override
    public String toString() {
        System.out.println("Ship: " +
                "passengers=" + passengers +
                ", port='" + port + '\'' +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year);
        return null;
    }
}
