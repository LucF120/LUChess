package chessboard; 

import org.junit.Test; 

import chessboard.*;
import chesspiece.*;

public class ChessBoardTests {
    @Test
    public void startingBoardTest() {
        ChessBoard startingBoard = new ChessBoard(); 
        ChessPiece[][] pieces = startingBoard.getBoard();
        assert(startingBoard.getPieceAt('a', 0) instanceof Rook);
        assert(startingBoard.getPieceAt('a', 0).isAlive() == true);
        assert(startingBoard.getPieceAt('a', 0).getColor() == 0);
    }
}