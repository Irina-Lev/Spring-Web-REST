package example.three;


import java.util.*;


public class InMemoryUserService implements UserService {
    private long userId = 1L;
    private final Map<Long, User> users;

    public InMemoryUserService() {
        this.users = new HashMap<>();
    }

    @Override
    public void getUserList() {
        System.out.println(users);
    }

    @Override
    public Optional<User> findUser(long userId) {
        return Optional.ofNullable(users.get(userId));
    }

    @Override
    public User getUser(long userId) {
        return findUser(userId).orElseThrow(() -> new IllegalArgumentException("User not fond " + userId));
    }

    @Override
    public User addUser(String name, String surname, String phoneNumber, String email) {
        var user = new User(userId, name, surname, phoneNumber, email);
        users.put(userId++, user);
        return user;
    }


    @Override
    public User editUser(long userId, String name, String surname, String phoneNumber, String email) {
        var user = getUser(userId);
        user.setName(name);
        user.setSurname(surname);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        return user;
    }

    @Override
    public List<User> findAllUsers() {
        List <User>  usersList = new ArrayList<>(users.values());
        return usersList;
    }
}
