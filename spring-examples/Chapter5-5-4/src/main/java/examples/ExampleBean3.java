package examples;

public class ExampleBean3 {

    // a private constructor
    private ExampleBean3() {

    }

    // a static factory method; the arguments to this method can be
    // considered the dependencies of the bean that is returned,
    // regardless of how those arguments are actually used.
    public static ExampleBean3 createInstance ( AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
        ExampleBean3 eb = new ExampleBean3 ();
        // some other operations...
        return eb;
    }

}
