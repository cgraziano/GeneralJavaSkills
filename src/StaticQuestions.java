import com.sun.javafx.css.Declaration;

/**
 * Created by Chris on 3/19/2017.
 * Keep in mind that this is learning area for me and will be heavily commented (not what I would do
 * in production code.
 */
public class StaticQuestions {
  private static int staticVariable;//initialized to default value. (int is 0)
                                    //The private keyword makes the variable not acceccible outside of this class.
                                    //The public keyword would make the variable acceccible within the class.
  int instanceVariable;//initialized to default value. (int is 0)

  public static void main(String[] args) {
    testDeclareFloatArray();
    int staticVariable = StaticQuestions.staticVariable;
    System.out.println("staticVariable = "+staticVariable);//can call static variable.
    System.out.println("staticVariable = "+ StaticQuestions.staticVariable);//can call static variable.

    StaticQuestions sq = new StaticQuestions();
    System.out.println("Call instance variable = "+sq.instanceVariable);//can call instance variable
    sq.testInstance();
  }

  public static void testDeclareFloatArray() {//Notice that the word static is required to use this method within the
                                              //main static method. If the static keyword is not used, the compile
                                              //time error is "non-static method testDeclareFloatArray() cannot be
                                              //referenced from a static context. This error exists because the
                                              //instance of the class StaticQuestions has not been created, so the runtime
                                              //has not reserved memory for that instance (otherwise, differenent instances
                                              //would override each other and that is not what you want.)"

                                              //A static method or variable is is known by the class, but is not known
                                              //by the instance of the class (which is why you can't tell a car to car.getCarType()
                                              //when getCarType is a static method.
    float[] floatArray = {1.0f,2.0f,3.0f};
    declareFloatArray(floatArray);
  }

  public static void declareFloatArray(float floatArray[]) {//notice declaration of float array with brackets after array name.
    int floatArrayLength = floatArray.length;
    float floatArray2[] = new float[floatArrayLength];//notice declaration of float array with brackets after array name.
    for (int i = 0; i < floatArrayLength; i++) {//notice that you can increment the variable "i" by 1 with the "++" after "i"
      floatArray2[i] = floatArray[i];
    }
    int counter = 0;
    for (float arrayElement : floatArray2) {//Notice how to looop through "floatArray2" by not declaring anything
                                            // besides the name of the float that the float elements of floatArray2 will
                                            // be stored in.
      System.out.println("floatArray2["+counter+"] = "+arrayElement);
      ++counter;//Notice that the variable counter can be incremented by placing a ++ before the name (opposite of
                //above with the i (both styles works).
    }
  }

  public void testInstance() {
    System.out.println("instanceVariable = " + instanceVariable);
    System.out.println("instanceVariable_this = " + this.instanceVariable);
  }

}
