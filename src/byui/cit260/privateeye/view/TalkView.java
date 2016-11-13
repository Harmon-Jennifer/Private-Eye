/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.view;

/**
 *
 * @author Mark
 */
public class TalkView extends View{
    
    public TalkView(String message){
        this.displayMessage = message;
    }
    
    public TalkView(){
        super("\nThe PERSON says STUFF to you.\n\n"
                + "Press any key to continue.\n");
        
    }
    
    @Override
    public boolean doAction(String value){
        //value = value.toUpperCase();
        
       // GameMenuView gameMenuView = new GameMenuView();
        //gameMenuView.display();
        return true;
    }

}