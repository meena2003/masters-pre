package fourthWeek.mission1.Problem6;

public class GenericPrinter<T extends Material> {
    private T t;

    public void setMaterial(T t) {
        this.t = t;
    }

    public T getMaterial() {
        return t;
    }

    public String toString() {
        return "재료는 " + t.toString() + "입니다.";
    }
}
