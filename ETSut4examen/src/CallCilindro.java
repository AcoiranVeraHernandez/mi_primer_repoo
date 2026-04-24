import java.util.StringJoiner;

public class CallCilindro {

    private String base;
    private String altura;
    private String lateral;
    private String radio;


    public CallCilindro(String base, String altura, String lateral) {
        this.base = base;
        this.altura = altura;
        this.lateral = lateral;
        this.radio = radio;
    }


    public static void add(CallCilindro awd) {
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getLateral() {
        return lateral;
    }

    public void setLateral(String lateral) {
        this.lateral = lateral;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CallCilindro.class.getSimpleName() + "[", "]")
                .add("radio=" + radio)
                .add("base=" + base)
                .add("altura=" + altura)
                .add("lateral=" + lateral)
                .toString();
    }


}
