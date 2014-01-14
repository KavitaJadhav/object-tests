
public class StringEqual {
    public boolean equals(String str1,String str2){
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        String str1 = "samiksha";
        String str2 = new String("samiksha");
        StringEqual st = new StringEqual();
        System.out.println(st.equals(str1,str2));
    }
}
