// Q56: Generic class accepting only subclasses of Number

class NumberGeneric<T extends Number> {

    T num1, num2;

    NumberGeneric(T n1, T n2) {
        num1 = n1;
        num2 = n2;
    }

    // method to calculate sum
    double getSum() {
        return num1.doubleValue() + num2.doubleValue();
    }
}

class NumberGenericSum {
    public static void main(String[] args) {

        NumberGeneric<Integer> obj1 = new NumberGeneric<>(10, 20);
        System.out.println("Sum: " + obj1.getSum());

        NumberGeneric<Double> obj2 = new NumberGeneric<>(5.5, 4.5);
        System.out.println("Sum: " + obj2.getSum());
    }
}