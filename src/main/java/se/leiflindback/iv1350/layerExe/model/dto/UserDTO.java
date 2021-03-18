package se.leiflindback.iv1350.layerExe.model.dto;

/**
 * Groups all data related to a user.
 */
public class UserDTO {
    private final String name;

    /**
     * Creates a new instance with the specified name.
     * 
     * @param name The newly created user's name
     */
    public UserDTO(String name) {
        this.name = name;
    }
    
    /**
     * @return the user's name. 
     */
    public String getName() {
        return name;
    }    
}
