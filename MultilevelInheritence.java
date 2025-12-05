class GrandFather{
    void grandfather() {
        System.out.println("I am GrandFather");
    }
}
class Father extends GrandFather { 
    void father() {
        System.out.println("I am Father");
    }
}
class Son extends Father { 
    void son() {
        System.out.println("I am Son");
    }
}
class Multilevelinheritence{
    public static void main(String args[]){
        Son s=new Son();
        s.son();
        s.father();
        s.grandfather();
    }
}