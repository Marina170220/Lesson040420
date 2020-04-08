package KompjuterIya.Lesson040420;

public class Task8 {
    public static void main(String[] args) {

        String stringOfSymbols = "Fun5/&_2>,Ke@nbtIu&$#9*1+__/EqXI-cmnv:j&4n#@))Gfsru,";
        String newString = new String();
        //char buffer;

        for (int i = 0; i < stringOfSymbols.length(); i++) {
            //buffer = stringOfSymbols.charAt(i);
            if (newString.indexOf(stringOfSymbols.charAt(i)) == -1) {
                newString = newString + stringOfSymbols.charAt(i);
            }
        }
        System.out.println(newString);
    }
}




