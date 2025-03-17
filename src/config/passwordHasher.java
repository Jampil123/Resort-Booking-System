
package config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class passwordHasher {
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(password.getBytes());
        String encoded = Base64.getEncoder().encodeToString(hashBytes);
        return encoded;
    }
    public static boolean verifyPassword(String enteredPassword, String storedHash) throws NoSuchAlgorithmException {
        String hashedEnteredPassword = hashPassword(enteredPassword); // Hash input password
        return hashedEnteredPassword.equals(storedHash); // Compare with stored hash
    }
}
