package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.util.Properties;

public class FileLib {
    public String getPropertyKeyValue(String propPath, String Key) throws IOException {
        FileInputStream fis = new FileInputStream(propPath);
        Properties prop = new Properties();
        prop.load(fis);
        String propValue = prop.getProperty(Key, "Incorrect Key");
        return propValue;

    }
}
