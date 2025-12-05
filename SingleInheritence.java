class Parent {
    void parent() {
        System.out.println("This is Parent class");
    }
}
class Child extends Parent { 
    void child() {
        System.out.println("This is Child class");
    }
}

public class SingleInheritence{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.parent(); 
        obj.child();  
    }
}
