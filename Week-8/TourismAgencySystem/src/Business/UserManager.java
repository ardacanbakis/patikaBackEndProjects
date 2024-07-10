package Business;

import Dao.UserDao;
import Entity.User;
import java.util.List;

public class UserManager {
    private UserDao userDao;

    public UserManager() {
        userDao = new UserDao();
    }
    public List<User> getAllUsers() {
        return userDao.findAll();
    }
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }
    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }
    public boolean deleteUser(int userId) {
        return userDao.deleteUser(userId);
    }
    public List<User> getUsersByRole(String role) {
        return userDao.findUsersByRole(role);
    }

    public User findByLogin(String username, String password) {
        return userDao.findByLogin(username, password);
    }
}
