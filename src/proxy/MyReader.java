package proxy;

public class MyReader implements Reader {

    @Override
    public String read(String str) {
        return str + " world";
    }
}