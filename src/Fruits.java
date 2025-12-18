import java.util.*;

class Apple {
    void show() {
        System.out.println("Apple");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("Banana");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("Cherry");
    }
}

public class Fruits {
    public static void main(String[] args) {
        Apple a = new Apple();
        Apple b = new Banana();
        Apple c = new Cherry();

        a.show();
        b.show();
        c.show();
    }
}
