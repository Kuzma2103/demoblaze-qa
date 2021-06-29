package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String driverPath;
    private static String url;
    private static String reg_email;
    private static String reg_password;

    public static PropertyManager getInstance() {

        Properties properties = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fileInput = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fileInput);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driverPath = properties.getProperty("driverPath");
        url = properties.getProperty("url");
        reg_email = properties.getProperty("reg_email");
        reg_password = properties.getProperty("reg_password");

        return instance;
    }

    // get methods
    public String getDriverPath() {
        return driverPath;
    }

    public String getURL() {
        return url;
    }

    public String getRegEmail() {
        return reg_email;
    }

    public String getRegPassword() {
        return reg_password;
    }
}
