package web.crud.dao;

import web.crud.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();
    User getUserById(long id);
    void createUser(User user);
    void updateUser(long id, User updatedUser);
    void deleteUser(long id);
    User getUserByEmail(String email);
}
