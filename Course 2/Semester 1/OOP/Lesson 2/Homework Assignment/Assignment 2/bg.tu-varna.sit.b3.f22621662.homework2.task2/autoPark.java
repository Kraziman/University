public class autoPark {
    car[] cars;

    public autoPark(int arrLength){
        cars = new car[arrLength];
    }

    public String getCarWithMinMileage(){
        car minMileageCar = null;
        for (int i = 0; i < cars.length; i++){
            if (cars[i] == null){
            }
            else if (minMileageCar == null){
                minMileageCar = cars[i];
            }
            else if (cars[i].getMileage() < minMileageCar.getMileage()){
                minMileageCar = cars[i];
            }
        }
        return "\nBrand: " + minMileageCar.getBrand() + "\nRegistration Number: " + minMileageCar.getRegistrationNumber() + "\nMileage: " + minMileageCar.getMileage();
    }
}
