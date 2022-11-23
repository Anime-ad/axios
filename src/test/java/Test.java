import com.liang.pojo.Users;
import com.liang.service.imp.UserImplementation;

import java.util.List;

/**
 * @author Beyond
 * @date 2022/11/14
 */
public class Test {
   UserImplementation userImplementation = new UserImplementation();
   static String string;
    @org.junit.Test
    public void userTest(){
//        int dcw = userImplementation.insertUser(2020590632  , "dcw1", "456");
//        System.out.println(dcw);
        List<Users> users = userImplementation.selectUser();
        users.forEach(System.out::println);
    }

}
