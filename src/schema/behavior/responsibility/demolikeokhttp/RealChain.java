package schema.behavior.responsibility.demolikeokhttp;

import java.util.List;

/**
 * @author zongfulin
 * Date: 2021/4/22
 * Time: 09:35
 * Description:
 */
public class RealChain implements Chain {

    private List<Character> list;
    private Request request;
    private int index = 0;

    public RealChain(List<Character> list, Request request, int index) {
        this.list = list;
        this.request = request;
        this.index = index;
    }

    @Override
    public Request getRequest() {
        return request;
    }

    @Override
    public Response processChain() {
        System.out.println(this);
        RealChain next = new RealChain(list, request, index + 1);
        Response response = list.get(index).processRequest(next);
        System.out.println("index = " + index);
        //这里不能简单的用index++来更新,不然的话当day>3的时候,会在FirstBoss里面无限循环
        return response;
    }

}
