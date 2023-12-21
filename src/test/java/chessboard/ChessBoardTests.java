package chessboard; 

import org.junit.Test; 

import chessboard.*;
import chesspiece.*;

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
}