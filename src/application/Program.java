package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {
    static void main() {

        Scanner sc = new Scanner(System.in);
        ChessMatch chassMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chassMatch.getPíeces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chassMatch.performChessMove(source, target);
        }
    }
}
