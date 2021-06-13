/**
 * @author zongfulin
 * Date: 2021/4/21
 * Time: 17:04
 * Description:
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 3;
//        在 while 循环下的 switch也能中断流程出去,本来 switch 只能中断一层的,加了break label23;才能出去
        label23:
//        这种情况为何要加个 while(true)呢
        while (true) {
            System.out.println("while");
            switch (i) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break label23;
                default:
                    break;
            }
        }

        while (true) {
            System.out.println(" while (true)");
            if (true) {
                break;
            }
        }
        System.out.println("while break");
    }
}
