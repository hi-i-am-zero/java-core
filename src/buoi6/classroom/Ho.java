package buoi6.classroom;

public class Ho extends Animals{

    private String loaiThit;

    public void sanMoi(){
        System.out.println("Ho sanMoi");;
    }

    @Override
    public void diChuyen(){
        System.out.println("Ho di chuyen nhanh");
    }
}
