package luis.poc.classisolation.project2;

import luis.poc.classisolation.project1.Class1;
import luis.poc.classisolation.project1.MyClass1;
import luis.poc.classpathisolation.library.DummyLibrary;

import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created with IntelliJ IDEA.
 * User: mago
 * Date: 12/1/12
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
@Remote
@Stateless
public class Class2 implements MyClass2 {

    public Class2()  {

    }

    @Override
    public void invoke() {
        final DummyLibrary dummyLibrary = new DummyLibrary();
        dummyLibrary.doNothing2();
        System.out.println("Invoked dummyLibrary.doNothing2 from Class 2");
    }

    @Override
    public void invoke2() throws NamingException {
        MyClass1 class1 = (MyClass1) InitialContext.doLookup("java:jboss/exported/classpath-isolation-ear1/project1-1.0/Class1!luis.poc.classisolation.project1.MyClass1");
        class1.invoke();
    }
}
