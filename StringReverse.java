public class StringReverse {

    public static void main(String[] args) {
            String name = "A man, a plan, a canal: Panama";
        System.out.println(rev(name));
    }


    static String rev(String s ){

        String noSpaceStr = s.replaceAll("[^a-zA-Z0-9]", "");
        String rev="" ;

        for (int i = 0; i <noSpaceStr.length(); i++) {
            char c = noSpaceStr.charAt(i);
            rev = c+rev;
        }


        return rev;
    }
}
