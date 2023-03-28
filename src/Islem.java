
import java.util.Scanner;


public class Islem {
    public static void main(String[] args) throws InterruptedException {
      Sekreter s=new Sekreter("Nurgül");
        Scanner scanner=new Scanner(System.in);
        String giris="Kurs kayıt bölümüne Hos geldiniz.\n"
                + "Ben bu kursta sekreter bölümünden sorumlu "+s.getAd()+"\n"
                + "Genel olarak kurs hakkında bilgi vermek gerekirse\n"
                + "Java,Kotlin ve Scala olmak üzere 3 tane kursumuz mevcuttur\n"
                + "Kurs ücretleri sabit olup 3000' TL dir.\n"
                + "Kursa kabul edilmek için ücreti pesin ödemelisiniz";
                
         System.out.println("//////////////////");
         System.out.println(giris);
         System.out.println("//////////////////");
         System.out.print("Lütfen kayıt olmak istediğiniz kurs adını giriniz: \n");
         
         String kursAdi=scanner.nextLine();
         
         System.out.print("Lütfen yatıracagınız parayi giriniz:");
         int para=scanner.nextInt();
         if(para==s.getUcret()){
             System.out.println("");
             s.islem_sonucu();
             Muhasebe m=new Muhasebe("Mehmet");
             m.degerlendirme(s);
             
         }
         else if(para>s.getUcret()){
             String message2="Yatirdiginiz para kurs ücretinden fazla oldugu saptandi\n"
                     + "Para üstünüz hesaplanıp size verilecek\n";
             System.out.println(message2);
             System.out.println("Para üstünüz hesaplaniyor... \n");
             
             Thread.sleep(2500);
             int paraüstü;
             paraüstü=para-s.getUcret();
             
             System.out.println("Para üstünüz "+paraüstü+ " liradir muhasebeden alabilirsiniz.");
             System.out.println("");
             s.islem_sonucu();
             Muhasebe m=new Muhasebe("Mehmet");
             m.degerlendirme(s);
         }
         else {
             System.out.println("Ücretin tamamini ödemediğiniz için işleminiz iptal edilmiştir.");
         return;
         }
    }
    
}
