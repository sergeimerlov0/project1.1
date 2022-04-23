package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {

    private static final UserService userService = new UserServiceImpl();
    private static final User user1 = new User("Petr", "Ivanov", (byte) 20);
    private static final User user2 = new User("Vasy", "Petrov", (byte) 25);
    private static final User user3 = new User("Sergey", "Sidorov", (byte) 31);
    private static final User user4 = new User("Anton", "Krilov", (byte) 38);
    public static void main(String[] args) {

        userService.createUsersTable();

        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());

        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());

        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());

        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
