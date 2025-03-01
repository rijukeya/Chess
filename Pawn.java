class Pawn extends Piece {
    public Pawn(char file, int rank, Chess.Player player) {
        super(file, rank, player);
    }
    
    @Override
    public boolean isValidMove(char newFile, int newRank, Board board) {
        int direction = (player == Chess.Player.white) ? 1 : -1;
        
        // Standard move
        if (newFile == file && newRank == rank + direction && board.isEmpty(newFile, newRank)) {
            return true;
        }
        
        // First move double step
        if (newFile == file && newRank == rank + 2 * direction && rank == (player == Chess.Player.white ? 2 : 7) &&
            board.isEmpty(newFile, newRank) && board.isEmpty(file, rank + direction)) {
            return true;
        }
        
        // Capture move
        if (Math.abs(newFile - file) == 1 && newRank == rank + direction && board.isEnemyPiece(newFile, newRank, player)) {
            return true;
        }
        
        return false;
    }
}