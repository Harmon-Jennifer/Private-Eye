/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investigator;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Mark
 */
public class Map implements Serializable{

    private int numRows;
    private int numColumns;
    private String mapName;
    private int localeList;

    public Map() {
    }
    
    
    
    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
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
        hash = 53 * hash + this.numRows;
        hash = 53 * hash + this.numColumns;
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
        if (this.numRows != other.numRows) {
            return false;
        }
        if (this.numColumns != other.numColumns) {
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
        return "Map{" + "numRows=" + numRows + ", numColumns=" + numColumns + ", mapName=" + mapName + ", localeList=" + localeList + '}';
    }
    
    
    
    
}
