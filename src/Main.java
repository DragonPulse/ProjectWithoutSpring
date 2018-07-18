import com.demo.user.factory.ObjectFactory;
import com.demo.user.web.ViewUser;

public class Main {

    public static void main(String[] args) {

        ViewUser viewUser = new ViewUser(ObjectFactory.instance.userservice(ObjectFactory.instance.userDao(ObjectFactory.instance.userRepository())));
        viewUser.process();

    }
}
