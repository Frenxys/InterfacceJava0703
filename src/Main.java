public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scatola s=new Scatola();
        Regalo r=new Regalo("regalo",45);
        s.add(r);
        Caramella c=new Caramella("cara",56,34);
        s.add(c);
        System.out.println("calorie:"+s.calorieTotali());
        System.out.println("peso:"+s.pesoTotale());
    }
}