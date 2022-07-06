public abstract class Bird {
  public Bird() {}

  public void eat() {
    System.out.println(this + " bird is eating");
  }

  @Override
  public String toString() {
    return this.getClass().getName();
  }
}