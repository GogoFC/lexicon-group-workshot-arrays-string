package se.lexicon;

class nameRepository {
    private static String[] names = new String[0];

    public static void main(String[] args) {
        String[] Names = {"Manprit", "jackee", "Atila3"};

        // Set the names using the setNames method
        setNames(Names);
        System.out.println(getSize());
        findAll();
        clear();
        // Display the names after clear
        System.out.println("Names after clear:");
        findAll();

    }


    public static int getSize() {
        return names.length;
    }

    public static void setNames(String[] newNames) {
        names = newNames;
    }

    public static void clear() {
        names = new String[0];
    }

    public static String[] findAll() {
        for (String name : names) {
            System.out.println(name);
        }
        return names;
    }


}
