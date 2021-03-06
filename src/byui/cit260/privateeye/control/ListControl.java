/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.control;

import byui.cit260.privateeye.exceptions.ListControlException;
import byui.cit260.privateeye.model.*;

/**
 *
 * @author User
 */
public class ListControl {

    public int getInput(int test) throws ListControlException {
        if (test < 0) {
            throw new ListControlException("\nFlagrant error. Virus equals very yes.\n");
        }
        return test;
    }

    public static Item[] createInventoryList() {

        // created array(list) of inventory items
        Item[] inventoryItem = new Item[16];

        Item paper = new Item();
        paper.setItemName("Paper");
        paper.setItemDesc("A blank piece of paper.");
        paper.setItemType("inventory");
        inventoryItem[ItemType.PAPER.ordinal()] = paper;

        Item pen = new Item();
        pen.setItemName("Pen");
        pen.setItemDesc("A pen with black ink");
        pen.setItemType("inventory");
        inventoryItem[ItemType.PEN.ordinal()] = pen;

        Item badge = new Item();
        badge.setItemName("Badge");
        badge.setItemDesc("Your Private Investigator badge");
        badge.setItemType("inventory");
        inventoryItem[ItemType.BADGE.ordinal()] = badge;

        return inventoryItem;
    }

    public static Item[] createEvidenceList() {

        // created array(list) of inventory items
        Item[] evidenceItem = new Item[16];

        Item glove = new Item();
        glove.setItemName("Glove");
        glove.setItemDesc("A bloody glove.");
        glove.setItemType("evidence");
        evidenceItem[ItemType.GLOVE.ordinal()] = glove;

        Item hair = new Item();
        hair.setItemName("Hair");
        hair.setItemDesc("Several strands of long brown hair.");
        hair.setItemType("evidence");
        evidenceItem[ItemType.HAIR.ordinal()] = hair;

        Item fingerprints = new Item();
        fingerprints.setItemName("Fingerprints");
        fingerprints.setItemDesc("Bloody fingerprints on a piece of torn fabric.");
        fingerprints.setItemType("evidence");
        evidenceItem[ItemType.FINGERPRINTS.ordinal()] = fingerprints;

        return evidenceItem;
    }

    public static Item[] createClueList() {

        // created array(list) of inventory items
        Item[] clueItem = new Item[16];

        Item gun = new Item();
        gun.setItemName("Gun");
        gun.setItemDesc("A smoking gun.");
        gun.setItemType("clue");
        clueItem[ItemType.GUN.ordinal()] = gun;

        Item shoeprints = new Item();
        shoeprints.setItemName("Shoe Prints");
        shoeprints.setItemDesc("Dirty shoeprints across the floor.");
        shoeprints.setItemType("clue");
        clueItem[ItemType.SHOEPRINTS.ordinal()] = shoeprints;

        Item photograph = new Item();
        photograph.setItemName("Photograph");
        photograph.setItemDesc("Photograph of the victum talking to a tall grey haired man.");
        photograph.setItemType("clue");
        clueItem[ItemType.PHOTOGRAPH.ordinal()] = photograph;

        return clueItem;
    }
}
