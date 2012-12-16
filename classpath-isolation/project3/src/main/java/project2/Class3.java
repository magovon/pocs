package project2;

import luis.poc.classisolation.project1.Class1;
import luis.poc.classisolation.project1.MyClass1;
import luis.poc.classisolation.project2.Class2;
import luis.poc.classisolation.project2.MyClass2;

import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created with IntelliJ IDEA.
 * User: mago
 * Date: 12/9/12
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class Class3 {

    private static MyClass1 class1;
    private static MyClass2 class2;


    static {


        try {
            System.out.println("Static init of Class 3");
            System.out.println("Instantiating Class 1");
            class1 = (MyClass1) InitialContext.doLookup("java:jboss/exported/classpath-isolation-ear1/project1-1.0/Class1!luis.poc.classisolation.project1.MyClass1");
            class1.invoke();
            System.out.println("Instantiating Class 2");
            class2 = (MyClass2) InitialContext.doLookup("java:jboss/exported/classpath-isolation-ear2/project2-1.0/Class2!luis.poc.classisolation.project2.MyClass2");
            class2.invoke();
            class2.invoke2();
        } catch (NamingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
