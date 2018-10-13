package controller;

public class Buttons {
	boolean isOperator;
    boolean isEquals;
    boolean isDot;
    boolean isNumber;
    boolean isClear;

    public void ButtonInfo (String buttonletters){

        readButtonValue(buttonletters);

    }

    private void readButtonValue(String buttonletters) {
        switch (buttonletters){
            case "C" : isClear = true; break;

            case "1" : isNumber = true; break;
            
            case "2" : isNumber = true; break;
            
            case "3" : isNumber = true; break;
            case "4" : isNumber = true; break;
            case "5" : isNumber = true; break;
            case "6" : isNumber = true; break;
            case "7" : isNumber = true; break;
            case "8" : isNumber = true; break;
            case "9" : isNumber = true; break;
            case "0" : isNumber = true; break;

            case "." :  isDot = true; break;

            case "+" : isOperator = true; break;
            case "-" :  isOperator = true; break;
            case "*" : isOperator = true; break;
            case "/" :  isOperator = true; break;
            case "=" : isEquals = true; break;

            default : System.out.println("BUTTON NOT FOUND!!");
        }

    }

    public boolean isNumber() {
        return isNumber;
    }

    public boolean isOperator() {
        return isOperator;
    }

    public boolean isEquals() {
        return isEquals;
    }

    public boolean isDot() {
        return isDot;
    }

    public boolean isClear() {
        return isClear;
    }

}
