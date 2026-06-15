import java.util.Scanner;

class Box {
    int length;
    int width;
    int height;

    public void setBox() {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER LENGTH OF THE BOX - ");
        length = s.nextInt();
        System.out.println("ENTER WIDTH  OF THE BOX - ");
        width = s.nextInt();
        System.out.println("ENTER HEIGHT OF THE BOX - ");
        height = s.nextInt();
    }

    public void getBox() {
        System.out.println("LENGTH - " + length);
        System.out.println("WIDTH  - " + width);
        System.out.println("HEIGHT - " + height);
    }
}

class ColoredBox extends Box {
    String color;

    public void setBoxColor() {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER YOUR BOX COLOR - ");
        color = s.next();
    }

    public void getBoxColor() {
        System.out.println("BOX COLOR - " + color);
    }
}

class ShippedBox extends ColoredBox{
    int weight;
    int shippingCost;

    public void setShippingCost(){
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER WEIGHT - ");
        weight = s.nextInt();
        shippingCost = weight * 50;
    }
    public void getShippedBox(){
        System.out.println("BOX WEIGHT - "+weight);
        System.out.println("SHIPPING COST - INR."+shippingCost);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        ShippedBox sb = new ShippedBox();
        sb.setBox();
        sb.setBoxColor();
        sb.setShippingCost();
        System.out.println("---------------------------------");
        sb.getBox();
        sb.getBoxColor();
        sb.getShippedBox();
    }
}