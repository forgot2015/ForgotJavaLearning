package schema.behavior.responsibility.demolikeokhttp;

/**
 * @author zongfulin
 * Date: 2021/4/22
 * Time: 09:37
 * Description:
 */
public class Manager implements Character {
    @Override
    public Response processRequest(Chain chain) {
        Request request = chain.getRequest();
        Response response = new Response();
        if (request.getDay() > 0 && request.getDay() <= 3) {
            response.setAgree(true);
            System.out.println("Manager Agreed");
        } else if (request.getDay() > 3 && request.getDay() <= 10) {
            //正式请求中,往SecondBoss传之前可以处理Header里面的信息
            response = chain.processChain();
        } else {
            response = chain.processChain();
        }
        //可以进一步处理response,正式请求中可以除去部分信息,如Header里面的信息
        return response;
    }
}
