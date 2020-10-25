import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        ComplexNumber a1 = new ComplexNumber(1.7, 2.1);
        ComplexNumber a2 = new ComplexNumber(2.1, 1.7);
        Object o1 = a1;
        a1 = (ComplexNumber)o1;
        Object o2 = a2;
        a2 = (ComplexNumber)o2;
        System.out.println(o1.hashCode() == o2.hashCode());
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());






/*        System.out.println(((ComplexNumber) c).getRe());
        System.out.println(((ComplexNumber) c).getIm());
        System.out.println(((ComplexNumber) d).getRe());
        System.out.println(((ComplexNumber) d).getIm());*/

    }
}
