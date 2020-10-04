package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./data1/config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String propValue = prop.getProperty("username","No such Key");
        System.out.println(propValue);

    }
}
