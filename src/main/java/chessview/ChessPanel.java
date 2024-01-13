package chessview; 

import chessboard.*;
import util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;


public class ChessPanel extends JPanel implements MouseListener {
    private Square[][] board; 
    private ChessBoard game;

    private ChessCoordinate firstClick;
    private ChessCoordinate secondClick;

    static char[] FILES = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    public ChessPanel(Square[][] board, ChessBoard game) {
        this.board = board;
        this.game = game;
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i=0 ; i<8 ; i++) {
            for(int j=1 ; j<9 ; j++) {
                Square square = board[i][j-1];
                BufferedImage image;

                if(game.getPieceAt(FILES[i], Math.abs(j)) == null) {
                    image = square.draw();
                } else {
                    image = square.drawPiece(game.getPieceAt(FILES[i], Math.abs(j)));
                }
                g.drawImage(image, (Square.fileToInt(square.getFile())-1)*100, 900 - (square.getRank()+1)*100, null);
            }
        }
    }
            
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Clicked at: (" + x + ", " + y + ")");

        if(x > 800 || y > 800) {
            System.out.println("Out of bounds");
            return; 
        } else {
            x = x / 100;
            y = 9 - (y / 100 + 1);

            System.out.println("You clicked " + FILES[x] + y);

            if(this.firstClick == null) {
                this.firstClick = new ChessCoordinate(FILES[x], y);
                board[x][y-1].setIsClicked();
            } else {
                if(this.secondClick == null) {
                    this.secondClick = new ChessCoordinate(FILES[x], y);
                } else {
                    System.out.println("ERROR: Clicks were not reset");
                }
            }
        }
    }

    // Other methods from the MouseListener interface
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public ChessCoordinate getFirstClick() {
        return this.firstClick;
    }

    public ChessCoordinate getSecondClick() {
        return this.secondClick;
    }

    public void resetClicks() {
        if(this.firstClick != null) {
            int x = Square.fileToInt(firstClick.getFile()) - 1;
            int y = this.firstClick.getRank() - 1;
            board[x][y].setIsClicked();
            this.firstClick = null;
        } 

        this.secondClick = null;
    }
    
}