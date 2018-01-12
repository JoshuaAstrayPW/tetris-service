package tetris.bean;


import java.util.List;

/**
 * Created by jojo on 2018/1/2.
 */
public class TetrisRequest {

    /**
     * 砖块类型
     */
    private int blockType;
    /**
     * 二维矩阵
     */
    private List<List<Integer>> matrix;


    public int getBlockType() {
        return blockType;
    }

    public void setBlockType(int blockType) {
        this.blockType = blockType;
    }

    public List<List<Integer>> getTetrisScene() {
        return matrix;
    }

    public void setTetrisScene(List<List<Integer>> matrix) {
        this.matrix = matrix;
    }
}
