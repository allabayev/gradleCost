package uz.costs;

public class Monsly {
    private int komunalka;
    private int kvartPlata;
    private int uchyoba;
    private int odejda;
    public Monsly (int komunalka, int kvartPlata, int uchyoba, int odejda) {
        this.komunalka=komunalka;
        this.kvartPlata=kvartPlata;
        this.uchyoba=uchyoba;
        this.odejda=odejda;
    }
    public void setKomunalka (int komunalka) {this.komunalka = komunalka;}
    public void setKvartPlata (int kvartPlata) {this.kvartPlata = kvartPlata;}
    public void setUchyoba (int uchyoba) {this.uchyoba=uchyoba;}
    public void setOdejda (int odejda) {this.odejda=odejda;}
}
