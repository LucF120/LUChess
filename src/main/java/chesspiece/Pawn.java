package chesspiece;

import util.*;

//Represents the Pawn Chess piece 
public class Pawn implements ChessPiece {
    private ChessCoordinate location; 
    private boolean isAlive; 
    private int value; 
    private int color; 
    private boolean isFirstMove; 

    //Constructor for a Pawn 
    public Pawn(char file, int rank, boolean isAlive, int color) {
        this.location = new ChessCoordinate(file, rank);
        this.isAlive = isAlive; 
        this.value = 1; 
        this.color = color; 
        this.isFirstMove = false;
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

    //Returns a boolean of whether or not the pawn just moved for the first time 
    public boolean isFirstMove() {
        return this.isFirstMove; 
    }
}