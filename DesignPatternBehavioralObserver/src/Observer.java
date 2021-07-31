public abstract class Observer {
    protected NewMusic subject;

    public Observer(NewMusic subject) {
        this.subject = subject;
    }

    public abstract void update();
}