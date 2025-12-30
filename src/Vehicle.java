public abstract class Vehicle {

    private String brand;
    protected int year;
    protected Driver driver;

    public Vehicle(String brand, int year) {
        this.brand=brand;
        this.year=year;
    }
    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo() {
        System.out.println("Brand: " + brand + "\n Year: " + year);
        if(driver!=null){
            driver.displayDriverInfo();
        }
        else{
            System.out.println("There is no driver");
        }
    }
    public void setDriver(Driver driver) {
        this.driver=driver;
    }
}
