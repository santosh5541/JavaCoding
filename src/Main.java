import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Map<String,Integer> courseMap = new HashMap<>();
    courseMap.put("Santosh",1);
    courseMap.put("bikash",2);
    courseMap.put("renu",3);
    courseMap.put("prabesh",4);

//    Iterator<Map.Entry<String, Integer>> iterator = courseMap.entrySet().iterator();
//    while (iterator.hasNext()){
//      Map.Entry<String,Integer> entry = iterator.next();
//      System.out.println(entry.getKey()+" ==> "+entry.getValue());
//    }
    for (Map.Entry<String,Integer>entry: courseMap.entrySet()){
      System.out.println(entry.getValue());
      System.out.println(entry.getKey());

      courseMap.forEach((key,value)->{
        System.out.println("key is "+key+" value is "+value);
      });

      //use stream API

      courseMap.entrySet().forEach(stringIntegerEntry -> {
        System.out.println(stringIntegerEntry.getValue());
        System.out.println(stringIntegerEntry.getKey());
      });
    }
  }
}