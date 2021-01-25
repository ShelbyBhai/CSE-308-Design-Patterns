public abstract class Observer {
    protected Subject subject;
    public abstract void commonupdate();
    public abstract void updatefrom1to2();
    public abstract void updatefrom1to3();
    public abstract void updatefrom2to1();
    public abstract void updatefrom2to3();
    public abstract void updatefrom3to1();
    public abstract void updatefrom3to2();
}
