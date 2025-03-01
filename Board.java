package chess;

import java.util.HashMap;

public class Board {
    private HashMap<String, Piece> board;

    public Board() {
        board = new HashMap<>();
        initializeBoard();
    }

    private void initializeBoard() {
        // Place pawns
        for (char file = 'a'; file <= 'h'; file++) {
            board.put(file + "2", new Pawn(Player.white));
            board.put(file + "7", new Pawn(Player.black));
        }
        
        // Place other pieces
        String backRank = "RNBQKBNR";
        for (int i = 0; i < 8; i++) {
            char file = (char) ('a' + i);
            board.put(file + "1", Piece.createPiece(backRank.charAt(i), Player.white));
            board.put(file + "8", Piece.createPiece(backRank.charAt(i), Player.black));
        }
    }
    
    public boolean isLegalMove(String from, String to, Player currentPlayer) {
        Piece piece = board.get(from);
        if (piece == null || piece.getPlayer() != currentPlayer) return false;
        return piece.isValidMove(from, to, board);
    }
    
    public void makeMove(String from, String to) {
        Piece piece = board.remove(from);
        board.put(to, piece);
    }
    
    public boolean isInCheck(Player player) {
        // Check if the player's king is under attack
        return false;
    }
    
    public boolean isCheckmate(Player player) {
        return false;
    }
}
