package buzz;


/**
 * BuzzFizzService
 *
 * @author Arvind Kumar
 *
 */
public class BuzzFizzService {

    private static final String BUZZ = "Buzz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZFIZZ = "BuzzFizz";

    /**
     * <p>Generates and prints numbers and their respective phrases
     * </p>
     * @param numberUpto number 0 to range
     */
    public static void generateFizzBuzz(int numberUpto) throws IllegalArgumentException {

        if(numberUpto<0)
            throw new IllegalArgumentException("numberUpto can be less than 0");

        for(int counter=1;counter<=numberUpto;counter++)
        {
            String printVal = getTheNumberPhrase(counter);
            System.out.println(printVal);
        }
    }
    /**
     * <p>Generates the phrase for number
     * </p>
     * @param numberVal number thats to convert to phrase
     * @return phrase or number
     */
    static String getTheNumberPhrase(int numberVal) {

        boolean divisibleOrAvailable5=numberVal%5==0;
        boolean divisibleOrAvailable3=numberVal%3==0;

        if(divisibleOrAvailable5 && divisibleOrAvailable3){
            System.out.println();
            return BUZZFIZZ;
        }

        int number=numberVal,remainder;
        while (number>0)
        {
            remainder=number%10;

            if (remainder == 5) divisibleOrAvailable5= true;
            if (remainder == 3) divisibleOrAvailable3= true;

            if(divisibleOrAvailable5 && divisibleOrAvailable3) {
                break;
            }

            number=number/10;
        }

        if(divisibleOrAvailable5 && divisibleOrAvailable3) {
            return BUZZFIZZ;
        } else if(divisibleOrAvailable5) {
            return  BUZZ;
        } else if(divisibleOrAvailable3) {
            return  FIZZ;
        }

        return Integer.toString(numberVal);

    }
}
