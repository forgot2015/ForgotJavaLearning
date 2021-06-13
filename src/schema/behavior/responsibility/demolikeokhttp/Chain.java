package schema.behavior.responsibility.demolikeokhttp;

/**
 * @author zongfulin
 * Date: 2021/4/22
 * Time: 09:34
 * Description:责任链模式的核心---为整个链提供接口,链上必须要有Request和Response
 */
public interface Chain {
    Request getRequest();

    /**
     * 选择用哪个链去解决相关内容
     *
     * @return
     */
    Response processChain();
}
