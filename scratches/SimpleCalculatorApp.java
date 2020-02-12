public class SimpleCalculatorApp {
    public static void main(String[] args){
        int result=0;
        switch(args[1]){
            case "add":
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case "subt":
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case "mult":
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case "div":
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
        }
        System.out.print(result);
        int d;
    }
}