public class StringCalculator {

    private String message;

    public StringCalculator(){
        message = "5,2";
    }
    public StringCalculator(String m){
        message = m;
    }
    public static int add(String numbers) throws Exception {

        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            if (Integer.parseInt(numbersArray[0]) < 0 || Integer.parseInt(numbersArray[1]) < 0){
                throw new Exception("Negatives not allowed");
            }

            if (Integer.parseInt(numbersArray[0]) > 1000) {
                numbersArray[0] = "0";
            }
            if (Integer.parseInt(numbersArray[1]) > 1000) {
                numbersArray[1] = "0";
            }

            for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                    returnValue+=Integer.parseInt(number.trim()); // If it is not a number, parseInt will throw an exception
                }
            }
        }
        return returnValue;

    }
}
