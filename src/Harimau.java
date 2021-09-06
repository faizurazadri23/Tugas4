public class Harimau extends Binatang {

    public Harimau(){
        System.out.println("Inside Harimau: constructor");
        setNama("Panthera");
        setAlamat("Sumatera");
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
        System.out.println("Harimau " +super.mata);
    }

    @Override
    public void lari() {
        System.out.println("Harimau " +super.kaki);
    }
}
