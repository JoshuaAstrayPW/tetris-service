package tetris.bean;

/**
 * Created by jojo on 2018/1/9.
 */
public class Tetris {
    private int hight;
    private int width;
    private int nBufferLines;
    private boolean[][] board;

    public Tetris(int hight, int width, int nBufferLines, boolean[][] board) {
        this.hight = hight;
        this.width = width;
        this.nBufferLines = nBufferLines;
        this.board = board;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getnBufferLines() {
        return nBufferLines;
    }

    public void setnBufferLines(int nBufferLines) {
        this.nBufferLines = nBufferLines;
    }

    public boolean[][] getBoard() {
        return board;
    }

    public void setBoard(boolean[][] board) {
        this.board = board;
    }
}
