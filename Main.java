import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();

        words.add("D");
        words.add("Du");
        words.add("Duc");
        words.add("Duck");



        System.out.println(words);

        WordChecker x = new WordChecker(words);
        System.out.println(x.getwordList());
        boolean wordChecker = x.isWordChain();
        System.out.println(wordChecker);
    }
}