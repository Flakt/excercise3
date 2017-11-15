public interface Function<T,R> {
    // public ... apply(...);
    // public ... compose(...);

    R apply(T t);

    R compose(T t,T y);

}
