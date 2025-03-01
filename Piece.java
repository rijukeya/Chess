abstract class Piece {
    protected char file;
    protected int rank;
    protected Chess.Player player;
    
    public Piece(char file, int rank, Chess.Player player) {
        this.file = file;
        this.rank = rank;
        this.player = player;
    }
    
    public abstract boolean isValidMove(char newFile, int newRank, Board board);
    
    public void move(char newFile, int newRank) {
        this.file = newFile;
        this.rank = newRank;
    }
    
    public Chess.Player getPlayer() {
        return player;
    }
    
    public char getFile() {
        return file;
    }
    
    public int getRank() {
        return rank;
    }