public class PublicTrain extends Locomotive {
  private static int id_gen = 1;
  private int publicTrainID;
  private PublicVan[] PublicVans;

  public PublicTrain(String model, double power, double weight, int numberOfVans, int maxSpeed, int maxVans,
      String fromCity, String toCity, PublicVan[] vans) {
    super(model, power, weight, numberOfVans, maxSpeed, maxVans, fromCity, toCity);
    this.PublicVans = vans;
    publicTrainID = id_gen++;
  }

  public void getPublicTrainData(int id) {
    System.out.printf(
        "Full Information About Train #%d: \nTrain model: %s;\nMax Power: %f;\nWeight: %f\nNumber of Vans: %d;\nFrom City: %s;\nTo City: %s; \nNumber of active vans: %d\n*****\n\n",
        publicTrainID, getModel(), getPower(), getWeight(), getNumberOfVans(), getFromCity(), getToCity(),
        PublicVans.length);
  }
}