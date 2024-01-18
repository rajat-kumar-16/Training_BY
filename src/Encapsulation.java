class Par{
    private int id;
    private String name;
    void setName(String name){
        this.name=name;
    }
    void setId(int id){
        this.id=id;
    }
    String getName(){
        return name;
    }
    int getId(){
        return id;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Par a= new Par();
        a.setName("Rajat");
        a.setId(2002);
        System.out.println(a.getName());
        System.out.println(a.getId());
    }
}
