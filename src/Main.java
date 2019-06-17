public class Main {

    public static void main(String[] args)
    {
        IsUnique unique = new IsUnique();
        CheckPermutation per = new CheckPermutation();

        System.out.println("Hello World!");
        System.out.println(unique.getDescription());
        System.out.println(unique.isUniqueChars("abcdefghijklmnopqrstuvwxyz"));

        System.out.println(per.getDescription());
    }
}
