package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class QaProps {
    public static Properties properties;
    private QaProps(){

    }
    public static void init(){
        if(properties == null) {
            properties = new Properties();
            try{
                properties.load(new FileInputStream("src/test/resources/env.properties"));
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static String getvalue(String key)  {
        init();
        return properties.getProperty(key);
    }
}
