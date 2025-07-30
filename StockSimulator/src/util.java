import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class util {
    private static final String ENVPATH = "./config";
    private static Properties properties;

    static {
        try {
        properties = new Properties();
        FileInputStream input = new FileInputStream(ENVPATH);
            properties.load(input);
    } catch (IOException e) {
            System.err.println("Error loading config file: " + e.getMessage());
    }
    }

    public static String getApiKey() {
        return properties.getProperty("API_KEY");
    }
        
}
