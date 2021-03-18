package se.leiflindback.iv1350.layerExe.controller;

import se.leiflindback.iv1350.layerExe.integration.UserDB;
import se.leiflindback.iv1350.layerExe.model.User;
import se.leiflindback.iv1350.layerExe.model.dto.UserDTO;

/**
 * This is the application's only controller. All calls to model and integration pass through here.
 */
public class Controller {
    private UserDB userDB;
    private User user;
    
    /**
     * Registers the specified user.
     * 
     * @param userDTO The user to register.
     */
    public void registerUser(UserDTO userDTO) {
        userDB.createUser(userDTO);
        user = new User(userDTO);
    }
}
