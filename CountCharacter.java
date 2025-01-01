import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static void main(String[] args){

     String str = "Ganesh KAle" ;

    countChar(str);
    
    }
    public static void countChar(String s){

        Map<Character , Integer> map  = new HashMap();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        System.out.println(map.toString());

    }
}
