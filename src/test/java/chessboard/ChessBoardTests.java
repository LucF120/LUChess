package chessboard; 

import org.junit.Test; 

import chessboard.*;
import chesspiece.*;
import util.*; 

import java.util.ArrayList;

public class ChessBoardTests {
    @Test
    public void startingBoardTest() {
        ChessBoard startingBoard = new ChessBoard(); 
        ChessPiece[][] pieces = startingBoard.getBoard();
        //A1 Rook 
        assert(startingBoard.getPieceAt('a', 1) instanceof Rook);
        assert(startingBoard.getPieceAt('a', 1).isAlive() == true);
        assert(startingBoard.getPieceAt('a', 1).getColor() == 0);
        assert(startingBoard.getPieceAt('a', 1).getFile() == 'a');
        assert(startingBoard.getPieceAt('a', 1).getRank() == 1);

        //B1 Knight 
        assert(startingBoard.getPieceAt('b', 1) instanceof Knight);
        assert(startingBoard.getPieceAt('b', 1).isAlive() == true);
        assert(startingBoard.getPieceAt('b', 1).getColor() == 0);
        assert(startingBoard.getPieceAt('b', 1).getFile() == 'b');
        assert(startingBoard.getPieceAt('b', 1).getRank() == 1);

        //C1 Bishop
        assert(startingBoard.getPieceAt('c', 1) instanceof Bishop);
        assert(startingBoard.getPieceAt('c', 1).isAlive() == true);
        assert(startingBoard.getPieceAt('c', 1).getColor() == 0);
        assert(startingBoard.getPieceAt('c', 1).getFile() == 'c');
        assert(startingBoard.getPieceAt('c', 1).getRank() == 1);

        //D1 Queen
        assert(startingBoard.getPieceAt('d', 1) instanceof Queen);
        assert(startingBoard.getPieceAt('d', 1).isAlive() == true);
        assert(startingBoard.getPieceAt('d', 1).getColor() == 0);
        assert(startingBoard.getPieceAt('d', 1).getFile() == 'd');
        assert(startingBoard.getPieceAt('d', 1).getRank() == 1);

        //E1 King 
        assert(startingBoard.getPieceAt('e', 1) instanceof King);
        assert(startingBoard.getPieceAt('e', 1).isAlive() == true);
        assert(startingBoard.getPieceAt('e', 1).getColor() == 0);
        assert(startingBoard.getPieceAt('e', 1).getFile() == 'e');
        assert(startingBoard.getPieceAt('e', 1).getRank() == 1);

        //F1 Bishop 
        assert(startingBoard.getPieceAt('f', 1) instanceof Bishop);
        assert(startingBoard.getPieceAt('f', 1).isAlive() == true);
        assert(startingBoard.getPieceAt('f', 1).getColor() == 0);
        assert(startingBoard.getPieceAt('f', 1).getFile() == 'f');
        assert(startingBoard.getPieceAt('f', 1).getRank() == 1);

        //G1 Knight 
        assert(startingBoard.getPieceAt('g', 1) instanceof Knight);
        assert(startingBoard.getPieceAt('g', 1).isAlive() == true);
        assert(startingBoard.getPieceAt('g', 1).getColor() == 0);
        assert(startingBoard.getPieceAt('g', 1).getFile() == 'g');
        assert(startingBoard.getPieceAt('g', 1).getRank() == 1);

        //H1 Rook 
        assert(startingBoard.getPieceAt('h', 1) instanceof Rook);
        assert(startingBoard.getPieceAt('h', 1).isAlive() == true);
        assert(startingBoard.getPieceAt('h', 1).getColor() == 0);
        assert(startingBoard.getPieceAt('h', 1).getFile() == 'h');
        assert(startingBoard.getPieceAt('h', 1).getRank() == 1);

        //A2 pawn 
        assert(startingBoard.getPieceAt('a', 2) instanceof Pawn);
        assert(startingBoard.getPieceAt('a', 2).isAlive() == true);
        assert(startingBoard.getPieceAt('a', 2).getColor() == 0);
        assert(startingBoard.getPieceAt('a', 2).getFile() == 'a');
        assert(startingBoard.getPieceAt('a', 2).getRank() == 2);

        //B2 pawn 
        assert(startingBoard.getPieceAt('b', 2) instanceof Pawn);
        assert(startingBoard.getPieceAt('b', 2).isAlive() == true);
        assert(startingBoard.getPieceAt('b', 2).getColor() == 0);
        assert(startingBoard.getPieceAt('b', 2).getFile() == 'b');
        assert(startingBoard.getPieceAt('b', 2).getRank() == 2);

        //C2 pawn 
        assert(startingBoard.getPieceAt('c', 2) instanceof Pawn);
        assert(startingBoard.getPieceAt('c', 2).isAlive() == true);
        assert(startingBoard.getPieceAt('c', 2).getColor() == 0);
        assert(startingBoard.getPieceAt('c', 2).getFile() == 'c');
        assert(startingBoard.getPieceAt('c', 2).getRank() == 2);

        //D2 pawn 
        assert(startingBoard.getPieceAt('d', 2) instanceof Pawn);
        assert(startingBoard.getPieceAt('d', 2).isAlive() == true);
        assert(startingBoard.getPieceAt('d', 2).getColor() == 0);
        assert(startingBoard.getPieceAt('d', 2).getFile() == 'd');
        assert(startingBoard.getPieceAt('d', 2).getRank() == 2);

        //E2 pawn 
        assert(startingBoard.getPieceAt('e', 2) instanceof Pawn);
        assert(startingBoard.getPieceAt('e', 2).isAlive() == true);
        assert(startingBoard.getPieceAt('e', 2).getColor() == 0);
        assert(startingBoard.getPieceAt('e', 2).getFile() == 'e');
        assert(startingBoard.getPieceAt('e', 2).getRank() == 2);

        //F2 pawn 
        assert(startingBoard.getPieceAt('f', 2) instanceof Pawn);
        assert(startingBoard.getPieceAt('f', 2).isAlive() == true);
        assert(startingBoard.getPieceAt('f', 2).getColor() == 0);
        assert(startingBoard.getPieceAt('f', 2).getFile() == 'f');
        assert(startingBoard.getPieceAt('f', 2).getRank() == 2);

        //G2 pawn 
        assert(startingBoard.getPieceAt('g', 2) instanceof Pawn);
        assert(startingBoard.getPieceAt('g', 2).isAlive() == true);
        assert(startingBoard.getPieceAt('g', 2).getColor() == 0);
        assert(startingBoard.getPieceAt('g', 2).getFile() == 'g');
        assert(startingBoard.getPieceAt('g', 2).getRank() == 2);

        //H2 pawn 
        assert(startingBoard.getPieceAt('h', 2) instanceof Pawn);
        assert(startingBoard.getPieceAt('h', 2).isAlive() == true);
        assert(startingBoard.getPieceAt('h', 2).getColor() == 0);
        assert(startingBoard.getPieceAt('h', 2).getFile() == 'h');
        assert(startingBoard.getPieceAt('h', 2).getRank() == 2);



        //A8 Rook 
        assert(startingBoard.getPieceAt('a', 8) instanceof Rook);
        assert(startingBoard.getPieceAt('a', 8).isAlive() == true);
        assert(startingBoard.getPieceAt('a', 8).getColor() == 1);
        assert(startingBoard.getPieceAt('a', 8).getFile() == 'a');
        assert(startingBoard.getPieceAt('a', 8).getRank() == 8);

        //B8 Knight 
        assert(startingBoard.getPieceAt('b', 8) instanceof Knight);
        assert(startingBoard.getPieceAt('b', 8).isAlive() == true);
        assert(startingBoard.getPieceAt('b', 8).getColor() == 1);
        assert(startingBoard.getPieceAt('b', 8).getFile() == 'b');
        assert(startingBoard.getPieceAt('b', 8).getRank() == 8);

        //C8 Bishop
        assert(startingBoard.getPieceAt('c', 8) instanceof Bishop);
        assert(startingBoard.getPieceAt('c', 8).isAlive() == true);
        assert(startingBoard.getPieceAt('c', 8).getColor() == 1);
        assert(startingBoard.getPieceAt('c', 8).getFile() == 'c');
        assert(startingBoard.getPieceAt('c', 8).getRank() == 8);

        //D8 Queen
        assert(startingBoard.getPieceAt('d', 8) instanceof Queen);
        assert(startingBoard.getPieceAt('d', 8).isAlive() == true);
        assert(startingBoard.getPieceAt('d', 8).getColor() == 1);
        assert(startingBoard.getPieceAt('d', 8).getFile() == 'd');
        assert(startingBoard.getPieceAt('d', 8).getRank() == 8);

        //E8 King 
        assert(startingBoard.getPieceAt('e', 8) instanceof King);
        assert(startingBoard.getPieceAt('e', 8).isAlive() == true);
        assert(startingBoard.getPieceAt('e', 8).getColor() == 1);
        assert(startingBoard.getPieceAt('e', 8).getFile() == 'e');
        assert(startingBoard.getPieceAt('e', 8).getRank() == 8);

        //F8 Bishop 
        assert(startingBoard.getPieceAt('f', 8) instanceof Bishop);
        assert(startingBoard.getPieceAt('f', 8).isAlive() == true);
        assert(startingBoard.getPieceAt('f', 8).getColor() == 1);
        assert(startingBoard.getPieceAt('f', 8).getFile() == 'f');
        assert(startingBoard.getPieceAt('f', 8).getRank() == 8);

        //G8 Knight 
        assert(startingBoard.getPieceAt('g', 8) instanceof Knight);
        assert(startingBoard.getPieceAt('g', 8).isAlive() == true);
        assert(startingBoard.getPieceAt('g', 8).getColor() == 1);
        assert(startingBoard.getPieceAt('g', 8).getFile() == 'g');
        assert(startingBoard.getPieceAt('g', 8).getRank() == 8);

        //H8 Rook 
        assert(startingBoard.getPieceAt('h', 8) instanceof Rook);
        assert(startingBoard.getPieceAt('h', 8).isAlive() == true);
        assert(startingBoard.getPieceAt('h', 8).getColor() == 1);
        assert(startingBoard.getPieceAt('h', 8).getFile() == 'h');
        assert(startingBoard.getPieceAt('h', 8).getRank() == 8);

        //A7 pawn 
        assert(startingBoard.getPieceAt('a', 7) instanceof Pawn);
        assert(startingBoard.getPieceAt('a', 7).isAlive() == true);
        assert(startingBoard.getPieceAt('a', 7).getColor() == 1);
        assert(startingBoard.getPieceAt('a', 7).getFile() == 'a');
        assert(startingBoard.getPieceAt('a', 7).getRank() == 7);

        //B7 pawn 
        assert(startingBoard.getPieceAt('b', 7) instanceof Pawn);
        assert(startingBoard.getPieceAt('b', 7).isAlive() == true);
        assert(startingBoard.getPieceAt('b', 7).getColor() == 1);
        assert(startingBoard.getPieceAt('b', 7).getFile() == 'b');
        assert(startingBoard.getPieceAt('b', 7).getRank() == 7);

        //C7 pawn 
        assert(startingBoard.getPieceAt('c', 7) instanceof Pawn);
        assert(startingBoard.getPieceAt('c', 7).isAlive() == true);
        assert(startingBoard.getPieceAt('c', 7).getColor() == 1);
        assert(startingBoard.getPieceAt('c', 7).getFile() == 'c');
        assert(startingBoard.getPieceAt('c', 7).getRank() == 7);

        //D7 pawn 
        assert(startingBoard.getPieceAt('d', 7) instanceof Pawn);
        assert(startingBoard.getPieceAt('d', 7).isAlive() == true);
        assert(startingBoard.getPieceAt('d', 7).getColor() == 1);
        assert(startingBoard.getPieceAt('d', 7).getFile() == 'd');
        assert(startingBoard.getPieceAt('d', 7).getRank() == 7);

        //E7 pawn 
        assert(startingBoard.getPieceAt('e', 7) instanceof Pawn);
        assert(startingBoard.getPieceAt('e', 7).isAlive() == true);
        assert(startingBoard.getPieceAt('e', 7).getColor() == 1);
        assert(startingBoard.getPieceAt('e', 7).getFile() == 'e');
        assert(startingBoard.getPieceAt('e', 7).getRank() == 7);

        //F7 pawn 
        assert(startingBoard.getPieceAt('f', 7) instanceof Pawn);
        assert(startingBoard.getPieceAt('f', 7).isAlive() == true);
        assert(startingBoard.getPieceAt('f', 7).getColor() == 1);
        assert(startingBoard.getPieceAt('f', 7).getFile() == 'f');
        assert(startingBoard.getPieceAt('f', 7).getRank() == 7);

        //G7 pawn 
        assert(startingBoard.getPieceAt('g', 7) instanceof Pawn);
        assert(startingBoard.getPieceAt('g', 7).isAlive() == true);
        assert(startingBoard.getPieceAt('g', 7).getColor() == 1);
        assert(startingBoard.getPieceAt('g', 7).getFile() == 'g');
        assert(startingBoard.getPieceAt('g', 7).getRank() == 7);

        //H7 pawn 
        assert(startingBoard.getPieceAt('h', 7) instanceof Pawn);
        assert(startingBoard.getPieceAt('h', 7).isAlive() == true);
        assert(startingBoard.getPieceAt('h', 7).getColor() == 1);
        assert(startingBoard.getPieceAt('h', 7).getFile() == 'h');
        assert(startingBoard.getPieceAt('h', 7).getRank() == 7);

        //Empty squares (ranks 3-6)
        for (int i=3 ; i<7 ; i++) {
            assert(startingBoard.getPieceAt('a', i) == null);
            assert(startingBoard.getPieceAt('b', i) == null);
            assert(startingBoard.getPieceAt('c', i) == null);
            assert(startingBoard.getPieceAt('d', i) == null);
            assert(startingBoard.getPieceAt('e', i) == null);
            assert(startingBoard.getPieceAt('f', i) == null);
            assert(startingBoard.getPieceAt('g', i) == null);
            assert(startingBoard.getPieceAt('h', i) == null);
        }

    }

    @Test 
    public void whitePiecesValueTest() {
        ChessBoard board = new ChessBoard();
        assert(board.whitePiecesValue() == (200 + 9 + 3 + 3 + 3 + 3 + 5 + 5 + 8));
    }

    @Test
    public void blackPiecesValueTest() {
        ChessBoard board = new ChessBoard(); 
        assert(board.blackPiecesValue() == (200 + 9 + 3 + 3 + 3 + 3 + 5 + 5 + 8));
    }

    @Test
    public void startingWhitePawnsLegalMoves() {
        ChessBoard board = new ChessBoard();
        ArrayList<ChessCoordinate> legalMovesA2 = new ArrayList<ChessCoordinate>();
        legalMovesA2.add(new ChessCoordinate('a', 4));
        legalMovesA2.add(new ChessCoordinate('a', 3));
        assert(board.getLegalMoves('a', 2).equals(legalMovesA2));

        ArrayList<ChessCoordinate> legalMovesB2 = new ArrayList<ChessCoordinate>();
        legalMovesB2.add(new ChessCoordinate('b', 4));
        legalMovesB2.add(new ChessCoordinate('b', 3));
        assert(board.getLegalMoves('b', 2).equals(legalMovesB2));

        ArrayList<ChessCoordinate> legalMovesC2 = new ArrayList<ChessCoordinate>();
        legalMovesC2.add(new ChessCoordinate('c', 4));
        legalMovesC2.add(new ChessCoordinate('c', 3));
        assert(board.getLegalMoves('c', 2).equals(legalMovesC2));

        ArrayList<ChessCoordinate> legalMovesD2 = new ArrayList<ChessCoordinate>();
        legalMovesD2.add(new ChessCoordinate('d', 4));
        legalMovesD2.add(new ChessCoordinate('d', 3));
        assert(board.getLegalMoves('d', 2).equals(legalMovesD2));

        ArrayList<ChessCoordinate> legalMovesE2 = new ArrayList<ChessCoordinate>();
        legalMovesE2.add(new ChessCoordinate('e', 4));
        legalMovesE2.add(new ChessCoordinate('e', 3));
        assert(board.getLegalMoves('e', 2).equals(legalMovesE2));

        ArrayList<ChessCoordinate> legalMovesF2 = new ArrayList<ChessCoordinate>();
        legalMovesF2.add(new ChessCoordinate('f', 4));
        legalMovesF2.add(new ChessCoordinate('f', 3));
        assert(board.getLegalMoves('f', 2).equals(legalMovesF2));

        ArrayList<ChessCoordinate> legalMovesG2 = new ArrayList<ChessCoordinate>();
        legalMovesG2.add(new ChessCoordinate('g', 4));
        legalMovesG2.add(new ChessCoordinate('g', 3));
        assert(board.getLegalMoves('g', 2).equals(legalMovesG2));

        ArrayList<ChessCoordinate> legalMovesH2 = new ArrayList<ChessCoordinate>();
        legalMovesH2.add(new ChessCoordinate('h', 4));
        legalMovesH2.add(new ChessCoordinate('h', 3));
        assert(board.getLegalMoves('h', 2).equals(legalMovesH2));
    }

    @Test
    public void startingBlackPawnsLegalMoves() {
        ChessBoard board = new ChessBoard();
        ArrayList<ChessCoordinate> legalMovesA7 = new ArrayList<ChessCoordinate>();
        legalMovesA7.add(new ChessCoordinate('a', 5));
        legalMovesA7.add(new ChessCoordinate('a', 6));
        assert(board.getLegalMoves('a', 7).equals(legalMovesA7));

        ArrayList<ChessCoordinate> legalMovesB7 = new ArrayList<ChessCoordinate>();
        legalMovesB7.add(new ChessCoordinate('b', 5));
        legalMovesB7.add(new ChessCoordinate('b', 6));
        assert(board.getLegalMoves('b', 7).equals(legalMovesB7));

        ArrayList<ChessCoordinate> legalMovesC7 = new ArrayList<ChessCoordinate>();
        legalMovesC7.add(new ChessCoordinate('c', 5));
        legalMovesC7.add(new ChessCoordinate('c', 6));
        assert(board.getLegalMoves('c', 7).equals(legalMovesC7));

        ArrayList<ChessCoordinate> legalMovesD7 = new ArrayList<ChessCoordinate>();
        legalMovesD7.add(new ChessCoordinate('d', 5));
        legalMovesD7.add(new ChessCoordinate('d', 6));
        assert(board.getLegalMoves('d', 7).equals(legalMovesD7));

        ArrayList<ChessCoordinate> legalMovesE7 = new ArrayList<ChessCoordinate>();
        legalMovesE7.add(new ChessCoordinate('e', 5));
        legalMovesE7.add(new ChessCoordinate('e', 6));
        assert(board.getLegalMoves('e', 7).equals(legalMovesE7));

        ArrayList<ChessCoordinate> legalMovesF7 = new ArrayList<ChessCoordinate>();
        legalMovesF7.add(new ChessCoordinate('f', 5));
        legalMovesF7.add(new ChessCoordinate('f', 6));
        assert(board.getLegalMoves('f', 7).equals(legalMovesF7));

        ArrayList<ChessCoordinate> legalMovesG7 = new ArrayList<ChessCoordinate>();
        legalMovesG7.add(new ChessCoordinate('g', 5));
        legalMovesG7.add(new ChessCoordinate('g', 6));
        assert(board.getLegalMoves('g', 7).equals(legalMovesG7));

        ArrayList<ChessCoordinate> legalMovesH7 = new ArrayList<ChessCoordinate>();
        legalMovesH7.add(new ChessCoordinate('h', 5));
        legalMovesH7.add(new ChessCoordinate('h', 6));
        assert(board.getLegalMoves('h', 7).equals(legalMovesH7));
    }
}