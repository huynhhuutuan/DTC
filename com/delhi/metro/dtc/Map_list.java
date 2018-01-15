package com.delhi.metro.dtc;

import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: FareDoor */
class Map_list {
    Map_list() {
    }

    public LinkedList<String> createList(String string, int i, int j, String[][] Route, ArrayList<String> junc) {
        LinkedList<String> l = new LinkedList();
        if (junc.contains(string)) {
            if (string.equals("Rajiv Chowk")) {
                l.add("Barakhamba");
                l.add("RK Ashram Marg");
                l.add("NewDelhi");
                l.add("Patel Chowk");
            } else if (string.equals("Yamuna Bank")) {
                l.add("Laxmi Nagar");
                l.add("Indraprasta");
                l.add("Akshardham");
            } else if (string.equals("Kashmere Gate")) {
                l.add("Chandni Chowk");
                l.add("Civil Lines");
                l.add("Shastri Park");
                l.add("Tis Hazari");
                l.add("Red Fort");
            } else if (string.equals("Mandi House")) {
                l.add("Barakhamba");
                l.add("Pragati Maidan");
                l.add("Janpath");
                l.add("ITO");
            } else if (string.equals("Central Secretariat")) {
                l.add("Patel Chowk");
                l.add("Udyog Bhawan");
                l.add("Janpath");
                l.add("Khan Market");
            } else if (string.equals("Kirti Nagar")) {
                l.add("Shadi Pur");
                l.add("Moti Nagar");
                l.add("Satguru Ram Singh Marg");
            } else if (string.equals("Inder Lok")) {
                l.add("Shastri Nagar");
                l.add("Kanhaiya Nagar");
                l.add("Ashok Park Main");
            } else if (string.equals("Ashok Park Main")) {
                l.add("Inder Lok");
                l.add("Punjabi Bagh");
                l.add("Satguru Ram Singh Marg");
            } else if (string.equals("Sikandarpur")) {
                l.add("DLF_Sikanderpur");
                l.add("Gurudronacharya");
                l.add("MG Road");
                l.add("Phase-1");
            } else if (string.equalsIgnoreCase("Kalkaji Mandir")) {
                l.add("Okhla NSIC");
                l.add("Nehru Place");
                l.add("Govindpuri");
            } else if (string.equalsIgnoreCase("Botanical Garden")) {
                l.add("Okhla Bird Sanctuary");
                l.add("Golf Course");
                l.add("Noida Sect 18");
            }
        } else if (j == 0) {
            l.add(Route[i][j + 1]);
        } else if (j == Route[i].length - 1) {
            l.add(Route[i][j - 1]);
        } else {
            l.add(Route[i][j - 1]);
            l.add(Route[i][j + 1]);
        }
        return l;
    }
}
