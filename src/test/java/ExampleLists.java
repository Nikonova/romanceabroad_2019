import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleLists {
    String a = "password";
    String b = "username";
    String c = "phone";
    String d = "date";

    @Test
    public void test() {

        List<String> dataList = new ArrayList<String>(Arrays.asList(a, b, c, d));
        String element = dataList.get(0);
        System.out.println(element);

        if (dataList.contains("milk")&& dataList.contains("password")) {
            System.out.println("We can find password");
        } else {
            System.out.println("We can't find all words");
        }

        if (dataList.contains("milk")|| dataList.contains("password")) {
            System.out.println("We can find some or all words");
        } else {
            System.out.println("We can't find list");
        }

        List<Integer> dataList2 = new ArrayList<>(Arrays.asList(1, 2, 8, 54));
        dataList2.add(52);
        System.out.println(dataList2);


        List<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1, 2, 23, 3, 2, 4));
        int sum = numberList.get(0) + numberList.get(2);
        System.out.println(sum);

        if (numberList.contains(5)) {
            System.out.println(numberList);
        } else {
            System.out.println("Doesn't have 5 in numberList");
        }


    }

}
