package exceptionExample;

public class Phone {
    private String phoneType;
    private String phoneNumber;

    public Phone(String phoneType, String phoneNumber) {

        if (phoneNumber == null || phoneType == null) throw new IllegalArgumentException("The type and number cannot be null");

        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    @Override 
    public String toString() {
        return "phoneType: " + phoneType + "phoneNumber: " + phoneNumber; 
    }
}
