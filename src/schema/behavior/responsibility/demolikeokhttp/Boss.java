package schema.behavior.responsibility.demolikeokhttp;

/**
 * @author zongfulin
 * Date: 2021/4/22
 * Time: 09:37
 * Description:
 */
public class Boss implements Character {
    @Override
    public Response processRequest(Chain chain) {
        //正式请求中可以做其他处理,这里化简直接返回同意
        Response response = new Response();
        response.setAgree(true);
        System.out.println("Boss Agreed");
        return response;
    }
}
