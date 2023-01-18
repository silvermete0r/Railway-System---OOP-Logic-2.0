public abstract class Van {
    private int capacity; 
    private boolean isAccessible;
    private double weight = 26000;

    public Van(int capacity, boolean isAccessible, double weight) {
        this.capacity = capacity;
        this.isAccessible = isAccessible;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAccessible() {
        return isAccessible;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setWeight(double weight) {
      this.weight = weight;
    }

    public double getWeight() {
      return weight;
    }

    public void setAccessible(boolean accessible) {
        isAccessible = accessible;
    }

    // abstract method to be implemented by subclasses
    public abstract double getVanWeight();
    public abstract void accessChange();
}