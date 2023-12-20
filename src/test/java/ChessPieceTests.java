package test; 

import org.junit.test; 

import luchess.ChessPiece;
import luchess.ChessBoard; 

public class ChessPieceTests {
    @Test
    public void pawnTest() {
        ChessPiece pawn = new Pawn('a', 2, true, 0);
        assert(pawn.getColor() == 0);
        assert(pawn.getFile() == 2);
        assert(pawn.getRank() == 'a');
        assert(pawn.getValue() == 1);
        assert(pawn.isAlive() == true); 
    }
}