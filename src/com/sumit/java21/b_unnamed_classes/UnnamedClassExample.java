    void main(){
        System.out.println("Instance Main Method");
        staticTest();
        instanceTest();
    }

    // if we will uncomment this TMM then it will take precedence over IMM
    /*public static void main(String[] args) {
        System.out.println("Traditional Main Method");
        staticTest();
        //instanceTest();       // not allowed in Traditional Main Method
    }*/

    public static void staticTest(){
        System.out.println("static test method");
    }

    public void instanceTest(){
        System.out.println("instance test method");
    }
