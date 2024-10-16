import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();

        words.add("catch");
        words.add("bobcat");
        words.add("catchacat");
        words.add("cat");
        words.add("at");


        System.out.println(words);

        WordChecker x = new WordChecker(words);
        
        
        System.out.println(x.createList("cat"));

        System.out.println(x.createList("catch"));

        System.out.println(x.createList("dog"));
    }
}
