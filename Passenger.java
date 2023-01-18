public class Passenger {
  private static int count_id = 0;
  private int passengerID;
  private String fullName;
  private int age;
  private String IIN;
  private String gender;
  private boolean isPremium = false;

  public Passenger(String fullName, int age, String IIN, String gender, boolean isPremium) {
    this();
    this.fullName = fullName;
    this.age = age;
    this.IIN = IIN;
    this.gender = gender;
    this.isPremium = isPremium;
  }

  public Passenger() {
    passengerID = count_id++;
  }

  public boolean getIsPremium() {
    return isPremium;
  }

  public void setIsPremium(boolean value) {
    this.isPremium = value;
  }

  public int getID() {
    return passengerID;
  }

  public String getIIN() {
    return IIN;
  }

  public void setIIN(String IIN) {
    this.IIN = IIN;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}