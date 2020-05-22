package src.DesignPatternsLab.Singleton;

public class LazyInnerHolderClass {
    public LazyInnerHolderClass() {
    }

    private static class LazyHolder{
        static final LazyInnerHolderClass INSTANCE=new LazyInnerHolderClass();
    }

    public static LazyInnerHolderClass getInstance(){
        return LazyHolder.INSTANCE;
    }
}
