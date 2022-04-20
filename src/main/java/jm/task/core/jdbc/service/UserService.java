package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;

import java.util.List;

public interface UserService {
    void createUsersTable(); // создание табл

    void dropUsersTable(); // удаление табл

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id); // удаление юзеров по йд

    List<User> getAllUsers(); // получение всех юзеров

    void cleanUsersTable(); // очистка всех юзеров
}
