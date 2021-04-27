package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        list.add("Value1");
        list.add("Value2");
        list.add("Value3");

        for (String element:list){
            System.out.println(element);
        }
    }
}
