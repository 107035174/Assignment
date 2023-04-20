package Assignment06;

public class MyTable {
    private Entry[] entries;
    private int size;

    public MyTable() {
        entries = new Entry[26];
        size = 0;
    }

    //returns the String that is matched with char c in the table
    public String get(char c) {
//implement
        int index = c - 'a';
        if (index >= 0 && index < entries.length && entries[index] != null) {
            return entries[index].str;
        } else {
            return null;
        }
    }

    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {
//implement
        int index = c - 'a';
        if (index >= 0 && index < entries.length) {
            entries[index] = new Entry(c, s);
        }
    }

    //returns a String consisting of nicely formatted display
//of the contents of the table
    public String toString() {
//implement
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null) {
                sb.append(entries[i].toString()).append("\n");
            }
        }
        return sb.toString();
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
//implement
            this.ch = ch;
            this.str = str;
        }

        //returns a String of the form "ch->str"
        public String toString() {
//implement
            return ch + "->" + str;
        }
    }
}