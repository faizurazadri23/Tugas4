public class Kucing extends Binatang {

    public Kucing(){
        System.out.println("Inside Kucing: constructor");
        setNama("Muezza");
        setAlamat("Arab");
        System.out.println("Nama : " + getNama() + "\nAsal : " + getAlamat());
    }

    @Override
    public void makan() {
        super.makan();
    }

    @Override
    public void minum() {
        super.minum();
    }

    @Override
    public void melihat() {
        System.out.println("Kucing " +super.mata);
    }

    @Override
    public void lari() {
        System.out.println("Kucing " +super.mata);
    }

    @Override
    public void alamat() {
        super.alamat();
    }
}
