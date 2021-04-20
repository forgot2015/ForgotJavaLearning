package base.variable;

import java.util.Arrays;

/*所以正常的写法是这样的：

1、如果用“.”作为分隔的话，必须是如下写法：String.split("\\."),这样才能正确的分隔开，不能用String.split(".");
2、如果用“|”作为分隔的话，必须是如下写法：String.split("\\|"),这样才能正确的分隔开，不能用String.split("|");
“.”和“|”都是转义字符，必须得加"\\";
3、如果在一个字符串中有多个分隔符，可以用“|”作为连字符，比如：“a=1 and b =2 or c=3”,把三个都分隔出来，可以用String.split("and|or");*/
public class StringSplitSample {
    public static void main(String[] args) {
        String str = "FF,s_reg|114|U00000001|1|1501228064|1|0|0|0,113|0,8039a114849fd7c796662a576d256cb4,FF";
        String[] strings = str.split("\\|");
        String[] strings2 = str.split("|");
        System.out.println("-------- split(\"\\\\|\") ----------");
        System.out.println(Arrays.toString(strings));
        System.out.println("---------- split(\"|\") --------");
        System.out.println(Arrays.toString(strings2));

        String string = "1&1&2|2&1&2|3&1&2|";
        System.out.println("--------- split(&) ----------");
        String[] strings1 = string.split("&");
        System.out.println(Arrays.toString(strings1));
    }
}
