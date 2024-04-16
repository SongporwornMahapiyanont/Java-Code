package Interface;

/**
 * InterfaceClass
 */
public interface InterfaceClass {
    int value = 199;
    void sayHello();
    int sayInterger();
}

class simple implements InterfaceClass{
    public void sayHello(){
        System.out.println("Hello World!");
    }
    public int sayInterger(){
        return 100;
    }
}

class program{
    public static void main(String[] args) {
        simple s = new simple();
        s.sayHello();
        System.out.println(s.sayInterger()+150);
    }
}