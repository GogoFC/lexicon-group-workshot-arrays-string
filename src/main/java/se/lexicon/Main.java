package se.lexicon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] initialNames = {"Jackie M", "Goran M", "Manprit Kumar", "Attila B" };
        NameRepository.setNames(initialNames);

        String addingName = "John Smith";
        //String addingName2 = "Goran M";
        //NameRepository.add(addingName2);
        NameRepository.add(addingName);

        NameRepository.remove("John Smith");
        NameRepository.remove("John Nonexistent");
        String[] names = NameRepository.findAll();

        System.out.println(Arrays.toString(names));
        //NameRepository.clear();
        //System.out.println(Arrays.toString(names) + "cleared");

        //System.out.println(NameRepository.getSize());
        //System.out.println(Arrays.toString(NameRepository.findByFirstName("Goran")));


    }
}