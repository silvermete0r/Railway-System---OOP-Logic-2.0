public class CargoTrain extends Locomotive {
  private static int id_gen = 1;
  private int cargoTrainID;
  private CargoVan[] cargoVans;

  public CargoTrain(String model, double power, double weight, int numberOfVans, int maxSpeed, int maxVans,
      String fromCity, String toCity, CargoVan[] vans) {
    super(model, power, weight, numberOfVans, maxSpeed, maxVans, fromCity, toCity);
    this.cargoVans = vans;
    cargoTrainID = id_gen++;
  }

  public void getCargoTrainData(int id) {
    System.out.printf(
        "Full Information About Train #%d: \nTrain model: %s;\nMax Power: %f;\nWeight: %f\nNumber of Vans: %d;\nFrom City: %s;\nTo City: %s; \nNumber of active vans: %d\n*****\n\n",
        cargoTrainID, getModel(), getPower(), getWeight(), getNumberOfVans(),  getFromCity(), getToCity(), cargoVans.length);
  }
}