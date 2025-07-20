package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

//        int extIndex = str.indexOf(ext);
        String fileName = str.substring(0, str.indexOf(ext));
        String extName = str.substring(str.indexOf(ext));

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
