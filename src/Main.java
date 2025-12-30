public class Main {
    public static void main(String[] args) {

        Vehicle car=new Car("BWV", 2005, 4, "Petrol");
        Vehicle motorcycle=new Motorcycle("Suzuki", 2018, false);
        Vehicle truck=new Truck("Iveco", 2021, 13.7, 4);

        Driver driver1=new Driver("Jacques Rousseau", "12345");
        Driver driver2=new Driver("Tartaglia Riemann", "12346");

        car.setDriver(driver1);
        motorcycle.setDriver(driver1);
        truck.setDriver(driver2);

        Vehicle[] vehicles={car, motorcycle, truck};

        // Полиморфизм
        for (int i=0; i<vehicles.length; i++) {
            vehicles[i].startEngine();
            vehicles[i].displayInfo();
            vehicles[i].stopEngine();
            System.out.println(" ");
        }
    }
}
