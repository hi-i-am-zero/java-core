package buoi4.BTVN;

import java.util.regex.Pattern;

public class Bai2 {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Regular expression to match valid phone numbers
        String regex = "^(\\+84|84|0)?\\d{3}[-.]?\\d{3}[-.]?\\d{3}$";

        // Compile the regex and match with the input
        return Pattern.matches(regex, phoneNumber);
    }

    public static void main(String[] args) {
        // Test cases
        String[] testNumbers = {
                "+84123456789", "84123456789", "0123456789", "0xxx.xxx.xxx", "0xxx-xxx-xxx",
                "+84123.456.789", "84123-456-789", "123456789", "123.456.789", "123-456-789"
        };

        for (String number : testNumbers) {
            System.out.println("Phone number: " + number + " is valid: " + isValidPhoneNumber(number));
        }
    }
}
