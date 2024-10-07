import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException{
        System.out.println(" ");
        Student student1 = new Student("Ron");
        Constructor[] constructors = student1.getClass().getConstructors();
        Object student2 = constructors[0].newInstance("Sasha");

        Field[] fieldsStudent2 = student2.getClass().getFields();
        int tmp = fieldsStudent2[fieldsStudent2.length-1].getInt(student2);
        fieldsStudent2[fieldsStudent2.length -1].setInt(student2, tmp * 2);
        System.out.println(student2);
        fieldsStudent2[fieldsStudent2.length -2].set(student2, "New name");
        System.out.println(student2);
        fieldsStudent2[fieldsStudent2.length -1].set(student2, 5);
        System.out.println(student2);
    }
}