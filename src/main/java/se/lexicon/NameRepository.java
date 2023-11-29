package se.lexicon;

import java.util.Arrays;

public class NameRepository {
    private static String[] names = new String[0];

    public static int getSize(){
        return names.length;
    }

    public static void setNames(String[] names) {
        NameRepository.names = names;
    }

    public static void clear() {
        String[] temp = new String[0];
        names = temp;
    }

    public static String[] findAll() {
        return names;
    }

    public static String find(final String fullName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(fullName))
                return names[i];
        }
        return null;
    }

    public static boolean add(final String fullname) {
        if (find(fullname) != null) return false;

        String[] newOne = {fullname};
        names = merge(names, newOne);
        return true;
    }

    public static String[] findByFirstName(final String firstName) {
        String[] found = new String[0];
        for (int i = 0; i < names.length; i++) {
            String[] fullName = names[i].split(" ");
            if(!fullName[0].equalsIgnoreCase(firstName))
                continue;
            String[] newFound = {names[i]};
            found = merge(found, newFound);
        }
        return found;
    }


    public static String[] findByLastName(final String lastname) {
        String[] found = new String[0];
        for (int i = 0; i < names.length; i++) {
            String[] fullName = names[i].split(" ");
            if(!fullName[1].equalsIgnoreCase(lastname))
                continue;
            String[] newFound = {names[i]};
            found = merge(found, newFound);
        }
        return found;
    }

    public static boolean remove(final String fullname) {
        String[] newArr = new String[names.length -1];
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(fullname))
                continue;
            newArr[i] = names[i];
        }
        names = newArr;
        return true;
    }


    /**
     *
     * helper method
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public static String[] merge(String[] arr1, String[] arr2) {

        String[] newArr = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for (int i = arr1.length, j=0; i < newArr.length; i++, j++) {
            newArr[i] = arr2[j];
        }
        return newArr;
    }

}
