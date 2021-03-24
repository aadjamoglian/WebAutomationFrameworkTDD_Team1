package arthur;

import common.WebAPI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CapitalOneArthur extends WebAPI {

    public void getCredentials() throws FileNotFoundException {
        Properties login = new Properties();
        try (FileReader in = new FileReader("secret.properties")) {
            login.load(in);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        String username = login.getProperty("username");
        String password = login.getProperty("password");
    }




}
