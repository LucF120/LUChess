package chesspiece;

import util.*; 

//Represents the Rook Chess piece 
public class Rook implements ChessPiece {
    private ChessCoordinate location; 
    private boolean isAlive; 
    private int value; 
    private int color; 
    private boolean hasMoved; 

    //Constructor for a Rook 
    public Rook(char file, int rank, boolean isAlive, int color) {
        this.location = new ChessCoordinate(file, rank);
        this.isAlive = isAlive; 
        this.value = 5; 
        this.color = color; 
        this.hasMoved = false;
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

    //Returns whether or not this rook has moved 
    public boolean hasMoved() {
        return this.hasMoved; 
    }

    //Sets the hasMoved boolean to true 
    public void setHasMoved() {
        this.hasMoved = true;
    }

    //Changes the location of a rook
    public void changeLocation(char file, int rank) {
        this.location.setFile(file);
        this.location.setRank(rank);
    }

    //Overriding the equals method 
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rook)) {
            return false;
        }

        Rook other = (Rook) obj;
        return this.getFile() == other.getFile() && this.getRank() == other.getRank() && this.getColor() == other.getColor(); 
    }

    //Overriding the hashCode method 
    @Override
    public int hashCode() {
        return (int) this.location.getFile() + (64 * this.location.getRank()) + (100 * this.color); 
  }
}