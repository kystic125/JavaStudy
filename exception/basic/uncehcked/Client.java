package exception.basic.uncehcked;

public class Client {
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
