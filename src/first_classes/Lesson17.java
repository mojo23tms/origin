package first_classes;


/**
 * public = access modifier; defines using of internal methods
 * class = define a class object; filename should match the classname
 */
public class Lesson17 {

    /**
     * methods = group of operation; usefull for code reusing and more readability
     * main = name for method representing; starting method for running java programs
     * static = ***
     * void = keyword for methods that return nothing
     * () = parameters braces
     * String[] args = String array with name 'args'
     */
    public static void main(String[] args){
        /**
         * System = inbuild class in java representing computer system
         * out = attribute in a system for outputting
         * println = printing method/function of the 'out'
         */
        System.out.println("Hi, i'm trying!");

        /**
         * Declaring variable:
         * int = data type (numbers)
         * var = name of the variable
         */
        int var;

        /**
         * Define variable
         * var = DECLARED variable name
         * 123 = value of DATA TYPE
         */
        var = 123;

        /**
         * One line defining
         */
        int varDef = 15;

        /**
         * Primitives:
         * Whole numbers: byte, short, int, long
         * Floating point numbers: float, double
         * Boolean
         * Text types: char
         * {
         *     - byte  // 1 byte	// Stores whole numbers from -128 to 127
         *     - short // 2 bytes	// Stores whole numbers from -32,768 to 32,767
         *     - int   // 4 bytes	// Stores whole numbers from -2,147,483,648 to 2,147,483,647
         *     - long	// 8 bytes	// Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         *
         *     - float	// 4 bytes	// Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
         *     - double	// 8 bytes	// Stores fractional numbers. Sufficient for storing 15 decimal digits
         *     - boolean // 1 bit	// Stores true or false values
         *     - char	// 2 bytes	// Stores a single character/letter or ASCII values
         * } */

        byte myBirthDay = 17;
        byte myBirthMonth = 3;
        short myBirthYear = 1998;
        int ukrainianPopulation = 44130000;
        long worldPopulation = 7980000000L;

        float piValue = 3.1415926F;

        double planksConstant = 6.626070040e-35;

        boolean isJavaCool = true;
        char emailSymbol = '@';

        System.out.println("My birth date: " + myBirthDay + "/" + myBirthMonth + "/" + myBirthYear);

        /**
         * Primitives Conversion:
         * - Automatic conversion (widening):
         * byte -> short/char -> int -> long -> float -> double
         * - Explicit conversion (narrowing):
         * reversed conversion; causes dataloss
         * desiredDataType newVarName = (desiredDataType) value OR otherVariableName
         */

        int newChar = emailSymbol;
        System.out.println(newChar);
        emailSymbol = (char) newChar;
        System.out.println(emailSymbol);

        /** Object references:
        * Whole numbers: Byte, Short, Integer, Long
        * Floating point numbers: Float, Double
        * Boolean
        * Text types: Character, String
        * Build-in and custom: FileWriter, BlueWhale, ATMMachine
        *
        * VARIABLES NAMING CONVENTION:
        * - case-sensitive
        * - can't be declared two times with same name
        * - must start with letter, $ or _
        * - can contain numbers
        * - can't be equal to reserved keywords of java:
        * abstract	assert	boolean	break	byte	case
        * catch	char	class	const	continue	default
        * double	do	else	enum	extends	false
        * final	finally	float	for	goto	if
        * implements	import	instanceof	int	interface	long
        * native	new	null	package	private	protected
        * public	return	short	static	strictfp	super
        * switch	synchronized	this	throw	throws	transient
        * true	try	void	volatile	while
        * - name in camelCase: ex.'nameOfTheVar'
        * - fully described what var contains
        * - don't use abbreviations without critical need
        *
        */
    }

}
