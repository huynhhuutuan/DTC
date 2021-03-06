package com.delhi.metro.dtc;

import android.support.v4.media.TransportMediator;

class Station_Gates {
    String[][] str;

    Station_Gates() {
        r0 = new String[172][];
        r0[0] = new String[]{"Moolchand Colony", "Keval Park,Majlish Park", "New Sabzi Mandi,Adarsh Nagar Indian Railway Station", "Fruit Mandi,SaraiPipal Thala"};
        r0[1] = new String[]{"AIIMS Hospital", "Ansari Nagar", "SafdarJung Hospital", "Vardhman Mahavir Medical College"};
        r0[2] = new String[]{"Akshardham Temple", "Parking"};
        r0[3] = new String[]{"Urban Institute of Management", "ISBT Anand Viahr"};
        r0[4] = new String[]{"Aya nagar", "Air Force Station"};
        r0[5] = new String[]{"Madan Park,Ashok Park Ext.", "Ashok Park Colony,Rampura"};
        r0[6] = new String[]{"Mahendru Enclave,Model Town-III", "Not Operational"};
        r0[7] = new String[]{"Passenger UnderPass,near Faridabad Toll Plaza", "Institue of Hotel Management"};
        r0[8] = new String[]{"Metro Bhavan", "Kanchanjunga Building", "Dcm Building", "InderPrakash And Vijay Building", "Naryan manjil", "New Delhi House"};
        r0[9] = new String[]{"Botasnical Garden Amity University"};
        r0[10] = new String[]{"Red Cross Building", "Krishi Bhawan", "India Gate,Boat House", "Vijay Chowk", "Rail Bhawan"};
        r0[11] = new String[]{"Kucha Natwa", "Delhi Public Library", "Old Delhi Railway Station", "MCD Parking", "Shish Ganj Gurudwara,Red Fort"};
        r0[12] = new String[]{"Ajmeri Gate", "Huaz Qazi", "Nai Sadak"};
        r0[13] = new String[]{"Vasant Kunj Sectro-D", "Andheriya Mor"};
        r0[14] = new String[]{"Sant Pramanand ", "IP College", "Oberoi Maidens Hotel"};
        r0[15] = new String[]{"Vivek Vihar,Parking", "J&K Pocket Dilshan Graden"};
        r0[16] = new String[]{"Residential complex of Belvedere Towers & Phase 2, Building No. 10, Convergys, DLF Square"};
        r0[17] = new String[]{"Cyber Hub, Ericsson Building, Gateway Tower, Udyog Vihar, Building No. 4 & 8"};
        r0[18] = new String[]{" Ambience Complex, National Media Centre, Building No. 6"};
        r0[19] = new String[]{"DLF Phase 2, Building No. 5 "};
        r0[20] = new String[]{"Cyber Green, Building No. 7, 9 & 14"};
        r0[21] = new String[]{"Sikanderpur Village, DLF Phase-1, Emaar MGF Business Park, DLF City Court"};
        r0[22] = new String[]{"Vipin Garden", "Ram Park"};
        r0[23] = new String[]{"CRPF Quarters", "Kakrola Village"};
        r0[24] = new String[]{"Pinaclemall", "Dwarka Dist Court"};
        r0[25] = new String[]{"Amrahi Village", "St. Gregorios School"};
        r0[26] = new String[]{"Sam International School", "Bansup Hospital"};
        r0[27] = new String[]{"Not Available", "Metro View Apartment"};
        r0[28] = new String[]{"Eros Etro Mall", "Nirmal bhartiya Public School"};
        r0[29] = new String[]{"Nh-8,BIJWASAN Village"};
        r0[30] = new String[]{"Spg Complex"};
        r0[31] = new String[]{"Pf Office ", "Bharat Gas Godown"};
        r0[32] = new String[]{"Mehrauli GurGaon Road", "Ghitoorni Village"};
        r0[33] = new String[]{"Not Available", "Golf Course Ground Noida"};
        r0[34] = new String[]{"Bansari Das Chandiwala Hospital & Education Inst. NSIC Ground", "C.R Prak,Jamia Millia,Islamia University,DeshBhandu College"};
        r0[35] = new String[]{"Yususf Sarai Market", "Siri Fort auditorium", "Uphaar Cinema", "GuruDwara Sikh Sangat(Green Park)"};
        r0[36] = new String[]{"Rajan Babu TB Hospital", "Mukharji Nagar", "GTB Nagar", "King Sway Camp", "NirnKari Colony"};
        r0[37] = new String[]{"Global Business Park", "Garden Estate Colony"};
        r0[38] = new String[]{"Sarvpriya Vihar", "Laxman Public School", "RBI Colony"};
        r0[39] = new String[]{"Max Hospital GurGaon", "GymKana Club Sector 29", "Signature Tower"};
        r0[40] = new String[]{"Umkal Hospital", "IIFCO Tower", "Sushantlok Phase-1"};
        r0[41] = new String[]{"Delhi Haat", "INA Market", "West Kidwai Nagar"};
        r0[42] = new String[]{"JJ Colony,Anand Nagar", "M Block Shastri Nagar", "Inderlock Line-5", "Indelock Cooler Market", "Inderlok Maszid"};
        r0[43] = new String[]{"DTC Head Quarters", "Parking"};
        r0[44] = new String[]{"Ramcharan Agarwal Chowk, Andhra Education Society, Rashtriya Mahila Ayog", "Dayal Singh Library", "UGC and CAG building, INSA (Institute of National Science Academy)", "Herald House, TOI and Dolls Museum", "PWD Office, Delhi Police Headquarter", "Engineers Bhawan, Vikas Minar, CA building and Income Tax office"};
        r0[45] = new String[]{"Jahangir Puri Colony(j & K) Block", "DDA Flat, Mahendra Park", "Fruit Mandi", "GTK Bus Depot"};
        r0[46] = new String[]{"Mahavir Nagar", "Kanjawal Nagar", "Jankapuri B1,B2"};
        r0[47] = new String[]{"Vikas Puri", "District Center", "Dmrc Parking"};
        r0[48] = new String[]{"Soochna Bhawan,Electronic Niketan", "EROS Cinema Jangapura Extn.Nizamudin Railway Satation", "MTNL Building,JLN stadium,SCOP Complex"};
        r0[49] = new String[]{"Not Available"};
        r0[50] = new String[]{"Jasola District Park,Living Style MallKalindi Park", "Container Corpration of india"};
        r0[51] = new String[]{"Jhulelal Mandir", "Vediocon Tower", "Hanuman mandir", "Baba Lalji Mandir"};
        r0[52] = new String[]{"Jhilmil", "DDA Flats"};
        r0[53] = new String[]{"Delhi Transco Ltd.", "CGO complex", "CGO complex", "CRPF Ground", "Dayal Singh College"};
        r0[54] = new String[]{"Fire Station Safdarjung", "Rajiv Gandhi Bhavan", "Safdarjung Airport Office Complex"};
        r0[55] = new String[]{"Sant Nagar,RG Stone Hospital,Kailash Colony", "Greater Kailash-1,Zamurdpur Village"};
        r0[56] = new String[]{"Kalkaji Mandir,Nehru Place Terminal,Lotus Temple"};
        r0[57] = new String[]{"Tota Ram Bazar,Ganesh Pura", "Maharishi Dyanand Park", "JJ Colony,MCD Sports Complex"};
        r0[58] = new String[]{"Karkardooma Court", "Metro Parkin"};
        r0[59] = new String[]{"Karolbagh Market", "Pusa Road", "Pusa Road", "Faishon Big Bazar", "City Hospital", "Apsara Arcade", "Ganga Ram hospital", "Jeevan Nursing Home"};
        r0[60] = new String[]{"MCD Park", "Maharaja Aggrasan Park", "Mori Gate Bus Stand", "Shamnath Marg", "Kudasiya Park", "ISBT Road", "ISBT"};
        r0[61] = new String[]{"Kaushambi", "Wave Cinema"};
        r0[62] = new String[]{"Lawerence Road", "Nanak Kunj,Keshav Puram,DDA Shoping Complex", "Parking", "Ashok Vihar"};
        r0[63] = new String[]{"UPSC Bhavan,Dholpur House,Delhi High Court", "Pardara Road ,Golf Link", "Lodhi Road,Ambassador hotel ", "Khan Market,Lok Nayak Bhawan"};
        r0[64] = new String[]{"Furniture Market Moments Mall", "Not Operational", "Kirti Nagar Railway Station Parking ", "Not Operational", "Parking"};
        r0[65] = new String[]{"MorYa Enclave Police Station,Vaishali Enclave,CD & KD Block,Pitampura", "shakur Pur Basti", "kapil vihar Nishat Kunj"};
        r0[66] = new String[]{"Metro Parking", "3C's Cinema", "Defence Colony"};
        r0[67] = new String[]{"D Block Laxmi ", "Shakarpur", "Patel Hospital"};
        r0[68] = new String[]{"Madipur JJ Colony", "Railway Reservation Center"};
        r0[69] = new String[]{"Geetanjali Hospital", "Shivalik Hospital", "Metro Enclave", "PVR Saket"};
        r0[70] = new String[]{"Himanchal Bhawan", "Sikandara Road"};
        r0[71] = new String[]{"Shahdara Industrial Area", "MCD Office"};
        r0[72] = new String[]{"Smachar Apartment", "Glaxo Apartment"};
        r0[73] = new String[]{"Hindustan Apartment,Ips Apartment", "Jeeevan Anmaol Hospital,Tranport Authority"};
        r0[74] = new String[]{"DT City Center Mall", "MGF MetroPolitan Mall"};
        r0[75] = new String[]{"Alpana Cinema,Model Town -ll", "Tagor Park,MalikPur Village", "Kripal Bagh,Ishwar Colony", "Gujrawalan Town,Chhatrasal Stadium"};
        r0[76] = new String[]{"Sarita Vihar depot,AALI GAON,NIIT Technologies"};
        r0[77] = new String[]{"RajKumari Amrit Kaur Sursing,Kendriya Vidyalaya Andrrews Ganj,Vijram Hotel", "Dmrc Parking"};
        r0[78] = new String[]{"Mn Fire Station", "Main Moti Nagar Market", "Kirti Nagar "};
        r0[79] = new String[]{"Bahadurgarh Rohtak Road", "Janardan Rai Nagar Institue of Aviation Technology,Rajendra Lakra Model School"};
        r0[80] = new String[]{"Kirari More ,Delhi Police Staff Quarters", "Govt Sarvodaya Bal,Kanya Vidhalaya Nagloi,Govt Girls Sr Sec School Nangloi"};
        r0[81] = new String[]{"Booming Dales Public School", "Govt Girls Sr Sec School JJ colony,Kamp No 2 ,Nangloi", "Mehendru"};
        r0[82] = new String[]{"Rnayar Hospital", "Not Available", "Dawarka Mor"};
        r0[83] = new String[]{"ISKON Temple", "EROS Corporate,Satyam Cinema,Electronic Market"};
        r0[84] = new String[]{"Big Bazar,Ring road", "Netaji Subhash Palace,District Center ", "Delhi Haat,Guru Govind Singh College,Tv tower"};
        r0[85] = new String[]{"Dharmshila Cancer Hospital"};
        r0[86] = new String[]{"New Delhi Railway station", "Not available", "Kamla Market", "Rail Yatri Niwas", "Airport Line"};
        r0[87] = new String[]{"V3s Mall ,Bharat Public School", "Bharat Colony", "Nirman Vihar Area"};
        r0[88] = new String[]{"Roadways Bus stand", "Rajkiya Degree College Noida"};
        r0[89] = new String[]{"Noida Sec 1,2,3&4 HCLTech Buliding,Naruja Hotel,Indain Oil Building", "Golchakar"};
        r0[90] = new String[]{"Rajnigandha Chowk", "Naya Bans Film city"};
        r0[91] = new String[]{"Atta Market", "GIP Mall"};
        r0[92] = new String[]{"Not Available", "Harkesh Nagar,Okhla Phase 1,2&3,Sanjay Colony,Govt Boys/Girls Sr Sec School,Harkesh Nagar", "Jasola"};
        r0[93] = new String[]{"Bharati Vidyapeeth University,Balajee Action Hospital", "Ordance Depot,Multan Nagar"};
        r0[94] = new String[]{"Jwalaheri Market,Vishal Bharti Public School", "Sahdev Park,Multan Nagar"};
        r0[95] = new String[]{"Rajiv Chowk", "Rajiv Chowk", "Sanchar Bhawan", "Pusa Institute", "Dmrc Parking Area", "Ranjeet Nagar"};
        r0[96] = new String[]{"Ayur House", "BB Patel Nagar Hospital", "Hotel Bricks"};
        r0[97] = new String[]{"Ekta Enclave,Redison Blue,DTC Busdepot Peeragarhi", "Mangol Puri Industrial Area,Safal Fruit & Vegitable"};
        r0[98] = new String[]{"Mandakini Apartment,Rajasthali Apartment", "Madhubun Chowk", "South Pitampura,Vishaka Enclave", "Prashant Vihar,District Court Rohini"};
        r0[99] = new String[]{"Supreme Court", "ITO", "Way to IITF Gate No 10"};
        r0[100] = new String[]{"Prathiba Vikas Vidyalaya Krishna Ganj,Krishn Ganj Railway Station", "Sabzi Mandi Railway Station"};
        r0[101] = new String[]{"Soffpro Institute", "Taneja Hospital", "State Bank Of India", "Punjab National Bank"};
        r0[102] = new String[]{"Baraf Khana", "Parking"};
        r0[103] = new String[]{"Punjabi Bagh,Railway Colony", "Transport Center"};
        r0[104] = new String[]{"Anuvart Marg", "Anuvart Marg"};
        r0[105] = new String[]{"Nagaland House", "Race Course"};
        r0[106] = new String[]{"Timber Market", "Union Bank of India,Sai Vatika"};
        r0[107] = new String[]{"Hotel Sidartha", "Bik Hospital", "Fire Station", "Pusa Institute"};
        r0[108] = new String[]{"RK Asharam", "PVR Plazza,B & H Block", "D & E Block", "Odeon Cinema", "N & F Block", "Palika Bazar", "Regal Cinema", "Oriental Bank"};
        r0[109] = new String[]{"Mtnl Office", "Rajouri Garden Metro Thana", "Vishal Cinema", "City Square Mall", "Ilahabad Bank", "Ilahabad Bank", "Bikanerwala", "Bikanerwala"};
        r0[110] = new String[]{"Metro Parking", "Ramesh Nagar", "Sun Temple", "Main Najfgarh Road", "Namdhari Colony"};
        r0[111] = new String[]{"Jagan Institute of Management of studies,Delhi Metro Rail Police Station Rithala", "Rohini Sec 24", "Metro Walk, Rohini Sec 11 & 15"};
        r0[112] = new String[]{"Heart And Lung Hospital", "R K Ashram", "Gol Market", "Lady HardingHospital", "Dmrc Metro Parking"};
        r0[113] = new String[]{"Rohini sec 7,Lotus Apartment", "Rajiv Gandhi Cancer Institute,Baba saheb Ambedkar Hospital,Rohini Sec 5", "Swarn Jayanthi Park,Rohini Sec 11,16,17, Metro Parking"};
        r0[114] = new String[]{"Om Sai Apartment , Rohini Sec -1,2,3,6,7 & 8", "Metro Parking Rohini Sec 9,10,13 & 14,Rajpur Village"};
        r0[115] = new String[]{"Vidya Niketan School,PVR Saket", "SAI-UL-Azaib,IGNOU,Maidan Garhi", "CISF Northen Regional Headquarters"};
        r0[116] = new String[]{"Sarita Vihar", "Madan Pur Kadar"};
        r0[117] = new String[]{"Patel Nagar Railway Station"};
        r0[118] = new String[]{"SDM Office"};
        r0[119] = new String[]{"Dtc Bus Depot", "Not Available", "Not Available", "Shanti Place Hotel", "Not Available", "DTC Volony", "Satyam Cinema"};
        r0[120] = new String[]{"Shahdara Bus Terminal ", "Shahdara Indian Railway Station"};
        r0[121] = new String[]{"Sarai Rohilla Railway Station , Govt Boys SR Sec School", "Shastri Nagar"};
        r0[122] = new String[]{"DMRC Operational Control Centre Shastri Park, Delhi Metro Rail Police", "IT Park,Metro Vihar(DMRC Staff Quarters)"};
        r0[123] = new String[]{"Shivaji Park Colony,DCP office(D.P.)", "Indian Oil Depot"};
        r0[124] = new String[]{"DLF Phase II & III", "Ambience Mall"};
        r0[125] = new String[]{"State Bank of Tilak nagar", "Pacific Mall", "Tilak Nagar Police station", "Minakshi Garden"};
        r0[TransportMediator.KEYCODE_MEDIA_PLAY] = new String[]{"Sultanpur Metro Depot", "Mehrauli Gurgaon Road"};
        r0[TransportMediator.KEYCODE_MEDIA_PAUSE] = new String[]{"Rail Neer Water plant,Nihal Vihar", "Surajmal Stadium , MCD Community Centre"};
        r0[128] = new String[]{"Khyala Kendriya Vidalaya", "Kukreja Hospital", "Cambridge School", "Rajouri Garden J Block"};
        r0[129] = new String[]{"Central Market Tilak nagar", "7th Floor Temple", "Jail Road Gurudwara", "Prem Nagar"};
        r0[TransportMediator.KEYCODE_MEDIA_RECORD] = new String[]{"District Court Tis Hazari", "St. Stephen Hospital", "Dmrc Parking"};
        r0[131] = new String[]{"Tughlakabad Railway Station,NTPC Badarpur Plant"};
        r0[132] = new String[]{"Udyog Bhawan", "Nirman Bhawan", "Vayu Sena Bhawan", "Sena Bhawan"};
        r0[133] = new String[]{"JJ Colony,Mianwali police station,wali nagar, Shiv vihar", "DTC Bus Depot,Udyog Nagar Industrial Area"};
        r0[134] = new String[]{"Pankha Road", "Dtc Bus Terminal "};
        r0[135] = new String[]{"Om Vihar", "Dal mill Road", "Prem Nagar", "Arya Samaj Road", "Arya Samaj Road"};
        r0[136] = new String[]{"Vaishali", "Shri Krishanvatika Vaishali Sec 4"};
        r0[137] = new String[]{"DMRC Officers Flats", "Old Secretariat", "Yellow Fever Inoculation Center MCD"};
        r0[138] = new String[]{"Reviera Apartment", "Mall Road", "Cavelary Lane", "University Campus Khalsa College"};
        r0[139] = new String[]{"MCD Parking"};
        r0[140] = new String[]{"Yamuna Bank Staff Quarters"};
        r0[141] = new String[]{"Not Available"};
        r0[142] = new String[]{"Not Available"};
        r0[143] = new String[]{"Not Available"};
        r0[144] = new String[]{"Not Available"};
        r0[145] = new String[]{"north-Vatika tower", "south-L&T building", "east-Crown Park"};
        r0[146] = new String[]{"north-Rajiv Chowk, Santosh Nagar,NHPC", "south-SSR,DLF INDUSTRIAL AREA, Spring Field, Jiva Ayurvedic", "west-SSR corporate park, Lakkadpur"};
        r0[147] = new String[]{"north-HAVELS, Sec-30, 31 , Spring Field Colony, Indraprasth Colony", "south-SRS, Mewala Maharajpur Chowk, sec-28", "west-Sec-46,47,48"};
        r0[148] = new String[]{"north-SRS MALL,SEC-28,SEC-30 POLICE LINE, Bhavishya Nidhi Enclave,Sec-31 Market, SRS Cinema", "south-Tarang Archid Apartments, Sunshine Apartment, Asian Hospital, Escort Hospital, Dynesty International School.", "west-Beebay Play School, Escort Corporate Center, Perfect Vision Hospital, Kartik Vihar,Sec-27."};
        r0[149] = new String[]{"north-Verddhman Multiplex Mall", "south-Chlrif Apartment, Delhi Public School", "west-Karkhana Bagh Indistrial area"};
        r0[150] = new String[]{"north-Sec-16", "south-Sec-15, Magpia Holiday Resort, Park Hospital", "west-Faridabad Railway Station, EF 3 Mall , Sant Nagar, Parshnath Mall "};
        r0[151] = new String[]{"north-Megpai", "south-Crown Plaza", "south-Crown Plaza"};
        r0[152] = new String[]{"north-SEC-7, SEC-11, YMCA Chowk, Park Hospital", "south-Sec-07, YMCA University", "west-Piyush Goyal, Mujesar Village"};
        r0[153] = new String[]{"north-IMT Faridabad", "south-SRS Multiplex, Sec-12,  Parshnath City Mall ", "west-Airforce Station, Radisson Hotel,  Sec-20"};
        r0[154] = new String[]{"Not Available"};
        r0[155] = new String[]{"Not Available"};
        r0[156] = new String[]{"Not Available"};
        r0[157] = new String[]{"Not Available"};
        r0[158] = new String[]{"Not Available"};
        r0[159] = new String[]{"Not Available"};
        r0[160] = new String[]{"Not Available"};
        r0[161] = new String[]{"Not Available"};
        r0[162] = new String[]{"Not Available"};
        r0[163] = new String[]{"Not Available"};
        r0[164] = new String[]{"Not Available"};
        r0[165] = new String[]{"Not Available"};
        r0[166] = new String[]{"Not Available"};
        r0[167] = new String[]{"Not Available"};
        r0[168] = new String[]{"Not Available"};
        r0[169] = new String[]{"Not Available"};
        r0[170] = new String[]{"Not Available"};
        r0[171] = new String[]{"Not Available"};
        this.str = r0;
    }
}
