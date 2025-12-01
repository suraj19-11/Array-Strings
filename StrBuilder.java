public class StrBuilder {

    //Print a to z using String builder 
    public static void AtoZ(){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);
        }
     System.out.println(sb);
    }

    //For a given string convert each the 1st letter of each to Uppercase
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "i love myself";
       System.out.println( toUpperCase(str));
    }
}
