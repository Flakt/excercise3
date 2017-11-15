import java.util.ArrayList;
import java.util.List;

/**
 * Created by schan on 2017-11-15.
 */
public class test <T,R> implements Function<T,R> {

    public static void main(String[] args){
        test t= new test();
        System.out.println(t.apply(2));
        System.out.println(t.compose("hej ",true));
    }




    @Override
    public R apply(T t) {
        R r=(R) t;
        return r;
    }

    @Override
    public R compose(T t, T y) {

        R r =(R) (t.toString()+y.toString());

        return r;
    }
}
