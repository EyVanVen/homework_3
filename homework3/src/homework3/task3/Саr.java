package homework3.task3;

public class Саr extends Vehicle{
        public Саr(){
            super.price = 14000;
            super.speed = 220;
            super.year = 1970;
            super.xCoordinate = 990;
            super.yCoordinate = 1890;
        }

    @Override
    public String toString() {
        System.out.println( "Саr: " +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year);
        return null;
    }
}
