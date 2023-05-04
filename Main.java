/*
학번 : 202301741
이름 : 고선우
 */
class Rectangle {
    int x;
    int y;
    int width;
    int height;
    public void setRectangle(int a, int b, int c, int d) {
        x = a;
        y = b;
        width = c;
        height = d;
    }

    public int area() {
        return width * height;
    }

    public boolean contains(Rectangle r) {
        if (x <= r.x && y <= r.y && x + width >= r.x + r.width && y + height >= r.y + r.height) {
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        System.out.println("Rectangle: (" + x + ", " + y + ") - " + width + " x " + height);
    }
}

public class Main {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.setRectangle(2, 2, 8, 7);
        rect1.show();
        System.out.println("Area: " + rect1.area());

        Rectangle rect2 = new Rectangle();
        rect2.setRectangle(5, 5, 6, 6);
        rect2.show();
        System.out.println("Area: " + rect2.area());

        if (rect1.contains(rect2)) {
            System.out.println("rect1 contains rect2");
        } else {
            System.out.println("rect1 does not contain rect2");
        }
    }
}