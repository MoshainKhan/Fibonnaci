package sparta.mk;


public class App 
{
    public static Integer FibbSeqNumber(Integer position) {
        Integer FibbonacciTotal = 0;
        //position == null
        if (position == null) {
            return 0;
        } else if (position <= 0) {
            FibbonacciTotal = 0;
            //Base case
        } else if (position <= 2) {
            FibbonacciTotal = 1;
        } else {
            //Recursive
            return FibbSeqNumber(position - 1) + FibbSeqNumber(position - 2);
        }
        return FibbonacciTotal;

    }
}
