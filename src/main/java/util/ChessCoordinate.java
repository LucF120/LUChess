package util; 

//Represents a coordinate pair on a chessboard.
//Consists of a file (a-h), followed by a rank (1-8)
public class ChessCoordinate {
    private char file;
    private int rank; 

    //Constructs a ChessCoordinate object by taking in a char file, and an int rank 
    public ChessCoordinate(char file, int rank) {
        if (file != 'a' && file != 'b' && file != 'c' && file != 'd' && file != 'e' && file != 'f' && file != 'g' && file != 'h') {
            throw new IllegalArgumentException("The file must be a letter between a-h");
        }
        if(rank <= 0 || rank > 8) {
            throw new IllegalArgumentException("The rank must be between 1-8");
        }

        this.file = file;
        this.rank = rank; 
    }

    //Returns the file of the ChessCoordiante object 
    public char getFile() {
        return this.file; 
    }

    //Returns the rank of the ChessCoordinate object
    public int getRank() {
        return this.rank; 
    }


}