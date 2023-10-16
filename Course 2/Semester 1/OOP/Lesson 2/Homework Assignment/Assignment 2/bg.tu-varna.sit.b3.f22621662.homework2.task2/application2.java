public class application2 {
    public static void main(String[] args) {
        car car1 = new car("BMW", "B 0000 AT", 103777);
        System.out.println(car1.print());
        car car2 = new car("Mercedes", "B 0001 AT", 1037477);
        car car3 = new car("Toyota", "B 0002 AT", 403777);
        car car4 = new car("Skoda", "B 0003 AT", 93777);
        car car5 = new car("Audi", "B 0004 AT", 703777);

        autoPark autoPark1 = new autoPark(50);

        autoPark1.cars[1] = car1;
        autoPark1.cars[2] = car2;
        autoPark1.cars[3] = car3;
        autoPark1.cars[4] = car4;
        autoPark1.cars[5] = car5;

        System.out.println(autoPark1.getCarWithMinMileage());

    }
}
