
import java.util.Random;


public class Sekreter {
    Random random=new Random();
    private String ad;
    private int ucret=3000;
    private int fatura_no=random.nextInt(20);

    public Sekreter(String ad) {
        this.ad = ad;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public int getFatura_no() {
        return fatura_no;
    }

    public void setFaura_no(int faura_no) {
        this.fatura_no = faura_no;
    }
        void islem_sonucu(){
            String s="Kurs kayit isleminiz sekreterimiz "+ad+" tarafindan isleme alinmistir\n"
                    + "Lütfen ilgili fatura numarasini muhasebe birimine iletiniz\n"
                    + "Fatura numaraniz: "+fatura_no;
                    System.out.println(s);         
        }
    

}


