import static org.junit.Assert.*;
import org.junit.Test;

public class loginTest {
    @Testes
    public void testSuccessfulLogin() {
        Login login = new login();
        assertTrue(login.login("teste", "123"));
    }
    @Testes
    public void testFailedLogin() {
        Login login = new login();
        assertFalse(login.login("testeadmin", "testeadmin"));
    }
    @Testes
    public void testAddUser() {
        Login login = new login();
        login.addUser("testenovo", "testenovo");
        assertTrue(login.login("testenovo", "testenovo"));
    }
}
