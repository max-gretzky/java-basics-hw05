import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  public static void feed(List<? extends Bird> list) {
    for (Bird value : list) {
      System.out.println("Feeding bird " + value);
    }
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    // TODO fix method declaration
    list.add(bird);
    bird.checkWings();

    System.out.println("Accepting a " + bird + " to a section");
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List<? super Bird> list, Bird newBird) {
    // TODO add a bird to list
    // TODO print birds in the cycle
    list.add(newBird);
    System.out.println("Adding a bird to the birds list");

    for (Object value : list) {
      System.out.println(value);
    }
  }
}