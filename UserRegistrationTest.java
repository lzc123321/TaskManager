import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author asus
 */
public class UserRegistrationTest {
    @Test
    public void testUserRegistration() {
        UserRegistration userRegistration = new UserRegistration();
        assertTrue(userRegistration.register("user1", "password1"));
        assertFalse(userRegistration.register("user1", "password1")); // ⽤户
    }
}