package chessboard;

import chesspiece.*;
import util.*;

import java.util.ArrayList;

//Represents a 64-square chess board 
public class ChessBoard {
    private ChessPiece[][] pieces = new ChessPiece[8][8];
    
    //Creates a new chess board 
    public ChessBoard() {
        this.setupBoard(); 
    }

    //Create a new chessboard by inputting a 2D array of pieces
    public ChessBoard(ChessPiece[][] pieces) {
        this.pieces = pieces; 
    }

    //Sets up the starting position of the board, with all 
    //Pieces on their default squares 
    private void setupBoard() {
        //White pawns 
        this.pieces[1][0] = new Pawn('a', 2, true, 0); 
        this.pieces[1][1] = new Pawn('b', 2, true, 0); 
        this.pieces[1][2] = new Pawn('c', 2, true, 0); 
        this.pieces[1][3] = new Pawn('d', 2, true, 0); 
        this.pieces[1][4] = new Pawn('e', 2, true, 0); 
        this.pieces[1][5] = new Pawn('f', 2, true, 0); 
        this.pieces[1][6] = new Pawn('g', 2, true, 0); 
        this.pieces[1][7] = new Pawn('h', 2, true, 0); 

        //Black pawns 
        this.pieces[6][0] = new Pawn('a', 7, true, 1); 
        this.pieces[6][1] = new Pawn('b', 7, true, 1); 
        this.pieces[6][2] = new Pawn('c', 7, true, 1); 
        this.pieces[6][3] = new Pawn('d', 7, true, 1); 
        this.pieces[6][4] = new Pawn('e', 7, true, 1); 
        this.pieces[6][5] = new Pawn('f', 7, true, 1); 
        this.pieces[6][6] = new Pawn('g', 7, true, 1); 
        this.pieces[6][7] = new Pawn('h', 7, true, 1); 

        //White major pieces 
        this.pieces[0][0] = new Rook('a', 1, true, 0);
        this.pieces[0][1] = new Knight('b', 1, true, 0);
        this.pieces[0][2] = new Bishop('c', 1, true, 0);
        this.pieces[0][3] = new Queen('d', 1, true, 0);
        this.pieces[0][4] = new King('e', 1, true, 0);
        this.pieces[0][5] = new Bishop('f', 1, true, 0);
        this.pieces[0][6] = new Knight('g', 1, true, 0);
        this.pieces[0][7] = new Rook('h', 1, true, 0);

        //Black major pieces 
        this.pieces[7][0] = new Rook('a', 8, true, 1);
        this.pieces[7][1] = new Knight('b', 8, true, 1);
        this.pieces[7][2] = new Bishop('c', 8, true, 1);
        this.pieces[7][3] = new Queen('d', 8, true, 1);
        this.pieces[7][4] = new King('e', 8, true, 1);
        this.pieces[7][5] = new Bishop('f', 8, true, 1);
        this.pieces[7][6] = new Knight('g', 8, true, 1);
        this.pieces[7][7] = new Rook('h', 8, true, 1);
    }

    //Returns the 2D array containing the positions of all 
    //Of the pieces on the chess board 
    public ChessPiece[][] getBoard() {
        return this.pieces; 
    }

    //Returns the legal moves for a piece at a given coordinate 
    //If the inputted file and rank is not a square on the board, throws IllegalArgumentException 
    public ArrayList<ChessCoordinate> getLegalMoves(char file, int rank) throws IllegalArgumentException {
        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();
        if (file != 'a' && file != 'b' && file != 'c' && file != 'd' && file != 'e' && file != 'f' && file != 'g' && file != 'h') {
            throw new IllegalArgumentException("The file must be between a-h");
        }
        if (rank <= 0 || rank > 8) {
            throw new IllegalArgumentException("The rank must be between 1-8");
        }

        ChessPiece piece = this.getPieceAt(file, rank);

        //Returns an empty ArrayList if there is no piece at the given position. 
        if (piece == null) {
            return legalMoves; 
        }
        else if(piece instanceof Pawn) {
            return this.getLegalPawnMoves((Pawn) piece);
        }
        else if(piece instanceof Rook) {
            return legalMoves; 
        } 
        else if(piece instanceof Knight) {
            return legalMoves; 
        }
        else if(piece instanceof Bishop) {
            return legalMoves; 
        }
        else if(piece instanceof Queen) {
            return legalMoves; 
        }
        else {
            return legalMoves; 
        }
    }

    private ArrayList<ChessCoordinate> getLegalPawnMoves(Pawn piece) {
        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();
        //White pawn movements 
        if(piece.getColor() == 0) {
            //White pawn at starting position moving up 2 squares 
            if(piece.getRank() == 2) {
                if(this.getPieceAt(piece.getFile(), 3) == null && this.getPieceAt(piece.getFile(), 4) == null) {
                    legalMoves.add(new ChessCoordinate(piece.getFile(), 4));
                }
            }
            //White pawn moving up 1 square 
            if(this.getPieceAt(piece.getFile(), piece.getRank()+1) == null) {
                legalMoves.add(new ChessCoordinate(piece.getFile(), piece.getRank()+1));
            }

            //White pawn diagonal captures and en passant captures 
            switch(piece.getFile()) {
                case 'a':
                    if(this.getPieceAt('b', piece.getRank()+1) != null) {
                        if(this.getPieceAt('b', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('b', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborA = this.getPieceAt('b', piece.getRank());
                    if(rightNeighborA instanceof Pawn) {
                        Pawn rightPawnA = (Pawn) rightNeighborA; 
                        if(rightPawnA.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('b', piece.getRank()+1));
                        }
                    }
                    break;
                case 'b':
                    if(this.getPieceAt('a', piece.getRank()+1) != null) {
                        if(this.getPieceAt('a', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('a', piece.getRank()+1));
                        }
                    }
                    if(this.getPieceAt('c', piece.getRank()+1) != null) {
                        if(this.getPieceAt('c', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('c', piece.getRank()+1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborB = this.getPieceAt('a', piece.getRank());
                    if(leftNeighborB instanceof Pawn) {
                        Pawn leftPawnB = (Pawn) leftNeighborB; 
                        if(leftPawnB.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('a', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborB = this.getPieceAt('c', piece.getRank());
                    if(rightNeighborB instanceof Pawn) {
                        Pawn rightPawnB = (Pawn) rightNeighborB; 
                        if(rightPawnB.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('c', piece.getRank()+1));
                        }
                    }
                    break;
                case 'c':
                    if(this.getPieceAt('b', piece.getRank()+1) != null) {
                        if(this.getPieceAt('b', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('b', piece.getRank()+1));
                        }
                    }
                    if(this.getPieceAt('d', piece.getRank()+1) != null) {
                        if(this.getPieceAt('d', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('d', piece.getRank()+1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborC = this.getPieceAt('b', piece.getRank());
                    if(leftNeighborC instanceof Pawn) {
                        Pawn leftPawnC = (Pawn) leftNeighborC; 
                        if(leftPawnC.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('b', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborC = this.getPieceAt('d', piece.getRank());
                    if(rightNeighborC instanceof Pawn) {
                        Pawn rightPawnC = (Pawn) rightNeighborC; 
                        if(rightPawnC.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('d', piece.getRank()+1));
                        }
                    }
                    break;
                case 'd':
                    if(this.getPieceAt('c', piece.getRank()+1) != null) {
                        if(this.getPieceAt('c', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('c', piece.getRank()+1));
                        }
                    }
                    if(this.getPieceAt('e', piece.getRank()+1) != null) {
                        if(this.getPieceAt('e', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('e', piece.getRank()+1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborD = this.getPieceAt('c', piece.getRank());
                    if(leftNeighborD instanceof Pawn) {
                        Pawn leftPawnD = (Pawn) leftNeighborD; 
                        if(leftPawnD.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('c', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborD = this.getPieceAt('e', piece.getRank());
                    if(rightNeighborD instanceof Pawn) {
                        Pawn rightPawnD = (Pawn) rightNeighborD; 
                        if(rightPawnD.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('e', piece.getRank()+1));
                        }
                    }
                    break;
                case 'e': 
                    if(this.getPieceAt('d', piece.getRank()+1) != null) {
                        if(this.getPieceAt('d', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('d', piece.getRank()+1));
                        }
                    }
                    if(this.getPieceAt('f', piece.getRank()+1) != null) {
                        if(this.getPieceAt('f', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('f', piece.getRank()+1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborE = this.getPieceAt('d', piece.getRank());
                    if(leftNeighborE instanceof Pawn) {
                        Pawn leftPawnE = (Pawn) leftNeighborE; 
                        if(leftPawnE.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('d', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborE = this.getPieceAt('f', piece.getRank());
                    if(rightNeighborE instanceof Pawn) {
                        Pawn rightPawnE = (Pawn) rightNeighborE; 
                        if(rightPawnE.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('f', piece.getRank()+1));
                        }
                    }
                    break;
                case 'f': 
                    if(this.getPieceAt('e', piece.getRank()+1) != null) {
                        if(this.getPieceAt('e', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('e', piece.getRank()+1));
                        }
                    }
                    if(this.getPieceAt('g', piece.getRank()+1) != null) {
                        if(this.getPieceAt('g', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('g', piece.getRank()+1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborF = this.getPieceAt('e', piece.getRank());
                    if(leftNeighborF instanceof Pawn) {
                        Pawn leftPawnF = (Pawn) leftNeighborF; 
                        if(leftPawnF.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('e', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborF = this.getPieceAt('g', piece.getRank());
                    if(rightNeighborF instanceof Pawn) {
                        Pawn rightPawnF = (Pawn) rightNeighborF; 
                        if(rightPawnF.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('g', piece.getRank()+1));
                        }
                    }
                    break;
                case 'g':
                    if(this.getPieceAt('f', piece.getRank()+1) != null) {
                        if(this.getPieceAt('f', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('f', piece.getRank()+1));
                        }
                    }
                    if(this.getPieceAt('h', piece.getRank()+1) != null) {
                        if(this.getPieceAt('h', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('h', piece.getRank()+1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborG = this.getPieceAt('f', piece.getRank());
                    if(leftNeighborG instanceof Pawn) {
                        Pawn leftPawnG = (Pawn) leftNeighborG; 
                        if(leftPawnG.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('f', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborG = this.getPieceAt('h', piece.getRank());
                    if(rightNeighborG instanceof Pawn) {
                        Pawn rightPawnG = (Pawn) rightNeighborG; 
                        if(rightPawnG.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('h', piece.getRank()+1));
                        }
                    }
                    break;
                case 'h':
                    if(this.getPieceAt('g', piece.getRank()+1) != null) {
                        if(this.getPieceAt('g', piece.getRank()+1).getColor() == 1) {
                            legalMoves.add(new ChessCoordinate('g', piece.getRank()+1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborH = this.getPieceAt('g', piece.getRank());
                    if(leftNeighborH instanceof Pawn) {
                        Pawn leftPawnH = (Pawn) leftNeighborH; 
                        if(leftPawnH.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('g', piece.getRank()+1));
                        }
                    }
                    break;
            }
        }

        //Black pawn movements 
        if(piece.getColor() == 1) {
            //White pawn at starting position moving up 2 squares 
            if(piece.getRank() == 7) {
                if(this.getPieceAt(piece.getFile(), 6) == null && this.getPieceAt(piece.getFile(), 5) == null) {
                    legalMoves.add(new ChessCoordinate(piece.getFile(), 5));
                }
            }
            //Black pawn moving down 1 square 
            if(this.getPieceAt(piece.getFile(), piece.getRank()-1) == null) {
                legalMoves.add(new ChessCoordinate(piece.getFile(), piece.getRank()-1));
            }

            //Black pawn diagonal captures and en passant captures 
            switch(piece.getFile()) {
                case 'a':
                    if(this.getPieceAt('b', piece.getRank()-1) != null) {
                        if(this.getPieceAt('b', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('b', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborA = this.getPieceAt('b', piece.getRank());
                    if(rightNeighborA instanceof Pawn) {
                        Pawn rightPawnA = (Pawn) rightNeighborA; 
                        if(rightPawnA.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('b', piece.getRank()-1));
                        }
                    }
                    break;
                case 'b':
                    if(this.getPieceAt('a', piece.getRank()-1) != null) {
                        if(this.getPieceAt('a', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('a', piece.getRank()-1));
                        }
                    }
                    if(this.getPieceAt('c', piece.getRank()-1) != null) {
                        if(this.getPieceAt('c', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('c', piece.getRank()-1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborB = this.getPieceAt('a', piece.getRank());
                    if(leftNeighborB instanceof Pawn) {
                        Pawn leftPawnB = (Pawn) leftNeighborB; 
                        if(leftPawnB.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('a', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborB = this.getPieceAt('c', piece.getRank());
                    if(rightNeighborB instanceof Pawn) {
                        Pawn rightPawnB = (Pawn) rightNeighborB; 
                        if(rightPawnB.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('c', piece.getRank()-1));
                        }
                    }
                    break;
                case 'c':
                    if(this.getPieceAt('b', piece.getRank()-1) != null) {
                        if(this.getPieceAt('b', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('b', piece.getRank()-1));
                        }
                    }
                    if(this.getPieceAt('d', piece.getRank()-1) != null) {
                        if(this.getPieceAt('d', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('d', piece.getRank()-1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborC = this.getPieceAt('b', piece.getRank());
                    if(leftNeighborC instanceof Pawn) {
                        Pawn leftPawnC = (Pawn) leftNeighborC; 
                        if(leftPawnC.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('b', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborC = this.getPieceAt('d', piece.getRank());
                    if(rightNeighborC instanceof Pawn) {
                        Pawn rightPawnC = (Pawn) rightNeighborC; 
                        if(rightPawnC.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('d', piece.getRank()-1));
                        }
                    }
                    break;
                case 'd':
                    if(this.getPieceAt('c', piece.getRank()-1) != null) {
                        if(this.getPieceAt('c', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('c', piece.getRank()-1));
                        }
                    }
                    if(this.getPieceAt('e', piece.getRank()-1) != null) {
                        if(this.getPieceAt('e', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('e', piece.getRank()-1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborD = this.getPieceAt('c', piece.getRank());
                    if(leftNeighborD instanceof Pawn) {
                        Pawn leftPawnD = (Pawn) leftNeighborD; 
                        if(leftPawnD.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('c', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborD = this.getPieceAt('e', piece.getRank());
                    if(rightNeighborD instanceof Pawn) {
                        Pawn rightPawnD = (Pawn) rightNeighborD; 
                        if(rightPawnD.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('e', piece.getRank()-1));
                        }
                    }
                    break;
                case 'e': 
                    if(this.getPieceAt('d', piece.getRank()-1) != null) {
                        if(this.getPieceAt('d', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('d', piece.getRank()-1));
                        }
                    }
                    if(this.getPieceAt('f', piece.getRank()-1) != null) {
                        if(this.getPieceAt('f', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('f', piece.getRank()-1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborE = this.getPieceAt('d', piece.getRank());
                    if(leftNeighborE instanceof Pawn) {
                        Pawn leftPawnE = (Pawn) leftNeighborE; 
                        if(leftPawnE.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('d', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborE = this.getPieceAt('f', piece.getRank());
                    if(rightNeighborE instanceof Pawn) {
                        Pawn rightPawnE = (Pawn) rightNeighborE; 
                        if(rightPawnE.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('f', piece.getRank()-1));
                        }
                    }
                    break;
                case 'f': 
                    if(this.getPieceAt('e', piece.getRank()-1) != null) {
                        if(this.getPieceAt('e', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('e', piece.getRank()-1));
                        }
                    }
                    if(this.getPieceAt('g', piece.getRank()-1) != null) {
                        if(this.getPieceAt('g', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('g', piece.getRank()-1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborF = this.getPieceAt('e', piece.getRank());
                    if(leftNeighborF instanceof Pawn) {
                        Pawn leftPawnF = (Pawn) leftNeighborF; 
                        if(leftPawnF.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('e', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborF = this.getPieceAt('g', piece.getRank());
                    if(rightNeighborF instanceof Pawn) {
                        Pawn rightPawnF = (Pawn) rightNeighborF; 
                        if(rightPawnF.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('g', piece.getRank()-1));
                        }
                    }
                    break;
                case 'g':
                    if(this.getPieceAt('f', piece.getRank()-1) != null) {
                        if(this.getPieceAt('f', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('f', piece.getRank()-1));
                        }
                    }
                    if(this.getPieceAt('h', piece.getRank()-1) != null) {
                        if(this.getPieceAt('h', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('h', piece.getRank()-1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborG = this.getPieceAt('f', piece.getRank());
                    if(leftNeighborG instanceof Pawn) {
                        Pawn leftPawnG = (Pawn) leftNeighborG; 
                        if(leftPawnG.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('f', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborG = this.getPieceAt('h', piece.getRank());
                    if(rightNeighborG instanceof Pawn) {
                        Pawn rightPawnG = (Pawn) rightNeighborG; 
                        if(rightPawnG.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('h', piece.getRank()-1));
                        }
                    }
                    break;
                case 'h':
                    if(this.getPieceAt('g', piece.getRank()-1) != null) {
                        if(this.getPieceAt('g', piece.getRank()-1).getColor() == 0) {
                            legalMoves.add(new ChessCoordinate('g', piece.getRank()-1));
                        }
                    }
                    //Left en passant 
                    ChessPiece leftNeighborH = this.getPieceAt('g', piece.getRank());
                    if(leftNeighborH instanceof Pawn) {
                        Pawn leftPawnH = (Pawn) leftNeighborH; 
                        if(leftPawnH.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('g', piece.getRank()-1));
                        }
                    }
                    break;
            }
        }
        return legalMoves; 
    }

    // Returns a piece that is at a given square 
    // If no piece is at a given square, throws IllegalArgumentException
    public ChessPiece getPieceAt(char file, int rank) throws IllegalArgumentException{
        if (rank <= 0 || rank > 8) {
            throw new IllegalArgumentException("The rank must be between 1-8");
        } else {
            switch(file) {
                case 'a': 
                    return this.pieces[rank-1][0];
                case 'b':
                    return this.pieces[rank-1][1];
                case 'c':
                    return this.pieces[rank-1][2];
                case 'd':
                    return this.pieces[rank-1][3];
                case 'e':
                    return this.pieces[rank-1][4];
                case 'f':
                    return this.pieces[rank-1][5];
                case 'g':
                    return this.pieces[rank-1][6];
                case 'h':
                    return this.pieces[rank-1][7];
                default: 
                    throw new IllegalArgumentException("The file must be between a-h");
                }
            }
    }

    // Sets a piece at a given square 
    // If the given square does not exist, throws an IllegalArgumentException
    public void setPieceAt(char file, int rank, ChessPiece piece) throws IllegalArgumentException{
        if (rank <= 0 || rank > 8) {
            throw new IllegalArgumentException("The rank must be between 1-8");
        } else {
            switch(file) {
                case 'a': 
                    this.pieces[rank-1][0] = piece;
                    break;
                case 'b':
                    this.pieces[rank-1][1] = piece;
                    break;
                case 'c':
                    this.pieces[rank-1][2] = piece;
                    break;
                case 'd':
                    this.pieces[rank-1][3] = piece;
                    break;
                case 'e':
                    this.pieces[rank-1][4] = piece;
                    break;
                case 'f':
                    this.pieces[rank-1][5] = piece;
                    break;
                case 'g':
                    this.pieces[rank-1][6] = piece;
                    break;
                case 'h':
                    this.pieces[rank-1][7] = piece;
                    break;
                default: 
                    throw new IllegalArgumentException("The file must be between a-h");
                }
            }
    }

    // boolean isCheckmate(); 



    //Returns the total value of the white pieces currently
    //On the board 
    public int whitePiecesValue() {
        int total = 0; 
        for (int i=0 ; i<8 ; i++) {
            for (int j=0 ; j<8 ; j++) {
                if(this.pieces[i][j] != null) {
                    if(this.pieces[i][j].getColor() == 0) {
                        total += this.pieces[i][j].getValue(); 
                    }
                }
            }
        }

        return total; 
    }

    //Returns the total value of the black pieces currently
    //On the board 
    public int blackPiecesValue() {
        int total = 0; 
        for (int i=0 ; i<8 ; i++) {
            for (int j=0 ; j<8 ; j++) {
                if(this.pieces[i][j] != null) {
                    if(this.pieces[i][j].getColor() == 1) {
                        total += this.pieces[i][j].getValue(); 
                    }
                }
            }
        }

        return total;
    }
}