package chessview;

import java.awt.Color;
import java.awt.Graphics.*;
import java.awt.Graphics2D;
import java.awt.image.*;

//Represents one square on the chessboard 
public class Square {
    static int SIZE = 100;

    private Color color; 
    private char file;
    private int rank;
    private boolean isClicked; 

    public Square(Color color, char file, int rank) {
        this.color = color;
        this.file = file;
        this.rank = rank; 
    }

    public BufferedImage draw() {
        BufferedImage squareImage = new BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB);

        Graphics2D g = squareImage.createGraphics();
        g.setColor(color);
        g.fillRect (0, 0, squareImage.getWidth(), squareImage.getHeight() );
        return squareImage;
    }

    public char getFile() {
        return this.file;
    }

    public int getRank() {
        return this.rank;
    }

    public boolean isClicked() {
        return this.isClicked;
    }

    public int fileToInt(int f) {
        int val = 8;

        switch(f) {
            case 'a':
                val = 1;
                break;
            case 'b':
                val = 2;
                break;
            case 'c':
                val = 3;
                break;
            case 'd':
                val = 4;
                break;
            case 'e':
                val = 5;
                break;
            case 'f':
                val = 6;
                break;
            case 'g':
                val = 7;
                break;
            case 'h':
                val = 8;
                break;
        }

        return val;
        
    }
}