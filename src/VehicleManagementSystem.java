import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> Cars = new ArrayList<>();
        List<Truck> Trucks = new ArrayList<>();
        List<Motorcycle> Motorcycles = new ArrayList<>();
        int choice = 0;
        boolean validChoice = false;
        boolean isWorking = true;
        
        while(isWorking) {
            while (!validChoice) {
                try {
                	System.out.println(" ");
                    System.out.println("Select vehicle type: 1. Car 2. Motorcycle 3. Truck 4. Show All Info");
                    choice = scanner.nextInt();
                    scanner.nextLine(); 

                    if (choice < 1 || choice > 4) {
                        throw new InputMismatchException();
                    }
                    validChoice = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    scanner.nextLine();
                }
            }

            switch (choice) {
                case 1:
                    Car car = handleCarInput(scanner);
                    displayCarDetails(car);
                    Cars.add(car);
                    validChoice = false;
                    break;
                    
                case 2:
                    Motorcycle motorcycle = handleMotorcycleInput(scanner);
                    displayMotorcycleDetails(motorcycle);
                    Motorcycles.add(motorcycle);
                    validChoice = false;
                    break;
                    
                case 3:
                    Truck truck = handleTruckInput(scanner);
                    displayTruckDetails(truck);
                    Trucks.add(truck);
                    validChoice = false;
                    break;
                case 4:
                	System.out.println(" ");
                	System.out.println("Cars:");
                	for(Car loopcar : Cars){
                		System.out.println(" ");
                		displayCarDetails(loopcar);
                	}
                	
                	System.out.println("Trucks:");
                	for(Truck looptruck : Trucks){
                		System.out.println(" ");
                		displayTruckDetails(looptruck);
                	}
                	System.out.println("Motorcycle:");
                	for(Motorcycle loopMotorcycle : Motorcycles){
                		System.out.println(" ");
                		displayMotorcycleDetails(loopMotorcycle);
                	}
                	validChoice = false;
                	break;
            }
        }
        
        scanner.close();
    }
    
    

    private static Car handleCarInput(Scanner scanner) {
        System.out.println("Enter make:");
        String make = scanner.nextLine();

        System.out.println("Enter model:");
        String model = scanner.nextLine();

        int year = 0;
        boolean validYear = false;
        while (!validYear) {
            try {
                System.out.println("Enter year of manufacture:");
                year = scanner.nextInt();
                scanner.nextLine(); 
                validYear = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid year. Please enter a valid year.");
                scanner.nextLine(); 
            }
        }

        Car car = new Car(make, model, year);

        int doors = 0;
        boolean validDoors = false;
        while (!validDoors) {
            try {
                System.out.println("Enter number of doors:");
                doors = scanner.nextInt();
                scanner.nextLine(); 
                if (doors >= 0) {
                    validDoors = true;
                } else {
                    System.out.println("Number of doors cannot be negative. Please enter a valid number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid number of doors. Please enter a valid number.");
                scanner.nextLine(); 
            }
        }

        car.setNumberOfDoors(doors);

        String fuelType;

        while (true) {
            System.out.println("Enter fuel type (petrol, diesel, electric):");
            fuelType = scanner.nextLine().trim().toLowerCase();

            if (fuelType.equals("petrol") || fuelType.equals("diesel") || fuelType.equals("electric")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'petrol', 'diesel', or 'electric'.");
            }
        }
        car.setFuelType(fuelType);

        return car;
    }

    private static void displayCarDetails(Car car) {
        System.out.println("Car Details:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYearOfManufacture());
        System.out.println("Number of doors: " + car.getNumberOfDoors());
        System.out.println("Fuel type: " + car.getFuelType());
    }

    private static Motorcycle handleMotorcycleInput(Scanner scanner) {
        System.out.println("Enter make:");
        String make = scanner.nextLine();

        System.out.println("Enter model:");
        String model = scanner.nextLine();

        int year = 0;
        boolean validYear = false;
        while (!validYear) {
            try {
                System.out.println("Enter year of manufacture:");
                year = scanner.nextInt();
                scanner.nextLine(); 
                validYear = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid year. Please enter a valid year.");
                scanner.nextLine(); 
            }
        }

        Motorcycle motorcycle = new Motorcycle(make, model, year);

        int wheels = 0;
        boolean validWheels = false;
        while (!validWheels) {
            try {
                System.out.println("Enter number of wheels:");
                wheels = scanner.nextInt();
                scanner.nextLine(); 
                if (wheels >= 0) {
                    validWheels = true;
                } else {
                    System.out.println("Number of wheels cannot be negative. Please enter a valid number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid number of wheels. Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
        motorcycle.setNumberOfWheels(wheels);

        String bikeType;

        while (true) {
            System.out.println("Enter motorcycle type (sport, cruiser, off-road):");
            bikeType = scanner.nextLine().trim().toLowerCase();

            if (bikeType.equals("sport") || bikeType.equals("cruiser") || bikeType.equals("off-road")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'sport', 'cruiser', or 'off-road'.");
            }
        }

        motorcycle.setMotorcycleType(bikeType);

        return motorcycle;
    }

    private static void displayMotorcycleDetails(Motorcycle motorcycle) {
        System.out.println("Motorcycle Details:");
        System.out.println("Make: " + motorcycle.getMake());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Year: " + motorcycle.getYearOfManufacture());
        System.out.println("Number of wheels: " + motorcycle.getNumberOfWheels());
        System.out.println("Motorcycle type: " + motorcycle.getMotorcycleType());
    }

    private static Truck handleTruckInput(Scanner scanner) {
        System.out.println("Enter make:");
        String make = scanner.nextLine();

        System.out.println("Enter model:");
        String model = scanner.nextLine();

        int year = 0;
        boolean validYear = false;
        while (!validYear) {
            try {
                System.out.println("Enter year of manufacture:");
                year = scanner.nextInt();
                scanner.nextLine(); 
                validYear = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid year. Please enter a valid year.");
                scanner.nextLine(); 
            }
        }

        Truck truck = new Truck(make, model, year);

        double cargoCapacity = 0;
        boolean validCargoCapacity = false;
        while (!validCargoCapacity) {
            try {
                System.out.println("Enter cargo capacity (in tons):");
                cargoCapacity = scanner.nextDouble();
                scanner.nextLine(); 
                if (cargoCapacity >= 0) {
                    validCargoCapacity = true;
                } else {
                    System.out.println("Cargo capacity cannot be negative. Please enter a valid number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid cargo capacity. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        truck.setCargoCapacity(cargoCapacity);

        String transmissionType;

        while (true) {
            System.out.println("Enter transmission type (manual, automatic):");
            transmissionType = scanner.nextLine().trim().toLowerCase();

            if (transmissionType.equals("manual") || transmissionType.equals("automatic")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'manual' or 'automatic'.");
            }
        }
        truck.setTransmissionType(transmissionType);

        return truck;
    }

    private static void displayTruckDetails(Truck truck) {
        System.out.println("Truck Details:");
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Year: " + truck.getYearOfManufacture());
        System.out.println("Cargo capacity: " + truck.getCargoCapacity() + " tons");
        System.out.println("Transmission type: " + truck.getTransmissionType());
    }
}