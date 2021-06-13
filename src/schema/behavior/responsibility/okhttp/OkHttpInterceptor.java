package schema.behavior.responsibility.okhttp;

/**
 * @author zongfulin
 * Date: 2021/4/21
 * Time: 18:05
 * Description:
 */
public interface OkHttpInterceptor {
    //    负责处理实际的任务
    public void intercept(Chain chain);

    interface Chain {
        //负责构建责任链
        void proceed(int free, String user);
    }
}
