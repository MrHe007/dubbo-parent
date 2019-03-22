/**
 * @author shkstart
 * @create 2019-03-22 9:11
 */

import bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

import java.io.IOException;

/**
 * @author hechen
 * @data 2019/3/22
 *
 */
public class ConsumerApp {

    public static void main(String[] args) {

        String xmlPath = "classpath:context.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);

        UserService service = context.getBean(UserService.class);
//        UserService service = (UserService)context.getBean("demoService");
        String str = service.getUserById(10);

        System.out.println(str);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
