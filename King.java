class King extends Piece {
    public King(char file, int rank, Chess.Player player) {
        super(file, rank, player);
    }
    
    @Override
    public boolean isValidMove(char newFile, int newRank, Board board) {
        int fileDiff = Math.abs(newFile - file);
        int rankDiff = Math.abs(newRank - rank);
        return fileDiff <= 1 && rankDiff <= 1;
    }
}