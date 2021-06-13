package schema.behavior.responsibility.demolikeokhttp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zongfulin
 * Date: 2021/4/22
 * Time: 09:40
 * Description: 还是不太理解
 */
public class MainTest {
    public static void main(String[] args) {
        Request request = new Request();
        request.setDay(1);
        System.out.println("请假一天");

        List<Character> characters = new ArrayList<Character>();
        characters.add(new Manager());
        characters.add(new Boss());

        Chain chain = new RealChain(characters, request, 0);
        chain.processChain();

        request.setDay(5);
        System.out.println("请假五天");
        chain.processChain();

        request.setDay(0);
        System.out.println("请假0天");
        System.out.println(chain.processChain().toString());

        request.setDay(100);
        System.out.println("请假100天");
        System.out.println(chain.processChain().toString());
    }
}
