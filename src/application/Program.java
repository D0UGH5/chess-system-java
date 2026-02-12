package application;

import chess.ChessMatch;

public class Program {
    static void main() {

        ChessMatch chassMatch = new ChessMatch();
        UI.printBoard(chassMatch.getPíeces());
    }
}
