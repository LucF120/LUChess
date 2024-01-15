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

    private JButton queenPromoButton;
    private JButton rookPromoButton;
    private JButton knightPromoButton;
    private JButton bishopPromoButton;

    static char[] FILES = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    public ChessPanel(Square[][] board, ChessBoard game) {
        this.board = board;
        this.game = game;
        addMouseListener(this);
        this.initializePromotionButtons();
        this.setLayout(null);
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

    public void addPromotionButtons() {
        this.add(queenPromoButton);
        this.add(rookPromoButton);
        this.add(bishopPromoButton);
        this.add(knightPromoButton);
    }

    public void removePromotionButtons() {

        this.remove(queenPromoButton);
        this.remove(rookPromoButton);
        this.remove(bishopPromoButton);
        this.remove(knightPromoButton);
    }

    private void initializePromotionButtons() {
        queenPromoButton = new JButton("Queen");
        rookPromoButton = new JButton("Rook");
        bishopPromoButton = new JButton("Bishop");
        knightPromoButton = new JButton("Knight");

        queenPromoButton.setActionCommand("Promote to Queen");
        queenPromoButton.addActionListener(new PawnPromotionListener(game));
        queenPromoButton.setPreferredSize(new Dimension(100, 100));
        queenPromoButton.setBounds(200, 350, queenPromoButton.getPreferredSize().width, queenPromoButton.getPreferredSize().height);


        rookPromoButton.setActionCommand("Promote to Rook");
        rookPromoButton.addActionListener(new PawnPromotionListener(game));
        rookPromoButton.setPreferredSize(new Dimension(100, 100));
        rookPromoButton.setBounds(300, 350, rookPromoButton.getPreferredSize().width, rookPromoButton.getPreferredSize().height);

        bishopPromoButton.setActionCommand("Promote to Bishop");
        bishopPromoButton.addActionListener(new PawnPromotionListener(game));
        bishopPromoButton.setPreferredSize(new Dimension(100, 100));
        bishopPromoButton.setBounds(400, 350, bishopPromoButton.getPreferredSize().width, bishopPromoButton.getPreferredSize().height);

        knightPromoButton.setActionCommand("Promote to Knight");
        knightPromoButton.addActionListener(new PawnPromotionListener(game));
        knightPromoButton.setPreferredSize(new Dimension(100, 100));
        knightPromoButton.setBounds(500, 350, knightPromoButton.getPreferredSize().width, knightPromoButton.getPreferredSize().height);

    }
    
}