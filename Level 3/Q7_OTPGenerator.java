import java.util.HashSet;

public class Q7_OTPGenerator {

    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        System.out.println("Are OTPs Unique: " + areOTPsUnique(otpArray));
    }

    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    public static boolean areOTPsUnique(int[] otpArray) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otpArray) {
            uniqueOTPs.add(otp);
        }
        return uniqueOTPs.size() == otpArray.length;
    }
}
