public class MyClass {
    String name;
    String surname;
    int age;
    String [] lessons;
    String favFood;

    public MyClass(){}
    public MyClass(String name,String surname,int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    public MyClass( String[]lessons,String favFood){
        this.lessons=lessons;
        this.favFood=favFood;
    }
}
