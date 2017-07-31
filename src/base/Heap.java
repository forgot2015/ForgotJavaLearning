package base;

import java.util.ArrayList;

/**
 * Created by forgot on 2017/7/28.
 */
public class Heap {
    public static void main(String[] args)
    {
        ArrayList list=new ArrayList();
        while(true)
        {
            list.add(new Heap());
            System.out.println("add(new Heap())");
        }
    }
}