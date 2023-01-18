public class CargoVan extends Van {
  private static int counter = 1;
  private int cargoVanID;
  private int totalIncome = 0;
  private double totalVanWeight = 0;
  private Cargo [] cargos;

  public CargoVan(int capacity, boolean isAccessible, double weight, Cargo [] cargos) {
    super(capacity, isAccessible, weight);
    this.cargos = cargos;
    this.cargoVanID = counter++; 
  }

  public void getVanData() {
    System.out.printf("Info About Van of the Cargo Train:\n*****\nVan ID: %d;\nTotal Capacity: %d kg;\nTotal Weight: %f kg; \nTotal Income: %d ₸\n*****\n\n", cargoVanID, getCapacity(), getVanWeight(), getTotalIncome());
  }

  @Override
  public double getVanWeight() {
    totalVanWeight = getWeight();
    for(int i=0; i<cargos.length; i++) {
      totalVanWeight += cargos[i].getWeight() * cargos[i].getQuantity();
    }
    return totalVanWeight;
  }

  public void getCargoData(int id) {
    if (cargos[id].isDangerous()) {
      System.out.println("📦 Dangerous Cargo 📦");
    } else {
      System.out.println("📦 Safe Cargo 📦");
    }
    System.out.printf(
        "Info About Cargo:\n*****\nCargoID: %d, Weight: %f;\nPrice: %d y.o.;\nQuantity: %d;\nVan ID: %d;\n*****\n\n", cargos[id].getCargoID(), cargos[id].getWeight(), cargos[id].getPrice(), cargos[id].getQuantity(), cargoVanID);
  }

  public int getTotalIncome() {
    for(int i=0; i<cargos.length; i++) {
        totalIncome += cargos[i].getPrice() * cargos[i].getQuantity();
    }
    return totalIncome;
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