package chesspiece;

//Represents a piece on a Chess board 
public interface ChessPiece {
    //Returns the file that the piece is currently in (a-h)
    //Returns '0' if the piece is not on the board 
    char getFile(); 

    //Returns the rank that the piece is currently in (1-8) 
    //Returns 0 if the piece is not on the board 
    int getRank(); 

    //Returns whether or not the piece is alive and on the board 
    boolean isAlive(); 

    //Returns the value of a chess piece 
    int getValue(); 

    //Returns 0 if a piece is white, 1 if a piece is black 
    int getColor(); 

    //Changes the location of a chess piece 
    void changeLocation(char file, int rank); 
}
