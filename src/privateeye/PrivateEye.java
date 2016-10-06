/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateeye;

import java.util.Scanner; 
import investigator.Item;
public class PrivateEye {

   
    public static void main(String[] args) {
        
        Item widget = new Item();
        
        widget.setItemName("Doohicky");
        widget.setItemType("Tool");
        widget.setItemDesc("No one know what it does or what it's used for.");
        
        String itemInfo = widget.toString();
        System.out.println(itemInfo);
        
        
        
        
/*        
        System.out.println("Please enter your name, Detective:");
		
		Scanner inFile;
		inFile = new Scanner(System.in);        
        String name = inFile.nextLine();
        
Opening dialog. - Setting the scene - The squenced execution makes it seem more interactive.
*     
        System.out.println("\nIt was a quiet night - a little too quiet - when the door to my office creeked open. Even though my back was turned I knew who this dame was from the unmistakable scent of her White Diamonds perfume.\n");
        try{ Thread.sleep(7000); }catch( Exception e ){}
        System.out.println("\n"+name+": \"I thought I told you I never wanted to to see you again.\"\n");
        try{ Thread.sleep(3500); }catch( Exception e ){}
        System.out.println("\nTrixie: \"I wouldn't be here, but Donny has been arrested.\"\n");
        try{ Thread.sleep(3000); }catch( Exception e ){}
        System.out.println("\nI grinned.\n");
        try{ Thread.sleep(1000); }catch( Exception e ){}
        System.out.println("\n"+name+": \"I can't say that surpirses me; it's been a long time comin' dollface. You know that?\"\n");
        try{ Thread.sleep(4500); }catch( Exception e ){}
        System.out.println("\nTrixie: \"The Feds say he murdered that man last night!! Donny's no saint, but we both know he's no murderer!\"\n");
        try{ Thread.sleep(4500); }catch( Exception e ){}
        System.out.println("\n"+name+": \"Speak for yourself.\"\n");
        try{ Thread.sleep(1000); }catch( Exception e ){}
        System.out.println("\nTrixie: \"You shut your mouth! You and Donny used to be best friends; what happened between you two?\"\n");
        try{ Thread.sleep(4500); }catch( Exception e ){}
        System.out.println("\n"+name+": \"He stole my girl thats what happenned!\"\n");
        try{ Thread.sleep(2000); }catch( Exception e ){}
        System.out.println("\nTrixie: \"Donny didn't steal me; you pushed me away! We never meant for it to happen, but he's my soulmate "+name+", and if you ever loved me, please help me now. You're my only hope.\"\n");
        try{ Thread.sleep(6000); }catch( Exception e ){}
        System.out.println("\nI could hear her sobbing as I stared out my office window; I always had a weakness for damsels in distress, especially one like Trixie Trueheart.\n");
        try{ Thread.sleep(6000); }catch( Exception e ){}
        System.out.print("\n"+name+": \"Fine");
        try{ Thread.sleep(1500); }catch( Exception e ){}
        System.out.print("... ");
        try{ Thread.sleep(1500); }catch( Exception e ){}
        System.out.print("I'll take the case.\"\n");
        try{ Thread.sleep(1000); }catch( Exception e ){}
        System.out.println("\nTrixie: \"Thank you, thank you "+name+", I knew I count on you.\"\n");
   */ }
}
