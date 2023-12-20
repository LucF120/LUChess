package chesspiece; 

import org.junit.Test; 

import chesspiece.*;

public class ChessPieceTests {
    @Test
    public void pawnTest() {
        ChessPiece pawn = new Pawn('a', 2, true, 0);
        assert(pawn.getColor() == 0);
        assert(pawn.getFile() == 'a');
        assert(pawn.getRank() == 2);
        assert(pawn.getValue() == 1);
        assert(pawn.isAlive() == true); 
    }

    @Test
    public void rookTest() {
        ChessPiece rook = new Rook('a', 1, true, 0);
        assert(rook.getColor() == 0);
        assert(rook.getFile() == 'a');
        assert(rook.getRank() == 1);
        assert(rook.getValue() == 5);
        assert(rook.isAlive() == true); 
    }

    @Test
    public void bishopTest() {
        ChessPiece bishop = new Bishop('b', 1, true, 0);
        assert(bishop.getColor() == 0);
        assert(bishop.getFile() == 'b');
        assert(bishop.getRank() == 1);
        assert(bishop.getValue() == 3);
        assert(bishop.isAlive() == true);
    }

    @Test
    public void knightTest() {
        ChessPiece knight = new Knight('c', 1, true, 0);
        assert(knight.getColor() == 0);
        assert(knight.getFile() == 'c');
        assert(knight.getRank() == 1);
        assert(knight.getValue() == 3);
        assert(knight.isAlive() == true);
    }

    @Test
    public void queenTest() {
        ChessPiece queen = new Queen('d', 1, true, 0);
        assert(queen.getColor() == 0);
        assert(queen.getFile() == 'd');
        assert(queen.getRank() == 1);
        assert(queen.getValue() == 9);
        assert(queen.isAlive() == true);
    }

    @Test
    public void kingTest() {
        ChessPiece king = new King('e', 1, true, 0);
        assert(king.getColor() == 0);
        assert(king.getFile() == 'e');
        assert(king.getRank() == 1);
        assert(king.getValue() == 200);
        assert(king.isAlive() == true);
    }
}