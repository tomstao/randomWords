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

        myWords.clear();
        frequencies.clear();

        for(String s : fr.words())
        {
            s = s.toLowerCase();
//            if(!(Character.isAlphabetic(s.charAt(0)))){
//                s = s.substring(1);
//            }
//
//            if(!(Character.isAlphabetic(s.charAt(s.length()-1)))){
//                s = s.substring(0, s.length()-1);
//            }
//
//            if(s.isEmpty()) continue;

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

    public int findIndexOfMax()
    {
        int maxIndex = 0;
        int max = 0;
        for(int i = 0; i < frequencies.size(); i++)
        {
            if (frequencies.get(i) > max) {
                maxIndex = i;
                max = frequencies.get(i);
            }
        }
        return maxIndex;
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


    public void testerWF()
    {
        findUnique();
        System.out.println("The number of unique words is: " + frequencies.size());

        for(int i = 0; i < myWords.size(); i++)
        {
            System.out.print("Word: " + myWords.get(i));
            System.out.println(". The frequency: " + frequencies.get(i));
        }

        System.out.println("The word has the greatest frequency is: " + myWords.get(findIndexOfMax())
        + " and the frequency is: " + frequencies.get(findIndexOfMax()));

    }

}


