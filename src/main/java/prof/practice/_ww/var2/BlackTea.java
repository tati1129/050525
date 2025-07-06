package prof.practice._ww.var2;

public class BlackTea extends Tea {

    private String variety;

    public BlackTea(int id, String manufacturer, String variety) {
        super(id, manufacturer);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    @Override
    public String toString() {
        return "BlackTea{" +
                "variety='" + variety + '\'' +
                '}';
    }
}
