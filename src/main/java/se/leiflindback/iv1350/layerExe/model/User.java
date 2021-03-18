package se.leiflindback.iv1350.layerExe.model;

import se.leiflindback.iv1350.layerExe.model.dto.UserDTO;

/**
 * Represents a User of the community.
 */
public class User {
    private final UserDTO userDTO;
    
    /**
     * Creates a new instance representing the specified user.
     * 
     * @param userDTO The user specified by the newly created instance.
     */
    public User(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
