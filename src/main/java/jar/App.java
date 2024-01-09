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
                System.out.println("White to move:\n");

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
                    scan.next();
                    continue;
                }
    
                ChessPiece pieceToMove = board.getPieceAt(file, rank);
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
                    board.movePiece(file, rank, destFile, destRank);

                    if(destinationPieceString.isEmpty()) {
                        System.out.println("The white " + pieceToMoveString + " at " + file + rank + " has moved to " + destFile + destRank);
                    } else {
                        System.out.println("The white " + pieceToMoveString + " at " + file + rank + " has captured the " + destinationPieceString + " at " + destFile + destRank);
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
                    System.out.println("Black is in checkmate. White wins!");
                    isGameOver = true;
                    break;
                }

                if(board.isBlackInCheck()) {
                    System.out.println("Black is in check");
                }

                if(board.isBlackStalemated()) {
                    System.out.println("Black is stalemated. The game is a draw");
                    isGameOver = true;
                    break;
                }

                whiteToMove = false;
                blackToMove = true;
            }

            while(blackToMove) {
                System.out.println("Black to move:\n");

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
                    scan.next();
                    continue;
                }
    
                ChessPiece pieceToMove = board.getPieceAt(file, rank);
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
                    board.movePiece(file, rank, destFile, destRank);

                    if(destinationPieceString.isEmpty()) {
                        System.out.println("The black " + pieceToMoveString + " at " + file + rank + " has moved to " + destFile + destRank);
                    } else {
                        System.out.println("The black " + pieceToMoveString + " at " + file + rank + " has captured the " + destinationPieceString + " at " + destFile + destRank);
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
                    System.out.println("White is in checkmate. Black wins!");
                    isGameOver = true;
                    break;
                }

                if(board.isWhiteInCheck()) {
                    System.out.println("White is in check");
                }

                if(board.isWhiteStalemated()) {
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
}
