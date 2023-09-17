import java.util.Random;

public class OTPGenerator {

    public static char[] generateOTP(int length) {
        System.out.println("Generating OTP using random:");
        System.out.print("Your OTP is: ");

        String numbers = "0123456789";
        Random random = new Random();
        char[] otp = new char[length];

        for (int i = 0; i < length; i++) {
            otp[i] = numbers.charAt(random.nextInt(numbers.length()));
        }

        return otp;
    }

    public static char[] generatePassword(int length) {
        System.out.println("Generating password using random:");
        System.out.print("Your new password is: ");

        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
        String allValues = capitalChars + smallChars + numbers + symbols;

        Random random = new Random();
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            password[i] = allValues.charAt(random.nextInt(allValues.length()));
        }

        return password;
    }

    public static void main(String[] args) {
        int otpLength = 5;
        System.out.println(generateOTP(otpLength));

        int passwordLength = 8;
        System.out.println(generatePassword(passwordLength));
    }
}
