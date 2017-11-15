import java.util.ArrayList;
import java.util.List;

/**
 * Created by schan on 2017-11-15.
 */
public class Lists {


    public static void main(String[] args){

        Lists L =new Lists();
        List<String>str =new ArrayList<>();
        str.add("hej");
        List<Integer> Int =new ArrayList<>();
        Int.add(7);
        System.out.println(L.zip(str,Int).toString());
    }


    static public <A, B> List<Tuple<A, B>> zip(List<A> l1, List<B> l2) {
        List<Tuple<A, B>> arr= new ArrayList<>();

        for (int i = 0; i <Math.min(l1.size(),l2.size()) ; i++) {
            arr.add(new Tuple<A,B>(l1.get(i),l2.get(i)));
        }

        return arr;
    }

}
