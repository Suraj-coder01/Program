// Q54: Generic class Pair<T, U>

class Pair<T, U> {
    private T first;   // first value
    private U second;  // second value

    // constructor
    Pair(T f, U s) {
        first = f;
        second = s;
    }

    // getter methods
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}

class PairGeneric {
    public static void main(String[] args) {

        // using Integer and String
        Pair<Integer, String> p1 = new Pair<>(101, "Rahul");

        System.out.println("ID: " + p1.getFirst());
        System.out.println("Name: " + p1.getSecond());
    }
}