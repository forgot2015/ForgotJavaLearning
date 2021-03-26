package schema.structure.bridge;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 5:06 PM
 * Description:
 */
public abstract class Person {
    protected Clothes clothes;

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    protected abstract void dress();
}
