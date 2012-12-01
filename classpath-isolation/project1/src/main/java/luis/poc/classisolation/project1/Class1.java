package luis.poc.classisolation.project1;

import luis.poc.classpathisolation.library.DummyLibrary;
/**
 * Created with IntelliJ IDEA.
 * User: mago
 * Date: 12/1/12
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Class1 {

    public Class1() {
        final DummyLibrary dummyLibrary = new DummyLibrary();
        dummyLibrary.doNothing1();
    }
}
