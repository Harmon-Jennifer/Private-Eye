/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

import byui.cit260.privateeye.control.GameControl;
import byui.cit260.privateeye.model.Drone;
import java.io.PrintWriter;
import privateeye.PrivateEye;

/**
 *
 * @author User
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n----------------------------------------------"
                + "\n| Main Menu                                  |"
                + "\n----------------------------------------------"
                + "\nN - Start new game"
                + "\nS - Save game"
                + "\nL - Load saved game"
                + "\nH - Help menu"
                + "\nQ - Quit"
                + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert to all upper case

        switch (value) {
            case "N":
                this.startNewGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "L":
                this.loadSavedGame();
                break;
            case "H":
                this.helpMenu();
                break;
            case "Z":
                this.markTest();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid option: Please select an option from the Main Menu.");
                break;
        }
        return false;
    }

    private static void startNewGame() {
        GameControl gameControl = new GameControl();
        gameControl.createNewGame(PrivateEye.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for the file where"
                + " the game is to be saved.");
        String filePath = this.getInput();
        try {
            //save the game to specified file
            GameControl.saveGame(PrivateEye.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void loadSavedGame() {
        this.console.println("\n\nEnter the file path for the file where the game "
                + "is located.");
        String filePath = this.getInput();

        try {
            GameControl.loadGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void helpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void markTest() {
        try {
            String filePath = "droneReport.txt";
            PrintWriter output = new PrintWriter(filePath);
            Drone[] droneList = Drone.values();
            output.println("Drone Report\n\n");
            for (Drone drone : droneList) {
                output.println(drone.name() + ":     \t" + drone.getDroneDesc());
            }

            output.flush();
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }

}
