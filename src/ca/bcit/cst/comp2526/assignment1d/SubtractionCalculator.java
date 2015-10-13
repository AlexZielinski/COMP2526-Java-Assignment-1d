package ca.bcit.cst.comp2526.assignment1d;

/**
 *Class SubtractionCalculator extends Calculator.
 * 
 * @author Alex Zielinski
 */
public class SubtractionCalculator extends Calculator
{
    private String type;
    /**
     * Constructor.
     * 
     * @param s for calculator type
     */
    public SubtractionCalculator(String s)
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
     * @return (y - x)
     */
    @Override
    public float calcValue(int x, int y)
    {
        return (y - x);
    }
}
