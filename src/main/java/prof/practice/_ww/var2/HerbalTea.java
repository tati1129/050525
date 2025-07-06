package prof.practice._ww.var2;

public class HerbalTea extends Tea {

    private String variety;

    public HerbalTea(int id, String manufacturer, String variety) {
        super(id, manufacturer);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void time() {
        System.out.println(" ");
    }

}
