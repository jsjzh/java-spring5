import com.jsjzh.java.spring5.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class TestUser {

  @Test
  public void testUserObject () throws NoSuchMethodException, IllegalAccessException,
    InvocationTargetException, InstantiationException, ClassNotFoundException {
    Class<?> aClass = Class.forName("com.jsjzh.java.spring5.User");
    User     user1  = (User) aClass.getDeclaredConstructor().newInstance();
    System.out.println("user1 = " + user1);
    user1.add();

    GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext(
      "bean.xml");
    User user2 = (User) genericXmlApplicationContext.getBean("user");
    System.out.println("user2 = " + user2);
    user2.add();
  }
}
