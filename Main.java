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

    int area() {
        return width * height;
    }

    boolean contains(Rectangle r) {
        if (x <= r.x && y <= r.y && x + width >= r.x + r.width && y + height >= r.y + r.height) {
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각혐",x,y,width,height);
    }
}

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();

        r1.setRectangle(2, 2, 8, 7);
        r1.show();
        System.out.println("");

        r2.setRectangle(5, 5, 6, 6);
        r2.show();
        System.out.println("");

        r3.setRectangle(1, 1, 10, 10);
        r3.show();
        System.out.println("");

        System.out.println("r의 면적은 " + r1.area());

        if(r1.contains(r2)){
            System.out.println("t는 r을 포함합니다.");
        } else {
            System.out.println("t는 r을 포함하지않습니다.");
        }
    }
}