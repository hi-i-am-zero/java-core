package buoi6.classroom;

public class Main {
    public static void main(String[] args) {
        Voi voi = new Voi();
        voi.diChuyen();

        Ho ho = new Ho();
        ho.diChuyen();

        Animals animals = new Voi();
        animals.diChuyen();
        Animals ho2 = new Ho();
        if (ho2 instanceof Ho){
            ((Ho)ho2).sanMoi();
        }
        ho2.diChuyen();
    }
}
