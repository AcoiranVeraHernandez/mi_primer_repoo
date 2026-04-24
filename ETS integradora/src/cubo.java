import java.util.StringJoiner;

public class cubo {
    private int lado;
    private float base;


    public cubo(int lado, float volumen, float base) {
        this.lado = lado;
        this.base = base;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }





    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", cubo.class.getSimpleName() + "[", "]")
                .add("lado=" + lado)
                .add("base=" + base)
                .toString();
    }
}
