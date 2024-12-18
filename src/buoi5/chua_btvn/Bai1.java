package buoi5.chua_btvn;

public class Bai1 {
    public static void main(String[] args) {
        String str = "Tôi học. lập trình, Học; lập trình: rất hay";
        String str2 = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";
        demSoLuongTu(str2);
    }

    public static void demSoLuongTu(String str) {
        //cat chuoi
        String[] arrStr = str.split(" ");
        //chuan hoa chuoi
        xoaKiTuDacBiet(arrStr);
        int soDong = arrStr.length;
        int soCot = 2;
        int soLuongDongThucTe = 0;
        String[][] mangKetQua = new String[soDong][soCot];
        //dem so lan xuat hien
        for (int i = 0; i < arrStr.length; i++) {
            boolean boQuaKiTu = false;
            String kyTuKiemTra = arrStr[i];
            //kiem tra tat ca cac ki tu tu index = 0 cho toi index = i
            for (int j = 0; j < i; j++) {
                //neu co ki tu nao trung voi tu can kiem tra
                if (kyTuKiemTra.equalsIgnoreCase(arrStr[j])) {
                    //bo qua tu do = true
                    boQuaKiTu = true;
                    break;
                }
            }
            //bo qua ki tu neu ki tu da duoc kiem tra
            if (boQuaKiTu) {
                continue;
            }
            //dem so lan xuat hien cua tu
            int count = 0;
            for (int j = i; j < arrStr.length; j++) {
                if (kyTuKiemTra.equalsIgnoreCase(arrStr[j])) {
                    count++;
                }
            }
            //dua tu do va so lan xuat hien vao mang 2 chieu ket qua
            mangKetQua[soLuongDongThucTe][0] = kyTuKiemTra;
            mangKetQua[soLuongDongThucTe][1] = String.valueOf(count);
            soLuongDongThucTe++;
        }
        hienThiMangHaiChieu(mangKetQua, soLuongDongThucTe);
    }

    public static void hienThiMangHaiChieu(String[][] arr, int soDongThucTe){
        for (int i = 0; i < soDongThucTe; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String data = arr[i][j];
                if (j == 0){
                    data = data.substring(0,1).toUpperCase() + data.substring(1);
                    System.out.print(data + " : ");
                    continue;
                }
                System.out.print(arr[i][j].toString() + " ");
            }
            System.out.println("");
        }
    }

    public static void xoaKiTuDacBiet(String[] arrStr) {
        for (int i = 0; i < arrStr.length; i++) {
            String str = arrStr[i].replace(".", "").replace(",", "")
                    .replace(":", "").replace(";", "").trim();
            arrStr[i] = str;
        }
    }
}
