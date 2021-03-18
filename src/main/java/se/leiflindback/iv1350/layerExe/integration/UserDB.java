package se.leiflindback.iv1350.layerExe.integration;

import java.util.ArrayList;
import java.util.List;
import se.leiflindback.iv1350.layerExe.model.dto.UserDTO;

/**
 * All calls to the user database are made from this class.
 */
public class UserDB {
    private List<UserDTO> fakeUserDB = new ArrayList<>();
    
    /**
     * Inserts the specified user into the database.
     * 
     * @param userDTO The user to insert.
     */
    public void createUser(UserDTO userDTO) {
        fakeUserDB.add(userDTO);
    }

}
