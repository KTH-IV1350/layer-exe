package se.leiflindback.iv1350.layerExe.view;

import se.leiflindback.iv1350.layerExe.controller.Controller;
import se.leiflindback.iv1350.layerExe.model.dto.UserDTO;

/**
 * This is a placeholder for the entire view.
 */
public class View {
    private Controller contr;
    
    /**
     * Simulates everything the user can do, by calling all methods in the controller.
     */
    public void sampleExecution() {
        UserDTO userDTO = new UserDTO("Stina");
        contr.registerUser(userDTO);
    }
}
