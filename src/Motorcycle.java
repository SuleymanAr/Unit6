public class Motorcycle implements MotorVehicle {
	//Create The Variables
    private String make;
    private String model;
    private int yearOfManufacture;
    private int numberOfWheels;
    private String type;

    public Motorcycle(String make, String model, int yearOfManufacture) {
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    
	//Implement The Functions From THe Interface
    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public void setNumberOfWheels(int wheels) {
        this.numberOfWheels = wheels;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

	@Override
	public void setMotorcycleType(String type) {
		this.type = type ;
		
	}

	@Override
	public String getMotorcycleType() {
		return type;
	}
}
