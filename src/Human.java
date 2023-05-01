abstract class Human {
    Human(){
        System.out.println("Constructor is Running!");
    }
    abstract void eat();
    abstract void walk();
    void breathing(){
        System.out.println("Breathing!!");
    }
}
class Man extends Human {
    @Override
    void eat() {
        System.out.println("Anthing Eat");
    }

    @Override
    void walk() {
        System.out.println("Any kind of Walk!");
    }

    @Override
    void breathing() {
        super.breathing();
        System.out.println("Lab Dab!!");
    }
}
class Dinali extends Man{
    @Override
    void breathing() {
        super.breathing();
        System.out.println("Dinalii Breathing!!");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Dinali Eating!!");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Running!!");
    }
}
class Running {
    public static void main(String[] args) {
       Human h = new Man();
       Human h1 = new Dinali();
       Man m = new Dinali();
       h.eat();
       h.breathing();
       h1.walk();
       h1.breathing();
       m.eat();
       m.walk();
       m.breathing();


    }
}

