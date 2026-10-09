
package class5;

public class Kitap {
    private int ISBN;
    private String yazar;
    private String ad;
    private String basimYili;
    private int sayfaSayisi;
    private String yayinEvi;
    private double fiyat;
    private int ciltNo;
    
    void setISBN(int ISBN){
        this.ISBN=ISBN;
    }
    int getISBN(){
        return ISBN;
    }
    
    Kitap(){ // constructor & yapıcı & kurucu & inizilatter
        /*
        this.ISBN=1234567891;
        this.yazar="Aydemirrr";
        this.ad="Hayat";
        this.basimYili="2024";
        this.sayfaSayisi=400;
        this.yayinEvi="Harput Yayinevi";
        this.fiyat=60;
        this.ciltNo=4;
        ozellikYazdir();
        */
    }
        Kitap(int ISBN, String yazar, String ad, String basimYili, int sayfaSayisi, String yayinEvi, double fiyat, int ciltNo){ // constructor & yapıcı & kurucu & inizilatter
        this.ISBN=ISBN;
        this.yazar=yazar;
        this.ad=ad;
        this.basimYili=basimYili;
        this.sayfaSayisi=sayfaSayisi;
        this.yayinEvi=yayinEvi;
        this.fiyat=fiyat;
        this.ciltNo=ciltNo;
        ozellikYazdir();
    }
        Kitap(String yazar, String ad, String basimYili, String yayinEvi, double fiyat, int ciltNo){ // constructor & yapıcı & kurucu & inizilatter
        this.ISBN=1234567844;
        this.yazar=yazar;
        this.ad=ad;
        this.basimYili=basimYili;
        this.sayfaSayisi=400;
        this.yayinEvi=yayinEvi;
        this.fiyat=fiyat;
        this.ciltNo=ciltNo;
        ozellikYazdir();
    }

    
    void parametreAktar(int ISBN, String yazar, String ad, String basimYili, int sayfaSayisi, String yayinEvi, double fiyat, int ciltNo){
        this.ISBN=ISBN;
        this.setYazar(yazar);
        this.setAd(ad);
        this.setBasimYili(basimYili);
        this.setSayfaSayisi(sayfaSayisi);
        this.setYayinEvi(yayinEvi);
        this.setFiyat(fiyat);
        this.setCiltNo(ciltNo);
    }
    
    void ozellikYazdir(){
        System.out.println("Kitap ISBN : "+ISBN);
        System.out.println("Kitap Yazar : "+getYazar());
        System.out.println("Kitap Adi : "+getAd());
        System.out.println("Kitap Basim Yili : "+getBasimYili());
        System.out.println("Kitap Sayfa Sayisi : "+getSayfaSayisi());
        System.out.println("Kitap Yayin Evi : "+getYayinEvi());
        System.out.println("Kitap Cilt No : "+getCiltNo());
        System.out.println("Kitap Fiyat : "+getFiyat());
        System.out.println("Kitap KDV Dahil Fiyat : "+fiyatHesapla(getFiyat()));
    }
    double fiyatHesapla(double fiyat){
        return fiyat*1.18;
    }
    int ciltNoGüncelle(int ciltNo){
        this.ciltNo = ciltNo;
        System.out.println("Guncel Cilt No : "+ ciltNo);
        return this.ciltNo;
    }

    /**
     * @return the yazar
     */
    public String getYazar() {
        return yazar;
    }

    /**
     * @param yazar the yazar to set
     */
    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the basimYili
     */
    public String getBasimYili() {
        return basimYili;
    }

    /**
     * @param basimYili the basimYili to set
     */
    public void setBasimYili(String basimYili) {
        this.basimYili = basimYili;
    }

    /**
     * @return the sayfaSayisi
     */
    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    /**
     * @param sayfaSayisi the sayfaSayisi to set
     */
    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    /**
     * @return the yayinEvi
     */
    public String getYayinEvi() {
        return yayinEvi;
    }

    /**
     * @param yayinEvi the yayinEvi to set
     */
    public void setYayinEvi(String yayinEvi) {
        this.yayinEvi = yayinEvi;
    }

    /**
     * @return the fiyat
     */
    public double getFiyat() {
        return fiyat;
    }

    /**
     * @param fiyat the fiyat to set
     */
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    /**
     * @return the ciltNo
     */
    public int getCiltNo() {
        return ciltNo;
    }

    /**
     * @param ciltNo the ciltNo to set
     */
    public void setCiltNo(int ciltNo) {
        this.ciltNo = ciltNo;
    }
}
