/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg328mining;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Daniel
 */
public class Vertex implements Comparable<Vertex> {

    private ArrayList<Vertex> connectedTo;
    private ArrayList<Vertex> connectedFrom;
    private final int width, blockID, blockProfit, blockCost, rowLevel;
    private final int value;
    private boolean pathPossible;
    private short nextBlockIt = -1;

    public Vertex(int blockWidth, int blockProfit, int blockCost, int blockID, int rowLevel) {
        connectedTo = new ArrayList<Vertex>();
        connectedFrom = new ArrayList<Vertex>();
        width = blockWidth;
        value = blockProfit - blockCost;
        this.blockID = blockID;
        pathPossible = true;
        this.blockProfit = blockProfit;
        this.blockCost = blockCost;
        this.rowLevel = rowLevel;
    }

    public void setNextBlockIt(short blockIt) {
        nextBlockIt = blockIt;
    }

    public short getNextBlockIt() {
        return nextBlockIt;
    }

    public int getWidth() {
        return width;
    }

    public int getValue() {
        return value;
    }

    public int getID() {
        return blockID;
    }

    public boolean containsConnectedTo(Vertex vertex) {
        return connectedTo.contains(vertex);
    }

    public Vertex getConnectedTo(int index) {
        return connectedTo.get(index);
    }

    public int getConnectedToSize() {
        return connectedTo.size();
    }

    public void addConnectedTo(Vertex vertex) {
        connectedTo.add(vertex);
    }

    public void addConnectedFrom(Vertex vertex) {
        connectedFrom.add(vertex);
    }

    public int getConnectedFromSize() {
        return connectedFrom.size();
    }

    public Vertex getConnectedFrom(int index) {
        return connectedFrom.get(index);
    }

    public boolean getPathPossible() {
        return pathPossible;
    }

    public void setPathToFalse() {
        pathPossible = false;
    }

    public int getRowLevel() {
        return rowLevel;
    }

    @Override
    public String toString() {
        return "(" + width + "," + blockProfit + "," + blockCost + ")";
    }

    @Override
    public int compareTo(Vertex o) {
        return Integer.compare(this.blockID, o.blockID);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Vertex) {
            Vertex vertex = (Vertex) object;
            return this.blockID == vertex.blockID;
        }
        return false;
    }

}
