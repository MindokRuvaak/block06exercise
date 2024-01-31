package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
// task 1: Implement this class. It should act like a tuple in e.g.
// Haskell or Python. An object of this type should hold two values of
// (possibly) different (arbitrary) types, and have the methods fst()
// and snd() to return the respective components.
// NOTE: The class should be read-only after initial construction.
public class Tuple<T1, T2> {
    private final T1 fst;
    public final T2 snd;

    public Tuple(T1 fst, T2 snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public T1 fst() {
        return fst;
    }

    public T2 snd() {
        return snd;
    }
}
