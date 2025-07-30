package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter(); // x001
        InnerOuter.Inner inner = outer.new Inner(); // x001.new > x002
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
