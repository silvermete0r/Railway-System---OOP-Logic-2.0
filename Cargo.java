public class Cargo {
    private static int counter=0;
    private int cargoID;
    private double weight = 4000;
    private int price = 600000;
    private int quantity = 3;
    private boolean isDangerous = true;
    
    public Cargo(double weight, int price, int quantity, boolean isDangerous) {
        this();
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;
        this.isDangerous = isDangerous;
    }
    public Cargo() {
      cargoID = counter++;
    }

    public int getCargoID() {
        return cargoID;
    }
    
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public boolean isDangerous() {
        return isDangerous;
    }
    public void setDangerous(boolean dangerous) {
        this.isDangerous = dangerous;
    }
}
