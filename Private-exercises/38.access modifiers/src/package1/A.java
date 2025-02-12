package package1;
import package2.*;

public class A {
    public static void main(String[] args) {

        //  Modifier  Class   Package     Subclass    World
        //--------------------------------------------------
        //  public      Y        Y            Y         Y
        //  protected   Y        Y            Y         N
        //  no modifier Y        Y?           N         N
        //  private     Y        N            N         N

        C c = new C();
        System.out.println(c.defaultMessage); //Not possible do access a different package
        System.out.println(c.publicMessage); //Possible because is public
        System.out.println(c.protectedMessage); //Not possible only a subclass can access it
        B b = new B();
        System.out.println(b.privateMessage);//Not possible. Not in the same class


    }
}
