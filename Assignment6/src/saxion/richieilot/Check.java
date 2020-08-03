package saxion.richieilot;

import java.util.ArrayList;

public class Check {
    private static ArrayList<String> supportedOps = new ArrayList<>();

    public static void setSupportedOps(){
        supportedOps.add("+");
        supportedOps.add("-");
        supportedOps.add("*");
        supportedOps.add("/");
        supportedOps.add("ln");
        supportedOps.add("sqrt");
        supportedOps.add("sin");
    }

    public static void setSupportedOps(ArrayList<String> ops){
        for (int i = 0; i < ops.size(); i++) {
            supportedOps.add(ops.get(i));
        }
    }

    public static boolean number(String element){
        try {
            Double.parseDouble(element);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

    public static boolean supportedOp(String element){ //TODO: not used yet
        setSupportedOps();
        for (String s:
                supportedOps ) {
            if(element.contains(s))
                return true;
        }
        return false;
    }

    public static ArrayList<String> getSupportedOps() {
        return supportedOps;
    }
}
