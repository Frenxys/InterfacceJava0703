public class Scatola {
    private OggettoScatola[] array=new OggettoScatola[100];
    private int elementi=0;
    public Scatola(){

    }
    public void add(OggettoScatola o){
        array[elementi]=o;
        elementi++;
    }
    public double pesoTotale(){
        double somma=0;
        for(int i=0; i<elementi; i++){
            somma+=array[i].getPeso();
        }
        return somma;
    }
    public int calorieTotali(){
        int somma=0;
        for(int i=0; i<elementi; i++){
            somma+=array[i].getCalorie();
        }
        return somma;
    }
    public String toString(){
        return "";
    }
}