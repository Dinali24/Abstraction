abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle!!");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Circle!!");
    }
}
class Test {
    public static void main(String[] args) {
        Shape r =new Rectangle();
        r.draw();
        Shape c = new Circle();
        c.draw();

    }
}
