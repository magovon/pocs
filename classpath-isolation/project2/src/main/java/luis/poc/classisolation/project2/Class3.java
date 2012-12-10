package luis.poc.classisolation.project2;

import javax.ejb.Stateless;

/**
 * Created with IntelliJ IDEA.
 * User: mago
 * Date: 12/9/12
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class Class3 {

    private static final Class2 class2;

    static {
        System.out.println("Static init of Class 3");
        class2 = new Class2();
    }
}
