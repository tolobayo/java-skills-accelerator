package exceptionExample;

public class PhoneTesterException {
    public static void main(String[] args) {
        String[] numbers = new String[] { "123-4567", "234-4567", null, "345-5678"};

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(new Phone("iPhone", numbers[i]));
            } catch (IllegalArgumentException e) {
               System.out.println(e.getLocalizedMessage()); 
            }
        }
    }
}
