package main.java;

//Represents a piece on a Chess board 
interface ChessPiece {
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
}

//Represents the Pawn Chess piece 
class Pawn implements ChessPiece {
    private char file;
    private int rank;
    private boolean isAlive; 
    private int value; 
    private int color; 

    //Constructor for a Pawn 
    public Pawn(char file, int rank, boolean isAlive, int color) {
        this.file = file;
        this.rank = rank;
        this.isAlive = isAlive; 
        this.value = 1; 
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

//Represents the Rook Chess piece 
class Rook implements ChessPiece {
    private char file;
    private int rank;
    private boolean isAlive; 
    private int value; 
    private int color; 

    //Constructor for a Rook 
    public Rook(char file, int rank, boolean isAlive, int color) {
        this.file = file;
        this.rank = rank;
        this.isAlive = isAlive; 
        this.value = 5; 
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

//Represents the Bishop Chess piece 
class Bishop implements ChessPiece {
    private char file;
    private int rank;
    private boolean isAlive; 
    private int value; 
    private int color;

    //Constructor for a Bishop 
    public Bishop(char file, int rank, boolean isAlive, int color) {
        this.file = file;
        this.rank = rank;
        this.isAlive = isAlive; 
        this.value = 3; 
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

//Represents the Knight Chess piece 
class Knight implements ChessPiece {
    private char file;
    private int rank;
    private boolean isAlive; 
    private int value; 
    private int color;

    //Constructor for a Knight 
    public Knight(char file, int rank, boolean isAlive, int color) {
        this.file = file;
        this.rank = rank;
        this.isAlive = isAlive; 
        this.value = 3; 
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

//Represents the Queen Chess piece 
class Queen implements ChessPiece {
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

//Represents the King Chess piece 
class King implements ChessPiece {
    private char file;
    private int rank;
    private boolean isAlive; 
    private int value; 
    private int color;

    //Constructor for a King 
    public King(char file, int rank, boolean isAlive, int color) {
        this.file = file;
        this.rank = rank;
        this.isAlive = isAlive; 
        this.value = 200; 
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