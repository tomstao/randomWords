import java.util.*;
import edu.duke.*;
public class WordFrequencies {
    private ArrayList<String> myWords;
    private ArrayList<Integer> frequencies;

    public WordFrequencies() {
        myWords = new ArrayList<String>();
    }

    public void findUnique()
    {
        FileResource fr = new FileResource();

        for(String s : fr.words())
        {
            if(!myWords.contains(s))
            {   s = s.toLowerCase();
                myWords.add(s);
            }
        }


    }


}
