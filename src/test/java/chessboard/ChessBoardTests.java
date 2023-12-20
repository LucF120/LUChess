package chessboard; 

import org.junit.Test; 

import chessboard.*;
import chesspiece.*;

public class ChessBoardTests {
    @Test
    public void startingBoardTest() {
        ChessBoard startingBoard = new ChessBoard(); 
        ChessPiece[][] pieces = startingBoard.getBoard();
        assert(pieces[0][0] instanceof Rook);
    }
}