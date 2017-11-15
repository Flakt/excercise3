import java.util.List;

/**
 * Created by schan on 2017-11-15.
 */
public interface Zip {

     <A,B> List<Tuple<A,B>> zip(List<A> l1 , List<B> l2);
}
