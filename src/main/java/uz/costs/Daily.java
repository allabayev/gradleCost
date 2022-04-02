package uz.costs;

public class Daily {
    private int trasnport;
    private int zavtrak;
    private int obed;
    private int ujin;
    private int karmRasxod;
    public Daily (int trasnport, int zavtrak, int obed, int ujin, int karmRasxod) {
        this.trasnport=trasnport;
        this.zavtrak=zavtrak;
        this.obed=obed;
        this.ujin=ujin;
        this.karmRasxod=karmRasxod;
    }
    public void setTrasnport (int trasnport) {this.trasnport=trasnport; }
    public void setZavtrak (int zavtrak) {this.zavtrak=zavtrak; }
    public void setObed (int obed) {this.obed=obed; }
    public void setUjin (int ujin) {this.ujin=ujin;}
    public void setKarmRasxod (int karmRasxod) {this.karmRasxod=karmRasxod; }
}