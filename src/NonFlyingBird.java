public abstract class NonFlyingBird extends Bird{
    public NonFlyingBird() {}

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}