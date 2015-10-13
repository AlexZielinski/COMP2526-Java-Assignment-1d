package ca.bcit.cst.comp2526.assignment1d;

/**
 * Class MultiplicationCalculator extends Calculator.
 * 
 * @author Alex Zielinski
 */
public class MultiplicationCalculator extends Calculator
{
    private String type;
    /**
     * Constructor.
     * 
     * @param s for calculator type
     */
    public MultiplicationCalculator(String s)
    {
        // calls parent constructor
        super(s);
        type = s;
    }
    
    /**
     * Method to return calculator type.
     * 
     * @return type
     */
    @Override
    public String getDescription()
    {
        return type;
    }
    
    /**
     * Method to return calculated value.
     * 
     * @param x     for row
     * @param y     for column
     * @return (x * y)
     */
    @Override
    public float calcValue(int x, int y)
    {
        return (x * y);
    }
}
