package schema.behavior.responsibility.okhttp;

/**
 * @author zongfulin
 * Date: 2021/4/21
 * Time: 17:43
 * Description:OKHttp的责任链模式是一种不纯的责任链，即每一个拦截器都组装Reponse的一部分。
 * 1.Interceptor接口中的intercept方法是实际处理请求的方法，每一个实现该接口的对象负责处理Reponse的一部分。
 * 2.Chain接口负责执行intercept方法。并最终拿到intercept处理后的请求，绝大部分传递给intercept方法的Chain对象是RealInterceptorChain
 *
 * 作者：石器时代小古董
 * 链接：https://www.jianshu.com/p/fd4255be60d7
 * 来源：简书
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class OkHttpTest {
    public static void main(String[] args) {

    }
}
