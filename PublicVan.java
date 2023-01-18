public class PublicVan extends Van {
  private static int count_id = 1;
  private int publicVanID;
  private int accessibleSeats;
  private Passenger[] passenger;
  private double totalVanWeight;
  private int totalIncome = 0;

  public PublicVan(int capacity, boolean isAccessible, double weight, int accessibleSeats, Passenger[] passenger) {
    super(capacity, isAccessible, weight);
    this.accessibleSeats = accessibleSeats - passenger.length;
    this.passenger = passenger;
    publicVanID = count_id++;
  }

  public int getAccessibleSeats() {
    return accessibleSeats;
  }

  public void setAccessibleSeats(int accessibleSeats) {
    this.accessibleSeats = accessibleSeats;
  }

  public void getPassengerData(int id) {
    if (passenger[id].getIsPremium()) {
      System.out.println("⭐ Premium Passenger ⭐");
    } else {
      System.out.println("⭐ Simple Passenger ⭐");
    }
    System.out.printf(
        "Info About Passenger:\n*****\nPassengerID: %d, FullName: %s;\nAge: %d y.o.;\nIIN: %s;\nGender: %s;\nVan ID: %d;\n*****\n\n",
        passenger[id].getID(), passenger[id].getFullName(), passenger[id].getAge(), passenger[id].getIIN(),
        passenger[id].getGender(), publicVanID);
  }

  @Override
  public double getVanWeight() {
    totalVanWeight = getWeight() + (getCapacity() - accessibleSeats) * 75;
    return totalVanWeight;
  }

  public int getTotalIncome() {
    for (int i = 0; i < passenger.length; i++) {
      if (passenger[i].getIsPremium()) {
        totalIncome += 45000;
      } else {
        totalIncome += 15000;
      }
    }
    return totalIncome;
  }

  public void getVanData() {
    System.out.printf(
        "Info About Van of the Public Train:\n*****\nVan ID: %d;\nTotal Capacity: %d seats;\nAccessible Seats: %d seats;\nTotal Weight: %f kg; \nTotal Income: %d ₸\n*****\n\n",
        publicVanID, getCapacity(), accessibleSeats, getVanWeight(), getTotalIncome());
  }

  @Override
  public void accessChange() {
    if (isAccessible()) {
      setAccessible(false);
      System.out.println("State was successfully changed. Van is now not accessible!");
    } else {
      setAccessible(true);
      System.out.println("State was successfully changed. Van is now accessible!");
    }
  }
}