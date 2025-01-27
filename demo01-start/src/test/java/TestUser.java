import com.jsjzh.java.spring5.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class TestUser {
  private Logger logger = LoggerFactory.getLogger(TestUser.class);

  @Test
  public void testUserObject () throws NoSuchMethodException, IllegalAccessException,
    InvocationTargetException, InstantiationException, ClassNotFoundException {
    Class<?> aClass = Class.forName("com.jsjzh.java.spring5.User");
    User     user1  = (User) aClass.getDeclaredConstructor().newInstance();
    System.out.println("user1 = " + user1);
    user1.add();
    logger.info("hello world");

    GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext(
      "bean.xml");
    User user2 = (User) genericXmlApplicationContext.getBean("user");
    System.out.println("user2 = " + user2);
    user2.add();
  }
}
