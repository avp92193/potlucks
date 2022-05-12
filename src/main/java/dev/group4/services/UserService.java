package dev.group4.services;

import dev.group4.aspects.InvalidUserNameException;
import dev.group4.entities.User;

public interface UserService {
    /**
     * A method that allows the creation of a new user in the Potluck Application
     * @param user The User to create and their username and password
     * @return a User if the username and password are valid
     * @throws InvalidUserNameException the username or password were invalid
     */
    User registerUser(User user) throws InvalidUserNameException;

    /**
     * A method that allows the user to login to their Potluck Account
     * @param user the User object which contains the username and password
     * @return a User if credentials are valid
     * @throws InvalidUserNameException The password or username was incorrect
     */
    User login(User user) throws InvalidUserNameException;
}
