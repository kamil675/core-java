public class strbuffer {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "Abc";
        System.out.println(str1.equals(str2));

        String str3 = "abc";
        System.out.println(str1.equals(str3));

        StringBuffer ac= new StringBuffer("kam");
        System.out.println(ac);
        ac.append("il");
        System.out.println(ac);
        ac.delete(0,2);
        System.out.println(ac);
        ac.insert(1, "q");
        System.out.println(ac);
    }
}
