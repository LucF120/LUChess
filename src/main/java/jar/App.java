package jar;

import chessboard.*;
import chesspiece.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        ChessBoard board = new ChessBoard(); 
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to LUChess!\n");

        boolean isGameOver = false;
        
        while(!isGameOver) {
            boolean whiteToMove = true;
            boolean blackToMove = false;

            while(whiteToMove) {
                renderBoard(board);

                System.out.println("\nWhite to move:\n");

                char file;
                int rank;
                char destFile;
                int destRank;
                try {
                    file = scan.next().charAt(0);
                    rank = scan.nextInt();
                    destFile = scan.next().charAt(0);
                    destRank = scan.nextInt(); 
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input, try again");
                    scan = new Scanner(System.in);
                    continue;
                }
    
                ChessPiece pieceToMove = board.getPieceAt(file, rank);

                if(pieceToMove != null) {
                    if(pieceToMove.getColor() != 0) {
                        System.out.println("The piece you are trying to move is not a white piece.");
                        continue;
                    }
                }

                ChessPiece destinationPiece = board.getPieceAt(destFile, destRank);

                String pieceToMoveString = "";
                String destinationPieceString = "";

                if(pieceToMove instanceof Pawn) {
                    pieceToMoveString = "pawn";
                }

                if(pieceToMove instanceof Rook) {
                    pieceToMoveString = "rook";
                }

                if(pieceToMove instanceof Knight) {
                    pieceToMoveString = "knight";
                }

                if(pieceToMove instanceof Bishop) {
                    pieceToMoveString = "bishop";
                }

                if(pieceToMove instanceof Queen) {
                    pieceToMoveString = "queen";
                }

                if(pieceToMove instanceof King) {
                    pieceToMoveString = "king";
                }

                if(destinationPiece instanceof Pawn) {
                    destinationPieceString = "pawn";
                }

                if(destinationPiece instanceof Rook) {
                    destinationPieceString = "rook";
                }

                if(destinationPiece instanceof Knight) {
                    destinationPieceString = "knight";
                }

                if(destinationPiece instanceof Bishop) {
                    destinationPieceString = "bishop";
                }

                if(destinationPiece instanceof Queen) {
                    destinationPieceString = "queen";
                }

                try {
                    if(board.isWhiteInCheck() == true) {
                        ChessPiece[][] piecesCopy = new ChessPiece[8][8];
                        piecesCopy = board.copyToPieces(board.getBoard());
                        ChessBoard boardCopy = new ChessBoard(piecesCopy);

                        boardCopy.movePiece(file, rank, destFile, destRank);
                        if(boardCopy.isWhiteInCheck() == true) {
                            System.out.println("\nThe move you provided did not get white out of check.\n");
                            continue;
                        }
                    } 
                    
                    board.movePiece(file, rank, destFile, destRank);

                    if(destinationPieceString.isEmpty()) {
                        if(pieceToMoveString.equals("king") && file == 'e' && (destFile == 'c' || destFile == 'g')) {
                            if(destFile == 'c') {
                                System.out.println("\nThe white king has castled long.");
                            }

                            if(destFile == 'g') {
                                System.out.println("\nThe white king has castled short");
                            }
                        } 
                        
                        else if(pieceToMoveString.equals("pawn") && file != destFile) {
                            System.out.println("\nThe white pawn at " + file + rank + " has captured the black pawn at " + destFile + rank + " via en passant.");
                        }

                        else {
                            System.out.println("\nThe white " + pieceToMoveString + " at " + file + rank + " has moved to " + destFile + destRank + "\n");
                        }
                    } else {
                        System.out.println("\nThe white " + pieceToMoveString + " at " + file + rank + " has captured the " + destinationPieceString + " at " + destFile + destRank + "\n");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
                } catch(NullPointerException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                if(board.isWhitePawnPromotable() == true) {
                    boolean promotionChosen = false;
                    while(!promotionChosen) {
                        System.out.println("The pawn at " + destFile + destRank + " can be promoted.");
                        System.out.println("Please type one of the following options:");
                        System.out.println("Q: Queen");
                        System.out.println("R: Rook");
                        System.out.println("B: Bishop");
                        System.out.println("K: Knight");

                        char promotionInput;

                        try {
                            promotionInput = scan.next().charAt(0);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid promotion input, please try again");
                            scan.next();
                            continue;
                        }

                        switch(promotionInput) {
                            case 'Q': 
                                board.promotePawn(destFile, destRank, "queen");
                                System.out.println("The pawn at " + destFile + destRank + " has been promoted to a queen!");
                                break;
                            case 'R':
                                board.promotePawn(destFile, destRank, "rook");
                                System.out.println("The pawn at " + destFile + destRank + " has been promoted to a rook!");
                                break;
                            case 'B':
                                board.promotePawn(destFile, destRank, "bishop");
                                System.out.println("The pawn at " + destFile + destRank + " has been promoted to a bishop!");
                                break;
                            case 'K':
                                board.promotePawn(destFile, destRank, "knight");
                                System.out.println("The pawn at " + destFile + destRank + " has been promoted to a knight!");
                                break;
                            default:
                                System.out.println("Invalid promotion input, please try again");
                                continue;
                        }
                        promotionChosen = true;
                    }

                }

                if(board.isBlackCheckmated() == true) {
                    renderBoard(board);
                    System.out.println("Black is in checkmate. White wins!");
                    isGameOver = true;
                    break;
                }

                if(board.isBlackInCheck()) {
                    System.out.println("Black is in check");
                }

                if(board.isBlackStalemated()) {
                    renderBoard(board);
                    System.out.println("Black is stalemated. The game is a draw");
                    isGameOver = true;
                    break;
                }

                whiteToMove = false;
                blackToMove = true;
            }

            while(blackToMove) {
                renderBoard(board);

                System.out.println("\nBlack to move:\n");

                char file;
                int rank;
                char destFile;
                int destRank;
                try {
                    file = scan.next().charAt(0);
                    rank = scan.nextInt();
                    destFile = scan.next().charAt(0);
                    destRank = scan.nextInt(); 
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input, try again");
                    scan = new Scanner(System.in);
                    continue;
                }
    
                ChessPiece pieceToMove = board.getPieceAt(file, rank);

                if(pieceToMove != null) {
                    if(pieceToMove.getColor() != 1) {
                        System.out.println("The piece you are trying to move is not a black piece.");
                        continue;
                    }
                }

                ChessPiece destinationPiece = board.getPieceAt(destFile, destRank);

                String pieceToMoveString = "";
                String destinationPieceString = "";

                if(pieceToMove instanceof Pawn) {
                    pieceToMoveString = "pawn";
                }

                if(pieceToMove instanceof Rook) {
                    pieceToMoveString = "rook";
                }

                if(pieceToMove instanceof Knight) {
                    pieceToMoveString = "knight";
                }

                if(pieceToMove instanceof Bishop) {
                    pieceToMoveString = "bishop";
                }

                if(pieceToMove instanceof Queen) {
                    pieceToMoveString = "queen";
                }

                if(pieceToMove instanceof King) {
                    pieceToMoveString = "king";
                }

                if(destinationPiece instanceof Pawn) {
                    destinationPieceString = "pawn";
                }

                if(destinationPiece instanceof Rook) {
                    destinationPieceString = "rook";
                }

                if(destinationPiece instanceof Knight) {
                    destinationPieceString = "knight";
                }

                if(destinationPiece instanceof Bishop) {
                    destinationPieceString = "bishop";
                }

                if(destinationPiece instanceof Queen) {
                    destinationPieceString = "queen";
                }

                try {
                    if(board.isBlackInCheck() == true) {
                        ChessPiece[][] piecesCopy = new ChessPiece[8][8];
                        piecesCopy = board.copyToPieces(board.getBoard());
                        ChessBoard boardCopy = new ChessBoard(piecesCopy);

                        boardCopy.movePiece(file, rank, destFile, destRank);
                        if(boardCopy.isBlackInCheck() == true) {
                            System.out.println("\nThe move you provided did not get black out of check.\n");
                            continue;
                        }
                    } 

                    board.movePiece(file, rank, destFile, destRank);

                    if(destinationPieceString.isEmpty()) {
                        if(pieceToMoveString.equals("king") && file == 'e' && (destFile == 'c' || destFile == 'g')) {
                            if(destFile == 'c') {
                                System.out.println("\nThe black king has castled long.");
                            }

                            if(destFile == 'g') {
                                System.out.println("\nThe black king has castled short");
                            }
                        }
                        
                        else if(pieceToMoveString.equals("pawn") && file != destFile) {
                            System.out.println("\nThe black pawn at " + file + rank + " has captured the white pawn at " + destFile + rank + " via en passant.");
                        }
                        
                        else {
                            System.out.println("\nThe black " + pieceToMoveString + " at " + file + rank + " has moved to " + destFile + destRank + "\n");
                        }
                    } else {
                        System.out.println("\nThe black " + pieceToMoveString + " at " + file + rank + " has captured the " + destinationPieceString + " at " + destFile + destRank + "\n");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
                } catch(NullPointerException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                if(board.isBlackPawnPromotable() == true) {
                    boolean promotionChosen = false;
                    while(!promotionChosen) {
                        System.out.println("The pawn at " + destFile + destRank + " can be promoted.");
                        System.out.println("Please type one of the following options:");
                        System.out.println("Q: Queen");
                        System.out.println("R: Rook");
                        System.out.println("B: Bishop");
                        System.out.println("K: Knight");

                        char promotionInput;

                        try {
                            promotionInput = scan.next().charAt(0);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid promotion input, please try again");
                            scan.next();
                            continue;
                        }

                        switch(promotionInput) {
                            case 'Q': 
                                board.promotePawn(destFile, destRank, "queen");
                                System.out.println("The pawn at " + destFile + destRank + " has been promoted to a queen!");
                                break;
                            case 'R':
                                board.promotePawn(destFile, destRank, "rook");
                                System.out.println("The pawn at " + destFile + destRank + " has been promoted to a rook!");
                                break;
                            case 'B':
                                board.promotePawn(destFile, destRank, "bishop");
                                System.out.println("The pawn at " + destFile + destRank + " has been promoted to a bishop!");
                                break;
                            case 'K':
                                board.promotePawn(destFile, destRank, "knight");
                                System.out.println("The pawn at " + destFile + destRank + " has been promoted to a knight!");
                                break;
                            default:
                                System.out.println("Invalid promotion input, please try again");
                                continue;
                        }
                        promotionChosen = true;
                    }

                }

                if(board.isWhiteCheckmated() == true) {
                    renderBoard(board);
                    System.out.println("White is in checkmate. Black wins!");
                    isGameOver = true;
                    break;
                }

                if(board.isWhiteInCheck()) {
                    System.out.println("White is in check");
                }

                if(board.isWhiteStalemated()) {
                    renderBoard(board);
                    System.out.println("White is stalemated. The game is a draw");
                    isGameOver = true;
                    break;
                }

                whiteToMove = true;
                blackToMove = false;
            }


        }
        System.out.println("Thank you for playing!");
        scan.close();
    }

    public static void renderBoard(ChessBoard board) {
        System.out.println();

                char[] files = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

                for(int i=8 ; i>0 ; i--) {
                    if(i == 8) {
                        System.out.println(" ________________________________________");
                    } else {
                        System.out.println(" |____|____|____|____|____|____|____|____|");
                    }
                    System.out.println(" |    |    |    |    |    |    |    |    |");

                    String line = i + "|";

                    for(int j=0 ; j<8 ; j++) {
                        ChessPiece piece = board.getPieceAt(files[j], i);

                        if(piece == null) {
                            line = line + "    |";
                        } else {
                            if(piece.getColor() == 0) {
                                if(piece instanceof Pawn) {
                                    line = line + " WP |";
                                }
        
                                if(piece instanceof Rook) {
                                    line = line + " WR |";
                                }
        
                                if(piece instanceof Knight) {
                                    line = line + " WN |";
                                }
        
                                if(piece instanceof Bishop) {
                                    line = line + " WB |";
                                }
        
                                if(piece instanceof Queen) {
                                    line = line + " WQ |";
                                }
        
                                if(piece instanceof King) {
                                    line = line + " WK |";
                                }
                            }

                            if(piece.getColor() == 1) {
                                if(piece instanceof Pawn) {
                                    line = line + " BP |";
                                }
        
                                if(piece instanceof Rook) {
                                    line = line + " BR |";
                                }
        
                                if(piece instanceof Knight) {
                                    line = line + " BN |";
                                }
        
                                if(piece instanceof Bishop) {
                                    line = line + " BB |";
                                }
        
                                if(piece instanceof Queen) {
                                    line = line + " BQ |";
                                }
        
                                if(piece instanceof King) {
                                    line = line + " BK |";
                                }
                            }
                        }
                    }
                    System.out.println(line);
                    // System.out.println(" |_________________________|");
                }
                System.out.println(" |_______________________________________|");
                System.out.println("   a    b    c    d    e    f    g    h\n");
    }
}
