package xql.Tool;

public class ChangeTool {

    public static int changeToInt(String data){

        int i = -1;
        try {
            i = Integer.parseInt(data.trim());
        } catch (NumberFormatException e) {

        }
        return i;
    }


}
