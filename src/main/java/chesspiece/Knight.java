package chesspiece;

import util.*;

//Represents the Knight Chess piece 
public class Knight implements ChessPiece {
    private ChessCoordinate location;
    private boolean isAlive; 
    private int value; 
    private int color;

    //Constructor for a Knight 
    public Knight(char file, int rank, boolean isAlive, int color) {
        this.location = new ChessCoordinate(file, rank);
        this.isAlive = isAlive; 
        this.value = 3; 
        this.color = color; 
    }

    //Returns the file that the piece is currently in (a-h)
    //Returns '0' if the piece is not on the board 
    public char getFile() {
        return this.location.getFile(); 
    }

    //Returns the rank that the piece is currently in (1-8) 
    //Returns 0 if the piece is not on the board 
    public int getRank() {
        return this.location.getRank(); 
    }

    //Returns whether or not the piece is alive and on the board 
    public boolean isAlive() {
        return this.isAlive; 
    }

    //Returns the value of a chess piece 
    public int getValue() {
        return this.value; 
    }

    //Returns 0 if a piece is white, 1 if a piece is black 
    public int getColor() {
        return this.color; 
    }

    //Changes the location of a knight
    public void changeLocation(char file, int rank) {
        this.location.setFile(file);
        this.location.setRank(rank);
    }

    //Overriding the equals method 
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Knight)) {
            return false;
        }

        Knight other = (Knight) obj;
        return this.getFile() == other.getFile() && this.getRank() == other.getRank() && this.getColor() == other.getColor(); 
    }

    //Overriding the hashCode method 
    @Override
    public int hashCode() {
        return (int) this.location.getFile() + (64 * this.location.getRank()) + (100 * this.color); 
  }
}