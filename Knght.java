class Knight extends Piece {
    public Knight(char file, int rank, Chess.Player player) {
        super(file, rank, player);
    }
    
    @Override
    public boolean isValidMove(char newFile, int newRank, Board board) {
        int fileDiff = Math.abs(newFile - file);
        int rankDiff = Math.abs(newRank - rank);
        return (fileDiff == 2 && rankDiff == 1) || (fileDiff == 1 && rankDiff == 2);
    }
}