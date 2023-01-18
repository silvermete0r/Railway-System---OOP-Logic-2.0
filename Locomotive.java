class Locomotive {
    private String model;
    private double power;
    private double weight;
    private int numberOfVans;
    private int maxSpeed;
    private int maxVans;
    private String fromCity;
    private String toCity;

    public Locomotive(String model, double power, double weight, int numberOfVans, int maxSpeed, int maxVans, String fromCity, String toCity) {
        this.model = model;
        this.power = power;
        this.weight = weight;
        this.numberOfVans = numberOfVans;
        this.maxSpeed = maxSpeed;
        this.maxVans = maxVans;
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    public double getWeight() {
        return weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
  
    public void setMaxSpeed(int maxSpeed) {
      this.maxSpeed = maxSpeed;
    }
  
    public int getMaxSpeed() {
      return maxSpeed;
    }

    public void setMaxVans(int maxVans) {
      this.maxVans = maxVans;
    }
  
    public int getMaxVans() {
      return maxVans;
    }
  
    public void setFromCity(String fromCity) {
      this.fromCity = fromCity;
    }

    public String getFromCity() {
      return fromCity;
    }

    public void setToCity(String toCity) {
      this.toCity = toCity;
    }

    public String getToCity() {
      return toCity;
    }

    public int getNumberOfVans() {
      return numberOfVans;
    }

    public void setNumberOfVans(int numberOfVans) {
      this.numberOfVans = numberOfVans;
    }
}
