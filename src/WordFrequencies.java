import java.util.*;
import edu.duke.*;
public class WordFrequencies {
    private ArrayList<String> myWords;
    private ArrayList<Integer> frequencies;

    public WordFrequencies() {
        myWords = new ArrayList<>();
        frequencies = new ArrayList<>();
    }

    public void findUnique()
    {
        FileResource fr = new FileResource();

        for(String s : fr.words())
        {
            s = s.toLowerCase();
            int index = myWords.indexOf(s);
            if(!myWords.contains(s))
            {
                myWords.add(s);
                frequencies.add(1);
            } else {
                frequencies.set(index, frequencies.get(index)+1);
            }
        }
    }

    public int get_size_myWords()
    {
        return myWords.size();
    }

    public ArrayList<String> get_str_myWords()
    {
        return myWords;
    }

    public ArrayList<Integer> get_freqs()
    {
        return frequencies;
    }

}


