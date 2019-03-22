/**
 * @author shkstart
 * @create 2019-03-22 9:12
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author hechen
 * @data 2019/3/22
 *
 */
public class ProviderApp {

    public static void main(String[] args) {

        String xmlPath = "classpath:context.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);


        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
