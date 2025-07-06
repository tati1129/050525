package prof.practice._ww.var2;

public class GreenTea extends Tea {
    private String variety;

    public GreenTea(int id, String manufacturer, String variety) {
        super(id, manufacturer);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void temperature() {
        System.out.println(" ");
    }
}
