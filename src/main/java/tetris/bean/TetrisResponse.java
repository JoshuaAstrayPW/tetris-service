package tetris.bean;

/**
 * Created by jojo on 2018/1/2.
 */
public class TetrisResponse {
    /**
     * 键盘码
     */
    private String keyCode;
    /**
     * 操作描述
     */
    private String desc;

    public String getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
