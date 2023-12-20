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
}

//Represents the Pawn Chess piece 
class Pawn implements ChessPiece {
    char file;
    int rank;
    boolean isAlive; 
    int value; 

    //Constructor for a Pawn 
    public Pawn(char file, int rank, boolean isAlive) {
        this.file = file;
        this.rank = rank;
        this.isAlive = isAlive; 
        this.value = 1; 
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
}

//Represents the Rook Chess piece 
class Rook implements ChessPiece {
    char file;
    int rank;
    boolean isAlive; 
    int value; 

    //Constructor for a Rook 
    public Rook(char file, int rank, boolean isAlive) {
        this.file = file;
        this.rank = rank;
        this.isAlive = isAlive; 
        this.value = 5; 
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
}

//Represents the Bishop Chess piece 
class Bishop implements ChessPiece {
    char file;
    int rank;
    boolean isAlive; 
    int value;

    //Constructor for a Bishop 
    public Bishop(char file, int rank, boolean isAlive) {
        this.file = file;
        this.rank = rank;
        this.isAlive = isAlive; 
        this.value = 3; 
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
}

//Represents the Knight Chess piece 
class Knight implements ChessPiece {
    char file;
    int rank;
    boolean isAlive; 
    int value; 

    //Constructor for a Knight 
    public Knight(char file, int rank, boolean isAlive) {
        this.file = file;
        this.rank = rank;
        this.isAlive = isAlive; 
        this.value = 3; 
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
}

//Represents the Queen Chess piece 
class Queen implements ChessPiece {
    char file;
    int rank;
    boolean isAlive; 
    int value; 

    //Constructor for a Queen 
    public Queen(char file, int rank, boolean isAlive) {
        this.file = file;
        this.rank = rank;
        this.isAlive = isAlive; 
        this.value = 9; 
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
}