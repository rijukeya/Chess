class Rook extends Piece {
    public Rook(char file, int rank, Chess.Player player) {
        super(file, rank, player);
    }
    
    @Override
    public boolean isValidMove(char newFile, int newRank, Board board) {
        if (file != newFile && rank != newRank) return false;
        return board.isPathClear(file, rank, newFile, newRank);
    }
}
