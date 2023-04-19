package Practice1;

public class MethodPractice implements InNara {

    public static void main(String[] args) {

        MethodPractice nara = new MethodPractice();
        nara.king("narasimha", 99);
        nara.king1(88);
        nara.king("narasimha11", 999);
        nara.king1(888);
        nara.nara();
        nara.nara1();
        nara.nara2();
    }



        public void king(String aa, int nn) {
            System.out.println(nn + aa);
        }

        public void king1(int nn) {
            System.out.println(nn);
        }


    @Override
    public void nara() {
        System.out.println("Nara");
    }

    @Override
    public void nara1() {
        System.out.println("Nara1");

    }

    @Override
    public void nara2() {
        System.out.println("Nara2");

    }
}