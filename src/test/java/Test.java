import com.liang.pojo.User;
import com.liang.utils.GsonUtil;

/**
 * @author Beyond
 * @date 2022/11/14
 */
public class Test {
    GsonUtil gsonUtil = new GsonUtil();
   static String string;
    @org.junit.Test
    public void userTest(){
        User user = new User("456","789");
         string = gsonUtil.beanToJson(user);
        System.out.println(string);
        gsonUtil.jsonToBean(string, User.class);
        System.out.println(user.toString());
        System.out.println(user.getName());
    }

}
