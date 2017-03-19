/**
 * Created by Chris on 3/19/2017.
 * Keep in mind that this is learning area for me and will be heavily commented (not what I would do
 * in production code.
 */
public class skillsTester {

  /*Will run with String args[] or String arg[]
  or String[] args or String[] arg.


   */
  public static void main(String[] arg) {
    System.out.println("rfun with args");
  }

  public void test(float hi[]) {

  }

  //This does not compile because the method below has
  //the same signature as the method above main(String[]).
  //Produce compile time error.
  /*public static void main(String arg[]) {
    System.out.println("run with args");
  }*/
}
