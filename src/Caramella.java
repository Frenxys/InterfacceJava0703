public class Caramella extends OggettoScatola{
    private int calorie;
    public Caramella(String descr,double peso,int calorie){
        super(descr,peso);
        setCalorie(calorie);
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return super.toString()+" calorie:"+calorie;
    }
}
