package chessboard; 

import org.junit.Test; 

import chessboard.*;
import chesspiece.*;
import util.*; 

import java.util.ArrayList;
import java.util.Arrays;

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

    @Test
    public void testDiagonalPawnCaptures() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);
        board.setPieceAt('a', 4, new Pawn('a', 4, true, 0, true));
        board.setPieceAt('b', 4, new Pawn('b', 4, true, 0, true));
        board.setPieceAt('c', 4, new Pawn('c', 4, true, 0, true));
        board.setPieceAt('d', 4, new Pawn('d', 4, true, 0, true));
        board.setPieceAt('e', 4, new Pawn('e', 4, true, 0, true));
        board.setPieceAt('f', 4, new Pawn('f', 4, true, 0, true));
        board.setPieceAt('g', 4, new Pawn('g', 4, true, 0, true));
        board.setPieceAt('h', 4, new Pawn('h', 4, true, 0, true));

        board.setPieceAt('a', 5, new Pawn('a', 5, true, 1, true));
        board.setPieceAt('b', 5, new Pawn('b', 5, true, 1, true));
        board.setPieceAt('c', 5, new Pawn('c', 5, true, 1, true));
        board.setPieceAt('d', 5, new Pawn('d', 5, true, 1, true));
        board.setPieceAt('e', 5, new Pawn('e', 5, true, 1, true));
        board.setPieceAt('f', 5, new Pawn('f', 5, true, 1, true));
        board.setPieceAt('g', 5, new Pawn('g', 5, true, 1, true));
        board.setPieceAt('h', 5, new Pawn('h', 5, true, 1, true));

        //White piece diagonal captures 
        ArrayList<ChessCoordinate> legalMovesA4 = new ArrayList<ChessCoordinate>();
        legalMovesA4.add(new ChessCoordinate('b', 5));
        assert(board.getLegalMoves('a', 4).equals(legalMovesA4));

        ArrayList<ChessCoordinate> legalMovesB4 = new ArrayList<ChessCoordinate>();
        legalMovesB4.add(new ChessCoordinate('a', 5));
        legalMovesB4.add(new ChessCoordinate('c', 5));
        assert(board.getLegalMoves('b', 4).equals(legalMovesB4));

        ArrayList<ChessCoordinate> legalMovesC4 = new ArrayList<ChessCoordinate>();
        legalMovesC4.add(new ChessCoordinate('b', 5));
        legalMovesC4.add(new ChessCoordinate('d', 5));
        assert(board.getLegalMoves('c', 4).equals(legalMovesC4));

        ArrayList<ChessCoordinate> legalMovesD4 = new ArrayList<ChessCoordinate>();
        legalMovesD4.add(new ChessCoordinate('c', 5));
        legalMovesD4.add(new ChessCoordinate('e', 5));
        assert(board.getLegalMoves('d', 4).equals(legalMovesD4));

        ArrayList<ChessCoordinate> legalMovesE4 = new ArrayList<ChessCoordinate>();
        legalMovesE4.add(new ChessCoordinate('d', 5));
        legalMovesE4.add(new ChessCoordinate('f', 5));
        assert(board.getLegalMoves('e', 4).equals(legalMovesE4));

        ArrayList<ChessCoordinate> legalMovesF4 = new ArrayList<ChessCoordinate>();
        legalMovesF4.add(new ChessCoordinate('e', 5));
        legalMovesF4.add(new ChessCoordinate('g', 5));
        assert(board.getLegalMoves('f', 4).equals(legalMovesF4));

        ArrayList<ChessCoordinate> legalMovesG4 = new ArrayList<ChessCoordinate>();
        legalMovesG4.add(new ChessCoordinate('f', 5));
        legalMovesG4.add(new ChessCoordinate('h', 5));
        assert(board.getLegalMoves('g', 4).equals(legalMovesG4));

        ArrayList<ChessCoordinate> legalMovesH4 = new ArrayList<ChessCoordinate>();
        legalMovesH4.add(new ChessCoordinate('g', 5));
        assert(board.getLegalMoves('h', 4).equals(legalMovesH4));


        //Black piece diagonal captures 
        ArrayList<ChessCoordinate> legalMovesA5 = new ArrayList<ChessCoordinate>();
        legalMovesA5.add(new ChessCoordinate('b', 4));
        assert(board.getLegalMoves('a', 5).equals(legalMovesA5));

        ArrayList<ChessCoordinate> legalMovesB5 = new ArrayList<ChessCoordinate>();
        legalMovesB5.add(new ChessCoordinate('a', 4));
        legalMovesB5.add(new ChessCoordinate('c', 4));
        assert(board.getLegalMoves('b', 5).equals(legalMovesB5));

        ArrayList<ChessCoordinate> legalMovesC5 = new ArrayList<ChessCoordinate>();
        legalMovesC5.add(new ChessCoordinate('b', 4));
        legalMovesC5.add(new ChessCoordinate('d', 4));
        assert(board.getLegalMoves('c', 5).equals(legalMovesC5));

        ArrayList<ChessCoordinate> legalMovesD5 = new ArrayList<ChessCoordinate>();
        legalMovesD5.add(new ChessCoordinate('c', 4));
        legalMovesD5.add(new ChessCoordinate('e', 4));
        assert(board.getLegalMoves('d', 5).equals(legalMovesD5));

        ArrayList<ChessCoordinate> legalMovesE5 = new ArrayList<ChessCoordinate>();
        legalMovesE5.add(new ChessCoordinate('d', 4));
        legalMovesE5.add(new ChessCoordinate('f', 4));
        assert(board.getLegalMoves('e', 5).equals(legalMovesE5));

        ArrayList<ChessCoordinate> legalMovesF5 = new ArrayList<ChessCoordinate>();
        legalMovesF5.add(new ChessCoordinate('e', 4));
        legalMovesF5.add(new ChessCoordinate('g', 4));
        assert(board.getLegalMoves('f', 5).equals(legalMovesF5));

        ArrayList<ChessCoordinate> legalMovesG5 = new ArrayList<ChessCoordinate>();
        legalMovesG5.add(new ChessCoordinate('f', 4));
        legalMovesG5.add(new ChessCoordinate('h', 4));
        assert(board.getLegalMoves('g', 5).equals(legalMovesG5));

        ArrayList<ChessCoordinate> legalMovesH5 = new ArrayList<ChessCoordinate>();
        legalMovesH5.add(new ChessCoordinate('g', 4));
        assert(board.getLegalMoves('h', 5).equals(legalMovesH5));
    }

    @Test
    public void enPassantTests1() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);
        board.setPieceAt('a', 5, new Pawn('a', 5, true, 0, false));
        board.setPieceAt('b', 5, new Pawn('b', 5, true, 1, true));
        board.setPieceAt('c', 5, new Pawn('c', 5, true, 0, false));
        board.setPieceAt('d', 5, new Pawn('d', 5, true, 1, true));
        board.setPieceAt('e', 5, new Pawn('e', 5, true, 0, false));
        board.setPieceAt('f', 5, new Pawn('f', 5, true, 1, true));
        board.setPieceAt('g', 5, new Pawn('g', 5, true, 0, false));
        board.setPieceAt('h', 5, new Pawn('h', 5, true, 1, true));

        //Testing legal en passant moves when there are alternating white-black pawns on the fifth rank 
        ArrayList<ChessCoordinate> legalMovesA5 = new ArrayList<ChessCoordinate>();
        legalMovesA5.add(new ChessCoordinate('a', 6));
        legalMovesA5.add(new ChessCoordinate('b', 6));
        assert(board.getLegalMoves('a', 5).equals(legalMovesA5));

        ArrayList<ChessCoordinate> legalMovesB5 = new ArrayList<ChessCoordinate>();
        legalMovesB5.add(new ChessCoordinate('b', 4));
        assert(board.getLegalMoves('b', 5).equals(legalMovesB5));

        ArrayList<ChessCoordinate> legalMovesC5 = new ArrayList<ChessCoordinate>();
        legalMovesC5.add(new ChessCoordinate('c', 6));
        legalMovesC5.add(new ChessCoordinate('b', 6));
        legalMovesC5.add(new ChessCoordinate('d', 6));
        assert(board.getLegalMoves('c', 5).equals(legalMovesC5));

        ArrayList<ChessCoordinate> legalMovesD5 = new ArrayList<ChessCoordinate>();
        legalMovesD5.add(new ChessCoordinate('d', 4));
        assert(board.getLegalMoves('d', 5).equals(legalMovesD5));

        ArrayList<ChessCoordinate> legalMovesE5 = new ArrayList<ChessCoordinate>();
        legalMovesE5.add(new ChessCoordinate('e', 6));
        legalMovesE5.add(new ChessCoordinate('d', 6));
        legalMovesE5.add(new ChessCoordinate('f', 6));
        assert(board.getLegalMoves('e', 5).equals(legalMovesE5));

        ArrayList<ChessCoordinate> legalMovesF5 = new ArrayList<ChessCoordinate>();
        legalMovesF5.add(new ChessCoordinate('f', 4));
        assert(board.getLegalMoves('f', 5).equals(legalMovesF5));

        ArrayList<ChessCoordinate> legalMovesG5 = new ArrayList<ChessCoordinate>();
        legalMovesG5.add(new ChessCoordinate('g', 6));
        legalMovesG5.add(new ChessCoordinate('f', 6));
        legalMovesG5.add(new ChessCoordinate('h', 6));
        assert(board.getLegalMoves('g', 5).equals(legalMovesG5));

        ArrayList<ChessCoordinate> legalMovesH5 = new ArrayList<ChessCoordinate>();
        legalMovesH5.add(new ChessCoordinate('h', 4));
        assert(board.getLegalMoves('h', 5).equals(legalMovesH5));
    }

    @Test
    public void enPassantTests2() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);
        board.setPieceAt('a', 5, new Pawn('a', 5, true, 1, true));
        board.setPieceAt('b', 5, new Pawn('b', 5, true, 0, false));
        board.setPieceAt('c', 5, new Pawn('c', 5, true, 1, true));
        board.setPieceAt('d', 5, new Pawn('d', 5, true, 0, false));
        board.setPieceAt('e', 5, new Pawn('e', 5, true, 1, true));
        board.setPieceAt('f', 5, new Pawn('f', 5, true, 0, false));
        board.setPieceAt('g', 5, new Pawn('g', 5, true, 1, true));
        board.setPieceAt('h', 5, new Pawn('h', 5, true, 0, false));

        //Testing legal en passant moves when there are alternating black-white pawns on the fifth rank 
        ArrayList<ChessCoordinate> legalMovesA5 = new ArrayList<ChessCoordinate>();
        legalMovesA5.add(new ChessCoordinate('a', 4));
        assert(board.getLegalMoves('a', 5).equals(legalMovesA5));

        ArrayList<ChessCoordinate> legalMovesB5 = new ArrayList<ChessCoordinate>();
        legalMovesB5.add(new ChessCoordinate('b', 6));
        legalMovesB5.add(new ChessCoordinate('a', 6));
        legalMovesB5.add(new ChessCoordinate('c', 6));
        assert(board.getLegalMoves('b', 5).equals(legalMovesB5));

        ArrayList<ChessCoordinate> legalMovesC5 = new ArrayList<ChessCoordinate>();
        legalMovesC5.add(new ChessCoordinate('c', 4));
        assert(board.getLegalMoves('c', 5).equals(legalMovesC5));

        ArrayList<ChessCoordinate> legalMovesD5 = new ArrayList<ChessCoordinate>();
        legalMovesD5.add(new ChessCoordinate('d', 6));
        legalMovesD5.add(new ChessCoordinate('c', 6));
        legalMovesD5.add(new ChessCoordinate('e', 6));
        assert(board.getLegalMoves('d', 5).equals(legalMovesD5));

        ArrayList<ChessCoordinate> legalMovesE5 = new ArrayList<ChessCoordinate>();
        legalMovesE5.add(new ChessCoordinate('e', 4));
        assert(board.getLegalMoves('e', 5).equals(legalMovesE5));

        ArrayList<ChessCoordinate> legalMovesF5 = new ArrayList<ChessCoordinate>();
        legalMovesF5.add(new ChessCoordinate('f', 6));
        legalMovesF5.add(new ChessCoordinate('e', 6));
        legalMovesF5.add(new ChessCoordinate('g', 6));
        assert(board.getLegalMoves('f', 5).equals(legalMovesF5));

        ArrayList<ChessCoordinate> legalMovesG5 = new ArrayList<ChessCoordinate>();
        legalMovesG5.add(new ChessCoordinate('g', 4));
        assert(board.getLegalMoves('g', 5).equals(legalMovesG5));

        ArrayList<ChessCoordinate> legalMovesH5 = new ArrayList<ChessCoordinate>();
        legalMovesH5.add(new ChessCoordinate('h', 6));
        legalMovesH5.add(new ChessCoordinate('g', 6));
        assert(board.getLegalMoves('h', 5).equals(legalMovesH5));
    }

    @Test
    public void enPassantTests3() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);
        board.setPieceAt('a', 4, new Pawn('a', 4, true, 0, true));
        board.setPieceAt('b', 4, new Pawn('b', 4, true, 1, false));
        board.setPieceAt('c', 4, new Pawn('c', 4, true, 0, true));
        board.setPieceAt('d', 4, new Pawn('d', 4, true, 1, false));
        board.setPieceAt('e', 4, new Pawn('e', 4, true, 0, true));
        board.setPieceAt('f', 4, new Pawn('f', 4, true, 1, false));
        board.setPieceAt('g', 4, new Pawn('g', 4, true, 0, true));
        board.setPieceAt('h', 4, new Pawn('h', 4, true, 1, false));

        //Testing legal en passant moves when there are alternating white-black pawns on the fourth rank 
        ArrayList<ChessCoordinate> legalMovesA4 = new ArrayList<ChessCoordinate>();
        legalMovesA4.add(new ChessCoordinate('a', 5));
        assert(board.getLegalMoves('a', 4).equals(legalMovesA4));

        ArrayList<ChessCoordinate> legalMovesB4 = new ArrayList<ChessCoordinate>();
        legalMovesB4.add(new ChessCoordinate('b', 3));
        legalMovesB4.add(new ChessCoordinate('a', 3));
        legalMovesB4.add(new ChessCoordinate('c', 3));
        assert(board.getLegalMoves('b', 4).equals(legalMovesB4));

        ArrayList<ChessCoordinate> legalMovesC4 = new ArrayList<ChessCoordinate>();
        legalMovesC4.add(new ChessCoordinate('c', 5));
        assert(board.getLegalMoves('c', 4).equals(legalMovesC4));

        ArrayList<ChessCoordinate> legalMovesD4 = new ArrayList<ChessCoordinate>();
        legalMovesD4.add(new ChessCoordinate('d', 3));
        legalMovesD4.add(new ChessCoordinate('c', 3));
        legalMovesD4.add(new ChessCoordinate('e', 3));
        assert(board.getLegalMoves('d', 4).equals(legalMovesD4));

        ArrayList<ChessCoordinate> legalMovesE4 = new ArrayList<ChessCoordinate>();
        legalMovesE4.add(new ChessCoordinate('e', 5));
        assert(board.getLegalMoves('e', 4).equals(legalMovesE4));

        ArrayList<ChessCoordinate> legalMovesF4 = new ArrayList<ChessCoordinate>();
        legalMovesF4.add(new ChessCoordinate('f', 3));
        legalMovesF4.add(new ChessCoordinate('e', 3));
        legalMovesF4.add(new ChessCoordinate('g', 3));
        assert(board.getLegalMoves('f', 4).equals(legalMovesF4));

        ArrayList<ChessCoordinate> legalMovesG4 = new ArrayList<ChessCoordinate>();
        legalMovesG4.add(new ChessCoordinate('g', 5));
        assert(board.getLegalMoves('g', 4).equals(legalMovesG4));

        ArrayList<ChessCoordinate> legalMovesH4 = new ArrayList<ChessCoordinate>();
        legalMovesH4.add(new ChessCoordinate('h', 3));
        legalMovesH4.add(new ChessCoordinate('g', 3));
        assert(board.getLegalMoves('h', 4).equals(legalMovesH4));
    }

    @Test
    public void enPassantTests4() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);
        board.setPieceAt('a', 4, new Pawn('a', 4, true, 1, false));
        board.setPieceAt('b', 4, new Pawn('b', 4, true, 0, true));
        board.setPieceAt('c', 4, new Pawn('c', 4, true, 1, false));
        board.setPieceAt('d', 4, new Pawn('d', 4, true, 0, true));
        board.setPieceAt('e', 4, new Pawn('e', 4, true, 1, false));
        board.setPieceAt('f', 4, new Pawn('f', 4, true, 0, true));
        board.setPieceAt('g', 4, new Pawn('g', 4, true, 1, false));
        board.setPieceAt('h', 4, new Pawn('h', 4, true, 0, true));

        //Testing legal en passant moves when there are alternating black-white pawns on the fourth rank 
        ArrayList<ChessCoordinate> legalMovesA4 = new ArrayList<ChessCoordinate>();
        legalMovesA4.add(new ChessCoordinate('a', 3));
        legalMovesA4.add(new ChessCoordinate('b', 3));
        assert(board.getLegalMoves('a', 4).equals(legalMovesA4));

        ArrayList<ChessCoordinate> legalMovesB4 = new ArrayList<ChessCoordinate>();
        legalMovesB4.add(new ChessCoordinate('b', 5));
        assert(board.getLegalMoves('b', 4).equals(legalMovesB4));

        ArrayList<ChessCoordinate> legalMovesC4 = new ArrayList<ChessCoordinate>();
        legalMovesC4.add(new ChessCoordinate('c', 3));
        legalMovesC4.add(new ChessCoordinate('b', 3));
        legalMovesC4.add(new ChessCoordinate('d', 3));
        assert(board.getLegalMoves('c', 4).equals(legalMovesC4));

        ArrayList<ChessCoordinate> legalMovesD4 = new ArrayList<ChessCoordinate>();
        legalMovesD4.add(new ChessCoordinate('d', 5));
        assert(board.getLegalMoves('d', 4).equals(legalMovesD4));

        ArrayList<ChessCoordinate> legalMovesE4 = new ArrayList<ChessCoordinate>();
        legalMovesE4.add(new ChessCoordinate('e', 3));
        legalMovesE4.add(new ChessCoordinate('d', 3));
        legalMovesE4.add(new ChessCoordinate('f', 3));
        assert(board.getLegalMoves('e', 4).equals(legalMovesE4));

        ArrayList<ChessCoordinate> legalMovesF4 = new ArrayList<ChessCoordinate>();
        legalMovesF4.add(new ChessCoordinate('f', 5));
        assert(board.getLegalMoves('f', 4).equals(legalMovesF4));

        ArrayList<ChessCoordinate> legalMovesG4 = new ArrayList<ChessCoordinate>();
        legalMovesG4.add(new ChessCoordinate('g', 3));
        legalMovesG4.add(new ChessCoordinate('f', 3));
        legalMovesG4.add(new ChessCoordinate('h', 3));
        assert(board.getLegalMoves('g', 4).equals(legalMovesG4));

        ArrayList<ChessCoordinate> legalMovesH4 = new ArrayList<ChessCoordinate>();
        legalMovesH4.add(new ChessCoordinate('h', 5));
        assert(board.getLegalMoves('h', 4).equals(legalMovesH4));
    }

    @Test
    public void rookTests() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);
        board.setPieceAt('a', 1, new Rook('a', 1, true, 0));
        ArrayList<ChessCoordinate> legalMovesA1 = new ArrayList<ChessCoordinate>();
        legalMovesA1.add(new ChessCoordinate('b', 1));
        legalMovesA1.add(new ChessCoordinate('c', 1));
        legalMovesA1.add(new ChessCoordinate('d', 1));
        legalMovesA1.add(new ChessCoordinate('e', 1));
        legalMovesA1.add(new ChessCoordinate('f', 1));
        legalMovesA1.add(new ChessCoordinate('g', 1));
        legalMovesA1.add(new ChessCoordinate('h', 1));
        legalMovesA1.add(new ChessCoordinate('a', 2));
        legalMovesA1.add(new ChessCoordinate('a', 3));
        legalMovesA1.add(new ChessCoordinate('a', 4));
        legalMovesA1.add(new ChessCoordinate('a', 5));
        legalMovesA1.add(new ChessCoordinate('a', 6));
        legalMovesA1.add(new ChessCoordinate('a', 7));
        legalMovesA1.add(new ChessCoordinate('a', 8));
        assert(board.getLegalMoves('a', 1).equals(legalMovesA1));

        ArrayList<ChessCoordinate> legalMovesB1 = new ArrayList<ChessCoordinate>();
        board.setPieceAt('a', 1, null);
        board.setPieceAt('b', 1, new Rook('b', 1, true, 0));
        legalMovesB1.add(new ChessCoordinate('a', 1));
        legalMovesB1.add(new ChessCoordinate('c', 1));
        legalMovesB1.add(new ChessCoordinate('d', 1));
        legalMovesB1.add(new ChessCoordinate('e', 1));
        legalMovesB1.add(new ChessCoordinate('f', 1));
        legalMovesB1.add(new ChessCoordinate('g', 1));
        legalMovesB1.add(new ChessCoordinate('h', 1));
        legalMovesB1.add(new ChessCoordinate('b', 2));
        legalMovesB1.add(new ChessCoordinate('b', 3));
        legalMovesB1.add(new ChessCoordinate('b', 4));
        legalMovesB1.add(new ChessCoordinate('b', 5));
        legalMovesB1.add(new ChessCoordinate('b', 6));
        legalMovesB1.add(new ChessCoordinate('b', 7));
        legalMovesB1.add(new ChessCoordinate('b', 8));
        assert(board.getLegalMoves('b', 1).equals(legalMovesB1));

        ArrayList<ChessCoordinate> legalMovesG1 = new ArrayList<ChessCoordinate>();
        board.setPieceAt('b', 1, null);
        board.setPieceAt('g', 1, new Rook('g', 1, true, 0));
        legalMovesG1.add(new ChessCoordinate('f', 1));
        legalMovesG1.add(new ChessCoordinate('e', 1));
        legalMovesG1.add(new ChessCoordinate('d', 1));
        legalMovesG1.add(new ChessCoordinate('c', 1));
        legalMovesG1.add(new ChessCoordinate('b', 1));
        legalMovesG1.add(new ChessCoordinate('a', 1));
        legalMovesG1.add(new ChessCoordinate('h', 1));
        legalMovesG1.add(new ChessCoordinate('g', 2));
        legalMovesG1.add(new ChessCoordinate('g', 3));
        legalMovesG1.add(new ChessCoordinate('g', 4));
        legalMovesG1.add(new ChessCoordinate('g', 5));
        legalMovesG1.add(new ChessCoordinate('g', 6));
        legalMovesG1.add(new ChessCoordinate('g', 7));
        legalMovesG1.add(new ChessCoordinate('g', 8));
        assert(board.getLegalMoves('g', 1).equals(legalMovesG1));

        ArrayList<ChessCoordinate> legalMovesE4 = new ArrayList<ChessCoordinate>();
        board.setPieceAt('g', 1, null);
        board.setPieceAt('e', 4, new Rook('e', 4, true, 1));
        legalMovesE4.add(new ChessCoordinate('d', 4));
        legalMovesE4.add(new ChessCoordinate('c', 4));
        legalMovesE4.add(new ChessCoordinate('b', 4));
        legalMovesE4.add(new ChessCoordinate('a', 4));
        legalMovesE4.add(new ChessCoordinate('f', 4));
        legalMovesE4.add(new ChessCoordinate('g', 4));
        legalMovesE4.add(new ChessCoordinate('h', 4));
        legalMovesE4.add(new ChessCoordinate('e', 3));
        legalMovesE4.add(new ChessCoordinate('e', 2));
        legalMovesE4.add(new ChessCoordinate('e', 1));
        legalMovesE4.add(new ChessCoordinate('e', 5));
        legalMovesE4.add(new ChessCoordinate('e', 6));
        legalMovesE4.add(new ChessCoordinate('e', 7));
        legalMovesE4.add(new ChessCoordinate('e', 8));
        assert(board.getLegalMoves('e', 4).equals(legalMovesE4));

        //Checks that there are no legal moves for a rook surrounded by same color pieces 
        board.setPieceAt('d', 4, new Rook('d', 4, true, 1));
        board.setPieceAt('d', 5, new King('d', 5, true, 1));
        board.setPieceAt('d', 3, new Knight('d', 3, true, 1));
        board.setPieceAt('c', 4, new Bishop('c', 4, true, 1));
        board.setPieceAt('e', 4, new Pawn('e', 4, true, 1));
        assert(board.getLegalMoves('d', 4).equals(new ArrayList<ChessCoordinate>()));

        //Checks that there are four capture moves legal for a rook surrounded by opposite color pieces 
        ArrayList<ChessCoordinate> legalMovesD4 = new ArrayList<ChessCoordinate>();
        board.setPieceAt('d', 4, new Rook('d', 4, true, 0));
        legalMovesD4.add(new ChessCoordinate('c', 4));
        legalMovesD4.add(new ChessCoordinate('e', 4));
        legalMovesD4.add(new ChessCoordinate('d', 3));
        legalMovesD4.add(new ChessCoordinate('d', 5));
        assert(board.getLegalMoves('d', 4).equals(legalMovesD4));

        //Check a rook can travel from a-f, but can't go to g-h due to colliding with it's own piece
        board.setPieceAt('d', 4, null);
        board.setPieceAt('c', 4, null);
        board.setPieceAt('d', 5, null);
        board.setPieceAt('d', 3, null);
        board.setPieceAt('e', 4, null);
        ArrayList<ChessCoordinate> legalMovesA5 = new ArrayList<ChessCoordinate>();
        board.setPieceAt('a', 5, new Rook('a', 5, true, 0));
        board.setPieceAt('g', 5, new Rook('g', 5, true, 0));
        board.setPieceAt('a', 7, new Pawn('a', 7, true, 0));
        board.setPieceAt('a', 2, new Bishop('a', 2, true, 0));
        legalMovesA5.add(new ChessCoordinate('b', 5));
        legalMovesA5.add(new ChessCoordinate('c', 5));
        legalMovesA5.add(new ChessCoordinate('d', 5));
        legalMovesA5.add(new ChessCoordinate('e', 5));
        legalMovesA5.add(new ChessCoordinate('f', 5));
        legalMovesA5.add(new ChessCoordinate('a', 4));
        legalMovesA5.add(new ChessCoordinate('a', 3));
        legalMovesA5.add(new ChessCoordinate('a', 6));
        assert(board.getLegalMoves('a', 5).equals(legalMovesA5));
    }

    @Test
    public void bishopTests() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);
        board.setPieceAt('a', 4, new Bishop('a', 4, true, 0));

        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('b', 5));
        legalMoves.add(new ChessCoordinate('c', 6));
        legalMoves.add(new ChessCoordinate('d', 7));
        legalMoves.add(new ChessCoordinate('e', 8));
        legalMoves.add(new ChessCoordinate('b', 3));
        legalMoves.add(new ChessCoordinate('c', 2));
        legalMoves.add(new ChessCoordinate('d', 1));
        assert(board.getLegalMoves('a', 4).equals(legalMoves));

        legalMoves = new ArrayList<ChessCoordinate>();
        board.setPieceAt('b', 5, new Pawn('b', 5, true, 0));
        board.setPieceAt('b', 3, new Bishop('b', 3, true, 0));
        assert(board.getLegalMoves('a', 4).equals(legalMoves));

        board.setPieceAt('b', 5, new Pawn('b', 5, true, 1));
        board.setPieceAt('b', 3, new Bishop('b', 3, true, 1));
        legalMoves.add(new ChessCoordinate('b', 5));
        legalMoves.add(new ChessCoordinate('b', 3));
        assert(board.getLegalMoves('a', 4).equals(legalMoves));

        board.setPieceAt('a', 4, null);
        board.setPieceAt('b', 5, null);
        board.setPieceAt('b', 3, null);
        board.setPieceAt('b', 4, new Bishop('b', 4, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('a', 5));
        legalMoves.add(new ChessCoordinate('a', 3));
        legalMoves.add(new ChessCoordinate('c', 5));
        legalMoves.add(new ChessCoordinate('d', 6));
        legalMoves.add(new ChessCoordinate('e', 7));
        legalMoves.add(new ChessCoordinate('f', 8));
        legalMoves.add(new ChessCoordinate('c', 3));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('e', 1));
        assert(board.getLegalMoves('b', 4).equals(legalMoves));

        board.setPieceAt('b', 4, null);
        board.setPieceAt('c', 4, new Bishop('c', 4, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('b', 5));
        legalMoves.add(new ChessCoordinate('a', 6));
        legalMoves.add(new ChessCoordinate('b', 3));
        legalMoves.add(new ChessCoordinate('a', 2));
        legalMoves.add(new ChessCoordinate('d', 5));
        legalMoves.add(new ChessCoordinate('e', 6));
        legalMoves.add(new ChessCoordinate('f', 7));
        legalMoves.add(new ChessCoordinate('g', 8));
        legalMoves.add(new ChessCoordinate('d', 3));
        legalMoves.add(new ChessCoordinate('e', 2));
        legalMoves.add(new ChessCoordinate('f', 1));
        assert(board.getLegalMoves('c', 4).equals(legalMoves));

        board.setPieceAt('c', 4, null);
        board.setPieceAt('d', 4, new Bishop('d', 4, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('c', 5));
        legalMoves.add(new ChessCoordinate('b', 6));
        legalMoves.add(new ChessCoordinate('a', 7));
        legalMoves.add(new ChessCoordinate('c', 3));
        legalMoves.add(new ChessCoordinate('b', 2));
        legalMoves.add(new ChessCoordinate('a', 1));
        legalMoves.add(new ChessCoordinate('e', 5));
        legalMoves.add(new ChessCoordinate('f', 6));
        legalMoves.add(new ChessCoordinate('g', 7));
        legalMoves.add(new ChessCoordinate('h', 8));
        legalMoves.add(new ChessCoordinate('e', 3));
        legalMoves.add(new ChessCoordinate('f', 2));
        legalMoves.add(new ChessCoordinate('g', 1));
        assert(board.getLegalMoves('d', 4).equals(legalMoves));

        board.setPieceAt('d', 4, null);
        board.setPieceAt('e', 4, new Bishop('e', 4, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 5));
        legalMoves.add(new ChessCoordinate('c', 6));
        legalMoves.add(new ChessCoordinate('b', 7));
        legalMoves.add(new ChessCoordinate('a', 8));
        legalMoves.add(new ChessCoordinate('d', 3));
        legalMoves.add(new ChessCoordinate('c', 2));
        legalMoves.add(new ChessCoordinate('b', 1));
        legalMoves.add(new ChessCoordinate('f', 5));
        legalMoves.add(new ChessCoordinate('g', 6));
        legalMoves.add(new ChessCoordinate('h', 7));
        legalMoves.add(new ChessCoordinate('f', 3));
        legalMoves.add(new ChessCoordinate('g', 2));
        legalMoves.add(new ChessCoordinate('h', 1));
        assert(board.getLegalMoves('e', 4).equals(legalMoves));

        board.setPieceAt('e', 4, null);
        board.setPieceAt('f', 4, new Bishop('f', 4, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('e', 5));
        legalMoves.add(new ChessCoordinate('d', 6));
        legalMoves.add(new ChessCoordinate('c', 7));
        legalMoves.add(new ChessCoordinate('b', 8));
        legalMoves.add(new ChessCoordinate('e', 3));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('c', 1));
        legalMoves.add(new ChessCoordinate('g', 5));
        legalMoves.add(new ChessCoordinate('h', 6));
        legalMoves.add(new ChessCoordinate('g', 3));
        legalMoves.add(new ChessCoordinate('h', 2));
        assert(board.getLegalMoves('f', 4).equals(legalMoves));

        board.setPieceAt('f', 4, null);
        board.setPieceAt('g', 4, new Bishop('g', 4, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('f', 5));
        legalMoves.add(new ChessCoordinate('e', 6));
        legalMoves.add(new ChessCoordinate('d', 7));
        legalMoves.add(new ChessCoordinate('c', 8));
        legalMoves.add(new ChessCoordinate('f', 3));
        legalMoves.add(new ChessCoordinate('e', 2));
        legalMoves.add(new ChessCoordinate('d', 1));
        legalMoves.add(new ChessCoordinate('h', 5));
        legalMoves.add(new ChessCoordinate('h', 3));
        assert(board.getLegalMoves('g', 4).equals(legalMoves));

        board.setPieceAt('g', 4, null);
        board.setPieceAt('h', 4, new Bishop('h', 4, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('g', 5));
        legalMoves.add(new ChessCoordinate('f', 6));
        legalMoves.add(new ChessCoordinate('e', 7));
        legalMoves.add(new ChessCoordinate('d', 8));
        legalMoves.add(new ChessCoordinate('g', 3));
        legalMoves.add(new ChessCoordinate('f', 2));
        legalMoves.add(new ChessCoordinate('e', 1));
        assert(board.getLegalMoves('h', 4).equals(legalMoves));
        
    }

    @Test
    public void queenTests() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);
        board.setPieceAt('e', 4, new Queen('e', 4, true, 0));
        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 4));
        legalMoves.add(new ChessCoordinate('c', 4));
        legalMoves.add(new ChessCoordinate('b', 4));
        legalMoves.add(new ChessCoordinate('a', 4));
        legalMoves.add(new ChessCoordinate('f', 4));
        legalMoves.add(new ChessCoordinate('g', 4));
        legalMoves.add(new ChessCoordinate('h', 4));
        legalMoves.add(new ChessCoordinate('e', 3));
        legalMoves.add(new ChessCoordinate('e', 2));
        legalMoves.add(new ChessCoordinate('e', 1));
        legalMoves.add(new ChessCoordinate('e', 5));
        legalMoves.add(new ChessCoordinate('e', 6));
        legalMoves.add(new ChessCoordinate('e', 7));
        legalMoves.add(new ChessCoordinate('e', 8));
        legalMoves.add(new ChessCoordinate('d', 5));
        legalMoves.add(new ChessCoordinate('c', 6));
        legalMoves.add(new ChessCoordinate('b', 7));
        legalMoves.add(new ChessCoordinate('a', 8));
        legalMoves.add(new ChessCoordinate('d', 3));
        legalMoves.add(new ChessCoordinate('c', 2));
        legalMoves.add(new ChessCoordinate('b', 1));
        legalMoves.add(new ChessCoordinate('f', 5));
        legalMoves.add(new ChessCoordinate('g', 6));
        legalMoves.add(new ChessCoordinate('h', 7));
        legalMoves.add(new ChessCoordinate('f', 3));
        legalMoves.add(new ChessCoordinate('g', 2));
        legalMoves.add(new ChessCoordinate('h', 1));
        assert(board.getLegalMoves('e', 4).equals(legalMoves));
        
        //Surrounded by pieces of same color 
        legalMoves = new ArrayList<ChessCoordinate>();
        board.setPieceAt('f', 4, new Bishop('f', 4, true, 0));
        board.setPieceAt('d', 4, new Knight('d', 4, true, 0));
        board.setPieceAt('e', 3, new Queen('e', 3, true, 0));
        board.setPieceAt('e', 5, new Pawn('e', 5, true, 0));
        board.setPieceAt('d', 5, new Bishop('d', 5, true, 0));
        board.setPieceAt('d', 3, new Knight('d', 3, true, 0));
        board.setPieceAt('f', 5, new Queen('f', 5, true, 0));
        board.setPieceAt('f', 3, new Rook('f', 3, true, 0));
        assert(board.getLegalMoves('e', 4).equals(new ArrayList<ChessCoordinate>()));

        //Surrounded by pieces of opposite color 
        legalMoves = new ArrayList<ChessCoordinate>();
        board.setPieceAt('e', 4, new Queen('e', 4, true, 1));
        legalMoves.add(new ChessCoordinate('d', 4));
        legalMoves.add(new ChessCoordinate('f', 4));
        legalMoves.add(new ChessCoordinate('e', 3));
        legalMoves.add(new ChessCoordinate('e', 5));
        legalMoves.add(new ChessCoordinate('d', 5));
        legalMoves.add(new ChessCoordinate('d', 3));
        legalMoves.add(new ChessCoordinate('f', 5));
        legalMoves.add(new ChessCoordinate('f', 3));
        assert(board.getLegalMoves('e', 4).equals(legalMoves));
    }
    
    @Test
    public void kingTest() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);
        board.setPieceAt('e', 1, new King('e', 1, true, 0));
        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 1));
        legalMoves.add(new ChessCoordinate('f', 1));
        legalMoves.add(new ChessCoordinate('e', 2));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('f', 2));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));


        //King with no legal moves due to attacks by rooks 
        legalMoves = new ArrayList<ChessCoordinate>();
        board.setPieceAt('a', 1, new Rook('a', 1, true, 1));
        board.setPieceAt('a', 2, new Rook('a', 2, true, 1));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));
        board.setPieceAt('a', 1, null);
        board.setPieceAt('a', 2, null);


        //King surrounded by same color bishops 
        legalMoves = new ArrayList<ChessCoordinate>();
        board.setPieceAt('d', 1, new Bishop('d', 1, true, 0));
        board.setPieceAt('f', 1, new Bishop('f', 1, true, 0));
        board.setPieceAt('d', 2, new Bishop('d', 2, true, 0));
        board.setPieceAt('f', 2, new Bishop('f', 2, true, 0));
        board.setPieceAt('e', 2, new Bishop('e', 2, true, 0));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));
    }

    @Test
    public void castlingTest() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);
        board.setPieceAt('a', 1, new Rook('a', 1, true, 0));
        board.setPieceAt('e', 1, new King('e', 1, true, 0));
        board.setPieceAt('h', 1, new Rook('h', 1, true, 0));
        board.setPieceAt('a', 8, new Rook('a', 8, true, 1));
        board.setPieceAt('e', 8, new King('e', 8, true, 1));
        board.setPieceAt('h', 8, new Rook('h', 8, true, 1));

        //Test long and short castle for white king 
        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 1));
        legalMoves.add(new ChessCoordinate('f', 1));
        legalMoves.add(new ChessCoordinate('e', 2));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('f', 2));
        legalMoves.add(new ChessCoordinate('c', 1));
        legalMoves.add(new ChessCoordinate('g', 1));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));

        //Test long and short castle for black king 
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 8));
        legalMoves.add(new ChessCoordinate('f', 8));
        legalMoves.add(new ChessCoordinate('e', 7));
        legalMoves.add(new ChessCoordinate('d', 7));
        legalMoves.add(new ChessCoordinate('f', 7));
        legalMoves.add(new ChessCoordinate('c', 8));
        legalMoves.add(new ChessCoordinate('g', 8));
        assert(board.getLegalMoves('e', 8).equals(legalMoves));

        King whiteKing = (King) board.getPieceAt('e', 1);
        King blackKing = (King) board.getPieceAt('e', 8);
        whiteKing.setHasMoved();
        blackKing.setHasMoved();

        //Test that white king can't castle if it has moved
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 1));
        legalMoves.add(new ChessCoordinate('f', 1));
        legalMoves.add(new ChessCoordinate('e', 2));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('f', 2));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));

        //Test that black king can't castle if it has moved 
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 8));
        legalMoves.add(new ChessCoordinate('f', 8));
        legalMoves.add(new ChessCoordinate('e', 7));
        legalMoves.add(new ChessCoordinate('d', 7));
        legalMoves.add(new ChessCoordinate('f', 7));
        assert(board.getLegalMoves('e', 8).equals(legalMoves));

        board.setPieceAt('e', 1, new King('e', 1, true, 0));
        board.setPieceAt('e', 8, new King('e', 8, true, 1));
        Rook a1Rook = (Rook) board.getPieceAt('a', 1);
        Rook h1Rook = (Rook) board.getPieceAt('h', 1);
        Rook a8Rook = (Rook) board.getPieceAt('a', 8);
        Rook h8Rook = (Rook) board.getPieceAt('h', 8);
        a1Rook.setHasMoved();
        h1Rook.setHasMoved();
        a8Rook.setHasMoved();
        h8Rook.setHasMoved();

        //Test that white king can't castle if the rooks have moved 
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 1));
        legalMoves.add(new ChessCoordinate('f', 1));
        legalMoves.add(new ChessCoordinate('e', 2));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('f', 2));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));

        //Test that black king can't castle if the rooks have moved 
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 8));
        legalMoves.add(new ChessCoordinate('f', 8));
        legalMoves.add(new ChessCoordinate('e', 7));
        legalMoves.add(new ChessCoordinate('d', 7));
        legalMoves.add(new ChessCoordinate('f', 7));
        assert(board.getLegalMoves('e', 8).equals(legalMoves));

        //Test that white king can't castle if the C1 square and F1 square is hit 
        board.setPieceAt('a', 1, new Rook('a', 1, true, 0));
        board.setPieceAt('h', 1, new Rook('h', 1, true, 0));
        board.setPieceAt('a', 8, new Rook('a', 8, true, 1));
        board.setPieceAt('h', 8, new Rook('h', 8, true, 1));
        board.setPieceAt('c', 4, new Queen('c', 4, true, 1));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 1));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('f', 2));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));

        //Tests that white king can't castle if the D1 and G1 square is hit 
        board.setPieceAt('c', 4, null);
        board.setPieceAt('d', 4, new Queen('d', 4, true, 1));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('f', 1));
        legalMoves.add(new ChessCoordinate('e', 2));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));

        //Tests that white king can't castle if it is in check 
        board.setPieceAt('d', 4, null);
        board.setPieceAt('e', 2, new Queen('e', 2, true, 1));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('e', 2));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));

        //Test that black king can't castle if the C8 square and F8 square is hit 
        board.setPieceAt('c', 5, new Queen('c', 5, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 8));
        legalMoves.add(new ChessCoordinate('d', 7));
        legalMoves.add(new ChessCoordinate('f', 7));
        assert(board.getLegalMoves('e', 8).equals(legalMoves));

        //Tests that black king can't castle if the D8 and G8 square is hit 
        board.setPieceAt('c', 5, null);
        board.setPieceAt('d', 5, new Queen('d', 5, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('f', 8));
        legalMoves.add(new ChessCoordinate('e', 7));
        assert(board.getLegalMoves('e', 8).equals(legalMoves));

        //Tests that black king can't castle if it is in check 
        board.setPieceAt('d', 5, null);
        board.setPieceAt('e', 7, new Queen('e', 7, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('e', 7));
        assert(board.getLegalMoves('e', 8).equals(legalMoves));

        //Tests that the white king can't castle if there is on a piece on B1 and G1 
        board.setPieceAt('e', 7, null);
        board.setPieceAt('e', 2, null);
        board.setPieceAt('b', 1, new Knight('b', 1, true, 0));
        board.setPieceAt('g', 1, new Knight('g', 1, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 1));
        legalMoves.add(new ChessCoordinate('f', 1));
        legalMoves.add(new ChessCoordinate('e', 2));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('f', 2));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));

        //Tests that the white king can't castle if there is on a piece on C1 and F1 
        board.setPieceAt('b', 1, null);
        board.setPieceAt('g', 1, null);
        board.setPieceAt('c', 1, new Bishop('c', 1, true, 0));
        board.setPieceAt('f', 1, new Bishop('f', 1, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 1));
        legalMoves.add(new ChessCoordinate('e', 2));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('f', 2));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));

        //Tests that the white king can't castle if there is a piece on D1 and F1
        board.setPieceAt('c', 1, null);
        board.setPieceAt('d', 1, new Queen('d', 1, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('e', 2));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('f', 2));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));

        //Tests that the white king can't castle if there is no rook on a1 or h1 
        board.setPieceAt('a', 1, null);
        board.setPieceAt('h', 1, null);
        board.setPieceAt('d', 1, null);
        board.setPieceAt('f', 1, null);
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 1));
        legalMoves.add(new ChessCoordinate('f', 1));
        legalMoves.add(new ChessCoordinate('e', 2));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('f', 2));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));

        //Tests that the black king can't castle if there is on a piece on B8 and G8 
        board.setPieceAt('b', 8, new Knight('b', 8, true, 1));
        board.setPieceAt('g', 8, new Knight('g', 8, true, 1));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 8));
        legalMoves.add(new ChessCoordinate('f', 8));
        legalMoves.add(new ChessCoordinate('e', 7));
        legalMoves.add(new ChessCoordinate('d', 7));
        legalMoves.add(new ChessCoordinate('f', 7));
        assert(board.getLegalMoves('e', 8).equals(legalMoves));

        //Tests that the black king can't castle if there is on a piece on C8 and F8 
        board.setPieceAt('b', 8, null);
        board.setPieceAt('g', 8, null);
        board.setPieceAt('c', 8, new Bishop('c', 8, true, 1));
        board.setPieceAt('f', 8, new Bishop('f', 8, true, 1));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 8));
        legalMoves.add(new ChessCoordinate('e', 7));
        legalMoves.add(new ChessCoordinate('d', 7));
        legalMoves.add(new ChessCoordinate('f', 7));
        assert(board.getLegalMoves('e', 8).equals(legalMoves));

        //Tests that the black king can't castle if there is a piece on D8 and F8
        board.setPieceAt('c', 8, null);
        board.setPieceAt('d', 8, new Queen('d', 8, true, 1));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('e', 7));
        legalMoves.add(new ChessCoordinate('d', 7));
        legalMoves.add(new ChessCoordinate('f', 7));
        assert(board.getLegalMoves('e', 8).equals(legalMoves));

        //Tests that the black king can't castle if there is no rook on a8 or h8 
        board.setPieceAt('a', 8, null);
        board.setPieceAt('h', 8, null);
        board.setPieceAt('d', 8, null);
        board.setPieceAt('f', 8, null);
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('d', 8));
        legalMoves.add(new ChessCoordinate('f', 8));
        legalMoves.add(new ChessCoordinate('e', 7));
        legalMoves.add(new ChessCoordinate('d', 7));
        legalMoves.add(new ChessCoordinate('f', 7));
        assert(board.getLegalMoves('e', 8).equals(legalMoves));
    }

    @Test
    public void knightTests() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);
        
        //Tests legal moves for a knight in the middle of the board with nothing else on board 
        board.setPieceAt('e', 4, new Knight('e', 4, true, 0));
        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('c', 5));
        legalMoves.add(new ChessCoordinate('c', 3));
        legalMoves.add(new ChessCoordinate('d', 6));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('g', 5));
        legalMoves.add(new ChessCoordinate('g', 3));
        legalMoves.add(new ChessCoordinate('f', 6));
        legalMoves.add(new ChessCoordinate('f', 2));
        assert(board.getLegalMoves('e', 4).equals(legalMoves));

        //Tests that the knight has the same legal moves if all 8 squares have capturable pieces 
        board.setPieceAt('c', 5, new Knight('c', 5, true, 1));
        board.setPieceAt('c', 3, new Bishop('c', 3, true, 1));
        board.setPieceAt('d', 6, new Rook('d', 6, true, 1));
        board.setPieceAt('d', 2, new Queen('d', 2, true, 1));
        board.setPieceAt('g', 5, new Pawn('g', 5, true, 1));
        board.setPieceAt('g', 3, new Pawn('g', 3, true, 1));
        board.setPieceAt('f', 6, new Knight('f', 6, true, 1));
        board.setPieceAt('f', 2, new Rook('f', 2, true, 1));
        assert(board.getLegalMoves('e', 4).equals(legalMoves));

        //Tests that the knight has no legal moves if all 8 squares have pieces of the same color 
        board.setPieceAt('e', 4, new Knight('e', 4, true, 1));
        assert(board.getLegalMoves('e', 4).equals(new ArrayList<ChessCoordinate>()));

        //Test legal moves for a knight on the a file 
        board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('a', 1, new Knight('a', 1, true, 0));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('c', 2));
        legalMoves.add(new ChessCoordinate('b', 3));
        assert(board.getLegalMoves('a', 1).equals(legalMoves));
        
        //Test legal moves for a knight on the h file 
        board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('h', 8, new Knight('h', 8, true, 1));
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('f', 7));
        legalMoves.add(new ChessCoordinate('g', 6));
        assert(board.getLegalMoves('h', 8).equals(legalMoves));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getLegalMovesFileOutOfBoundsException() {
        ChessBoard board = new ChessBoard(); 
        board.getLegalMoves('i', 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getLegalMovesRankOutOfBoundsException() {
        ChessBoard board = new ChessBoard(); 
        board.getLegalMoves('i', 9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void movePieceFileOutOfBoundsException() {
        ChessBoard board = new ChessBoard(); 
        board.movePiece('i', 1, 'h', 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void movePieceRankOutOfBoundsException() {
        ChessBoard board = new ChessBoard(); 
        board.movePiece('h', 9, 'h', 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void movePieceDestFileOutOfBoundsException() {
        ChessBoard board = new ChessBoard(); 
        board.movePiece('h', 8, 'i', 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void movePieceDestRankOutOfBoundsException() {
        ChessBoard board = new ChessBoard(); 
        board.movePiece('h', 8, 'h', 9);
    }

    @Test(expected = NullPointerException.class)
    public void moveEmptySquareException() {
        ChessBoard board = new ChessBoard(); 
        board.movePiece('h', 4, 'h', 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void movePieceIllegally() {
        ChessBoard board = new ChessBoard();
        board.movePiece('a', 2, 'a', 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void movePieceIllegally2() {
        ChessBoard board = new ChessBoard();
        board.movePiece('h', 1, 'h', 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void movePieceIllegally3() {
        ChessBoard board = new ChessBoard();
        board.movePiece('e', 1, 'e', 3);
    }

    @Test
    public void movePieceCastling() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);

        board.setPieceAt('a', 1, new Rook('a', 1, true, 0));
        board.setPieceAt('e', 1, new King('e', 1, true, 0));
        board.movePiece('e', 1, 'c', 1);

        assert(board.getPieceAt('a', 1) == null);
        assert(board.getPieceAt('e', 1) == null);
        assert(board.getPieceAt('c', 1) instanceof King);
        assert(board.getPieceAt('d', 1) instanceof Rook);

        //Assert that the king can no longer castle
        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('b', 1));
        legalMoves.add(new ChessCoordinate('c', 2));
        legalMoves.add(new ChessCoordinate('b', 2));
        legalMoves.add(new ChessCoordinate('d', 2));
        assert(board.getLegalMoves('c', 1).equals(legalMoves));

        //Assert that rook legal moves are correct 
        legalMoves = new ArrayList<ChessCoordinate>();
        legalMoves.add(new ChessCoordinate('e', 1));
        legalMoves.add(new ChessCoordinate('f', 1));
        legalMoves.add(new ChessCoordinate('g', 1));
        legalMoves.add(new ChessCoordinate('h', 1));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('d', 3));
        legalMoves.add(new ChessCoordinate('d', 4));
        legalMoves.add(new ChessCoordinate('d', 5));
        legalMoves.add(new ChessCoordinate('d', 6));
        legalMoves.add(new ChessCoordinate('d', 7));
        legalMoves.add(new ChessCoordinate('d', 8));
        assert(board.getLegalMoves('d', 1).equals(legalMoves));

        board.setPieceAt('c', 1, null);
        board.setPieceAt('d', 1, null);
        board.setPieceAt('e', 1, new King('e', 1, true, 0));
        board.setPieceAt('h', 1, new Rook('h', 1, true, 0));
        board.movePiece('e', 1, 'g', 1);
        assert(board.getPieceAt('f', 1) instanceof Rook);
        assert(board.getPieceAt('g', 1) instanceof King);
        assert(board.getPieceAt('e', 1) == null);
        assert(board.getPieceAt('h', 1) == null);

        board.setPieceAt('f', 1, null);
        board.setPieceAt('g', 1, null);
        board.setPieceAt('e', 8, new King('e', 8, true, 1));
        board.setPieceAt('a', 8, new Rook('a', 8, true, 1));
        board.movePiece('e', 8, 'c', 8);
        assert(board.getPieceAt('c', 8) instanceof King);
        assert(board.getPieceAt('d', 8) instanceof Rook);
        assert(board.getPieceAt('e', 8) == null);
        assert(board.getPieceAt('a', 8) == null);

        board.setPieceAt('c', 8, null);
        board.setPieceAt('d', 8, null);
        board.setPieceAt('e', 8, new King('e', 8, true, 1));
        board.setPieceAt('h', 8, new Rook('h', 8, true, 1));
        board.movePiece('e', 8, 'g', 8);
        assert(board.getPieceAt('g', 8) instanceof King);
        assert(board.getPieceAt('f', 8) instanceof Rook);
        assert(board.getPieceAt('h', 8) == null);
        assert(board.getPieceAt('e', 8) == null);
    }

    @Test
    public void enPassantMoveTest() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);

        board.setPieceAt('e', 4, new Pawn('e', 4, true, 0, true));
        board.setPieceAt('f', 4, new Pawn('f', 4, true, 1));
        board.movePiece('f', 4, 'e', 3);
        assert(board.getPieceAt('e', 4) == null);
        assert(board.getPieceAt('f', 4) == null);
        assert(board.getPieceAt('e', 3) instanceof Pawn);
        Pawn pawn = (Pawn) board.getPieceAt('e', 3);
        assert(pawn.getColor() == 1);

        board.setPieceAt('e', 3, null);
        board.setPieceAt('h', 7, new Pawn('h', 7, true, 1));
        board.setPieceAt('g', 5, new Pawn('g', 5, true, 0));
        board.movePiece('h', 7, 'h', 5);
        board.movePiece('g', 5, 'h', 6);
        assert(board.getPieceAt('h', 7) == null);
        assert(board.getPieceAt('h', 5) == null);
        assert(board.getPieceAt('g', 5) == null);
        assert(board.getPieceAt('h', 6) instanceof Pawn);
        assert(board.getPieceAt('h', 6).getColor() == 0);

        //Assert that a newly moved pawn gets marked as isFirstMove() after jumping 2 squares, and then is no longer marked this after any other move 
        board.setPieceAt('h', 6, null);
        board.setPieceAt('e', 2, new Pawn('e', 2, true, 0));
        board.setPieceAt('h', 7, new Pawn('h', 7, true, 1));
        board.movePiece('e', 2, 'e', 4);
        assert(board.getPieceAt('e', 2) == null);
        assert(board.getPieceAt('e', 4) instanceof Pawn);
        Pawn pawn2 = (Pawn) board.getPieceAt('e', 4);
        assert(pawn2.isFirstMove() == true);
        board.movePiece('h', 7, 'h', 6);
        pawn2 = (Pawn) board.getPieceAt('e', 4);
        Pawn pawn3 = (Pawn) board.getPieceAt('h', 6);
        assert((pawn2.isFirstMove()) == false);
        assert(pawn3.isFirstMove() == false);
    }

    @Test
    public void knightMoveCaptureTest() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);

        board.setPieceAt('e', 4, new Knight('e', 4, true, 0));
        board.setPieceAt('f', 6, new Knight('f', 6, true, 1));
        board.movePiece('e', 4, 'f', 6);
        assert(board.getPieceAt('e', 4) == null);
        assert(board.getPieceAt('f', 6) instanceof Knight);
        assert(board.getPieceAt('f', 6).getColor() == 0);
    }

    @Test
    public void bishopMoveCaptureTest() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);

        board.setPieceAt('a', 1, new Bishop('a', 1, true, 0));
        board.setPieceAt('h', 8, new Rook('h', 8, true, 1));
        board.movePiece('a', 1, 'h', 8);
        assert(board.getPieceAt('a', 1) == null);
        assert(board.getPieceAt('h', 8) instanceof Bishop);
        assert(board.getPieceAt('h', 8).getColor() == 0);
    }

    @Test
    public void rookMoveCaptureTest() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);

        board.setPieceAt('a', 2, new Rook('a', 2, true, 1));
        board.setPieceAt('c', 2, new Rook('c', 2, true, 0));
        board.movePiece('a', 2, 'c', 2);
        assert(board.getPieceAt('a', 2) == null);
        assert(board.getPieceAt('c', 2) instanceof Rook);
        assert(board.getPieceAt('c', 2).getColor() == 1);
    }

    @Test
    public void regularPawnCaptureTest() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);

        board.setPieceAt('e', 4, new Pawn('e', 4, true, 0));
        board.setPieceAt('f', 5, new Pawn('f', 5, true, 1));
        board.movePiece('f', 5, 'e', 4);
        assert(board.getPieceAt('f', 5) == null);
        assert(board.getPieceAt('e', 4) instanceof Pawn);
        assert(board.getPieceAt('e', 4).getColor() == 1);
    }

    @Test
    public void kingMoveCaptureTest() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);

        board.setPieceAt('e', 1, new King('e', 1, true, 0));
        board.setPieceAt('e', 2, new Queen('e', 2, true, 1));
        board.movePiece('e', 1, 'e', 2);
        assert(board.getPieceAt('e', 1) == null);
        assert(board.getPieceAt('e', 2) instanceof King);
        assert(board.getPieceAt('e', 2).getColor() == 0);
    }


    @Test
    public void moveQueenTest() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);

        board.setPieceAt('e', 4, new Queen('e', 4, true, 1));
        board.setPieceAt('e', 8, new Bishop('e', 8, true, 0));
        board.setPieceAt('a', 8, new Knight('a', 8, true, 0));
        board.movePiece('e', 4, 'e', 8);
        board.movePiece('e', 8, 'a', 8);
        assert(board.getPieceAt('e', 4) == null);
        assert(board.getPieceAt('e', 8) == null);
        assert(board.getPieceAt('a', 8) instanceof Queen);
        assert(board.getPieceAt('a', 8).getColor() == 1);
    }

    @Test
    public void castleThenCaptureWithRook() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);

        board.setPieceAt('a', 1, new Rook('a', 1, true, 0));
        board.setPieceAt('e', 1, new King('e', 1, true, 0));
        board.setPieceAt('d', 8, new Bishop('c', 8, true, 1));
        board.movePiece('e', 1, 'c', 1);
        board.movePiece('d', 1, 'd', 8);
        assert(board.getPieceAt('e', 1) == null);
        assert(board.getPieceAt('a', 1) == null);
        assert(board.getPieceAt('c', 1) instanceof King);
        assert(board.getPieceAt('d', 1) == null);
        assert(board.getPieceAt('d', 8) instanceof Rook);
        assert(board.getPieceAt('d', 8).getColor() == 0);
    }

    @Test
    public void checkTest() {
        ChessBoard board = new ChessBoard();
        assert(board.isWhiteInCheck() == false);
        assert(board.isBlackInCheck() == false);

        board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('e', 1, new King('e', 1, true, 0));
        board.setPieceAt('a', 1, new Rook('a', 1, true, 1));
        board.setPieceAt('e', 8, new King('e', 8, true, 1));
        board.setPieceAt('g', 6, new Bishop('g', 6, true, 0));
        assert(board.isWhiteInCheck() == true);
        assert(board.isBlackInCheck() == true);
    }

    @Test
    public void testWhiteKingCoords() {
        ChessBoard board = new ChessBoard();
        assert(board.getWhiteKingCoords().equals(new ChessCoordinate('e', 1)));
    }
    
    @Test
    public void checkMateTest() {
        ChessBoard board = new ChessBoard();
        assert(board.isWhiteCheckmated() == false);
        assert(board.isBlackCheckmated() == false);


        board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('e', 1, new King('e', 1, true, 0));
        board.setPieceAt('a', 1, new Rook('a', 1, true, 1));
        board.setPieceAt('b', 2, new Queen('b', 2, true, 1));
        board.setPieceAt('h', 1, new Rook('h', 1, true, 0));
        board.setPieceAt('f', 2, new Pawn('f', 2, true, 0));
        board.setPieceAt('h', 4, new Bishop('h', 4, true, 0));
        board.setPieceAt('f', 8, new Queen('f', 8, true, 0));

        assert(board.isWhiteCheckmated() == true);

        board.setPieceAt('b', 2, null);
        assert(board.isWhiteCheckmated() == false);

        board.setPieceAt('b', 2, new Rook('b', 2, true, 1));
        assert(board.isWhiteCheckmated() == true);

        board.setPieceAt('a', 1, null);
        assert(board.isWhiteCheckmated() == false);


        board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('h', 8, new King('h', 8, true, 1));
        board.setPieceAt('h', 7, new Pawn('h', 7, true, 1));
        board.setPieceAt('g', 7, new Pawn('g', 7, true, 1));
        board.setPieceAt('g', 8, new Rook('g', 8, true, 1));
        board.setPieceAt('g', 6, new Knight('g', 6, true, 0));
        board.setPieceAt('h', 1, new Queen('h', 1, true, 0));

        assert(board.isBlackCheckmated() == true);

        board.setPieceAt('h', 1, null);
        assert(board.isBlackCheckmated() == false);

        board.setPieceAt('h', 1, new Queen('h', 1, true, 0));
        assert(board.isBlackCheckmated() == true);
    }

    @Test
    public void kingWithNoMoves() {
        ChessBoard board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('e', 1, new King('e', 1, true, 0));
        board.setPieceAt('e', 2, new Queen('e', 2, true, 1));
        board.setPieceAt('a', 2, new Rook('a', 2, true, 1));
        assert(board.getLegalMoves('e', 1).size() == 0);
    }

    @Test
    public void kingSurroundedByOppBishops() {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        ChessBoard board = new ChessBoard(pieces);
        board.setPieceAt('e', 1, new King('e', 1, true, 0));
        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();

        //King surrounded by opposite color bishops 
        legalMoves = new ArrayList<ChessCoordinate>();
        board.setPieceAt('d', 1, new Bishop('d', 1, true, 1));
        board.setPieceAt('f', 1, new Bishop('f', 1, true, 1));
        board.setPieceAt('d', 2, new Bishop('d', 2, true, 1));
        board.setPieceAt('f', 2, new Bishop('f', 2, true, 1));
        board.setPieceAt('e', 2, new Bishop('e', 2, true, 1));
        legalMoves.add(new ChessCoordinate('d', 2));
        legalMoves.add(new ChessCoordinate('f', 2));
        assert(board.getLegalMoves('e', 1).equals(legalMoves));
    }

    @Test
    public void kingInCenterSurroundedByOppBishops() {
        ChessBoard board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('e', 4, new King('e', 4, true, 0));
        board.setPieceAt('e', 3, new Bishop('e', 3, true, 1));
        board.setPieceAt('e', 5, new Bishop('e', 5, true, 1));
        board.setPieceAt('d', 4, new Bishop('d', 4, true, 1));
        board.setPieceAt('f', 4, new Bishop('f', 4, true, 1));
        board.setPieceAt('d', 5, new Bishop('d', 5, true, 1));
        board.setPieceAt('d', 3, new Bishop('d', 3, true, 1));
        board.setPieceAt('f', 5, new Bishop('f', 5, true, 1));
        board.setPieceAt('f', 3, new Bishop('f', 3, true, 1));
        board.setPieceAt('f', 1, new Rook('f', 1, true, 1));
        board.setPieceAt('f', 8, new Rook('f', 8, true, 1));
        board.setPieceAt('d', 1, new Rook('d', 1, true, 1));
        board.setPieceAt('d', 8, new Rook('d', 8, true, 1));
        
        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();
        assert(board.getLegalMoves('e', 4).equals(legalMoves));
    }

    @Test
    public void whiteAndBlackPawnsNoMoves() {
        ChessBoard board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('g', 7, new Pawn('g', 7, true, 1));
        board.setPieceAt('g', 6, new Knight('g', 6, true, 0));

        ArrayList<ChessCoordinate> legalMoves = new ArrayList<ChessCoordinate>();
        assert(board.getLegalMoves('g', 7).size() == 0);

        board.setPieceAt('g', 2, new Pawn('g', 2, true, 0));
        board.setPieceAt('g', 3, new Knight('g', 3, true, 1));
        assert(board.getLegalMoves('g', 2).size() == 0);
    }

    @Test 
    public void testWhiteStalemate() {
        ChessBoard board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('e', 1, new King('e', 1, true, 0));
        board.setPieceAt('c', 2, new Queen('c', 2, true, 1));
        board.setPieceAt('f', 1, new Knight('f', 1, true, 0));
        board.setPieceAt('h', 1, new Rook('h', 1, true, 1));

        assert(board.isWhiteStalemated() == true);

        board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('e', 8, new King('e', 8, true, 1));
        board.setPieceAt('c', 7, new Queen('c', 7, true, 0));
        board.setPieceAt('f', 8, new Knight('f', 8, true, 1));
        board.setPieceAt('h', 8, new Rook('h', 8, true, 0));

        assert(board.isBlackStalemated() == true);

        board = new ChessBoard();
        assert(board.isWhiteStalemated() == false);
        assert(board.isBlackStalemated() == false);
    }

    @Test
    public void testisPawnPromotable() {
        ChessBoard board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('c', 8, new Pawn('c', 8, true, 0));
        board.setPieceAt('d', 1, new Pawn('d', 1, true, 1));
        
        assert(board.isWhitePawnPromotable() == true);
        assert(board.isBlackPawnPromotable() == true);

        board = new ChessBoard();
        assert(board.isWhitePawnPromotable() == false);
        assert(board.isBlackPawnPromotable() == false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void promotePawnIllegalFile() {
        ChessBoard board = new ChessBoard(); 
        board.promotePawn('i', 1, "queen");
    }

    @Test(expected = IllegalArgumentException.class)
    public void promotePawnIllegalRank() {
        ChessBoard board = new ChessBoard(); 
        board.promotePawn('i', 0, "queen");
    }

    @Test(expected = NullPointerException.class)
    public void promotePawnNoPawnPresent() {
        ChessBoard board = new ChessBoard(new ChessPiece[8][8]); 
        board.promotePawn('h', 8, "queen");
    }

    @Test(expected = IllegalArgumentException.class)
    public void promotePawnNotPawn() {
        ChessBoard board = new ChessBoard(); 
        board.setPieceAt('h', 8, new Rook('h', 8, true, 0));
        board.promotePawn('h', 8, "queen");
    }

    @Test(expected = IllegalArgumentException.class)
    public void promotePawnWrongRank() {
        ChessBoard board = new ChessBoard(); 
        board.setPieceAt('h', 8, new Pawn('h', 8, true, 1));
        board.promotePawn('h', 8, "queen");
    }

    @Test(expected = IllegalArgumentException.class)
    public void promotePawnWrongRank2() {
        ChessBoard board = new ChessBoard(); 
        board.setPieceAt('h', 1, new Pawn('h', 1, true, 0));
        board.promotePawn('h', 1, "queen");
    }

    @Test(expected = IllegalArgumentException.class)
    public void promotePawnInvalidPromoType() {
        ChessBoard board = new ChessBoard(); 
        board.setPieceAt('h', 1, new Pawn('h', 1, true, 1));
        board.promotePawn('h', 1, "king");
    }

    @Test
    public void promoteWhitePawn() {
        ChessBoard board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('h', 8, new Pawn('h', 8, true, 0));
        board.setPieceAt('g', 8, new Pawn('g', 8, true, 0));
        board.setPieceAt('e', 8, new Pawn('e', 8, true, 0));
        board.setPieceAt('a', 8, new Pawn('a', 8, true, 0));
        board.promotePawn('h', 8, "queen");
        board.promotePawn('g', 8, "rook");
        board.promotePawn('e', 8, "bishop");
        board.promotePawn('a', 8, "knight");

        assert(board.getPieceAt('h', 8) instanceof Queen);
        assert(board.getPieceAt('h', 8).getColor() == 0);

        assert(board.getPieceAt('g', 8) instanceof Rook);
        assert(board.getPieceAt('g', 8).getColor() == 0);

        assert(board.getPieceAt('e', 8) instanceof Bishop);
        assert(board.getPieceAt('e', 8).getColor() == 0);

        assert(board.getPieceAt('a', 8) instanceof Knight);
        assert(board.getPieceAt('a', 8).getColor() == 0);
    }

    @Test
    public void promoteBlackPawn() {
        ChessBoard board = new ChessBoard(new ChessPiece[8][8]);
        board.setPieceAt('h', 1, new Pawn('h', 1, true, 1));
        board.setPieceAt('g', 1, new Pawn('g', 1, true, 1));
        board.setPieceAt('e', 1, new Pawn('e', 1, true, 1));
        board.setPieceAt('a', 1, new Pawn('a', 1, true, 1));
        board.promotePawn('h', 1, "queen");
        board.promotePawn('g', 1, "rook");
        board.promotePawn('e', 1, "bishop");
        board.promotePawn('a', 1, "knight");

        assert(board.getPieceAt('h', 1) instanceof Queen);
        assert(board.getPieceAt('h', 1).getColor() == 1);

        assert(board.getPieceAt('g', 1) instanceof Rook);
        assert(board.getPieceAt('g', 1).getColor() == 1);

        assert(board.getPieceAt('e', 1) instanceof Bishop);
        assert(board.getPieceAt('e', 1).getColor() == 1);

        assert(board.getPieceAt('a', 1) instanceof Knight);
        assert(board.getPieceAt('a', 1).getColor() == 1);
    }

    @Test
    public void operaHouseGameTest() {
        ChessBoard board = new ChessBoard();
        assert(board.isWhiteCheckmated() == false);
        assert(board.isBlackCheckmated() == false);
        assert(board.isWhiteInCheck() == false);
        assert(board.isBlackInCheck() == false);
        assert(board.isWhiteStalemated() == false);
        assert(board.isBlackStalemated() == false);

        board.movePiece('e', 2, 'e', 4);
        board.movePiece('e', 7, 'e', 5);
        board.movePiece('g', 1, 'f', 3);
        board.movePiece('d', 7, 'd', 6);
        board.movePiece('d', 2, 'd', 4);
        board.movePiece('c', 8, 'g', 4);
        board.movePiece('d', 4, 'e', 5);
        board.movePiece('g', 4, 'f', 3);
        board.movePiece('d', 1, 'f', 3);
        board.movePiece('d', 6, 'e', 5);
        board.movePiece('f', 1, 'c', 4);
        board.movePiece('g', 8, 'f', 6);
        board.movePiece('f', 3, 'b', 3);
        board.movePiece('d', 8, 'e', 7);
        board.movePiece('b', 1, 'c', 3);
        board.movePiece('c', 7, 'c', 6);
        board.movePiece('c', 1, 'g', 5);
        board.movePiece('b', 7, 'b', 5);
        board.movePiece('c', 3, 'b', 5);
        board.movePiece('c', 6, 'b', 5);
        board.movePiece('c', 4, 'b', 5);

        assert(board.isWhiteCheckmated() == false);
        assert(board.isBlackCheckmated() == false);
        assert(board.isWhiteInCheck() == false);
        assert(board.isBlackInCheck() == true);
        assert(board.isWhiteStalemated() == false);
        assert(board.isBlackStalemated() == false);
        
        board.movePiece('b', 8, 'd', 7);
        board.movePiece('e', 1, 'c', 1);

        assert(board.getPieceAt('d', 1) instanceof Rook);

        board.movePiece('a', 8, 'd', 8);
        board.movePiece('d', 1, 'd', 7);
        board.movePiece('d', 8, 'd', 7);
        board.movePiece('h', 1, 'd', 1);
        board.movePiece('e', 7, 'e', 6);
        board.movePiece('b', 5, 'd', 7);

        assert(board.isWhiteCheckmated() == false);
        assert(board.isBlackCheckmated() == false);
        assert(board.isWhiteInCheck() == false);
        assert(board.isBlackInCheck() == true);
        assert(board.isWhiteStalemated() == false);
        assert(board.isBlackStalemated() == false);

        board.movePiece('f', 6, 'd', 7);
        board.movePiece('b', 3, 'b', 8);

        assert(board.isWhiteCheckmated() == false);
        assert(board.isBlackCheckmated() == false);
        assert(board.isWhiteInCheck() == false);
        assert(board.isBlackInCheck() == true);
        assert(board.isWhiteStalemated() == false);
        assert(board.isBlackStalemated() == false);

        board.movePiece('d', 7, 'b', 8);
        board.movePiece('d', 1, 'd', 8);

        assert(board.isWhiteCheckmated() == false);
        assert(board.isBlackCheckmated() == true);
        assert(board.isWhiteInCheck() == false);
        assert(board.isBlackInCheck() == true);
        assert(board.isWhiteStalemated() == false);
        assert(board.isBlackStalemated() == false);
    }

    @Test
    public void blackWinTest() {
        ChessBoard board = new ChessBoard();
        
        assert(board.isWhiteCheckmated() == false);
        assert(board.isBlackCheckmated() == false);
        assert(board.isWhiteInCheck() == false);
        assert(board.isBlackInCheck() == false);
        assert(board.isWhiteStalemated() == false);
        assert(board.isBlackStalemated() == false);

        board.movePiece('e', 2, 'e', 4);
        board.movePiece('e', 7, 'e', 5);
        board.movePiece('f', 1, 'c', 4);
        board.movePiece('d', 8, 'f', 6);
        board.movePiece('b', 1, 'c', 3);
        board.movePiece('f', 8, 'c', 5);
        board.movePiece('c', 4, 'f', 7);

        assert(board.isWhiteCheckmated() == false);
        assert(board.isBlackCheckmated() == false);
        assert(board.isWhiteInCheck() == false);
        assert(board.isBlackInCheck() == true);
        assert(board.isWhiteStalemated() == false);
        assert(board.isBlackStalemated() == false);

        board.movePiece('f', 6, 'f', 7);

        assert(board.isWhiteCheckmated() == false);
        assert(board.isBlackCheckmated() == false);
        assert(board.isWhiteInCheck() == false);
        assert(board.isBlackInCheck() == false);
        assert(board.isWhiteStalemated() == false);
        assert(board.isBlackStalemated() == false);

        board.movePiece('g', 1, 'h', 3);
        board.movePiece('d', 7, 'd', 5);
        board.movePiece('e', 4, 'd', 5);
        board.movePiece('c', 8, 'h', 3);
        board.movePiece('g', 2, 'h', 3);
        board.movePiece('f', 7, 'f', 2);

        assert(board.isWhiteCheckmated() == true);
        assert(board.isBlackCheckmated() == false);
        assert(board.isWhiteInCheck() == true);
        assert(board.isBlackInCheck() == false);
        assert(board.isWhiteStalemated() == false);
        assert(board.isBlackStalemated() == false);
        
    }

}