import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // Declare an array to store Cargo objects
    Cargo[] cargoArray = new Cargo[] {
        new Cargo(1000.5, 500, 3, true),
        new Cargo(2000.2, 800, 6, false),
        new Cargo(3000.1, 1200, 2, true),
        new Cargo(4000.3, 600, 4, false),
        new Cargo(5000.5, 1500, 5, true),
        new Cargo(9000.6, 500, 20, false),
        new Cargo(1250.5, 600, 12, false),
        new Cargo(8000.9, 1000, 5, false),
        new Cargo(6000.8, 900, 3, true),
        new Cargo(2500.1, 800, 8, false),
        new Cargo(3500.7, 1000, 1, false),
        new Cargo(10000.2, 1500, 2, true),
        new Cargo(4500.3, 1200, 16, true),
        new Cargo(5500.1, 600, 12, false),
        new Cargo(6000.7, 800, 18, true),
        new Cargo(3000.4, 750, 20, false),
        new Cargo(9500.4, 1200, 12, false),
        new Cargo(7500.2, 1500, 18, false),
        new Cargo(1000.5, 500, 3, true),
        new Cargo(800.0, 800, 8, false)
    };

    // Declare an array to store Cargo objects
    Passenger[] passengerArray = new Passenger[100];

    // Declare variables to store data read from the file

    // For Passengers
    String fullName = "John Doe";
    int age = 19;
    String IIN = "041023667366";
    String gender = "M";
    boolean isPremium = true;

    // Create a File object to represent the file to be read
    File file = new File("passengers_data.txt");

    // For Passenger -> Parsing data from txt file into array of objects
    try (Scanner scanner = new Scanner(file)) {
      // Use a while loop to read data from the file
      int i = 0;
      while (scanner.hasNextLine()) {
        if (scanner.hasNext())
          fullName = scanner.next();
        if (scanner.hasNextInt())
          age = scanner.nextInt();
        if (scanner.hasNext())
          IIN = scanner.next();
        if (scanner.hasNext())
          gender = scanner.next();
        if (scanner.hasNextBoolean())
          isPremium = scanner.nextBoolean();
        scanner.nextLine();
        // Create a new Passenger object with the data read from the file
        passengerArray[i] = new Passenger(fullName, age, IIN, gender, isPremium);
        i++;
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + file);
    }

    PublicVan[] publicVanArray = new PublicVan[] {
        new PublicVan(60, true, 26000, 60, passengerArray),
        new PublicVan(60, true, 26000, 60, passengerArray),
        new PublicVan(60, true, 26000, 60, passengerArray)
    };

    CargoVan[] cargoVanArray = new CargoVan[] {
        new CargoVan(50000, true, 15000, cargoArray),
        new CargoVan(45000, false, 18000, cargoArray),
        new CargoVan(47000, false, 16000, cargoArray)
    };

    PublicTrain publicTrain = new PublicTrain("SCZ200", 7600, 50000, 40, 200, 40, "Astana", "Aktobe",
        publicVanArray);

    CargoTrain cargoTrain = new CargoTrain("XFA350", 8400, 60000, 30, 250, 30, "Aktobe", "Almaty", cargoVanArray);

    System.out.println("Hello, dear user of RailWay System. To call main menu just write a command \"Menu\"\n");

    while (true) {
      callMenu();

      System.out.print("Enter a command: ");
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      if (n == 1) {
        System.out.println(
            "Main Menu:\n*****\n1 - Get Public Train Data;\n2 - Get Passenger Data;\n3 - Get Public Van Data;\n*****");
        System.out.print("Enter a command: ");
        int ans = in.nextInt();
        switch (ans) {
          case 1:
            publicTrain.getPublicTrainData(0);
            break;
          case 2:
            System.out.print("\nPlease enter ID: ");
            int id = in.nextInt();
            publicVanArray[0].getPassengerData(id);
            break;
          case 3:
            publicVanArray[0].getVanData();
            break;
          default:
            System.out.println("Something went wrong please try again!");
        }
      } else if (n == 2) {
        System.out
            .println(
                "Main Menu:\n*****\n1 - Get Cargo Train Data;\n2 - Get Cargo Data;\n3 - Get Cargo Van Data;\n*****");
        System.out.print("Enter a command: ");
        int ans = in.nextInt();
        switch (ans) {
          case 1:
            cargoTrain.getCargoTrainData(0);
            break;
          case 2:
            System.out.print("\nPlease enter ID: ");
            int id = in.nextInt();
            cargoVanArray[0].getCargoData(id);
            break;
          case 3:
            cargoVanArray[0].getVanData();
            break;
          default:
            System.out.println("Something went wrong please try again!");
        }
      } else if (n == 3) {
        System.out.println("Goodbye, Sir!");
        break;
      } else {
        System.out.println("Something went wrong please try again!");
      }
    }
  }

  public static void callMenu() {
    System.out.println("Main Menu:\n*****\n1 - Public Train Settings;\n2 - Cargo Train Settings;\n3 - Exit\n*****\n");
  }
}