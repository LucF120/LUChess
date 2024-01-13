package chessview;

import chesspiece.*;

import java.awt.Color;
import java.awt.Graphics.*;
import java.awt.Graphics2D;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ClassLoader;
import java.net.URL;




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
        this.isClicked = false;
    }

    public BufferedImage draw() {
        BufferedImage squareImage = new BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB);

        Graphics2D g = squareImage.createGraphics();
        g.setColor(color);
        g.fillRect (0, 0, squareImage.getWidth(), squareImage.getHeight());

        if(this.isClicked()) {
            squareImage = this.redTintImage(squareImage);
        }

        return squareImage;
    }

    public BufferedImage drawPiece(ChessPiece piece) {
        if(piece == null) {
            return this.draw();
        }

        String pathToImg = "src/main/resources/images/";

        if(this.fileToInt(piece.getFile()) % 2 == piece.getRank() % 2) {
            pathToImg = pathToImg + "DarkSquare_";
        } else {
            pathToImg = pathToImg + "LightSquare_";
        }

        if(piece.getColor() == 0) {
            pathToImg = pathToImg + "White";
        } else {
            pathToImg = pathToImg + "Black";
        }

        if(piece instanceof Pawn) {
            pathToImg = pathToImg + "Pawn.png";
        }

        if(piece instanceof Rook) {
            pathToImg = pathToImg + "Rook.png";
        }

        if(piece instanceof Bishop) {
            pathToImg = pathToImg + "Bishop.png";
        }

        if(piece instanceof Knight) {
            pathToImg = pathToImg + "Knight.png";
        }

        if(piece instanceof Queen) {
            pathToImg = pathToImg + "Queen.png";
        }

        if(piece instanceof King) {
            pathToImg = pathToImg + "King.png";
        }

        BufferedImage image = this.draw();
        try {
            image = ImageIO.read(new File(pathToImg));
        } catch(IOException e) {
            System.out.println("Error: IOException");
        }
        
        if(this.isClicked()) {
            image = this.redTintImage(image);
        }

        return image;

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

    public void setIsClicked() {
        this.isClicked = !this.isClicked;
    }

    public BufferedImage redTintImage(BufferedImage image) {
        BufferedImage redTintedImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);

        for(int y=0 ; y<image.getHeight() ; y++) {
            for(int x=0 ; x<image.getWidth() ; x++) {
                Color color = new Color(image.getRGB(x, y));

                int newRed = Math.min(255, color.getRed() + (color.getRed() / 2));

                Color newColor = new Color(newRed, color.getGreen(), color.getBlue());

                redTintedImage.setRGB(x, y, newColor.getRGB());


                
            }
        }

        return redTintedImage;
    }

    public static int fileToInt(char f) {
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