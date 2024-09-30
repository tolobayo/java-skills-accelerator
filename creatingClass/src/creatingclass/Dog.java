package creatingclass;

public class Dog {
    private String dogName;
    private String dogType;
    private String dogColor;
    private int dogAge;

    public Dog(String dogType, String dogName, String dogColor, int dogAge) {
        this.dogType = dogType;
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    public String getDogName() {
        return this.dogName;
    }
    public String getDogType() {
        return this.dogType;
    }
    public int getDogAge() {
        return this.dogAge;
    }
    public String getDogColor() {
        return this.dogColor;
    }

    public void setDogName(String newName) {
        this.dogName = newName;
    }
    public void setDogType(String newType) {
        this.dogType = newType;
    }
    public void setDogAge(int newAge) {
        this.dogAge = newAge;
    }
    public void setDogColor(String newColor) {
        this.dogColor = newColor;
    }

    @Override
    public String toString() {
        return "Dog type:" + dogType + " Dog name:" + dogName + " Dog color:" + dogColor + " Dog age:" + dogAge;
    }

}
