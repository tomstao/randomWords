
public class Test extends Main{

    public static void testWf()
    {
        WordFrequencies wf = new WordFrequencies();
        wf.findUnique();
        System.out.println("# Unique words: " + wf.get_size_myWords());

        for (int i = 0; i < wf.get_size_myWords(); i++)
        {
            System.out.println(wf.get_str_myWords().get(i) + "\t" +
                    wf.get_freqs().get(i));
        }

    }
}
