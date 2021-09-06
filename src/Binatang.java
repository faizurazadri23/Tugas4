public class Binatang {
    String kaki="Lari", mata="Melihat";
    private String nama;
    private String alamat;

    public Binatang(){
        System.out.println("Inside Binatang Constructor");
        nama="";
        alamat="";
    }

    public Binatang(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void makan(){
        System.out.println("Binatang Makan");
    }

    public void minum(){
        System.out.println("Binatang Minum");
    }

    public void lari(){
        System.out.println("Binatang Lari " + kaki);
    }

    public void melihat(){
        System.out.println("Binatang" + mata);
    }

    public void alamat(){
        System.out.println("Asal " + alamat);
    }
}
