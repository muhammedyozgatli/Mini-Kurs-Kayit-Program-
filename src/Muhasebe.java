
import java.util.Scanner;


public class Muhasebe {
    private String ad;

    public Muhasebe(String ad) {
        this.ad = ad;
    }
    public void degerlendirme(Sekreter s) throws InterruptedException{
        while (true){
            Scanner scanner=new Scanner(System.in);
            int faturaNo;
            
            String a="Merhaba ben kursun muhsabesinden sorumluyum\n"
                    + "Lütfen kayit isleminiz tanımlamak icin kayıt numarasini giriniz";
            System.out.println(a);
            faturaNo=scanner.nextInt();
            if(faturaNo==s.getFatura_no()){
                System.out.println(" ");
                System.out.println("Fatura numarasi kontol ediliyor..");
               Thread.sleep(3000);
               
                
                String message="Kursun muhasebe biriminden sorumlu " +ad+ " tarafindan fatura numarasi  "
                        + "Kontrol edildi ve doğru oldugu saptandı.\n"
                        + "Kursumuza Hos Geldiniz..";
                        
                        System.out.println(message);
                        return;
            }
            else{
                System.out.println("");
                System.out.println("Fatura numarası kontrol ediliyor..");
                Thread.sleep(3000);
               
                String message="Kursun muhasebe biriminden sorumlu " +ad+ " tarafindan fatura numarasi  "
                        + "Kontrol edildi ve yanlis saptandi\n"
                        + "Lütfen fatura numaranızı tekrar giriniz.";
                        
                        System.out.println(message);
                
            }
        }
    }
    
}
