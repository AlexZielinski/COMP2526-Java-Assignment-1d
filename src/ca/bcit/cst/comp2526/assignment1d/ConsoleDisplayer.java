package ca.bcit.cst.comp2526.assignment1d;

/**
 * Class ConsoleDisplayer.
 * 
 * @author Alex Zielinski
 */
public class ConsoleDisplayer {
    
    /**
     * Default constructor.
     */
    public ConsoleDisplayer()
    {
        
    }
    
    /**
     * Method to display arithmetic table.
     * 
     * @param t for table
     */
    public void displayTable(Table t)
    {
        String s = "-----";
        String operator = t.getDescription();
        
        // if addition
        if(operator.equals("+"))
        {
            // creates addition table
            t.createAdditionTable();
            System.out.printf("\n");
       
            // prints operator
            System.out.printf("%5s", operator);

            // prints header numbers
            System.out.printf("  ");
            for (int i = 0; i < t.getSize(); i++)
                System.out.printf("%5d", (i + t.getStart()));

            System.out.printf("\n");

            // prints underline under header numbers
            System.out.printf("  ");
            for (int i = 0; i <= t.getSize(); i++)
                System.out.printf("%5s", s);

            System.out.printf("\n");
            
            // prints side column numbers and elements of array
            for (int row = 0; row < t.getSize(); row++)
            {
                System.out.printf("%5d |", row + t.getStart());
                for (int col = 0; col < t.getSize(); col++)
                    System.out.printf("%5.0f", t.getValueAt(row + t.getStart(), 
                                      col + t.getStart()));
            
                System.out.printf("\n");
            }
        }
        // if subtractions
        else if(operator.equals("-"))
        {
            // creates subtraction table
            t.createSubtractionTable();
            System.out.printf("\n");
            
            
            // prints operator
            System.out.printf("%5s", operator);

            // prints header numbers
            System.out.printf("  ");
            for (int i = 0; i < t.getSize(); i++)
                System.out.printf("%5d", (i + t.getStart()));

            System.out.printf("\n");

            // prints underline under header numbers
            System.out.printf("  ");
            for (int i = 0; i <= t.getSize(); i++)
                System.out.printf("%5s", s);

            System.out.printf("\n");
            
            // prints side column numbers and elements of array
            for (int row = 0; row < t.getSize(); row++)
            {
                System.out.printf("%5d |", row + t.getStart());
                for (int col = 0; col < t.getSize(); col++)
                    System.out.printf("%5.0f", t.getValueAt(row + t.getStart(), 
                                      col + t.getStart()));
            
                System.out.printf("\n");
            }
        }  
        // if division
        else if(operator.equals("/"))
        {
            // creates division table
            t.createDivisionTable();
            System.out.printf("\n");
            
            // prints operator
            System.out.printf("%5s", operator);

            // prints header numbers
            System.out.printf("  ");
            for (int i = 0; i < t.getSize(); i++)
                System.out.printf("%5d", (i + t.getStart()));

            System.out.printf("\n");

            // prints underline under header numbers
            System.out.printf("  ");
            for (int i = 0; i <= t.getSize(); i++)
                System.out.printf("%5s", s);

            System.out.printf("\n");
            
            // prints side column numbers and elements of array
            for (int row = 0; row < t.getSize(); row++)
            {
                System.out.printf("%5d |", row + t.getStart());
                for (int col = 0; col < t.getSize(); col++)
                    System.out.printf("%5.0f", t.getValueAt(row + t.getStart(), 
                                      col + t.getStart()));
            
                System.out.printf("\n");
            }
        }
        // else multiplication
        else
        {
            // creates multiplication table
            t.createMultiplicationTable(); 
            System.out.printf("\n");
            
            // prints operator
            System.out.printf("%5s", operator);

            // prints header numbers
            System.out.printf("  ");
            for (int i = 0; i < t.getSize(); i++)
                System.out.printf("%5d", (i + t.getStart()));

            System.out.printf("\n");

            // prints underline under header numbers
            System.out.printf("  ");
            for (int i = 0; i <= t.getSize(); i++)
                System.out.printf("%5s", s);

            System.out.printf("\n");
            
            // prints side column numbers and elements of array
            for (int row = 0; row < t.getSize(); row++)
            {
                System.out.printf("%5d |", row + t.getStart());
                for (int col = 0; col < t.getSize(); col++)
                    System.out.printf("%5.0f", t.getValueAt(row + t.getStart(), 
                                      col + t.getStart()));
            
                System.out.printf("\n");
            } 
        }
    }
}
