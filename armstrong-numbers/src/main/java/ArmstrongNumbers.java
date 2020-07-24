class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String number = String.valueOf(numberToCheck);
        int lengthOfNumber = number.length();
        double sum = 0;
         
        for (char digit : number.toCharArray()) {
            sum += Math.pow(Double.parseDouble(String.valueOf(digit)), lengthOfNumber);
        }
        return sum == numberToCheck; 
    }

}
