import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> words_a = new ArrayList<String>();
        words_a.add("an");
        words_a.add("band");
        words_a.add("band");
        words_a.add("abandon");
        WordChecker a = new WordChecker(words_a);
        System.out.println(words_a);
        System.out.println(a.isWordChain());
        System.out.println();

        ArrayList<String> words_b = new ArrayList<String>();
        words_b.add("to");
        words_b.add("too");
        words_b.add("stool");
        words_b.add("tools");
        WordChecker b = new WordChecker(words_b);
        System.out.println(words_b);
        System.out.println(b.isWordChain());
        System.out.println();

        ArrayList<String> words_x = new ArrayList<String>();
        words_x.add("catch");
        words_x.add("bobcat");
        words_x.add("catchacat");
        words_x.add("cat");
        words_x.add("at");


        System.out.println(words_x);

        WordChecker x = new WordChecker(words_x);
        
        
        System.out.println(x.createList("cat"));

        System.out.println(x.createList("catch"));

        System.out.println(x.createList("dog"));
    }
}
