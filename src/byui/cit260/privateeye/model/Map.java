/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.privateeye.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Mark
 */
public class Map implements Serializable{

    public static final int NUMROWS = 5;
    public static final int NUMCOLUMNS = 5;
    private String mapName;
    private int localeList;
    private Location [][] matrix = new Location [NUMROWS][NUMCOLUMNS];
    
    public Map() {
    }

    public void init(){
        Random rand = new Random();        
        for(int row = 0; row < NUMROWS; row++){
            for(int col = 0; col < NUMCOLUMNS; col++){
                Location locale = new Location();
                locale.setLocaleColumn(col);
                locale.setLocaleRow(row);
                locale.setLocaleVisited(false);               
                int randLocale = rand.nextInt(LocaleType.values().length);
                locale.setLocaleType(LocaleType.values()[randLocale]);
                matrix[row][col] = locale;
            }
        }
    }
    public Location getLocaleAt(int row, int col){
        return matrix[row][col];
    }
    
    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public int getLocaleList() {
        return localeList;
    }

    public void setLocaleList(int localeList) {
        this.localeList = localeList;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.NUMROWS;
        hash = 53 * hash + this.NUMCOLUMNS;
        hash = 53 * hash + Objects.hashCode(this.mapName);
        hash = 53 * hash + this.localeList;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.NUMROWS != other.NUMROWS) {
            return false;
        }
        if (this.NUMCOLUMNS != other.NUMCOLUMNS) {
            return false;
        }
        if (this.localeList != other.localeList) {
            return false;
        }
        if (!Objects.equals(this.mapName, other.mapName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "NUMROWS=" + NUMROWS + ", NUMCOLUMNS=" + NUMCOLUMNS + ", mapName=" + mapName + ", localeList=" + localeList + '}';
    }
    
    
    
    
}
