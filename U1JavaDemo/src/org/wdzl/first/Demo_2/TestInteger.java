package org.wdzl.first.Demo_2;

public class TestInteger {
    public static void main(String[] args) {
        Converter converter1 =  Integer::valueOf;
        Converter converter2 = from -> "fkit.org".indexOf(from);
        Integer val = converter2.convert("it");
        System.out.println(val);
    }
}
interface Converter {
    Integer convert(String from);

}

