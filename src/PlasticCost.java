import java.util.*;

class Sheet2D{
    double length, width;
    Sheet2D(double l, double w) {
        length = l;
        width = w;
    }
    double cost() {
        return length * width * 40;
    }
}

class Box3D extends Sheet2D{
    double height;
    Box3D(double l, double w, double h) {
        super(l, w);
        height = h;
    }
    double cost() {
        return length * width * height * 60;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        double l = sc.nextDouble();
        System.out.print("Enter width : ");
        double w = sc.nextDouble();
        System.out.print("Enter height : ");
        double h = sc.nextDouble();

        Sheet2D sheet = new Sheet2D(l, w);
        Box3D box = new Box3D(l, w, h);

        System.out.println("Cost of Sheet : " + sheet.cost());
        System.out.println("Cost of Box : " + box.cost());
    }
}
