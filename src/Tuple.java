public class Tuple<T, Y> {

    T t;
    Y y;

    public Tuple(T t, Y y) {

        this.t = t;

        this.y = y;
    }

    // public ... fst(){...}

    public T fst() {
        return t;
    }

    // public ... snd(){...}
    public Y snd() {
        return y;
    }


    @Override
    public String toString() {
        return t + " " + y;
    }
}
