package modernjava.ex01.제1장;

public class Apple {
    private double weight;

    public Apple(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
