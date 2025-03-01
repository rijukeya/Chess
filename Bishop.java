class Bishop extends Piece {
    public Bishop(char file, int rank, Chess.Player player) {
        super(file, rank, player);
    }
    
    @Override
    public boolean isValidMove(char newFile, int newRank, Board board) {
        if (Math.abs(newFile - file) != Math.abs(newRank - rank)) return false;
        return board.isPathClear(file, rank, newFile, newRank);
    }
}
