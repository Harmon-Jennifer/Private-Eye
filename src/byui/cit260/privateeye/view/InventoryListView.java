/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

/**
 *
 * @author Jennifer
 */
public class InventoryListView extends View {

    public InventoryListView() {
        super("\n"
                + "\n----------------------------------------------"
                + "\n| Inventory List                             |"
                + "\n----------------------------------------------"
                + "\nA - Notepad"
                + "\nB - Pencil"
                + "\nC - Your I.D."
                + "\nQ - Exit Inventory list."
                + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // converts to all upper case

        switch (value) {
            case "A":
                this.inventoryNotePad();
                break;
            case "B":
                this.inventoryPencil();
                break;
            case "C":
                this.inventoryID();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid option: Please select an option from the Inventory list.");
                break;
        }
        return false;
    }

    private void inventoryNotePad() {
        this.console.println("*** inventoryNotePad information function called ***");
    }

    private void inventoryPencil() {
        this.console.println("*** inventoryPencil information function called ***");
    }

    private void inventoryID() {
        this.console.println("*** inventoryID information function called ***");
    }

}
