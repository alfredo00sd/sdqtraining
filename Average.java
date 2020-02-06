package reto1;

import reto1.utils.Console;

import java.util.regex.Pattern;

/**
 * Give some values and you will receive the average of the values...
 * supporting Integral and decimals.
 * * */
public class Average extends Console {

    public static void main(String[] args) {

        final String DOUBLE_PATTERN = "[0-9]+(\\.)?[0-9]*";
        String prompt;
        double result = 0;

        formattedMsg("Tell me, the max of numbers.",true);

        prompt = SCANNER.nextLine();

        if (Pattern.matches(DOUBLE_PATTERN, prompt)) {

            int sizeOfList = Integer.parseInt(prompt);
            int[] list = new int[sizeOfList];

            formattedMsg("Enter your "+sizeOfList+" numbers to calculate",true);

            for(int i = 0; i < sizeOfList; i++){

                String value = SCANNER.nextLine();

                if(Pattern.matches(DOUBLE_PATTERN, value)){
                    list[i] = SCANNER.nextInt();
                }else{
                    error(value);
                }
            }

            for(int i = 0; i < sizeOfList; i++)
                result += list[i];

            formattedMsg("The average number is",true);
            System.out.println(".: "+result / sizeOfList+ " :.");

        }else {
            error(prompt);
        }
    }

    private static void error(String value){
        formattedMsg("the value: \'" + value + "\' is not allowed here",false);
    }
}
