import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflect {
    //反射对象
    public static void reflectObject() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> user = Class.forName("User");
        Object object = user.newInstance();
        User user1 = (User)object;
        user1.setUserName("hx76");
        user1.setPassword("123456");
        user1.printf();
    }
    //反射构造函数
    public static void reflectConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = User.class;
        Constructor constructor = c.getConstructor(String.class,String.class);
        User user = (User) constructor.newInstance("hx77","1234567");
        System.out.println(user.printf());
    }
    //反射属性
    public static void reflectPrivateField() throws Exception {
        Class c = User.class;
        Object object = c.newInstance();
        Field field1 = c.getField("TAG");
        String s = (String) field1.get(object);
        System.out.println(s);
    }
    //反射方法
    public static void reflectPrivateMethod() throws Exception{
        Class c = User.class;
        Object object = c.newInstance();
        Method method = c.getMethod("printf");
        System.out.println(method.invoke(object));
    }

    public static void main(String[] args) throws Exception {
        //reflectObject();
        reflectConstructor();
        reflectPrivateField();
        reflectPrivateMethod();
    }
}
