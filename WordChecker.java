import java.util.ArrayList;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;

    public WordChecker(ArrayList<String> list)
    {
        wordList = list;
    }

    public WordChecker()
    {
        wordList = new ArrayList<String>();
    }

    /**
     * Returns true if each element of wordList (except the first) contains the
     * previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    public boolean isWordChain() 
    {
        for(int i = 1; i < wordList.size(); i++)
        {
            String after = wordList.get(i);
            String before = wordList.get(i - 1);


            if(after.indexOf(before) < 0) return false;
        }
        
        //If it hasn't returned false, then this will make it return true
        return true;
    }

    /**
     * Returns an ArrayList<String> based on strings from wordList that start
     * with target, as described in part (b). Each element of the returned ArrayList
     * has had
     * the initial occurrence of target removed.
     * Postconditions: wordList is unchanged.
     * Items appear in the returned list in the same order as they appear in
     * wordList.
     */
    public ArrayList<String> createList(String target) 
    {
        ArrayList<String> createdList = new ArrayList<String>();
        
        int targetLen = target.length();

        for (String current : wordList)
        {
            //If the target string's element appears in the first elements of a word in the list, this bit of code adds said element from the list without the tatget's elements into a new list
            //If that condition isn't true, no new element gets added into the new list
            if (current.indexOf(target) == 0)
            {
                String add = current.substring(targetLen);

                createdList.add(add);
            }
            
        } 
        return createdList;
    }

    //This command will tell you what is inside the list
    public ArrayList<String> getwordList()
    {
        return wordList;
    }

}
