package ca.bcit.cst.comp2526.assignment1d;

/**
 * Abstract class Calculator.
 * 
 * @author Alex Zielinski
 */
public abstract class Calculator
{

    /** Stores type of calculator as string */
    private String calcType;
    
    /**
     * Constructor.
     * 
     * @param s for calculator type
     */
    protected Calculator(String s)
    {
        calcType = s;
    }

    /**
     * Method to return calculator type.
     * 
     * @return description
     */
    public String getDescription()
    {
        return calcType;
    }

    /**
     * Abstract method to return value from specific row and column.
     * 
     * @param x     for row
     * @param y     for column
     * @return value
     */
    public abstract float calcValue(int x, int y);
}
