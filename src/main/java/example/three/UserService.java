package example.three;

import java.util.List;
import java.util.Optional;

public interface UserService {
      void getUserList ();
      Optional <User> findUser (long userId);
      User getUser (long userId);
      User addUser (String name, String surname, String phoneNumber, String email);
      User editUser (long id, String name, String surname, String phoneNumber, String email);

      List<User> findAllUsers ();

}
