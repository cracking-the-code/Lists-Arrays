public class IsUnique {

    public IsUnique(){}

    public String getDescription(){
        return "Implement an algorithm to determine if a string has all unique " +
               "\n characters. What if you cannot use additional data structures?";
    }

    boolean isUniqueChars(String str){

        if(str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val] == true)
                return false;
            char_set[val] = true;
        }

        return true;

    }

}
