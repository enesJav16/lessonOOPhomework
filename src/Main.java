import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String [] lessons={"Java","Js","English"};
        MyClass person1=new MyClass("enes","marat uulu",20);
        MyClass person2=new MyClass(lessons,"Fried chicken");

        System.out.println("Person 1 name: "+person1.name+"\nPerson 1 surname: "+person1.surname+"\nPerson 1 age: "+person1.age);
        System.out.println("Person 2 lessons: "+ Arrays.toString(person2.lessons)+"\nPerson 2 favourite food: "+person2.favFood);
    }
}