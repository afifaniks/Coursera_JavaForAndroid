package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here
        int res =0;
        switch (operation) {
            case 1:
                res = new Add(argumentOne, argumentTwo).operation();
                mOut.print(res+"");
                break;
            case 2:
                res = new Subtract(argumentOne, argumentTwo).operation();
                mOut.print(res+"");
                break;
            case 3:
                res = new Multiply(argumentOne, argumentTwo).operation();
                mOut.print(res+"");
                break;
            case 4:
                if (argumentTwo == 0) {
                    mOut.print("Illegal argument");
                } else{
                    int res2[] = new Divide(argumentOne,argumentTwo).operation();
                    mOut.print(res2[0] + " R: " + res2[1]);
                }
                break;
        }
    }
}
