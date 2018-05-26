package com.example.amitb.sportsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class team extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        getSupportActionBar().setTitle("TEAMS");
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Acharya Ambalali V. Patel Junior College");
        listDataHeader.add("Atharva Malad");
        listDataHeader.add("Birla");
        listDataHeader.add("D J Sanghvi");
        listDataHeader.add("D Y Patil Medical");
        listDataHeader.add("Datta Meghe Airoli");
        listDataHeader.add("Flame Pune");
        listDataHeader.add("Fr. Rodrigues");
        listDataHeader.add("Government Law College");
        listDataHeader.add("HR College");
        listDataHeader.add("ICT");
        listDataHeader.add("IIT Bombay");
        listDataHeader.add("ISME");
        listDataHeader.add("ITM");
        listDataHeader.add("Jai Hind");
        listDataHeader.add("JamnaBai");


        // Adding child data
        List<String> AcharyaAmbalaliVPatelJuniorCollege = new ArrayList<String>();
        AcharyaAmbalaliVPatelJuniorCollege.add("MANAN");
        AcharyaAmbalaliVPatelJuniorCollege.add("RAJ");
        AcharyaAmbalaliVPatelJuniorCollege.add("PRAKHAR");
        AcharyaAmbalaliVPatelJuniorCollege.add("AMIT");
        AcharyaAmbalaliVPatelJuniorCollege.add("HARSH");
        AcharyaAmbalaliVPatelJuniorCollege.add("ADITYA");
        AcharyaAmbalaliVPatelJuniorCollege.add("VEDANG");
        AcharyaAmbalaliVPatelJuniorCollege.add("ROHAN");
        AcharyaAmbalaliVPatelJuniorCollege.add("RUSHABH");
        AcharyaAmbalaliVPatelJuniorCollege.add("ABHISHEK");
        AcharyaAmbalaliVPatelJuniorCollege.add("AAYUSH");

        List<String> AtharvaMalad = new ArrayList<String>();
        AtharvaMalad.add("ROHIT");
        AtharvaMalad.add("HARDIK");
        AtharvaMalad.add("ISHAN");
        AtharvaMalad.add("POLLARD");
        AtharvaMalad.add("JASPRIT");
        AtharvaMalad.add("KRUNAL");
        AtharvaMalad.add("MICHAEL");
        AtharvaMalad.add("DHONI");
        AtharvaMalad.add("KOHLI");
        AtharvaMalad.add("RAINA");
        AtharvaMalad.add("JADEJA");

        List<String> Birla = new ArrayList<String>();
        Birla.add("GAMBHIR");
        Birla.add("IYER");
        Birla.add("ROY");
        Birla.add("MORRIS");
        Birla.add("SHANKAR");
        Birla.add("SHAMI");
        Birla.add("NADEEM");
        Birla.add("MISHRA");
        Birla.add("HARSHAL");
        Birla.add("BOULT");
        Birla.add("PANT");
        List<String> DJSANGHVI = new ArrayList<String>();
        DJSANGHVI.add("DHAWAN");
        DJSANGHVI.add("WARNER");
        DJSANGHVI.add("KANE");
        DJSANGHVI.add("HOODA");
        DJSANGHVI.add("RASHID");
        DJSANGHVI.add("BKUMAR");
        DJSANGHVI.add("YUSUF");
        DJSANGHVI.add("SHAKIB");
        DJSANGHVI.add("PANDEY");
        DJSANGHVI.add("SAHA");
        DJSANGHVI.add("KAUL");

        List<String> DYPATILMEDICAL = new ArrayList<String>();
        DYPATILMEDICAL.add("WATSON");
        DYPATILMEDICAL.add("RAYUDU");
        DYPATILMEDICAL.add("BILLINGS");
        DYPATILMEDICAL.add("DUPLESSIS");
        DYPATILMEDICAL.add("JADEJA");
        DYPATILMEDICAL.add("JADHAV");
        DYPATILMEDICAL.add("BRAVO");
        DYPATILMEDICAL.add("TAHIR");
        DYPATILMEDICAL.add("BHAJJI");
        DYPATILMEDICAL.add("WOOD");
        DYPATILMEDICAL.add("THAKUR");
        List<String> DATTA = new ArrayList<String>();
        DATTA.add("RAHANE");
        DATTA.add("BUTTLER");
        DATTA.add("SANJU");
        DATTA.add("STOKES");
        DATTA.add("TRIPATHI");
        DATTA.add("BINNY");
        DATTA.add("UNADKAT");
        DATTA.add("SHORT");
        DATTA.add("DHAWAL");
        DATTA.add("SODHI");
        DATTA.add("CHOPRA");
        List<String> FLAME  = new ArrayList<String>();
        FLAME.add("ROHIT");
        FLAME.add("YADAV");
        FLAME.add("ISHAN");
        FLAME.add("HARDIK");
        FLAME.add("POLLARD");
        FLAME.add("LEWIS");
        FLAME.add("BUMRAH");
        FLAME.add("DUMINY");
        FLAME.add("RAHMAN");
        FLAME.add("MAYANK");
        FLAME.add("CUTTING");
        List<String> RODRIGUES = new ArrayList<String>();
        RODRIGUES.add("LYNN");
        RODRIGUES.add("NARINE");
        RODRIGUES.add("ROBIN");
        RODRIGUES.add("ROONEY");
        RODRIGUES.add("BOLIA");
        RODRIGUES.add("GOLIA");
        RODRIGUES.add("CECE");
        RODRIGUES.add("NATE");
        RODRIGUES.add("CHUCK");
        RODRIGUES.add("BASS");
        RODRIGUES.add("AMEENA");

        List<String> GovernmentLawCollege = new ArrayList<String>();
        GovernmentLawCollege.add("TOM");
        GovernmentLawCollege.add("HARRY");
        GovernmentLawCollege.add("DICKINS");
        GovernmentLawCollege.add("DHAMIJA");
        GovernmentLawCollege.add("SHIVANI");
        GovernmentLawCollege.add("MITHALI");
        GovernmentLawCollege.add("RAJ");
        GovernmentLawCollege.add("FAULKNER");
        GovernmentLawCollege.add("SHREY");
        GovernmentLawCollege.add("PRATAP");
        GovernmentLawCollege.add("ANSH");

        List<String> HR = new ArrayList<String>();
        HR.add("AAYUSH");
        HR.add("ANAY");
        HR.add("VIBHOR");
        HR.add("DARSHAN");
        HR.add("SHAMOIL");
        HR.add("ADNEY");
        HR.add("SHLOK");
        HR.add("PRATHAM");
        HR.add("ROHAN");
        HR.add("APOORVA");
        HR.add("SHAAN");

        List<String> ICT = new ArrayList<String>();
        ICT.add("PRNAV");
        ICT.add("GAURAV");
        ICT.add("RAMY");
        ICT.add("DROGBA");
        ICT.add("MESSI");
        ICT.add("INIESTA");
        ICT.add("RONALDO");
        ICT.add("SALAH");
        ICT.add("LAMPARD");
        ICT.add("ASH");
        ICT.add("COBY");

        List<String> IITBOMBAY = new ArrayList<String>();
        IITBOMBAY.add("AKSHAT");
        IITBOMBAY.add("RATIK");
        IITBOMBAY.add("ADITYA");
        IITBOMBAY.add("SHIVAM");
        IITBOMBAY.add("GEETANSH");
        IITBOMBAY.add("YUVRAJ");
        IITBOMBAY.add("RAJ");
        IITBOMBAY.add("RAGHAV");
        IITBOMBAY.add("AYMAN");
        IITBOMBAY.add("SIDHANT");
        IITBOMBAY.add("MIKKY");

        List<String> ISME = new ArrayList<String>();
        ISME.add("LUV");
        ISME.add("WATSON");
        ISME.add("IRLING");
        ISME.add("TASHIF");
        ISME.add("TALIB");
        ISME.add("HASSAN");
        ISME.add("ANDY");
        ISME.add("DEEPAK");
        ISME.add("ARSALAN");
        ISME.add("DEV");
        ISME.add("DEVAK");

        List<String> ITM = new ArrayList<String>();
        ITM.add("JAIVAN");
        ITM.add("SOOJI");
        ITM.add("VIMOHIT");
        ITM.add("RAVI");
        ITM.add("BANDY");
        ITM.add("GORAV");
        ITM.add("MICKEAL");
        ITM.add("SUNIL");
        ITM.add("ZUBAIR");
        ITM.add("AYUSH");
        ITM.add("GAYLE");

        List<String> JAIHIND = new ArrayList<String>();
        JAIHIND.add("CHRIS");
        JAIHIND.add("ROHIT");
        JAIHIND.add("RAINA");
        JAIHIND.add("GOTI");
        JAIHIND.add("AASHNAV");
        JAIHIND.add("MAGAN");
        JAIHIND.add("BADAL");
        JAIHIND.add("JAI");
        JAIHIND.add("AARYAN");
        JAIHIND.add("HARSH");
        JAIHIND.add("ABHISHEK");
        JAIHIND.add("VINOD");

        List<String> JAMNABAI = new ArrayList<String>();
        JAMNABAI.add("VARUN");
        JAMNABAI.add("HRITIK");
        JAMNABAI.add("RANBIR");
        JAMNABAI.add("RANVEER");
        JAMNABAI.add("SHAHRUKH");
        JAMNABAI.add("SALMAN");
        JAMNABAI.add("AMIR");
        JAMNABAI.add("DEVANAND");
        JAMNABAI.add("AMITABH");
        JAMNABAI.add("ARAV");
        JAMNABAI.add("SANJAY");

        listDataChild.put(listDataHeader.get(0), AcharyaAmbalaliVPatelJuniorCollege); // Header, Child data
        listDataChild.put(listDataHeader.get(1), AtharvaMalad);
        listDataChild.put(listDataHeader.get(2), Birla );
        listDataChild.put(listDataHeader.get(3), DJSANGHVI );
        listDataChild.put(listDataHeader.get(4), DYPATILMEDICAL );
        listDataChild.put(listDataHeader.get(5), GovernmentLawCollege );
        listDataChild.put(listDataHeader.get(6), JAIHIND );
        listDataChild.put(listDataHeader.get(7), JAMNABAI );
        listDataChild.put(listDataHeader.get(8), ICT );
        listDataChild.put(listDataHeader.get(9), IITBOMBAY );
        listDataChild.put(listDataHeader.get(10), ISME );
        listDataChild.put(listDataHeader.get(11), ITM );
        listDataChild.put(listDataHeader.get(12), HR );
        listDataChild.put(listDataHeader.get(13), DATTA );
        listDataChild.put(listDataHeader.get(14), RODRIGUES );
        listDataChild.put(listDataHeader.get(15), FLAME );
    }
}

