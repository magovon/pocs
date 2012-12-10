package luis.poc.classisolation.project2;

import luis.poc.classisolation.project1.Class1;
import luis.poc.classpathisolation.library.DummyLibrary;

import javax.ejb.Singleton;
import javax.ejb.Stateless;

/**
 * Created with IntelliJ IDEA.
 * User: mago
 * Date: 12/1/12
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Class2 {

    public Class2()  {
        final DummyLibrary dummyLibrary = new DummyLibrary();
        dummyLibrary.doNothing2();
        final Class1 class1 = new Class1();
        System.out.println("Created instance of Class 2");
    }
}
