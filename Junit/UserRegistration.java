public class UserRegistration {
    public static void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty() ||
            email == null || !email.contains("@") ||
            password == null || password.length() < 6) {
            throw new IllegalArgumentException("Invalid user details");
        }
    }
}