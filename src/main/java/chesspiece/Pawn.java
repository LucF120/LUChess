package chesspiece;

import util.*;

//Represents the Pawn Chess piece 
public class Pawn implements ChessPiece {
    private ChessCoordinate location; 
    private boolean isAlive; 
    private int value; 
    private int color; 
    private boolean isFirstMove; 
    private String piece; 

    //Constructor for a Pawn 
    public Pawn(char file, int rank, boolean isAlive, int color) {
        this.location = new ChessCoordinate(file, rank);
        this.isAlive = isAlive; 
        this.value = 1; 
        this.color = color; 
        this.isFirstMove = false;
        this.piece = "Pawn";
    }

    //Constructor for a Pawn where you can set isFirstMove 
    public Pawn(char file, int rank, boolean isAlive, int color, boolean isFirstMove) {
        this.location = new ChessCoordinate(file, rank);
        this.isAlive = isAlive; 
        this.value = 1; 
        this.color = color; 
        this.isFirstMove = isFirstMove;
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

    //Returns a string corresponding to the piece type.
    public String getPiece() {
        return this.piece;
    }

    //Returns a boolean of whether or not the pawn just moved for the first time 
    public boolean isFirstMove() {
        return this.isFirstMove; 
    }

    //Changes the location of a pawn
    public void changeLocation(char file, int rank) {
        this.location.setFile(file);
        this.location.setRank(rank);
    }

    //Overriding the equals method 
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pawn)) {
            return false;
        }

        Pawn other = (Pawn) obj;
        return this.getFile() == other.getFile() && this.getRank() == other.getRank() && this.getColor() == other.getColor(); 
    }

    //Overriding the hashCode method 
    @Override
    public int hashCode() {
        return (int) this.location.getFile() + (64 * this.location.getRank()) + (100 * this.color); 
  }
}