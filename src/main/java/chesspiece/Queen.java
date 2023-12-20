package chesspiece; 

//Represents the Queen Chess piece 
public class Queen implements ChessPiece {
    private char file;
    private int rank;
    private boolean isAlive; 
    private int value; 
    private int color; 

    //Constructor for a Queen 
    public Queen(char file, int rank, boolean isAlive, int color) {
        this.file = file;
        this.rank = rank;
        this.isAlive = isAlive; 
        this.value = 9; 
        this.color = color; 
    }

    //Returns the file that the piece is currently in (a-h)
    //Returns '0' if the piece is not on the board 
    public char getFile() {
        return this.file; 
    }

    //Returns the rank that the piece is currently in (1-8) 
    //Returns 0 if the piece is not on the board 
    public int getRank() {
        return this.rank; 
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
}