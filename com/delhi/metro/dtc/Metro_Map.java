package com.delhi.metro.dtc;

import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* compiled from: FareDoor */
class Metro_Map {
    String[][] Route;
    public ArrayList<String> airpotLine;
    ArrayList<String> blue;
    ArrayList<String> blue1;
    ArrayList<String> brown;
    ArrayList<String> brown1;
    Map<String, Integer> distance = new HashMap();
    ArrayList<String> green;
    ArrayList<String> green1;
    ArrayList<String> itemsList = new ArrayList();
    public ArrayList<String> junc;
    Map_list mList;
    ArrayList<String> magenta;
    Map<String, LinkedList<String>> map = new HashMap();
    String[] path;
    Queue<String> queue;
    ArrayList<String> red;
    ListView t1;
    ArrayList<String> visited;
    ArrayList<String> voilet;
    ArrayList<String> yellow;

    /* compiled from: FareDoor */
    enum Line {
        BLUE,
        BLUE_1,
        RED,
        YELLOW,
        GREEN,
        GREEN_1,
        VIOLET,
        BROWN,
        BROWN_1,
        AIRPORT,
        MAGENTA
    }

    public Metro_Map() {
        r1 = new String[10][];
        r1[0] = new String[]{"Vaishali", "Kaushambi", "Anand Vihar", "Karkar Duma", "Preet Vihar", "Nirman Vihar", "Laxmi Nagar", "Yamuna Bank", "Indraprasta", "Pragati Maidan", "Mandi House", "Barakhamba", "Rajiv Chowk", "RK Ashram Marg", "Jhandewalan", "Karol Bagh", "Rajendra Place", "Patel Nagar", "Shadi Pur", "Kirti Nagar", "Moti Nagar", "Ramesh Nagar", "Rajouri Garden", "Tagore Garden", "Subash Nagar", "Tilak Nagar", "Janak Puri East", "Janak Puri West", "Uttam Nagar East", "Uttam Nagar West", "Nawada", "Dwaraka Mor", "Dwarka", "Dwarka Sector - 14", "Dwarka Sector - 13", "Dwarka Sector - 12", "Dwarka Sector - 11", "Dwarka Sector - 10", "Dwarka Sector - 9", "Dwarka Sector - 8", "Dwarka Sector - 21"};
        r1[1] = new String[]{"Noida City Centre", "Golf Course", "Botanical Garden", "Noida Sect 18", "Noida Sect 16", "Noida Sect 15", "New Ashok Nagar", "Mayur Vihar Ext", "Mayur Vihar-I", "Akshardham", "Yamuna Bank"};
        r1[2] = new String[]{"Samaypur Badli", "Rohini Sector 18-19", "Haiderpur Badli Mor", "Jahangirpuri", "Adarsh Nagar", "Azadpur", "Model Town", "GTB Nagar", "Viswavidyalaya", "Vidhan Sabha", "Civil Lines", "Kashmere Gate", "Chandni Chowk", "Chawri Bazar", "NewDelhi", "Rajiv Chowk", "Patel Chowk", "Central Secretariat", "Udyog Bhawan", "Race Course", "Jorbagh", "INA", "AIIMS", "Green Park", "Hauz Khas", "MalviaNagar", "Saket", "Qutab Minar", "Chhattarpur", "Sultanpur", "Ghotorni", "Arjan Garh", "Gurudronacharya", "Sikandarpur", "MG Road", "IFFCO Chowk", "Huda City Centre"};
        r1[3] = new String[]{"Dilshad Garden", "Jhil mil", "Mansrover park", "Shahdara", "Welcome", "Seelam Pur", "Shastri Park", "Kashmere Gate", "Tis Hazari", "Pul Bangash", "Pratap Nagar", "Shastri Nagar", "Inder Lok", "Kanhaiya Nagar", "Keshav Puram", "Netaji Subash Place", "Kohat Enclave", "Pitam Pura", "RohiniEast", "Rohini West", "Rithala"};
        r1[4] = new String[]{"Kashmere Gate", "Red Fort", "Jama Masjid", "Delhi Gate", "ITO", "Mandi House", "Janpath", "Central Secretariat", "Khan Market", "JLN", "Jangpura", "Lajpat Nagar", "Moolchand", "Kailash Colony", "Nehru Place", "Kalkaji Mandir", "Govindpuri", "Okhla", "Jasola-Apollo", "Sarita Vihar", "Mohan Estate", "Tuglakabad", "Badarpur", "Sarai", "NHPC Chowk", "Mewala Maharajpur", "Sector-28", "Badkal Mor", "Faridabad old", "Ajronda", "Bata Chowk", "ESCORT MUJESAR"};
        r1[5] = new String[]{"Mundka", "Rajdhani Park", "Nangloai Rly. Station", "Nangloai", "Surajmal Stadium", "Udyog Nagar", "Peera Garhi", "Paschim Vihar (West)", "Paschim Vihar (East)", "Madi Pur", "Shivaji Park", "Punjabi Bagh", "Ashok Park Main", "Inder Lok"};
        r1[6] = new String[]{"Ashok Park Main", "Satguru Ram Singh Marg", "Kirti Nagar"};
        r1[7] = new String[]{"Sikandarpur", "DLF_Sikanderpur", "DLF_Phase 2", "DLF_Belvedere Towers", "DLF_Cyber City", "DLF_Moulsari Avenue", "DLF_Phase 3"};
        r1[8] = new String[]{"Sikandarpur", "Phase-1", "Sector 42-43", "Sector 53-54", "Sector 54 Chowk", "Sector 55-56"};
        r1[9] = new String[]{"Botanical Garden", "Okhla Bird Sanctuary", "Kalindi Kunj", "Jasola Vihar Shaheen Bagh", "Okhla Vihar", "Jamia Milia Islamia", "Sukhdev Vihar", "Okhla NSIC", "Kalkaji Mandir"};
        this.Route = r1;
        this.mList = new Map_list();
        this.visited = new ArrayList();
        this.path = new String[144];
        this.blue = new ArrayList();
        this.blue1 = new ArrayList();
        this.green = new ArrayList();
        this.green1 = new ArrayList();
        this.yellow = new ArrayList();
        this.red = new ArrayList();
        this.voilet = new ArrayList();
        this.brown = new ArrayList();
        this.brown1 = new ArrayList();
        this.magenta = new ArrayList();
        this.junc = new ArrayList();
        this.airpotLine = new ArrayList();
        this.queue = new LinkedList();
        for (Object add : this.Route[0]) {
            this.blue.add(add);
        }
        for (Object add2 : this.Route[1]) {
            this.blue1.add(add2);
        }
        for (Object add22 : this.Route[2]) {
            this.yellow.add(add22);
        }
        for (Object add222 : this.Route[3]) {
            this.red.add(add222);
        }
        for (Object add2222 : this.Route[4]) {
            this.voilet.add(add2222);
        }
        for (Object add22222 : this.Route[5]) {
            this.green1.add(add22222);
        }
        for (Object add222222 : this.Route[6]) {
            this.green.add(add222222);
        }
        for (Object add2222222 : this.Route[7]) {
            this.brown.add(add2222222);
        }
        for (Object add22222222 : this.Route[8]) {
            this.brown1.add(add22222222);
        }
        for (Object add222222222 : this.Route[9]) {
            this.magenta.add(add222222222);
        }
        this.junc.add("Kashmere Gate");
        this.junc.add("Yamuna Bank");
        this.junc.add("Rajiv Chowk");
        this.junc.add("Mandi House");
        this.junc.add("Sikandarpur");
        this.junc.add("Central Secretariat");
        this.junc.add("Kirti Nagar");
        this.junc.add("Inder Lok");
        this.junc.add("Ashok Park Main");
        this.junc.add("Botanical Garden");
        this.junc.add("Kalkaji Mandir");
        this.airpotLine.add("Shivaji Stadium");
        this.airpotLine.add("Dhaula Kuan");
        this.airpotLine.add("Delhi Aerocity");
        this.airpotLine.add("IGI Airport (T-3)");
        init();
    }

    public Map<String, LinkedList<String>> getMap() {
        return this.map;
    }

    void init() {
        for (int i = 0; i < this.Route.length; i++) {
            for (int j = 0; j < this.Route[i].length; j++) {
                this.map.put(this.Route[i][j], this.mList.createList(this.Route[i][j], i, j, this.Route, this.junc));
                this.distance.put(this.Route[i][j], Integer.valueOf(-1));
            }
        }
    }

    public void findPathBFS(String source, String dest) {
        int i;
        if (source.equalsIgnoreCase("Kashmere Gate") && this.voilet.contains(dest)) {
            int dest_index = this.voilet.indexOf(dest);
            for (i = 0; i <= dest_index; i++) {
                this.itemsList.add(this.voilet.get(i));
            }
        } else if (dest.equalsIgnoreCase("Kashmere Gate") && this.voilet.contains(source)) {
            for (i = this.voilet.indexOf(source); i >= 0; i--) {
                this.itemsList.add(this.voilet.get(i));
            }
        } else {
            Map<String, String> route = new HashMap();
            this.queue.add(source);
            this.distance.put(source, Integer.valueOf(0));
            route.put(source, null);
            while (!this.queue.isEmpty()) {
                String s = (String) this.queue.remove();
                Iterator it = ((LinkedList) this.map.get(s)).iterator();
                while (it.hasNext()) {
                    String st = (String) it.next();
                    if (((Integer) this.distance.get(st)).intValue() == -1) {
                        this.distance.put(st, Integer.valueOf(((Integer) this.distance.get(s)).intValue() + 1));
                        this.queue.add(st);
                        route.put(st, s);
                    }
                }
            }
            String temp = (String) route.get(dest);
            int path_len = ((Integer) this.distance.get(dest)).intValue();
            this.path = new String[(path_len + 1)];
            System.out.println(path_len);
            int k = 0 + 1;
            this.path[0] = dest;
            int k2 = k + 1;
            this.path[k] = temp;
            k = k2;
            while (temp != null) {
                temp = (String) route.get(temp);
                if (temp != null) {
                    k2 = k + 1;
                    this.path[k] = temp;
                    k = k2;
                }
            }
            i = this.path.length - 1;
            while (i >= 0) {
                if (this.path[i] == null || this.path[i] != dest) {
                    if (!isJunction(this.path[i]) || i == path_len) {
                        this.itemsList.add(this.path[i]);
                    } else if (i <= 0 || getLine(this.path[i - 1]) == getLine(this.path[i + 1])) {
                        this.itemsList.add(this.path[i]);
                    } else if (this.path[i] == "Yamuna Bank") {
                        if (this.path[i + 1] == "Indraprasta") {
                            this.itemsList.add(this.path[i]);
                        } else if ((this.path[i + 1].endsWith("Akshardham") && this.path[i - 1].equals("Laxmi Nagar")) || (this.path[i - 1].endsWith("Akshardham") && this.path[i + 1].equals("Laxmi Nagar"))) {
                            this.itemsList.add("Change at:" + this.path[i]);
                        } else {
                            this.itemsList.add(this.path[i]);
                        }
                    } else if (this.path[i] != "Ashok Park Main") {
                        this.itemsList.add("Change at:" + this.path[i]);
                    } else if (this.path[i + 1] == "Punjabi Bagh") {
                        this.itemsList.add(this.path[i]);
                    } else if ((this.path[i + 1].endsWith("Satguru Ram Singh Marg") && this.path[i - 1].equals("Inder Lok")) || (this.path[i - 1].endsWith("Satguru Ram Singh Marg") && this.path[i + 1].equals("Inder Lok"))) {
                        this.itemsList.add("Change at:" + this.path[i]);
                    } else {
                        this.itemsList.add(this.path[i]);
                    }
                    i--;
                } else {
                    this.itemsList.add(this.path[i]);
                    return;
                }
            }
        }
    }

    public boolean isJunction(String source) {
        if (this.junc.contains(source)) {
            return true;
        }
        return false;
    }

    public Line getLine(String station) {
        if (this.blue.contains(station)) {
            return Line.BLUE;
        }
        if (this.blue1.contains(station)) {
            return Line.BLUE_1;
        }
        if (this.yellow.contains(station)) {
            return Line.YELLOW;
        }
        if (this.green.contains(station)) {
            return Line.GREEN;
        }
        if (this.green1.contains(station)) {
            return Line.GREEN_1;
        }
        if (this.red.contains(station)) {
            return Line.RED;
        }
        if (this.voilet.contains(station)) {
            return Line.VIOLET;
        }
        if (this.brown.contains(station) || this.brown1.contains(station)) {
            return Line.BROWN;
        }
        if (this.airpotLine.contains(station)) {
            return Line.AIRPORT;
        }
        if (this.magenta.contains(station)) {
            return Line.MAGENTA;
        }
        return null;
    }

    public String lineColor(Line l) {
        if (l == Line.BLUE || l == Line.BLUE_1) {
            return "Blue";
        }
        if (l == Line.YELLOW) {
            return "Yellow";
        }
        if (l == Line.GREEN || l == Line.GREEN_1) {
            return "Green";
        }
        if (l == Line.RED) {
            return "Red";
        }
        if (l == Line.VIOLET) {
            return "Violet";
        }
        if (l == Line.BROWN) {
            return "brown";
        }
        if (l == Line.AIRPORT) {
            return "Airport";
        }
        return null;
    }
}
