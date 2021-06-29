package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String driverPath;
    private static String url;

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

        return instance;
    }

    // get methods
    public String getDriverPath() {
        return driverPath;
    }

    public String getURL() {
        return url;
    }
}
