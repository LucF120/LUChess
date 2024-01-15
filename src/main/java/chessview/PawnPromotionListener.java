package chessview;

import util.*;
import chessboard.*;
import chesspiece.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PawnPromotionListener implements ActionListener {
    ChessBoard game;

    public PawnPromotionListener(ChessBoard game) {
        this.game = game;
    }

    @Override
    public void actionPerformed(ActionEvent e) throws NullPointerException {
        Pawn promotablePawn = this.game.getPromotablePawn();

        if(promotablePawn != null) {
            switch(e.getActionCommand()) {
                case "Promote to Queen":
                    game.promotePawn(promotablePawn.getFile(), promotablePawn.getRank(), "queen");
                    break;
                case "Promote to Rook":
                    game.promotePawn(promotablePawn.getFile(), promotablePawn.getRank(), "rook");
                    break;
                case "Promote to Bishop":
                    game.promotePawn(promotablePawn.getFile(), promotablePawn.getRank(), "bishop");
                    break;
                case "Promote to Knight":
                    game.promotePawn(promotablePawn.getFile(), promotablePawn.getRank(), "knight");
                    break;
                default:
            }
        }

    }
}