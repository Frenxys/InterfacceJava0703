abstract public class OggettoScatola implements  Pesabile,Mangiabile{
    private String descrizione;
    private double peso;
    public OggettoScatola(String descrizione,double peso){
        setDescrizione(descrizione);
        setPeso(peso);
    }
    public double peso() {
        return 0;
    }
    public int calorie(){
        return 0;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getCalorie() {
        return 0;
    }
    @Override
    public String toString() {
        return descrizione+" peso:"+peso+" ";
    }

    public double getPeso() {
        return peso;
    }
}
