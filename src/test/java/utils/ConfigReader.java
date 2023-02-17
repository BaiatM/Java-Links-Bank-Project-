package utils;

import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    public static void initializeProperties(){

        try {
            //we r creating an object of FileReader and passing the path to it.
            //FileReader is a class in java which is used to read info from files
            //it throws and exception which is y we have to surround it with try/catch block
            FileReader fileReader = new FileReader("src/test/resources/config.properties");
            //here we r initializing our Properties object
            properties = new Properties();
            //here we r using the .load(fileReader) method in order to pass the file reader to the properties object
            properties.load(fileReader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        //we r returning the value stored inside of the key passed as an argument to this method
        return properties.getProperty(key);
    }
}
