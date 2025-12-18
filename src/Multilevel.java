import java.util.*;

class Plate{
    int length, width;
    Plate(int l, int w) {
        length = l;
        width = w;
    }
}

class Box extends Plate{
    int height;
    Box(int l, int w, int h) {
        super(l, w);
        height = h;
    }
}

class WoodBox extends Box{
    int thick;
    WoodBox(int l, int w, int h, int t){
        super(l, w, h);
        thick = t;
    }
    void display(){
        System.out.println(length + " " + width + " " + height + " " + thick);
    }
}

public class Multilevel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        int l = sc.nextInt();
        System.out.print("Enter Width : ");
        int w = sc.nextInt();
        System.out.print("Enter Height : ");
        int h = sc.nextInt();
        System.out.print("Enter Thick : ");
        int t = sc.nextInt();

        WoodBox wb = new WoodBox(l, w, h, t);
        wb.display();
    }
}
