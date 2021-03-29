package schema.behavior.memo;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 2:30 PM
 * Description:
 */
public class Memento {
    private int level;//等级
    private int coin;//金币数量

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
