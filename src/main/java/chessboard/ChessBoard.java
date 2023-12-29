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
            return this.getLegalRookMoves((Rook) piece);
        } 
        else if(piece instanceof Knight) {
            return legalMoves; 
        }
        else if(piece instanceof Bishop) {
            return this.getLegalBishopMoves((Bishop) piece);
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
                        if(rightPawnA.getColor() == 1 && rightPawnA.isFirstMove() == true) {
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
                        if(leftPawnB.getColor() == 1 && leftPawnB.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('a', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborB = this.getPieceAt('c', piece.getRank());
                    if(rightNeighborB instanceof Pawn) {
                        Pawn rightPawnB = (Pawn) rightNeighborB; 
                        if(rightPawnB.getColor() == 1 && rightPawnB.isFirstMove() == true) {
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
                        if(leftPawnC.getColor() == 1 && leftPawnC.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('b', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborC = this.getPieceAt('d', piece.getRank());
                    if(rightNeighborC instanceof Pawn) {
                        Pawn rightPawnC = (Pawn) rightNeighborC; 
                        if(rightPawnC.getColor() == 1 && rightPawnC.isFirstMove() == true) {
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
                        if(leftPawnD.getColor() == 1 && leftPawnD.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('c', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborD = this.getPieceAt('e', piece.getRank());
                    if(rightNeighborD instanceof Pawn) {
                        Pawn rightPawnD = (Pawn) rightNeighborD; 
                        if(rightPawnD.getColor() == 1 && rightPawnD.isFirstMove() == true) {
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
                        if(leftPawnE.getColor() == 1 && leftPawnE.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('d', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborE = this.getPieceAt('f', piece.getRank());
                    if(rightNeighborE instanceof Pawn) {
                        Pawn rightPawnE = (Pawn) rightNeighborE; 
                        if(rightPawnE.getColor() == 1 && rightPawnE.isFirstMove() == true) {
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
                        if(leftPawnF.getColor() == 1 && leftPawnF.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('e', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborF = this.getPieceAt('g', piece.getRank());
                    if(rightNeighborF instanceof Pawn) {
                        Pawn rightPawnF = (Pawn) rightNeighborF; 
                        if(rightPawnF.getColor() == 1 && rightPawnF.isFirstMove() == true) {
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
                        if(leftPawnG.getColor() == 1 && leftPawnG.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('f', piece.getRank()+1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborG = this.getPieceAt('h', piece.getRank());
                    if(rightNeighborG instanceof Pawn) {
                        Pawn rightPawnG = (Pawn) rightNeighborG; 
                        if(rightPawnG.getColor() == 1 && rightPawnG.isFirstMove() == true) {
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
                        if(leftPawnH.getColor() == 1 && leftPawnH.isFirstMove() == true) {
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
                        if(rightPawnA.getColor() == 0 && rightPawnA.isFirstMove() == true) {
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
                        if(leftPawnB.getColor() == 0 && leftPawnB.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('a', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborB = this.getPieceAt('c', piece.getRank());
                    if(rightNeighborB instanceof Pawn) {
                        Pawn rightPawnB = (Pawn) rightNeighborB; 
                        if(rightPawnB.getColor() == 0 && rightPawnB.isFirstMove() == true) {
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
                        if(leftPawnC.getColor() == 0 && leftPawnC.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('b', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborC = this.getPieceAt('d', piece.getRank());
                    if(rightNeighborC instanceof Pawn) {
                        Pawn rightPawnC = (Pawn) rightNeighborC; 
                        if(rightPawnC.getColor() == 0 && rightPawnC.isFirstMove() == true) {
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
                        if(leftPawnD.getColor() == 0 && leftPawnD.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('c', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborD = this.getPieceAt('e', piece.getRank());
                    if(rightNeighborD instanceof Pawn) {
                        Pawn rightPawnD = (Pawn) rightNeighborD; 
                        if(rightPawnD.getColor() == 0 && rightPawnD.isFirstMove() == true) {
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
                        if(leftPawnE.getColor() == 0 && leftPawnE.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('d', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborE = this.getPieceAt('f', piece.getRank());
                    if(rightNeighborE instanceof Pawn) {
                        Pawn rightPawnE = (Pawn) rightNeighborE; 
                        if(rightPawnE.getColor() == 0 && rightPawnE.isFirstMove() == true) {
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
                        if(leftPawnF.getColor() == 0 && leftPawnF.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('e', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborF = this.getPieceAt('g', piece.getRank());
                    if(rightNeighborF instanceof Pawn) {
                        Pawn rightPawnF = (Pawn) rightNeighborF; 
                        if(rightPawnF.getColor() == 0 && rightPawnF.isFirstMove() == true) {
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
                        if(leftPawnG.getColor() == 0 && leftPawnG.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('f', piece.getRank()-1));
                        }
                    }
                    //Right en passant 
                    ChessPiece rightNeighborG = this.getPieceAt('h', piece.getRank());
                    if(rightNeighborG instanceof Pawn) {
                        Pawn rightPawnG = (Pawn) rightNeighborG; 
                        if(rightPawnG.getColor() == 0 && rightPawnG.isFirstMove() == true) {
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
                        if(leftPawnH.getColor() == 0 && leftPawnH.isFirstMove() == true) {
                            legalMoves.add(new ChessCoordinate('g', piece.getRank()-1));
                        }
                    }
                    break;
            }
        }
        return legalMoves; 
    }

    //Returns the legal moves that a rook piece can make 
    private ArrayList<ChessCoordinate> getLegalRookMoves(ChessPiece piece) {
        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();
        int upRank = piece.getRank() + 1;
        int downRank = piece.getRank() - 1;
        char[] rightFiles = this.getRightFiles(piece.getFile());
        char[] leftFiles = this.getLeftFiles(piece.getFile());
        int pos = 0;
        int maxLeftPos = leftFiles.length - 1;
        int maxRightPos = rightFiles.length - 1;

        //Check for legal leftwards rook moves 
        while(pos <= maxLeftPos) {
            if(this.getPieceAt(leftFiles[pos], piece.getRank()) != null) {
                if(this.getPieceAt(leftFiles[pos], piece.getRank()).getColor() != piece.getColor()) {
                    legalMoves.add(new ChessCoordinate(leftFiles[pos], piece.getRank()));
                    break;
                }
                break;
            } else {
                legalMoves.add(new ChessCoordinate(leftFiles[pos], piece.getRank()));
                pos++; 
            }
        }

        //Check for legal rightwards rook moves 
        pos = 0;
        while(pos <= maxRightPos) {
            if(this.getPieceAt(rightFiles[pos], piece.getRank()) != null) {
                if(this.getPieceAt(rightFiles[pos], piece.getRank()).getColor() != piece.getColor()) {
                    legalMoves.add(new ChessCoordinate(rightFiles[pos], piece.getRank()));
                    break;
                }
                break;
            } else {
                legalMoves.add(new ChessCoordinate(rightFiles[pos], piece.getRank()));
                pos++; 
            }
        }

        //Check for legal downwards rook moves 
        while(downRank >= 1) {
            if(this.getPieceAt(piece.getFile(), downRank) != null) {
                if(this.getPieceAt(piece.getFile(), downRank).getColor() != piece.getColor()) {
                    legalMoves.add(new ChessCoordinate(piece.getFile(), downRank));
                    break;
                }
                break;
            } else {
                legalMoves.add(new ChessCoordinate(piece.getFile(), downRank));
                downRank--; 
            }
        }

        //Check for legal upwards rook moves 
        while(upRank <= 8) {
            if(this.getPieceAt(piece.getFile(), upRank) != null) {
                if(this.getPieceAt(piece.getFile(), upRank).getColor() != piece.getColor()) {
                    legalMoves.add(new ChessCoordinate(piece.getFile(), upRank));
                    break;
                }
                break;
            } else {
                legalMoves.add(new ChessCoordinate(piece.getFile(), upRank));
                upRank++; 
            }
        }

        return legalMoves;
    }

    public ArrayList<ChessCoordinate> getLegalBishopMoves(ChessPiece piece) {
        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();
        int upRankLeft = piece.getRank() + 1;
        int downRankLeft = piece.getRank() - 1; 
        int upRankRight = piece.getRank() + 1;
        int downRankRight = piece.getRank() - 1; 
        char[] rightFiles = this.getRightFiles(piece.getFile());
        char[] leftFiles = this.getLeftFiles(piece.getFile());
        int pos = 0;
        int maxLeftPos = leftFiles.length - 1;
        int maxRightPos = rightFiles.length - 1;

        //Check for legal diagonal up-and-left bishop moves 
        while(upRankLeft <= 8 && pos <= maxLeftPos) {
            if(this.getPieceAt(leftFiles[pos], upRankLeft) != null) {
                if(this.getPieceAt(leftFiles[pos], upRankLeft).getColor() != piece.getColor()) {
                    legalMoves.add(new ChessCoordinate(leftFiles[pos], upRankLeft));
                    break;
                }
                break;
            } else {
                legalMoves.add(new ChessCoordinate(leftFiles[pos], upRankLeft));
                pos++;
                upRankLeft++;
            }
        }

        //Check for legal diagonal down-and-left bishop moves 
        pos = 0;
        while(downRankLeft >= 1 && pos <= maxLeftPos) {
            if(this.getPieceAt(leftFiles[pos], downRankLeft) != null) {
                if(this.getPieceAt(leftFiles[pos], downRankLeft).getColor() != piece.getColor()) {
                    legalMoves.add(new ChessCoordinate(leftFiles[pos], downRankLeft));
                    break;
                }
                break;
            } else {
                legalMoves.add(new ChessCoordinate(leftFiles[pos], downRankLeft));
                pos++;
                downRankLeft--;
            }
        }

        //Check for legal diagonal up-and-right bishop moves 
        pos = 0; 
        while(upRankRight <= 8 && pos <= maxRightPos) {
            if(this.getPieceAt(rightFiles[pos], upRankRight) != null) {
                if(this.getPieceAt(rightFiles[pos], upRankRight).getColor() != piece.getColor()) {
                    legalMoves.add(new ChessCoordinate(rightFiles[pos], upRankRight));
                    break;
                }
                break;
            } else {
                legalMoves.add(new ChessCoordinate(rightFiles[pos], upRankRight));
                pos++;
                upRankRight++;
            }
        }

        //Check for legal diagonal down-and-right bishop moves 
        pos = 0;
        while(downRankRight >= 1 && pos <= maxRightPos) {
            if(this.getPieceAt(rightFiles[pos], downRankRight) != null) {
                if(this.getPieceAt(rightFiles[pos], downRankRight).getColor() != piece.getColor()) {
                    legalMoves.add(new ChessCoordinate(rightFiles[pos], downRankRight));
                    break;
                }
                break;
            } else {
                legalMoves.add(new ChessCoordinate(rightFiles[pos], downRankRight));
                pos++;
                downRankRight--;
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

    //Returns the files to the left of a given file 
    private char[] getLeftFiles(char file) {
        char[] leftFiles; 
        if(file == 'a') {
            leftFiles = new char[0];
        } else if(file == 'b') {
            leftFiles = new char[1];
            leftFiles[0] = 'a';
        } else if(file == 'c') {
            leftFiles = new char[2];
            leftFiles[0] = 'b';
            leftFiles[1] = 'a';
        } else if(file == 'd') {
            leftFiles = new char[3];
            leftFiles[0] = 'c';
            leftFiles[1] = 'b';
            leftFiles[2] = 'a';
        } else if(file == 'e') {
            leftFiles = new char[4];
            leftFiles[0] = 'd';
            leftFiles[1] = 'c';
            leftFiles[2] = 'b';
            leftFiles[3] = 'a';
        } else if(file == 'f') {
            leftFiles = new char[5];
            leftFiles[0] = 'e';
            leftFiles[1] = 'd';
            leftFiles[2] = 'c';
            leftFiles[3] = 'b';
            leftFiles[4] = 'a';
        } else if(file == 'g') {
            leftFiles = new char[6];
            leftFiles[0] = 'f';
            leftFiles[1] = 'e';
            leftFiles[2] = 'd';
            leftFiles[3] = 'c';
            leftFiles[4] = 'b';
            leftFiles[5] = 'a';
        } else {
            leftFiles = new char[7];
            leftFiles[0] = 'g';
            leftFiles[1] = 'f';
            leftFiles[2] = 'e';
            leftFiles[3] = 'd';
            leftFiles[4] = 'c';
            leftFiles[5] = 'b';
            leftFiles[6] = 'a';
        }

        return leftFiles;
    }

    private char[] getRightFiles(char file) {
        char[] rightFiles; 
        if(file == 'a') {
            rightFiles = new char[7];
            rightFiles[0] = 'b';
            rightFiles[1] = 'c';
            rightFiles[2] = 'd';
            rightFiles[3] = 'e';
            rightFiles[4] = 'f';
            rightFiles[5] = 'g';
            rightFiles[6] = 'h';
        } else if(file == 'b') {
            rightFiles = new char[6];
            rightFiles[0] = 'c';
            rightFiles[1] = 'd';
            rightFiles[2] = 'e';
            rightFiles[3] = 'f';
            rightFiles[4] = 'g';
            rightFiles[5] = 'h';
        } else if(file == 'c') {
            rightFiles = new char[5];
            rightFiles[0] = 'd';
            rightFiles[1] = 'e';
            rightFiles[2] = 'f';
            rightFiles[3] = 'g';
            rightFiles[4] = 'h';
        } else if(file == 'd') {
            rightFiles = new char[4];
            rightFiles[0] = 'e';
            rightFiles[1] = 'f';
            rightFiles[2] = 'g';
            rightFiles[3] = 'h';
        } else if(file == 'e') {
            rightFiles = new char[3];
            rightFiles[0] = 'f';
            rightFiles[1] = 'g';
            rightFiles[2] = 'h';
        } else if(file == 'f') {
            rightFiles = new char[2];
            rightFiles[0] = 'g';
            rightFiles[1] = 'h';
        } else if(file == 'g') {
            rightFiles = new char[1];
            rightFiles[0] = 'h';
        } else {
            rightFiles = new char[0];
        }

        return rightFiles;
    }
}