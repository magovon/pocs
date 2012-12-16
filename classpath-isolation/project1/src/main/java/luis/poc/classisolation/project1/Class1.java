package luis.poc.classisolation.project1;

import luis.poc.classpathisolation.library.DummyLibrary;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Created with IntelliJ IDEA.
 * User: mago
 * Date: 12/1/12
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
@Remote
@Stateless
public class Class1 implements MyClass1 {

    public Class1() {

    }

    @Override
    public void invoke() {
        final DummyLibrary dummyLibrary = new DummyLibrary();
        dummyLibrary.doNothing1();
        System.out.println("Invoked dummyLibrary.doNothing1 from Class 1");
    }
}
