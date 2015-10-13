# COMP2526-Java-Assignment-1d

Comp 2526 Assignment #1d

------------------------------------------------------------------------------------------
Description:

You are to develop a program that prints out the multiplication, addition, subtraction 
or division table given the users start and end range and type of table. Now you are to 
add a new class ConsoleDisplayer which is responsible to display the output from ANY 
table (including any future tables defined). See Assignments #1a,#1b and #1c for further 
details.

Additionally you are going to remove the table subclasses since all they have is two minor 
differences between them. The Table subclasses will be replaced with a new class hierarchy 
that makes use of polymorphism to factor out the differences that were in the table 
subclasses.

Some classes:

class ConsoleDisplayer – should have a display table method that accepts ANY table type 
                         and displays it correctly.
    public void displayTable(Table table)
    Gets a table passed thru (super class)

Main – modify to use the ConsoleDisplayer class defined above.

Table – no longer abstract and no longer has the display method
    public Table(final int start, final int stop, final Calculator calc) (only constructor)
    public String getDescription()
    public int getStart()
    public int getSize()
    public float getValueAt(final int row, final int col)

Calculator – Abstract class with:
    protected Calculator(String s) (s is one of “+”, “-“, “*”, “/”)
    public String getDescription() (returns “+”, “-“, “*”, “/”) returns calculator type, 
    public abstract float calcValue(int x, int y) get value from a specific row and column

AdditionCalculator, SubtractionCalculator, MultiplicationCalculator, DivisionCalculator all 
extend from Calculator