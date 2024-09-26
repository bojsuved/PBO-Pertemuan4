public class Main {
    public static void main(String[] args) {
        Handphone[] daftarHandphone = new Handphone[2];

        daftarHandphone[0] = new Smartphone("Iphone", "Pro Maxing 12");
        daftarHandphone[1] = new FeaturePhone("Huawei", "Tab Mate2");

        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.matikan();
            System.out.println();
        }

        for (Handphone hp : daftarHandphone) {
            if (hp instanceof Smartphone) {
                ((Smartphone) hp).aksesInternet();
            } else if (hp instanceof FeaturePhone) {
                ((FeaturePhone) hp).mainGameSnake();
            }
        }
    }
}