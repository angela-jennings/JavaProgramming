package day53_inheritance.hiding;

public class PhoneTests {
    public static void main(String[] args) {
        Phone ph = new Phone();
        CellPhone cp = new CellPhone();

        ph.call();
        cp.text();
        cp.call();
        cp.use();
    }
}
