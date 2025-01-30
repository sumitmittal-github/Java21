public class IMM_Example {

    /*public static void main(String[] args) {
        System.out.println("Traditional Main Method");
    }*/

    void main(){
        System.out.println("Instance Main Method");
        staticMethod();
        instanceMethod();
    }

    static void staticMethod(){
        System.out.println("static method");
    }

    void instanceMethod(){
        System.out.println("instance method");
    }

}