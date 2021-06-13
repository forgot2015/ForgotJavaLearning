package schema.behavior.responsibility.demolikeokhttp;

/**
 * @author zongfulin
 * Date: 2021/4/22
 * Time: 09:33
 * Description:
 */
public class Response {
    /**
     * 领导是否同意
     */
    private boolean isAgree = false;

    public boolean isAgree() {
        return isAgree;
    }

    public void setAgree(boolean agree) {
        isAgree = agree;
    }

    @Override
    public String toString() {
        return "Response{" +
                "isAgree=" + isAgree +
                '}';
    }
}
