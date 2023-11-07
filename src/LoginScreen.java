import java.util.HashMap;
import java.util.Map;

/* classe de autenticacao de banco de dados*/
public class Login {

    public Login() {
        userDatabase = new HashMap<>();
        userDatabase.put("teste", "123");
        userDatabase.put("teste2", "1234");
        userDatabase.put("teste3", "12345");
        userDatabase.put("teste4", "123456");
        userDatabase.put("teste5", "1234567");
    }
    /**
     * metodo de verificacao
     * @param user
     * @param senha
     * @return 
     * retorno do metodo*/
    public boolean login(String user, String senha) { if (userDatabase.containsKey(user)) {
            String storedsenha = userDatabase.get(user);
            if (storedsenha.equals(senha)) {
                return true; 
                // Autenticacao concluida
            }
        }
        return false; 
        // Falha
    }
    /**
     * adiciona um novo usuario
     * @param user
     * @param senha
     */
    public void addUser(String user, String senha) {
        userDatabase.put(user, senha);
    }
}