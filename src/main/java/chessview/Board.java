package chessview;

import chesspiece.*;
import chessboard.*;
import util.*;

import java.awt.Color;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.io.IOException;

//Represents a chess board consisting of 64 squares 
public class Board {
    static Color BEIGE = new Color(181, 181, 141);
    static Color GREEN = new Color(107, 142, 35);
    static char[] FILES = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    private Square[][] board = new Square[8][8];
    private ChessBoard game;
    private ChessPanel chessPanel;

    public Board(ChessBoard game) {
        this.game = game;

        this.renderBoard(board);
    }

    private void renderBoard(Square[][] board) {
        for(int i=0 ; i<8 ; i++) {
            for(int j=1 ; j<9 ; j++) {
                if(i%2 == (j-1)%2) {
                    board[i][j-1] = new Square(BEIGE, FILES[i], j);
                } else {
                    board[i][j-1] = new Square(GREEN, FILES[i], j);
                }
            }
        }
    }

    public void makeBoard() {
        JFrame frame = new JFrame("Chess Application");

        chessPanel = new ChessPanel(board, game);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(900, 900));
        frame.pack();
        frame.getContentPane().add(chessPanel);
        frame.setVisible(true);
    }

    public chessview.Square[][] getChessBoard() {
        return this.board;
    }
    
    public ChessBoard getChessGame() {
        return this.game;
    }
    
    public ChessPanel getPanel() {
        return this.chessPanel;
    }
}