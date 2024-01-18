class Car{
    final int speed =100;
    // final works like constant also can do it to methods
    // when final is on Class we don't give acces to anyone
    // in private even child can't access it
    // private is not applicable on class
    void gare(){
        System.out.println("4 ");
    }

}
class BMW extends Car{
    void gare(){
        System.out.println("5 gare "+ "Speed is: "+speed);
        super.gare();
    }
}
class Final{
    public static void main(String args[]){
        Car c =new Car();
        //c.speed =2000;
        BMW b= new BMW();
        b.gare();
    }
}