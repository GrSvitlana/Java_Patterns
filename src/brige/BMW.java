package brige;

public class BMW implements Models {

    @Override
    public void drive(String str) {
        System.out.println(str + " BMW");
    }
}