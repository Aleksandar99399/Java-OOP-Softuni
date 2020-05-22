package src.ReflectionAndAnnotationsLab.AnnotationsLab;

public class Foo {

    @Test("I have a very special name")
    public void foo(){
        System.out.println("testing foo");
    }

    @Test
    @Deprecated(since = "3.8", forRemoval = false)
    public void bar(){
        System.out.println("testing bar");
    }

    @Test
    public void zar(){
        System.out.println("testing zar");
    }
}
