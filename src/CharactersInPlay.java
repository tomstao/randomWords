import edu.duke.FileResource;

import java.util.ArrayList;

public class CharactersInPlay {
    private ArrayList<String> characters;
    private ArrayList<Integer> lines;

    public CharactersInPlay() {
        characters = new ArrayList<>();
        lines = new ArrayList<>();
    }

    public void update(String person) {
        person = person.toLowerCase();
        int index = characters.indexOf(person);
        if(!(characters.contains(person))) {
            characters.add(person);
            lines.add(1);
        } else {
            lines.set(index, lines.get(index) + 1);}
    }

    public void charactersWithNumParts(int num1, int num2) {

        for(int i = 0; i < characters.size(); i++) {
            if (lines.get(i) <= num2 && lines.get(i) >= num1) {
                System.out.println(characters.get(i) + " has " + lines.get(i));
            }
        }
    }


    public void findAllCharacters() {
        FileResource fr = new FileResource();
        characters.clear();
        lines.clear();
        for(String line : fr.lines()) {
//            if(line.charAt(2) == ' ') {
//                continue;
//            }
            int pIndex = line.indexOf('.');
            if(pIndex == -1) {continue;}
            String character = line.substring(0, pIndex);
            update(character);
        }

    }

    public void mostLinesChar(){
        int mostLines = 0;
        int index = 0;
        for(int i = 0; i < lines.size(); i++) {
            if(lines.get(i) > mostLines) {
                mostLines = lines.get(i);
                index = i;
            }
        }
        System.out.println("Character has the most lines: " + characters.get(index) + " of " + mostLines);
    }

    public void tester()
    {
        findAllCharacters();
        for(int i = 0; i<lines.size(); i++) {
            if(lines.get(i) > 1) System.out.println("Character " + characters.get(i) + " has " + lines.get(i) + " lines");
        }
        mostLinesChar();
        charactersWithNumParts(10,15);
    }

}
