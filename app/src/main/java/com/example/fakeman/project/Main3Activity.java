package com.example.fakeman.project;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Window g=getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.TYPE_STATUS_BAR);
        final String s=getIntent().getExtras().getString("title");
        final String    sx=getIntent().getExtras().getString("sx");
        TextView    t   =   (TextView)  findViewById(R.id.textView3);
        final TextView    t2  =   (TextView)  findViewById(R.id.textView4);
        final EditText    et  =   (EditText)  findViewById(R.id.editText);
        et.requestFocus();
        Button    fat =   (Button)  findViewById(R.id.floatingActionButton2);

        String s1=part2stringdiv(s);
        final String  s2=part1stringdiv(s);
        t.setText("Please enter the "+s1+" :");
        t2.setText(s2+" : ");
        ImageButton homebtn=(ImageButton)   findViewById(R.id.homee);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main3Activity.this,MainActivity.class);
                startActivity(i);
                Main3Activity.this.finish();

            }

        });
        fat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double  m=0,c=0;
                String es=et.getText().toString();
                if (es.trim().equals("")) {
                    Toast.makeText(getApplicationContext(),"Please fill the required fields",Toast.LENGTH_SHORT).show();
                    }
                    else    if(es.trim().equals("0")){
                    Toast.makeText(getApplicationContext(),"Null Values Are Not Accepted",Toast.LENGTH_SHORT).show();

                }

                else{
                    switch (sx){

                        //RESIDENTIAL CASE
                        case "ResidentialLow Raised ApartmentsPerson TripAM Peak":
                            switch (s){
                                case "No. of Total Person Trips (IN) Vs. No. of Persons Staying in Apartment":
                                    m=0.0953;
                                    c=7.4019;
                                    break;
                                case "No. of Total Person Trips (OUT) Vs. No. of Persons Staying in Apartment":
                                    m=0.162;
                                    c=5.3176;
                                    break;
                                case "No. of Total Person Trips (IN+OUT) Vs. No. of Persons Staying in Apartment":
                                    m=0.2573;
                                    c=12.719;
                                    break;
                                case "No. of Total Person Trips (IN) Vs. No. of Units in Apartment":
                                    m=0.2614;
                                    c=11.436;
                                    break;
                                case "No. of Total Person Trips (OUT) Vs. No. of Units in Apartment":
                                    m=0.4397;
                                    c=12.372;
                                    break;
                                case "No. of Total Person Trips (IN+OUT) Vs. No. of Units in Apartment":
                                    m=0.7011;
                                    c=23.807;
                                    break;
                                case "No. of Total Person Trips (IN) Vs. Gross Floor Area (sq.m)":
                                    m=0.0016;
                                    c=14.715;
                                    break;
                                case "No. of Total Person Trips (OUT) Vs. Gross Floor Area (sq.m)":
                                    m=0.0029;
                                    c=16.889;
                                    break;
                                case "No. of Total Person Trips (IN+OUT) Vs. Gross Floor Area (sq.m)":
                                    m=0.0045;
                                    c=31.605;
                                    break;
                                case "No. of Total Person Trips (IN) Vs. No. of Employees Working for Apartment":
                                    m=4.0434;
                                    c=-6.2843;
                                    break;
                                case "No. of Total Person Trips (OUT) Vs. No. of Employees Working for Apartment":
                                    m=7.359;
                                    c=-21.888;
                                    break;
                                case "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for Apartment":
                                    m=10.33;
                                    c=-18.053;
                                    break;
                            }
                            break;
                        case "ResidentialLow Raised ApartmentsPerson TripPM Peak":
                            switch (s){
                                case    "No. of Total Person Trips (OUT) Vs. No. of Persons Staying in Apartment" :
                                    m=0.2007;
                                    c=3.2968;
                                    break;
                                case    "No. of Total Person Trips (IN+OUT) Vs. No. of Persons Staying in Apartment" :
                                    m=0.4424;
                                    c=6.0191;
                                    break;
                                case    "No. of Total Person Trips (IN) Vs. No. of Units in Apartment" :
                                    m=0.632;
                                    c=14.168;
                                    break;
                                case    "No. of Total Person Trips (OUT) Vs. No. of Units in Apartment" :
                                    m=0.521;
                                    c=12.941;
                                    break;
                                case    "No. of Total Person Trips (IN+OUT) Vs. No. of Units in Apartment" :
                                    m=1.153;
                                    c=27.109;
                                    break;
                                case    "No. of Total Person Trips (IN) Vs. Gross Floor Area (sq.m)" :
                                    m=0.0039;
                                    c=21.551;
                                    break;
                                case    "No. of Total Person Trips (OUT) Vs. Gross Floor Area (sq.m)" :
                                    m=0.0032;
                                    c=19.216;
                                    break;
                                case    "No. of Total Person Trips (IN+OUT) Vs. Gross Floor Area (sq.m)" :
                                    m=0.0072;
                                    c=40.767;
                                    break;
                                case    "No. of Total Person Trips (IN) Vs. No. of Employees Working for Apartment" :
                                    m=8.9093;
                                    c=-16.737;
                                    break;
                                case    "No. of Total Person Trips (OUT) Vs. No. of Employees Working for Apartment" :
                                    m=8.773;
                                    c=-30.385;
                                    break;
                                case    "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for Apartment" :
                                    m=19.514;
                                    c=-65.969;
                                    break;

                            }
                            break;


                        case "ResidentialLow Raised ApartmentsVehicular TripAM Peak":
                            switch (s){
                                case    "No. of PCU Trips (IN)  Vs. No. of Employees Working for Apartment"    :
                                    m=0.7253;
                                    c=-1.5325;
                                    break;

                                case    "No. of PCU Trips (OUT) Vs. No. of Employees Working for Apartment" :
                                    m=1.8476;
                                    c=-6.8898;
                                    break;

                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Employees Working for Apartment"  :
                                    m=2.6235;
                                    c=-9.0873;
                                    break;

                                case    "No. of PCU Trips (IN) Vs. No. of Persons Staying in Apartment" :
                                    m=0.0174;
                                    c=0.6528;
                                    break;

                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Persons Staying in Apartment" :
                                    m=0.0613;
                                    c=0.1795;
                                    break;

                                case    "No. of PCU Trips (IN) Vs. Gross Floor Area (sq.m)" :
                                    m=0.0003;
                                    c=1.8333;
                                    break;

                                case    "No. of PCU Trips (OUT) Vs. Gross Floor Area (sq.m)"    :
                                    m=0.0008;
                                    c=2.4158;
                                    break;

                                case    "No. of PCU Trips (IN+OUT) Vs. Gross Floor Area (sq.m)" :
                                    m=0.007;
                                    c=-0.4197;
                                    break;
                            }
                            break;

                        case "ResidentialLow Raised ApartmentsVehicular TripPM Peak":
                            switch (s){
                                case    "No. of PCU Trips (IN) Vs. No. of Employees Working for Apartment"  :
                                    m=1.8;
                                    c=-4;
                                    break;
                                case        "No. of PCU Trips (OUT) Vs. No. of Employees Working for Apartment" :
                                    m=3;
                                    c=-13;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Employees Working for Apartment"  :
                                    m=1.7644;
                                    c=-1.2037;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. No. of Persons Staying in Apartment" :
                                    m=0.045;
                                    c=0.94;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Persons Staying in Apartment"    :
                                    m=0.090;
                                    c=-0.372;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Persons Staying in Apartment" :
                                    m=0.1348;
                                    c=0.1641;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. Gross Floor Area (sq.m)" :
                                    m=0.0008;
                                    c=4.3963;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. Gross Floor Area (sq.m)"    :
                                    m=0.005;
                                    c=1.8733;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. Gross Floor Area (sq.m)" :
                                    m=0.0007;
                                    c=7.2211;
                                    break;
                            }
                            break;
                        case "ResidentialIndependent HousePerson TripAM Peak":
                            switch (s){
                                case    "No. of Total Person Trips (IN) Vs. No. of Employees Working for House":
                                    m=1.4472;
                                    c=0.6398;
                                    break;
                                case    "No. of Total Person Trips (OUT) Vs. No. of Employees Working for House":
                                    m=1.1667;
                                    c=2.2778;
                                    break;
                                case    "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for House":
                                    m=2.5652;
                                    c=2.7391;
                                    break;
                                case    "No. of Total Person Trips (IN) Vs. No. of Persons Staying in House":
                                    m=1.5;
                                    c=-4.5;
                                    break;
                                case    "No. of Total Person Trips (OUT) Vs. No. of Persons Staying in House":
                                    m=1.0403;
                                    c=-1.7903;
                                    break;
                                case    "No. of Total Person Trips (IN+OUT) Vs. No. of Persons Staying in House":
                                    m=1.7037;
                                    c=-2;
                                    break;
                                case    "No. of Total Person Trips (IN) Vs. Gross Floor Area (sq.m)":
                                    m=0.0059;
                                    c=0.7279;
                                    break;
                                case    "No. of Total Person Trips (OUT) Vs. Gross Floor Area (sq.m)":
                                    m=0.0049;
                                    c=1.8441;
                                    break;
                            }
                            break;
                        case "ResidentialIndependent HousePerson TripPM Peak":
                            switch (s){
                                case    "No. of Total Person Trips (IN) Vs. Gross Floor Area (sq.m)":
                                    m=0.0048;
                                    c=1.1929;
                                    break;
                                case     "No. of Total Person Trips (OUT) Vs. Gross Floor Area (sq.m)" :
                                    m=0.0038;
                                    c=-0.0987;
                                    break;
                                case    "No. of Total Person Trips (IN+OUT) Vs. Gross Floor Area (sq.m)" :
                                    m=0.0086;
                                    c=1.549;
                                    break;
                                case    "No. of Total Person Trips (IN) Vs. No. of Employees Working for House" :
                                    m=1.0104;
                                    c=1.6979;
                                    break;
                                case    "No. of Total Person Trips (OUT) Vs. No. of Employees Working for House" :
                                    m=1.2414;
                                    c=-0.2759;
                                    break;
                                case    "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for House" :
                                    m=2.1;
                                    c=1.7;
                                    break;
                                case    "No. of Total Person Trips (IN) Vs. No. of Persons Staying in House" :
                                    m=0.9603;
                                    c=-1.5563;
                                    break;
                                case    "No. of Total Person Trips (OUT) Vs. No. of Persons Staying in House" :
                                    m=0.7079;
                                    c=-0.9213;
                                    break;
                                case    "No. of Total Person Trips (IN+OUT) Vs. No. of Persons Staying in House":
                                    m=1.55;
                                    c=-2.3056;
                                    break;

                            }
                            break;
                        case "ResidentialIndependent HouseVehicular TripAM Peak":
                            switch (s){
                                case    "No. of PCU Trips (IN) Vs. Gross Floor Area (sq.m)":
                                    m=0.001;
                                    c=0.112;
                                    break;
                                case        "No. of PCU Trips (OUT) Vs. Gross Floor Area (sq.m)":
                                    m=0.0077;
                                    c=-0.4665;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. Gross Floor Area (sq.m)":
                                    m=0.0028;
                                    c=0.4007;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. No. of Persons Staying in House":
                                    m=0.2019;
                                    c=-0.4423;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Persons Staying in House":
                                    m=0.3523;
                                    c=-0.5682;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Persons Staying in House":
                                    m=0.5417;
                                    c=0.9167;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. No. of Employees Working for House":
                                    m=0.3199;
                                    c=0.0062;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Employees Working for House":
                                    m=0.5833;
                                    c=0.2167;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Employees Working for House":
                                    m=0.8864;
                                    c=0.4318;
                                    break;
                            }
                            break;
                        case "ResidentialIndependent HouseVehicular TripPM Peak":
                            switch (s){
                                case    "No. of PCU Trips (IN) Vs. No. of Persons Staying in House":
                                    m=0.1161;
                                    c=0.0893;
                                    break;
                                case        "No. of PCU Trips (OUT) Vs. No. of Persons Staying in House":
                                    m=0.3704;
                                    c=-1.2778;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Persons Staying in House":
                                    m=0.325;
                                    c=-0.36;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. No. of Employees Working for House":
                                    m=0.3;
                                    c=0;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Employees Working for House":
                                    m=0.4444;
                                    c=-0.2222;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Employees Working for House":
                                    m=0.5873;
                                    c=-0.0794;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. Gross Floor Area":
                                    m=0.0012;
                                    c=-0.2316;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. Gross Floor Area":
                                    m=0.001;
                                    c=-0.2795;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. Gross Floor Area":
                                    m=0.0018;
                                    c=-0.1906;
                                    break;
                            }
                            break;
                        case "ResidentialResidential BuildingsPerson TripAM Peak":
                            switch (s){
                                case    "No. of Scooter Person Trips (IN) Vs. No. of Persons Staying in Apartment":
                                    m=0.0412;
                                    c=0.5995;
                                    break;
                                case    "No. of Scooter Person Trips (OUT) Vs. No. of Persons Staying in Apartment":
                                    m=0.083;
                                    c=-2.2908;
                                    break;
                                case    "No. of Scooter Person Trips (IN+ OUT) Vs. No. of Persons Staying in Apartment":
                                    m=0.1243;
                                    c=-1.6913;
                                    break;
                                case    "No. of Scooter Person Trips (IN) Vs. No. of Units in Apartment":
                                    m=0.1077;
                                    c=2.5539;
                                    break;
                                case    "No. of Scooter Person Trips (OUT) Vs. No. of Units in Apartment":
                                    m=0.2238;
                                    c=1.3824;
                                    break;
                                case    "No. of Scooter Person Trips (IN+ OUT) Vs. No. of Units in Apartment":
                                    m=0.3315;
                                    c=3.9363;
                                    break;
                                case    "No. of Scooter Person Trips (IN) Vs. Gross Floor Area (Sq.m)":
                                    m=0.0007;
                                    c=3.6324;
                                    break;
                                case    "No. of Scooter Person Trips (OUT) Vs. Gross Floor Area (Sq.m)":
                                    m=0.0014;
                                    c=3.8525;
                                    break;
                                case    "No. of Scooter Person Trips (IN+ OUT) Vs. Gross Floor Area (Sq.m)":
                                    m=0.0021;
                                    c=7.4849;
                                    break;
                                case    "No. of Scooter Person Trips (IN) Vs. No. of Employees Working for Apartment":
                                    m=1.6467;
                                    c=-3.5097;
                                    break;
                                case    "No. of Scooter Person Trips (OUT) Vs. No. of Employees Working for Apartment":
                                    m=3.4096;
                                    c=-12.241;
                                    break;
                                case    "No. of Scooter Person Trips (IN+ OUT) Vs. No. of Employees Working for Apartment":
                                    m=4.7162;
                                    c=-12.541;
                                    break;
                                case    "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for Apartment":
                                    m=19.514;
                                    c=-65.969;
                                    break;
                            }
                            break;
                        case "ResidentialResidential BuildingsPerson TripPM Peak":
                            switch (s){
                                case    "No. of Scooter Person Trips (IN) Vs. No. of Persons Staying in Apartment":
                                    m=0.0814;
                                    c=0.7497;
                                    break;
                                case    "No. of Scooter Person Trips (OUT) Vs. No. of Persons Staying in Apartment":
                                    m=0.0656;
                                    c=0.7971;
                                    break;
                                case    "No. of Scooter Person Trips (IN+ OUT) Vs. No. of Persons Staying in Apartment":
                                    m=0.147;
                                    c=1.5467;
                                    break;
                                case    "No. of Scooter Person Trips (IN) Vs. No. of Units in Apartment":
                                    m=0.2221;
                                    c=3.1797;
                                    break;
                                case    "No. of Scooter Person Trips (OUT) Vs. No. of Units in Apartment":
                                    m=0.1908;
                                    c=1.2779;
                                    break;
                                case    "No. of Scooter Person Trips (IN+ OUT) Vs. No. of Units in Apartment":
                                    m=0.4128;
                                    c=4.4576;
                                    break;
                                case    "No. of Scooter Person Trips (IN) Vs. Gross Floor Area (Sq.m)":
                                    m=0.0014;
                                    c=6.9943;
                                    break;
                                case    "No. of Scooter Person Trips (OUT) Vs. Gross Floor Area (Sq.m)":
                                    m=0.0011;
                                    c=2.7977;
                                    break;
                                case    "No. of Scooter Person Trips (IN+ OUT) Vs. Gross Floor Area (Sq.m)":
                                    m=0.0024;
                                    c=13.13;
                                    break;
                                case    "No. of Scooter Person Trips (IN) Vs. No. of Employees Working for Apartment":
                                    m=3.2761;
                                    c=-7.5116;
                                    break;
                            }
                            break;
                        case "ResidentialResidential BuildingsVehicular TripAM Peak":
                            switch (s){
                                case    "No. of Car Vehicular Trips (IN) Vs. No. of Employees Working for Apartment":
                                    m=0.1788;
                                    c=-0.7067;
                                    break;
                                case    "No. of Car Vehicular Trips (OUT) Vs. No. of Employees Working for Apartment":
                                    m=0.5988;
                                    c=-2.3699;
                                    break;
                                case    "No. of Car Vehicle Trips (IN+ OUT) Vs. No. of Employees Working for Apartment":
                                    m=0.824;
                                    c=-3.6872;
                                    break;
                                case    "No. of Car Vehicular Trips (IN) Vs. No. of Persons Staying in Apartment":
                                    m=0.0041;
                                    c=-0.2316;
                                    break;
                                case    "No. of Car Vehicle Trips (OUT) Vs.  No. of Persons Staying in Apartment":
                                    m=0.0135;
                                    c=-0.6798;
                                    break;
                                case    "No. of Car Vehicle Trips (IN+ OUT) Vs. No. of Persons Staying in Apartment":
                                    m=0.0189;
                                    c=-1.4968;
                                    break;
                                case    "No. of Car Vehicle Trips (IN) Vs. Gross Floor Area (Sq.m)":
                                    m=7E-05;
                                    c=0.0816;
                                    break;
                                case    "No. of Car Vehicle Trips (OUT) Vs. Gross Floor Area (Sq.m)":
                                    m=0.0002;
                                    c=0.4356;
                                    break;
                                case    "No. of Car Vehicle Trips (IN+ OUT) Vs. Gross Floor Area (Sq.m)":
                                    m=0.0003;
                                    c=0.3489;
                                    break;
                                case    "No. of Scooter Vehicle Trips (IN) Vs. No. of Employees Working for Apartment":
                                    m=1.1542;
                                    c=-2.4554;
                                    break;
                                case    "No. of Scooter Vehicle Trips (OUT) Vs. No. of Employees Working for Apartments":
                                    m=2.6257;
                                    c=-10.723;
                                    break;
                                case    "No. of Scooter Vehicle Trips (IN+ OUT) Vs. No. of Employees Working for Apartment":
                                    m=3.6518;
                                    c=-11.495;
                                    break;
                                case    "No. of Scooter Vehicle Trips (IN) Vs. Gross Floor Area (Sq.m)":
                                    m=0.0005;
                                    c=2.9416;
                                    break;
                                case    "No. of Scooter Vehicle Trips (OUT) Vs. Gross Floor Area (Sq.m)":
                                    m=0.001;
                                    c=2.8212;
                                    break;
                                case    "No. of Scooter Vehicle Trips (IN+ OUT) Vs. Gross Floor Area (Sq.m)":
                                    m=0.0015;
                                    c=6.4413;
                                    break;
                                case    "No. of Scooter Vehicle Trips (IN) Vs. No. of Persons Staying in Apartment":
                                    m=0.028;
                                    c=1.4631;
                                    break;
                                case    "No. of Scooter Vehicle Trips (OUT) Vs. No. of Persons Staying in Apartment":
                                    m=0.0612;
                                    c=-1.7552;
                                    break;
                            }
                            break;
                        case "ResidentialResidential BuildingsVehicular TripPM Peak":
                            switch (s){
                                case    "No. of Car Vehicle Trips (IN+ OUT) Vs. No. of Persons Staying in Apartment":
                                    m=0.0078;
                                    c=2.9733;
                                    break;
                                case    "No. of Car Vehicle Trips (IN+ OUT) Vs. Gross Floor Area (Sq.m)":
                                    m=0.0002;
                                    c=2.213;
                                    break;
                                case    "No. of Scooter Vehicle Trips (IN+ OUT) Vs. No. of Employees Working for Apartment":
                                    m=2.3313;
                                    c=4.7651;
                                    break;
                                case    "No. of Scooter Vehicle Trips (IN+ OUT) Vs. Gross Floor Area (Sq.m)":
                                    m=0.0011;
                                    c=6.4765;
                                    break;
                                case    "No. of Total Vehicle Trips (IN) = Vs.  (0.2417) No. of Persons Staying in Apartment":
                                    m=0.2417;
                                    c=2.7223;
                                    break;
                            }
                            break;


                        //INSTITUTIONAL CASE
                        case "InstitutionalPrimary And Secondary SchoolsPerson TripMorning Session":
                            switch (s){
                                case    "No. of Pedestrians Vs. Gross Floor Area":
                                    m=0.4225;
                                    c=-146.87;
                                    break;
                                case    "No. of Pedestrians Vs. No. of Class Rooms":
                                    m=100.87;
                                    c=-761.25;
                                    break;
                                case    "No. of Pedestrians Vs. No. of Employee":
                                    m=45.745;
                                    c=-492.59;
                                    break;
                                case    "No. of Pedestrians Vs. No. of Persons":
                                    m=0.87;
                                    c=-1.802;
                                    break;
                                case    "No. of Motor Cycles/ Scooter Person Unit Vs. Gross Floor Area":
                                    m=0.0464;
                                    c=-24.157;
                                    break;
                                case    "No. of Motor Cycles/Scooter Person Unit Vs. No. of Class Rooms":
                                    m=5.3747;
                                    c=-43.835;
                                    break;
                                case    "No. of Motor Cycles/ Scooter Person Unit Vs. No. of Employee":
                                    m=2.6;
                                    c=-24;
                                    break;
                                case    "No. of Motor Cycles/ Scooter Person Unit Vs. No. of Persons":
                                    m=0.15;
                                    c=24;
                                    break;
                                case    "No. of Cycle Person Unit Vs. Gross Floor Area":
                                    m=0.0208;
                                    c=9.8513;
                                    break;
                                case    "No. of Cycle Person Unit Vs. No. of Class Rooms":
                                    m=5.472;
                                    c=-42.388;
                                    break;
                                case    "No. of Cycle Person Unit Vs. No. of Employee":
                                    m=3.2942;
                                    c=-42.066;
                                    break;
                                case    "No. of Cycles Person Units Vs. No. of Persons":
                                    m=0.2;
                                    c=-44;
                                    break;
                                case    "Total Person Trips Vs. Gross Floor Area":
                                    m=0.4075;
                                    c=18.356;
                                    break;
                                case    "Total Person Trips Vs. Number of Class Rooms":
                                    m=105.4;
                                    c=-704.21;
                                    break;
                                case    "Total Person Unit Vs. No. of Employee":
                                    m=1.102;
                                    c=-2.603;
                                    break;
                                case    "Total Person Unit Vs. No. of Persons":
                                    m=0.95;
                                    c=24;
                                    break;
                                case    "No. of Bus Person Unit Vs. Gross Floor Area":
                                    m=0.0476;
                                    c=-60.6823;
                                    break;
                                case    "No. of Bus Person Unit Vs. No. of Class Rooms":
                                    m=11.343;
                                    c=-73.683;
                                    break;
                                case    "No. of Bus Person Unit Vs. No. of Employee":
                                    m=7.0984;
                                    c=-64.772;
                                    break;
                                case    "No. of Standard Buses Person Unit Vs. No. of Persons":
                                    m=0.0095;
                                    c=-0.43;
                                    break;
                                case    "No. of Car/Jeep/Van Person Unit Vs. Gross Floor Area":
                                    m=0.0017;
                                    c=-0.2624;
                                    break;
                                case    "No. of Car/Jeep/Van Person Unit Vs. No. of Class Rooms":
                                    m=0.439;
                                    c=3.3092;
                                    break;
                                case    "No. of Car/Van/Jeep Person Unit Vs. No. of Employee":
                                    m=0.2179;
                                    c=-1.5137;
                                    break;
                                case    "No. of Car/Van/Jeep Person Units Vs. No. of Persons":
                                    m=0.014;
                                    c=-1.2;
                                    break;
                            }
                            break;
                        case "InstitutionalPrimary And Secondary SchoolsPerson TripEvening Session":
                            switch (s){
                                case    "No. of Motor Cycle Person Unit Vs. Gross Floor Area":
                                    m=0.0068;
                                    c=-0.5925;
                                    break;
                                case    "No. of Motor Cycle Person Unit Vs. No. of Class Rooms":
                                    m=5.4734;
                                    c=-44.451;
                                    break;
                                case    "No. of Motor Cycle Person Unit Vs. No. of Employees":
                                    m=2.122;
                                    c=-21.063;
                                    break;
                                case    "No. of Motor Cycle Person Vs. No. of Persons":
                                    m=0.1179;
                                    c=-16.37;
                                    break;
                                case    "No. of Cycle Person Unit Vs. Gross Floor Area":
                                    m=0.0258;
                                    c=7.4159;
                                    break;
                                case    "No. of Cycles Person Unit Vs. No. of Class Rooms":
                                    m=5.7425;
                                    c=-47.451;
                                    break;
                                case    "No. of Cycle Person Trips Vs. No. of Employees":
                                    m=3.5166;
                                    c=-45.538;
                                    break;
                                case    "No. of Cycles Person Unit Vs. No. of Persons":
                                    m=0.2134;
                                    c=-46.646;
                                    break;
                                case    "Total Person Trip Vs. Gross Floor Area":
                                    m=0.4329;
                                    c=3.6315;
                                    break;
                                case    "Total Person Trips Vs. No. of Persons":
                                    m=0.9852;
                                    c=-38.895;
                                    break;
                                case    "No. of Buses Person Unit Vs. Gross Floor Area":
                                    m=0.0463;
                                    c=-3.189;
                                    break;
                                case    "No. of Buses Person Unit Vs. No. of Class Rooms":
                                    m=12.432;
                                    c=-50.11;
                                    break;
                                case    "No. of Bus Person Unit Vs. No. of Employees":
                                    m=7.2599;
                                    c=-64.329;
                                    break;
                                case    "No. of Standard Buses Person Unit Vs. No. of Persons":
                                    m=0.4407;
                                    c=-82.776;
                                    break;
                                case    "No. of Car Person Unit Vs. Gross Floor Area":
                                    m=0.0018;
                                    c=-0.1058;
                                    break;
                                case    "No. of Car/Jeep/Van Person Unit Vs. No. of Class Rooms":
                                    m=0.439;
                                    c=-3.3092;
                                    break;
                                case    "No. of Car Person Unit Vs. No. of Employees":
                                    m=0.2597;
                                    c=-1.9764;
                                    break;
                                case    "No. of Car Person Unit Vs. No. of Persons":
                                    m=0.0148;
                                    c=-2.7186;
                                    break;
                                case    "No. of Pedestrians Vs. Gross Floor Area":
                                    m=0.4439;
                                    c=-151.45;
                                    break;
                                case    "No. of Pedestrians Vs. No. of Employees":
                                    m=47.221;
                                    c=-491.88;
                                    break;
                                case    "No. of Pedestrians Vs. No. of Persons":
                                    m=0.9174;
                                    c=-189.23;
                                    break;
                                case    "Total Persons Trip Vs. No. of Employees":
                                    m=49.356;
                                    c=-506.88;
                                    break;
                            }
                            break;
                        case "InstitutionalPrimary And Secondary SchoolsVehicular TripMorning Session":
                            switch (s){
                                case    "No. of Car/Van/Jeep Vehicular Unit Vs. Total Gross Floor Area":
                                    m=0.0016;
                                    c=-0.4372;
                                    break;
                                case    "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Class Rooms":
                                    m=0.439;
                                    c=-3.6485;
                                    break;
                                case    "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Employees":
                                    m=0.2513;
                                    c=-1.9597;
                                    break;
                                case    "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Persons":
                                    m=0.0142;
                                    c=-2.7423;
                                    break;
                                case    "No. of Motor Cycles/Scooters Vehicular Unit Vs. Total Gross Floor Area":
                                    m=0.0008;
                                    c=0.0687;
                                    break;
                                case    "No. of Motor Cycle/Scooter Vehicular Unit Vs. Total No. of Class Rooms":
                                    m=2.6873;
                                    c=-21.918;
                                    break;
                                case    "No. of Motor Cycles/ Scooter Vehicular Unit Vs. No. of Employees":
                                    m=1.1426;
                                    c=-10.805;
                                    break;
                                case    "No. of Motor Cycles/Scooter Vehicular Unit Vs. No. of Persons":
                                    m=0.0749;
                                    c=-11.933;
                                    break;
                                case    "No. of Standard Buses Vehicular Unit Vs. Total Gross Floor Area":
                                    m=0.0035;
                                    c=0.3293;
                                    break;
                                case    "No. of Standard Bus Vehicular Unit Vs. No. of Class Rooms":
                                    m=0.8507;
                                    c=-5.5262;
                                    break;
                                case    "No. of Standard Bus Vehicular Unit Vs. No. of Employees":
                                    m=0.5555;
                                    c=-3.7351;
                                    break;
                                case    "No. of Standard Bus Vehicular Unit Vs. No. of Persons":
                                    m=0.0309;
                                    c=-5.1932;
                                    break;
                                case    "No. of Cycle Vehicular Unit Vs. Total Gross Floor Area":
                                    m=0.0104;
                                    c=4.9257;
                                    break;
                                case    "No. of Cycle Vehicular Unit Vs. Total No. of Class Rooms":
                                    m=2.736;
                                    c=-22.694;
                                    break;
                                case    "No. of Cycle Vehicular Unit Vs. No. of Employees":
                                    m=1.6471;
                                    c=-21.033;
                                    break;
                                case    "No. of Cycle Vehicular Unit Vs. No. of Persons":
                                    m=0.1013;
                                    c=-21.932;
                                    break;
                                case    "No. of PCU Trips Vs. Total Gross Floor Area":
                                    m=0.0008;
                                    c=0.0687;
                                    break;
                                case    "Total No. of PCU Units Vs. Total No. of Class Rooms":
                                    m=3.8342;
                                    c=-20.514;
                                    break;
                                case    "Total No. of PCU Units Vs. No. of Employees":
                                    m=2.4271;
                                    c=-20.925;
                                    break;
                                case    "No. of PCU Units Vs. No. of Persons":
                                    m=0.1599;
                                    c=-24.933;
                                    break;
                            }
                            break;
                        case "InstitutionalPrimary And Secondary SchoolsVehicular TripEvening Session":
                            switch (s){
                                case    "No. of Cycle Vehicular Unit Vs. Gross Floor Area":
                                    m=0.0258;
                                    c=7.4159;
                                    break;
                                case    "No. of Cycles Vehicular Unit Vs. No. of Class Rooms":
                                    m=5.7425;
                                    c=-47.451;
                                    break;
                                case    "No. of Cycle Vehicular Unit Vs. No. of Employees" :
                                    m=3.5166;
                                    c=-45.538;
                                    break;
                                case    "No. of Cycle Vehicular Unit Vs. No. of Persons" :
                                    m=0.2134;
                                    c=-46.646;
                                    break;
                                case    "No. of Motor Cycles Vehicular Unit Vs. No. of Employees":
                                    m=2.122;
                                    c=-21.063;
                                    break;
                                case    "No. of Motor Cycles Vehicular Unit Vs. No. of Persons" :
                                    m=0.1179;
                                    c=-16.646;
                                    break;
                                case    "No. of Buses Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.0012;
                                    c=-0.0797;
                                    break;
                                case    "No. of Buses Vehicular Unit Vs. No. of Class Rooms" :
                                    m=0.3108;
                                    c=-1.2528;
                                    break;
                                case    "No. of Standard Buses Vehicular Unit Vs. No. of Employees" :
                                    m=0.1815;
                                    c=-1.6082;
                                    break;
                                case    "No. of Standard Buses Vehicular Unit Vs. No. of Persons" :
                                    m=0.011;
                                    c=-2.0694;
                                    break;
                                case    "No. of PCU Units Vs. Gross Floor Area" :
                                    m=0.0178;
                                    c=13.827;
                                    break;
                                case    "No. of PCU Units Vs. No. of Class Rooms" :
                                    m=3.969;
                                    c=-20.588;
                                    break;
                                case    "No. of PCU Trips Vs. No. of Employees" :
                                    m=2.548;
                                    c=-22.366;
                                    break;
                                case    "No. of PCU Trips Vs. No. of Persons" :
                                    m=0.1656;
                                    c=-25.13;
                                    break;
                                case    "No. of Car Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.00108;
                                    c=-0.01058;
                                    break;
                                case    "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Class Rooms":
                                    m=0.439;
                                    c=-3.3092;
                                    break;
                                case    "No. of Car Vehicular Unit Vs. No. of Employees" :
                                    m=0.257;
                                    c=-1.9764;
                                    break;
                                case    "No. of Car Vehicular Unit Vs. No. of Persons":
                                    m=0.048;
                                    c=-2.7186;
                                    break;
                            }
                            break;
                        case "InstitutionalIntermediate CollegePerson TripMorning Session":
                            switch (s){
                                case    "No. of Auto Rickshaw Person Unit Vs. Gross Floor Area":
                                    m=0.0343;
                                    c=5.7073;
                                    break;
                                case    "No. of Auto Rickshaw Person Unit Vs. No. of Class Rooms":
                                    m=1.3;
                                    c=-14;
                                    break;
                                case    "No. of Auto Rickshaw Person Unit Vs. No. of Employee":
                                    m=2.6;
                                    c=9.1;
                                    break;
                                case    "No. of Auto Rickshaw Person Unit Vs. No. of Persons":
                                    m=0.077;
                                    c=-22;
                                    break;
                                case    "No. of Cycle Person Unit Vs. Gross Floor Area":
                                    m=0.0128;
                                    c=40.343;
                                    break;
                                case    "No. of Cycles Person Unit Vs. No. of Class Rooms":
                                    m=2.5;
                                    c=-5.3;
                                    break;
                                case    "No. of Cycles Person Unit Vs. No. of Employee":
                                    m=1.9;
                                    c=-1.8;
                                    break;
                                case    "No. of Cycles Person Unit Vs. No. of Persons":
                                    m=0.17;
                                    c=-30;
                                    break;
                                case    "Total Person Units Vs. Gross Floor Area":
                                    m=0.076;
                                    c=0.42;
                                    break;
                                case    "Total Person Units Vs. No. of Class Rooms":
                                    m=25;
                                    c=35;
                                    break;
                                case    "Total Person Units Vs. No. of Employees":
                                    m=15;
                                    c=37;
                                    break;
                                case    "Total Person Units Vs. No. of Persons":
                                    m=1.2;
                                    c=-96;
                                    break;
                                case    "No. of Pedestrians Vs. Gross Floor Area":
                                    m=0.0538;
                                    c=278.46;
                                    break;
                                case    "No. of Pedestrians Vs. No. of Class Rooms":
                                    m=35;
                                    c=-0.2802;
                                    break;
                                case    "No. of Pedestrians Vs. No. of Employee":
                                    m=15;
                                    c=-1.402;
                                    break;
                                case    "No. of Pedestrians Vs. No. of Persons":
                                    m=1.5;
                                    c=-3.2;
                                    break;
                                case    "No. of Car/Van/Jeep Person Units Vs. No. of Class Rooms":
                                    m=0.71;
                                    c=-11;
                                    break;
                                case    "No. of Car/Van/Jeep Person Units Vs. No. of Employee":
                                    m=0.31;
                                    c=-3.8;
                                    break;
                                case    "No. of Car/Van/Jeep Person Units Vs. No. of Persons":
                                    m=0.032;
                                    c=-9.3;
                                    break;
                                case    "No. of Motor Cycles/ Scooter Person Unit Vs. No. of Class Rooms":
                                    m=0.6;
                                    c=2.3;
                                    break;
                                case    "No. of Motor Cycles/Scooters Person Units Vs. No. of Employee":
                                    m=0.41;
                                    c=1.1;
                                    break;
                                case    "No. of Motor Cycles/ Scooter Person Unit Vs. No. of Persons":
                                    m=0.035;
                                    c=-3.7;
                                    break;
                            }
                            break;
                        case"InstitutionalIntermediate CollegePerson TripEvening Session":
                            switch (s){
                                case    "No. of Auto Rickshaw Person Unit Vs. Gross Floor Area" :
                                    m=0.0302;
                                    c=0.1973;
                                    break;
                                case    "No. of Auto Rikshaw Person Unit Vs. No. of Total Units" :
                                    m=3.1312;
                                    c=14.842;
                                    break;
                                case    "No. of Auto Rickshaw Person Unit Vs. No. of Employee" :
                                    m=3.2489;
                                    c=-12.924;
                                    break;
                                case    "No. of Auto Rickshaw Person Unit Vs. No. of Persons" :
                                    m=0.054;
                                    c=-5.6;
                                    break;
                                case    "No. of Car/Jeep/Van Person Unit Vs. Gross Floor Area" :
                                    m=0.0006;
                                    c=2.0078;
                                    break;
                                case    "No. of Car/Jeep/Van Person Unit Vs. No. of Class Rooms" :
                                    m=0.68;
                                    c=-9.1;
                                    break;
                                case    "No. of Car/Van/Jeep Person Unit Vs. No. of Employee" :
                                    m=0.3029;
                                    c=1.3792;
                                    break;
                                case    "No. of Car/Jeep/Van Person Unit Vs. No. of Persons" :
                                    m=0.026;
                                    c=-5.7;
                                    break;
                                case    "No. of Cycle Person Unit Vs. Gross Floor Area" :
                                    m=0.0131;
                                    c=-38.601;
                                    break;
                                case    "No. of Cycle Person Unit Vs. No. of Total Units" :
                                    m=3.9757;
                                    c=-16.018;
                                    break;
                                case    "No. of Cycle Person Unit Vs. No. of Employee" :
                                    m=1.6394;
                                    c=7.7123;
                                    break;
                                case    "No. of Cycle Person Unit Vs. No. of Persons" :
                                    m=0.29;
                                    c=-88;
                                    break;
                                case    "No. of Motor Cycles/Scooter Person Unit Vs. Gross Floor Area" :
                                    m=0.0002;
                                    c=10.221;
                                    break;
                                case    "No. of Motor Cycles/Scooter Person Unit Vs. Total Units" :
                                    m=0.039757;
                                    c=11.142;
                                    break;
                                case    "No. of Motor Cycles/Scooter Person Unit Vs. No. of Employees" :
                                    m=0.5138;
                                    c=2.2888;
                                    break;
                                case    "No. of Motor Cycles/Scooter Person Unit Vs. No. of Persons" :
                                    m=0.0202;
                                    c=6.0073;
                                    break;
                                case    "No. of Pedestrians Vs. Gross Floor Area" :
                                    m=0.0981;
                                    c=191.37;
                                    break;
                                case    "No. of Pedestrians Vs. No. of Total Units":
                                    m=25.159;
                                    c=-40.856;
                                    break;
                                case    "No. of Pedestrians Vs. No. of Employees" :
                                    m=21;
                                    c=-2.6888;
                                    break;
                                case    "No. of Pedestrians Vs. No. of Persons" :
                                    m=0.9731;
                                    c=-128.42;
                                    break;
                                case    "Total Person Units Vs. Gross Floor Area " :
                                    m=0.0773;
                                    c=288.76;
                                    break;
                                case    "Total Person Units Vs. No. of Total Units" :
                                    m=23.956;
                                    c=109.94;
                                    break;
                                case    "Total Person Units Vs. No. of Employee" :
                                    m=19.893;
                                    c=-123.76;
                                    break;
                                case    "Total Person Units Vs. No. of Persons":
                                    m=0.9184;
                                    c=-12.208;
                                    break;
                            }
                            break;
                        case "InstitutionalIntermediate CollegeVehicular TripMorning Session":
                            switch (s){
                                case    "No. of Cycle Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.0036;
                                    c=23;
                                    break;
                                case    "No. of Cycles Vehicular Unit Vs. No. of Class Rooms" :
                                    m=2.2;
                                    c=-20;
                                    break;
                                case    "No. of Cycles Vehicular Unit Vs. No. of Employees" :
                                    m=2.3;
                                    c=-13;
                                    break;
                                case    "No. of Cycles Vehicular Unit Vs. No. of Persons" :
                                    m=0.085;
                                    c=-14;
                                    break;
                                case    "No. of Motor Cycles Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.035;
                                    c=5;
                                    break;
                                case    "No. of Motor Cycles/Scooter Vehicular Unit Vs. No. of Class Rooms" :
                                    m=0.94;
                                    c=-12;
                                    break;
                                case    "No. of Motor Cycle/Scooter Vehicular Unit Vs. No. of Employee" :
                                    m=2.3;
                                    c=-13;
                                    break;
                                case    "No. of Motor Cycles/Scooter Vehicular Unit Vs. No. of Persons" :
                                    m=0.025;
                                    c=-5.6;
                                    break;
                                case    "No. of Auto Rickshaw Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.0025;
                                    c=21;
                                    break;
                                case    "No. of Auto Rickshaw Vehicular Unit Vs. No. of Class Rooms" :
                                    m=2;
                                    c=-30;
                                    break;
                                case    "No. of Auto Rickshaw Vehicular Unit Vs. No. of Employees" :
                                    m=0.93;
                                    c=-10;
                                    break;
                                case    "No. of Auto Rickshaw Vehicular Unit Vs. No. of Persons" :
                                    m=0.077;
                                    c=-22;
                                    break;
                                case    "No. of Car/Jeep/Van Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.0012;
                                    c=-2.3;
                                    break;
                                case    "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Class Rooms" :
                                    m=0.48;
                                    c=-5.3;
                                    break;
                                case    "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Employees" :
                                    m=0.31;
                                    c=-3.8;
                                    break;
                                case    "No. of Car/Jeep/Van Vehicular Unit Vs.   No. of Persons":
                                    m=0.032;
                                    c=-9.3;
                                    break;
                                case    "Total PCU Trips Vs. Gross Floor Area" :
                                    m=0.011;
                                    c=37;
                                    break;
                                case    "Total Vehicular Units Vs. No. of Class Rooms" :
                                    m=3.3;
                                    c=-19;
                                    break;
                                case    "Total PCU Trips Vs. No. of Employee":
                                    m=2;
                                    c=7.1;
                                    break;
                            }
                            break;
                        case "InstitutionalIntermediate CollegeVehicular TripEvening Session":
                            switch (s){
                                case    "Total Vehicular Unit Vs. Gross Floor Area " :
                                    m=0.0165;
                                    c=30.143;
                                    break;
                                case    "Total PCU Trips Vs. No. of Class Rooms" :
                                    m=4;
                                    c=21;
                                    break;
                                case    "Total Vehicular Units Vs. No. of Employee" :
                                    m=1.4525;
                                    c=22.73;
                                    break;
                                case    "No. of Motor Cycles/Scooters Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.0011;
                                    c=6.1096;
                                    break;
                                case    "No. of Motor Cycles Scooter Vehicular Units Vs. No. of Total Units" :
                                    m=0.4861;
                                    c=-2.6308;
                                    break;
                                case    "No. of Motor Cycles/ Scooter Vs. No. of Employee " :
                                    m=0.2319;
                                    c=2.0057;
                                    break;
                                case    "No. of Motor Cycles/Scooters Vehicular Unit Vs. No. of Persons" :
                                    m=0.0096;
                                    c=3.8485;
                                    break;
                                case    "No. of Cycle Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.0066;
                                    c=19.501;
                                    break;
                                case    "No. of Cycle Vehicular Unit Vs. Total Units " :
                                    m=0.5307;
                                    c=12.511;
                                    break;
                                case    "No. of Cycles Vehicular Unit Vs. No. of Employees" :
                                    m=0.7899;
                                    c=5.2462;
                                    break;
                                case    "No. of Cycle Vehicular Unit Vs. No. of Persons" :
                                    m=0.0528;
                                    c=0.8952;
                                    break;
                                case    "No. of Car/Jeep/Van Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.002;
                                    c=1.0765;
                                    break;
                                case    "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Class Rooms" :
                                    m=0.69;
                                    c=-8.5;
                                    break;
                                case    "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Employee " :
                                    m=0.84;
                                    c=-16;
                                    break;
                                case    "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Persons " :
                                    m=0.034;
                                    c=-11;
                                    break;
                                case    "No. of Auto Rickshaw Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.0043;
                                    c=6.1373;
                                    break;
                                case    "No. of Auto Rickshaw Vehicular Unit Vs. Total Units" :
                                    m=0.7057;
                                    c=4.4059;
                                    break;
                                case    "No. of Auto Rickshaw Vehicular Unit Vs. No. of Employee" :
                                    m=0.633;
                                    c=1.5941;
                                    break;
                                case    "No. of Auto Rickshaw Person Unit Vs. No. of Persons" :
                                    m=0.061;
                                    c=-7.6;
                                    break;
                            }
                            break;
                        case "InstitutionalDegree CollegePerson TripMorning Session":
                            switch (s){
                                case      "Total Person Unit Vs. Gross Floor Area":
                                     m=0.00034;
                                     c=0.0045;
                                     break;
                                case         "Total Person Unit Vs. Number of Class Rooms":
                                     m=23;
                                     c=-0.0019;
                                     break;
                                case        "Total Person Unit Vs. No. of Employee":
                                     m=32;
                                     c=-0.0027;
                                     break;
                                case        "Total Person Unit Vs. Number of Persons":
                                     m=0.91;
                                     c=-85;
                                     break;
                                case         "No. of Standard Bus Person Unit Vs. Gross Floor Area":
                                     m=0.00041;
                                     c=0.47;
                                     break;
                                case         "Standard Bus Person Unit Vs. No. of Class Rooms":
                                     m=0.26;
                                     c=-3.6;
                                     break;
                                case         "No. of Standard Bus Person Unit Vs. No. of Employees":
                                     m=0.08;
                                     c=-2.4;
                                     break;
                                case         "No. of Standard Buses Person Unit Vs. No. of Persons":
                                     m=0.0055;
                                     c=-1.3;
                                     break;
                                case         "Pedestrians Vs. Gross Floor Area":
                                     m=0.41;
                                     c=-3.2;
                                     break;
                                case         "Pedestrians Vs. No. of Class Rooms ":
                                     m=1.7;
                                     c=-0.93;
                                     break;
                                case         "No. of Pedestrians Vs. No. of Persons":
                                     m=0.95;
                                     c=-0.0013;
                                     break;
                                case         "No. of Motor Cycles/ Scooter Person Unit Vs. Gross Floor Area":
                                     m=0.027;
                                     c=-1.2;
                                     break;
                                case         "Motorcycles/Scooter Person Unit Vs. No. of Class Rooms":
                                     m=1.7;
                                     c=-0.93;
                                     break;
                                case         "No. of Motor Cycles/ Scooter Person Unit Vs. No. of Persons ":
                                     m=0.079;
                                     c=-9.4;
                                     break;
                                case         "No. of Car/Jeep/Van Person Unit Vs. Gross Floor Area":
                                     m=0.0067;
                                     c=-7.5;
                                     break;
                                case         "No. of Car/Jeep/Van Person Unit Vs. No. of Class Rooms":
                                     m=0.39;
                                     c=-5.2;
                                     break;
                                case         "No. of Car/Van/Jeep Person Unit Vs. No. of Employees":
                                     m=0.18;
                                     c=-2.3;
                                     break;
                                case         "Car/Van/Jeep Person Unit Vs. No. of Persons ":
                                    m=0.018;
                                    c=-3.2;
                                    break;

                            }
                            break;
                        case "InstitutionalDegree CollegePerson TripEvening Session":
                            switch (s){
                                case         "No. of Car Person Unit Vs. Gross Floor Area":
                                     m=1E-05;
                                     c=0.9222;
                                     break;
                                case         "No. of Car/Jeep/Van Person Unit Vs. No. of Class Rooms":
                                     m=0.3792;
                                     c=-5.2173;
                                     break;
                                case         "No. of Car/Van/Jeep Person Unit Vs. No. of Employees":
                                     m=0.1454;
                                     c=-2.3015;
                                     break;
                                case        "No. of Car/Jeep/Van Person Unit Vs. No. of Students ":
                                     m=0.0178;
                                     c=-3.1527;
                                     break;
                                case         "No. of Bus Person Unit Vs. Gross Floor Area":
                                     m=0.0017;
                                     c=55.231;
                                     break;
                                case        "No. of Buses Person Unit Vs. No. of Class Rooms ":
                                    m=8.1688;
                                    c=-111.12;
                                    break;
                                case        "No. of Bus Person Unit Vs. No. of Employee":
                                    m=3.3568;
                                    c=-104.47;
                                    break;
                                case        "No. of Buses Person Unit Vs. No. of Students ":
                                    m=0.2352;
                                    c=-61.767;
                                    break;
                                case        "Total Person Trip Vs. Gross Floor Area":
                                    m=0.0033;
                                    c=510.83;
                                    break;
                                case        "Total Person Unit Vs. No. of Class Rooms":
                                    m=18.855;
                                    c=-20.539;
                                    break;
                                case        "Total Person Trip Vs. No. of Employee":
                                    m=7.5794;
                                    c=213.86;
                                    break;
                                case        "No. of Total Person Unit Vs. No. of Students":
                                    m=0.6421;
                                    c=-154.07;
                                    break;
                                case        "No. of Persons Vs. No. of Employees":
                                    m=1.7352;
                                    c=137.05;
                                    break;
                                case        "No. of Persons Vs. No. of Students ":
                                    m=0.0663;
                                    c=-7.2512;
                                    break;
                                case        "Total No. of Pedestrians Vs. No. of Class Rooms":
                                    m=37.602;
                                    c=-102.8;
                                    break;
                                case        "Total No. of Pedestrians Vs. Gross Floor Area" :
                                    m=0.0176;
                                    c=100.63;
                                    break;
                                case        "No. of Motor Cycles/ Scooter Person Unit Vs. Gross Floor Area":
                                    m=0.0008;
                                    c=3.6392;
                                    break;

                        }
                        break;
                        case "InstitutionalDegree CollegeVehicular TripMorning Session":
                            switch (s){
                                case        "Total PCU Vs. Gross Floor Area" :
                                     m=0.026;
                                     c=-18;
                                     break;
                                case        "Total PCU Vs. No. of Class Rooms" :
                                    m=1.1;
                                    c=0.65;
                                    break;
                                case        "Total PCU Vs. No. of Employees" :
                                    m=0.71;
                                    c=-1.8;
                                    break;
                                case        "Total PCU Vs. No. of Persons" :
                                    m=0.071;
                                    c=-8.6;
                                    break;
                                case        "No. of Motor Cycles/Scooters Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.014;
                                    c=-6;
                                    break;
                                    case       "No. of Motor Cycles/Scooter Vehicular Units Vs. No. of Class Rooms" :
                                    m=0.87;
                                    c=0.75;
                                    break;
                                case       "No. of Motor Cycle/Scooter Vehicular Unit Vs. No. of Employees" :
                                   m=0.37;
                                    c=2.3;
                                    break;
                                    case        "No. of Motor Cycles/ Scooter Vehicular Unit Vs. No. of Persons" :
                                    m=0.038;
                                    c=-3.6;
                                    break;
                               case       "No. of Car/Jeep/Van Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.0066;
                                    c=-5.9;
                                    break;
                                case       "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Class Rooms" :
                                    m=0.44;
                                    c=-6;
                                    break;
                                case       "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Employees" :
                                    m=0.17;
                                    c=-3.1;
                                    break;
                                case        "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Persons" :
                                   m=0.018;
                                    c=-3.2;
                                    break;
                                case        "No. of Standard Buses Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.00012;
                                    c=-1.4;
                                    break;
                                case        "No. of Standard Bus Vehicular Unit Vs. No. of Class Rooms":
                                    m=0.75;
                                    c=-9.1;
                                    break;
                                case  "No. of Standard Bus Vehicular Unit Vs No. of Employees":
                                    m=0.24;
                                    c=-7.2;
                                    break;
                                case "No. of Standard Bus Vehicular Unit Vs No. of Person":
                                    m=0.017;
                                    c=-3.8;
                                    break;

                            }
                            break;
                        case "InstitutionalDegree CollegeVehicular TripEvening Session":
                            switch (s){
                                case       "No. of Car Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.0005;
                                    c=-0.4181;
                                    break;
                                case       "No. of Car Vehicular Unit Vs. No. of Class Rooms" :
                                    m=0.38;
                                    c=-5.2;
                                    break;
                                case       "No. of Car Vehicular Unit Vs. No. of Employee" :
                                    m=0.1565;
                                    c=-4.1643;
                                    break;
                                case       "No. of Motor Cycles/Scooters Vehicular Unit Vs. Gross Floor Area" :
                                    m=0.0008;
                                    c=3.6392;
                                    break;
                                case       "No. of Motor Cycles Vehicular Unit Vs. No. of Class Rooms" :
                                    m=1.2943;
                                    c=4.6111;
                                    break;
                                case       "No. of Motor Cycles Vehicular Unit Vs. No. of Employees" :
                                    m=0.6474;
                                    c=-4.6007;
                                    break;
                                case       "No. of PCU Units Vs. Gross Floor Area" :
                                    m=0.0001;
                                    c=9.4575;
                                    break;
                                case       "No. of PCU Units Vs. No. of Class Rooms" :
                                    m=0.9724;
                                    c=-0.2508;
                                    break;
                                case       "No. of PCU Trips Vs. No. of Employees" :
                                    m=0.3802;
                                    c=-1.3759;
                                    break;
                                case       "No. of PCU Units Vs. No. of Pedestrians" :
                                    m=0.0202;
                                    c=5.8297;
                                    break;
                                case       "No. of Standard Bus Vehicular Unit Vs. Gross Floor Area" :
                                    m=4E-05;
                                    c=1.6637;
                                    break;
                                case       "No. of Standard Bus Vehicular Unit Vs. No. of Class Rooms" :
                                    m=0.2042;
                                    c=-2.778;
                                    break;
                                case       "No. of Standard Bus Vehicular Unit Vs. No. of Employee":
                                    m=0.0839;
                                    c=-2.6118;
                                    break;

                            }
                            break;


                        //COMMERCIAL CASE
                        case "CommercialHotelsPerson TripAfternoon Peak":
                            switch (s){
                                case        "No. of Car Person Trips (IN) Vs. No. of Employees Working" :
                                     m=0.6901;
                                     c=-30.843;
                                     break;
                               case       "No. of Car Person Trips (OUT) Vs. No. of Employees Working for Hotel" :
                                    m=0.2693;
                                    c=-8.6138;
                                    break;
                                case       "No. of Car Person Trips (IN+OUT) Vs. No. of Employees Working for Hotel" :
                                    m=0.96;
                                    c=-42.926;
                                    break;
                                case       "No. of Scooter Person Trips (IN) Vs. No. of Employees Working" :
                                    m=0.2805;
                                    c=-13.533;
                                    break;
                                case       "No. of Scooters Person Trips (IN+OUT) Vs. No. of Employees Working in Hotel" :
                                    m=0.5208;
                                    c=-25.527;
                                    break;
                                case       "No. of Scooter Person Trips (OUT) Vs. No. of Persons Visiting Hotel" :
                                    m=0.1841;
                                    c=-11.052;
                                    break;
                                case       "No. of Scooter Person Trips (IN+OUT) Vs. No. of Person Visiting Hotel" :
                                    m=0.2917;
                                    c=-24.27;
                                    break;
                                case       "No. of Total Person Trips (IN) Vs. No. of Seats in Hotel" :
                                    m=0.8766;
                                    c=-56154;
                                    break;
                                case       "No. of Total Person Trips (OUT) Vs. No. of Seats in Hotel" :
                                    m=0.4018;
                                    c=-4.605;
                                    break;
                                case       "No. of Total Person Trips (IN+OUT) Vs. No. of Seats in Hotel" :
                                    m=102677;
                                    c=-47.36;
                                    break;
                                    case       "No. of Total Person Trips (IN) Vs. No. of Beds in Hotel" :
                                    m=1.4781;
                                    c=0.1294;
                                    break;
                                case       "No. of Total Person Trips (IN) Vs. Gross Floor Area (acres)" :
                                    m=15.361;
                                    c=-91.708;
                                    break;
                                case       "No. of Total Person Trips (OUT) Vs. Gross Floor Area (acres)" :
                                    m=9.2945;
                                    c=-71.094;
                                    break;
                                case       "No. of Total Person Trips (IN+OUT) Vs. Gross Floor Area (acres)" :
                                    m=27.043;
                                    c=-213.03;
                                    break;
                                case       "No. of Total Person Trips (IN) Vs. No. of Rooms in Hotel" :
                                    m=3.0117;
                                    c=-25.458;
                                    break;
                                 case  "No. of Total Person Trips (OUT) Vs. No. of Rooms in Hotel" :
                                     m=1.286;
                                     c=17.451;
                                case        "No. of Total Person Trips (IN+OUT) Vs. No. of Rooms in Hotel" :
                                    m=4.2499;
                                    c=11.216;
                                    break;
                                case       "No. of Total Person Trips (IN) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.5411;
                                    c=-95.842;
                                    break;
                                case       "No. of Total Person Trips (OUT) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.2196;
                                    c=-5.0023;
                                    break;
                                case       "No. of Total Person Trips (IN+OUT) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.5302;
                                    c=9.742;
                                    break;
                                case       "No. of Total Person Trips (IN) Vs. No. of Employees Working for Hotel" :
                                    m=1.2651;
                                    c=-36.363;
                                    break;
                                case       "No. of Total Person Trips (OUT) Vs. No. of Employees Working for Hotel" :
                                    m=0.6504;
                                    c=-8.0046;
                                    break;
                               case       "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for Hotel":
                                    m=2.0102;
                                    c=-43.119;
                                    break;
                            }
                            break;
                        case "CommercialHotelsPerson TripEvening Peak":
                            switch (s){
                                case         "No. of Total Person Trips (IN) Vs. No. of Seats in Hotel" :
                                    m=0.7807;
                                    c=38.228;
                                    break;
                                case         "No. of Total Person Trips (OUT) Vs. No. of Seats in Hotel" :
                                    m=0.5862;
                                    c=-21.779;
                                    break;
                                case        "No. of Total Person Trips (IN+OUT) Vs.  No. of Seats in Hotel" :
                                    m=1.127;
                                    c=75.328;
                                    break;
                                case        "No. of Total Person Trips (IN) Vs. No. of Beds in Hotel" :
                                    m=1.0385;
                                    c=101.76;
                                    break;
                                case        "No. of Total Person Trips (OUT) Vs. No. of Beds in Hotel" :
                                    m=2.2723;
                                    c=-85.328;
                                    break;
                                case        "No. of Total Person Trips (IN+OUT) Vs. No. of Beds in Hotel":
                                    m=2.1485;
                                    c=147023;
                                    break;
                                case        "No. of Total Person Trips (IN) Vs. Gross Floor Area (acres)" :
                                    m=7.0042;
                                    c=128.58;
                                    break;
                                case        "No. of Total Person Trips (OUT) Vs. Gross Floor Area (acres)" :
                                    m=8.6208;
                                    c=-27.944;
                                    break;
                                case        "No. of Total Person Trips (IN+OUT) Vs. Gross Floor Area (acres)" :
                                    m=12.138;
                                    c=168.61;
                                    break;
                                case        "No. of Total Person Trips (IN) Vs. No. of Rooms in Hotel" :
                                    m=1.0881;
                                    c=108.88;
                                    break;
                                case        "No. of Total Person Trips (OUT) Vs. No. of Rooms in Hotel" :
                                    m=16162;
                                    c=3.9652;
                                    break;
                                case        "No. of Total Person Trips (IN+OUT) Vs. No. of Rooms in Hotel":
                                    m=1.3901;
                                    c=240.79;
                                    break;
                                case        "No. of Total Person Trips (IN) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.4524;
                                    c=0.0617;
                                    break;
                                case        "No. of Total Person Trips (OUT) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.2726;
                                    c=1.7765;
                                    break;
                                case        "No. of Total Person Trips (IN+OUT) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.5585;
                                    c=28.139;
                                    break;
                                case        "No. of Total Person Trips (IN) Vs. No. of Employees Working for Hotel" :
                                    m=0.972;
                                    c=1.162;
                                    break;
                                case        "No. of Total Person Trips (OUT) Vs. No. of Employees Working for Hotel" :
                                    m=0.6077;
                                    c=-4.2601;
                                    break;
                                case        "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for Hotel" :
                                    m=1.308;
                                    c=62.7213;
                                    break;
                                case        "No. of Car Person Trips (IN) Vs.  No. of Seats in Hotel" :
                                    m=0.72;
                                    c=-17;
                                    break;
                                case        "No. of Car Person Trips (OUT) Vs.  No. of Seats in Hotel" :
                                    m=0.24;
                                    c=-5;
                                    break;
                                case        "No. of Car Person Trips (IN+OUT) Vs. No. of Seats in Hotel" :
                                    m=0.53;
                                    c=45;
                                    break;
                                case        "No. of Car Person Trips (IN) Vs.  No. of Beds" :
                                    m=0.75;
                                    c=22;
                                    break;
                                case        "No. of Car Person Trips (OUT) Vs.  No. of Beds in The Hotel" :
                                    m=0.82;
                                    c=-21;
                                    break;
                                case        "No. of Car Person Trips (IN+OUT) Vs. No. of Beds in Hotel" :
                                    m=1.2;
                                    c=40;
                                    break;
                                case        "No. of Car Person Trips (IN) Vs.  Gross Floor Area (Acres)" :
                                    m=5.8;
                                    c=20;
                                    break;
                                case        "No. of Car Person Trips (OUT) Vs.  Gross Floor Area (Acres)":
                                    m=3;
                                    c=12;
                                    break;
                                case        "No. of Car Person Trips (IN+OUT) Vs. Gross Floor Area (Acres)" :
                                    m=9.9;
                                    c=7.7;
                                    break;
                                case        "No. of Car Person Trips (IN) Vs.  No. of Rooms in Hotel" :
                                    m=0.62;
                                    c=30;
                                    break;
                                case        "No. of Car Person Trips (OUT) Vs.  No. of Hotel Rooms" :
                                    m=0.56;
                                    c=0.89;
                                    break;
                                case        "No. of Car Person Trips (IN+OUT) Vs. No. of Rooms in The Hotel" :
                                    m=1;
                                    c=49;
                                    break;
                                case        "No. of Car Person Trips (IN) Vs.  No. of Person Visiting the Hotel" :
                                    m=0.2741;
                                    c=10.588;
                                    break;
                                case        "No. of Car Person Trips (OUT) Vs.  No. of Person Visiting Hotel" :
                                    m=0.0722;
                                    c=5.7931;
                                    break;
                                case        "No. of Car Person Trips (IN+OUT) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.3894;
                                    c=9.664;
                                    break;
                                case        "No. of Scooter Person Trips (IN) Vs.  No. of Seats in Hotel" :
                                    m=0.25;
                                    c=-11;
                                    break;
                                case        "No. of Scooter Person Trips (OUT) Vs.  No. of Seats" :
                                    m=0.13;
                                    c=3;
                                    break;
                                case        "No. of Scooter Person Trips (IN+OUT) Vs. No. of Seats" :
                                    m=0.25;
                                    c=9.4;
                                    break;
                                case        "No. of Scooters Person Trips (IN) Vs.  No. of Beds" :
                                    m=0.96;
                                    c=16;
                                    break;
                                case        "No. of Scooters Person Trips (OUT) Vs.  No. of Beds" :
                                    m=0.73;
                                    c=3.5;
                                    break;
                                case        "No. of Scooters Person Trips (IN+OUT) Vs. No. of Beds" :
                                    m=1.7;
                                    c=20;
                                    break;
                                case        "No. of Scooter Person Trips (IN) Vs.  Gross Floor Area (Acres)" :
                                    m=3.5;
                                    c=-19;
                                    break;
                                case        "No. of Scooter Person Trips (OUT) Vs. Gross Floor Area (Acres)" :
                                    m=1.8;
                                    c=-1.7;
                                    break;
                                case        "No. of Scooter Person Trips (IN+OUT) Vs. Gross Floor Area (Acres)" :
                                    m=1.7;
                                    c=3.8;
                                    break;
                                case        "No. of Scooter Person Trips (IN) Vs.  No. of Rooms in Hotel" :
                                    m=1.3335;
                                    c=12.996;
                                    break;
                                case        "No. of Scooters Person Trips (OUT) Vs. No. of Rooms in The Hotel" :
                                    m=0.2731;
                                    c=13.969;
                                    break;
                                case        "No. of Scooter Person Trips (IN+OUT) Vs. No. of Rooms in The Hotel":
                                    m=2.7;
                                    c=-19;
                                    break;

                            }
                            break;
                        case "CommercialHotelsVehicular TripAfternoon Peak":
                            switch (s){
                                case    "No. of PCU Trips (IN) Vs. No. of Employees Working for Hotel" :
                                    m=0.3582;
                                    c=-32.281;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Employees Working for Hotel" :
                                    m=0.2414;
                                    c=-10.677;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Employees Working for Hotel" :
                                    m=0.5855;
                                    c=-33.199;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. No. of Seats in Hotel" :
                                    m=0.2147;
                                    c=-20.421;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Seats in Hotel" :
                                    m=0.1568;
                                    c=-8.2471;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Seats in Hotel" :
                                    m=0.3405;
                                    c=-22.499;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. No. of Beds in Hotel" :
                                    m=0.3252;
                                    c=5.0047;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Beds in Hotel" :
                                    m=0.2546;
                                    c=0.7955;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Beds in Hotel" :
                                    m=0.5552;
                                    c=9.5521;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. Gross Floor Area (acres) " :
                                    m=4.3784;
                                    c=-24.82;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. Gross Floor Area (acres)" :
                                    m=2.7814;
                                    c=-5.9542;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. Gross Floor Area (acres) " :
                                    m=7.7959;
                                    c=-44.646;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. No. of Rooms in Hotel" :
                                    m=0.8606;
                                    c=-21.825;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Rooms in Hotel" :
                                    m=0.6404;
                                    c=-17.483;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Rooms in Hotel" :
                                    m=1.5009;
                                    c=-39.308;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.0847;
                                    c=-0.1901;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.0626;
                                    c=-1.3576;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Persons Visiting the Hotel":
                                    m=0.1473;
                                    c=-1.5477;
                                    break;

                            }
                            break;
                        case "CommercialHotelsVehicular TripEvening Peak":
                            switch (s){
                                case    "No. of PCU Trips (IN) Vs. No. of Seats in Hotel" :
                                    m=0.3526;
                                    c=-4.2861;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Seats in Hotel":
                                    m=0.1909;
                                    c=-11.98;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Seats in Hotel" :
                                    m=0.5461;
                                    c=-14.721;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. No. of Beds in Hotel" :
                                    m=0.2777;
                                    c=14.985;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Beds in Hotel" :
                                    m=0.2764;
                                    c=10.871;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Beds in Hotel" :
                                    m=1.0088;
                                    c=-23.747;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. Gross Floor Area (acres)" :
                                    m=1.0136;
                                    c=-1.6607;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. Gross Floor Area (acres)" :
                                    m=2.4996;
                                    c=-1.9456;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. Gross Floor Area (acres)" :
                                    m=5.1;
                                    c=-2.2;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. No. of Rooms in Hotel" :
                                    m=0.1749;
                                    c=18.953;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Rooms in Hotel" :
                                    m=0.3066;
                                    c=0.7837;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Rooms in Hotel" :
                                    m=0.3757;
                                    c=27.811;
                                    break;
                                case    "No. of PCU Trips (IN) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.1183;
                                    c=0.0881;
                                    break;
                                case    "No. of PCU Trips (OUT) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.0977;
                                    c=-7.2123;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.2203;
                                    c=-1.735;
                                    break;
                                case    "No. of PCU Trips (IN+OUT) Vs. No. of Employees Working for Hotel" :
                                    m=0.3972;
                                    c=-4.5625;
                                    break;
                                case    "No. of Car Vehicle Trips (IN) Vs. No. of Seats in Hotel" :
                                    m=0.2479;
                                    c=-3.8711;
                                    break;
                                case    "No. of Car Vehicle Trips (OUT) Vs. No. of Seats in Hotel" :
                                    m=0.0996;
                                    c=-0.431;
                                    break;
                                case    "No. of Car Vehicle Trips (IN+OUT) Vs. No. of Seats in Hotel" :
                                    m=0.47;
                                    c=-26;
                                    break;
                                case    "No. of Cars Vehicle Trips (IN) Vs. No. of Beds in Hotel" :
                                    m=0.079;
                                    c=14;
                                    break;
                                case    "No. of Car Vehicle Trips (OUT) Vs. No. of Beds in Hotel" :
                                    m=0.2;
                                    c=2.7;
                                    break;
                                case    "No. of Car Vehicle Trips (IN+OUT) Vs. No. of Beds in Hotel " :
                                    m=0.8292;
                                    c=-35.741;
                                    break;
                                case    "No. of Car Vehicle Trips (IN) Vs. Gross Floor Area (Acres)" :
                                    m=2.8077;
                                    c=12.797;
                                    break;
                                case    "No. of Car Vehicle Trips (OUT) Vs. Gross Floor Area (Acres)" :
                                    m=1.689;
                                    c=0.2574;
                                    break;
                                case    "No. of Cars Vehicle Trips (IN) Vs. Gross Floor Area (Acres)" :
                                    m=1.6;
                                    c=28;
                                    break;
                                case    "No. of Car Vehicles Trips (IN) Vs. No. of Room in The Hotel":
                                    m=0.1798;
                                    c=11.862;
                                    break;
                                case    "No. of Car Vehicles Trips (OUT) Vs. No. of Rooms in The Hotel" :
                                    m=0.2447;
                                    c=-0.5651;
                                    break;
                                case    "No. of Car Vehicles Trips (IN+OUT) Vs. No. of Rooms in The Hotel" :
                                    m=0.3222;
                                    c=19.6;
                                    break;
                                case    "No. of Car Vehicles Trips (IN) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.0977;
                                    c=-0.6577;
                                    break;
                                case    "No. of Car Vehicles Trips (OUT) Vs. No. of Persons Visiting Hotel" :
                                    m=0.0718;
                                    c=-4.23;
                                    break;
                                case    "No. of Car Vehicle Trips (IN+OUT) Vs. No. of Persons Visiting the Hotel" :
                                    m=0.1725;
                                    c=-3.0943;
                                    break;
                                case    "No. of Car Vehicle Trips (IN) Vs. No. of Employees Working for Hotel" :
                                    m=0.2101;
                                    c=-0.06606;
                                    break;
                                case    "No. of Car Vehicle Trips (OUT) Vs. No. of Employees Working for Hotel" :
                                    m=0.1167;
                                    c=-1.3975;
                                    break;
                                case    "No. of Car Vehicle Trips (IN+OUT) Vs. No. of Employees Working for Hotel" :
                                    m=0.2813;
                                    c=0.467;
                                    break;
                                case    "No. of Scooters Vehicle Trips (IN) Vs. No. of Seats in Hotel" :
                                    m=0.4361;
                                    c=-35.786;
                                    break;
                                case    "No. of Scooters Vehicle Trips (OUT) Vs. No. of Seats in Hotel" :
                                    m=0.12;
                                    c=-8.6;
                                    break;
                                case    "No. of Scooters Vehicle Trips (IN) Vs. No. of Beds in Hotel":
                                    m=0.92;
                                    c=-38;
                                    break;
                                case    "No. of Scooters Vehicle Trips (OUT) Vs. No. of Beds in Hotel " :
                                    m=0.45;
                                    c=2;
                                    break;
                                case    "No. of Scooters Vehicle Trips (IN+OUT) Vs. No. of Beds in Hotel" :
                                    m=0.8292;
                                    c=-35.741;
                                    break;
                                case    "No. of Scooter Vehicles Trips (OUT) Vs. Gross Floor Area (Acres)" :
                                    m=1.2761;
                                    c=1.4046;
                                    break;
                                case    "No. of Scooter Vehicle Trips (IN+OUT) Vs. Gross Floor Area (Acres)" :
                                    m=2.5;
                                    c=3.1;
                                    break;
                                case    "No. of Scooter Vehicles Trips (IN) Vs. No. of Rooms in The Hotel" :
                                    m=1.6197;
                                    c=-39.91;
                                    break;
                                case    "No. of Scooter Vehicles Trips (OUT) Vs. No. of Rooms in The Hotel" :
                                    m=1.5263;
                                    c=-50.842;
                                    break;
                                case    "No. of Scooter Vehicles Trips (IN+OUT) Vs. No. of Rooms in The Hotel" :
                                    m=1.241;
                                    c=14.482;
                                    break;
                                case    "No. of Scooter Vehicle Trips (IN) Vs. No. of Persons Visiting Hotel" :
                                    m=0.1671;
                                    c=-11.581;
                                    break;
                                case    "No. of Scooter Vehicle Trips (OUT) Vs. No. of Persons Visiting Hotel" :
                                    m=0.1192;
                                    c=-14.283;
                                    break;
                                case    "No. of Scooter Vehicle Trips (IN+OUT) Vs. No. of Persons Visiting Hotel" :
                                    m=0.0998;
                                    c=-2.9185;
                                    break;
                                case    "No. of Scooters Vehicle Trips (IN) Vs. No. of Employees Working for Hotel" :
                                    m=0.0906;
                                    c=1.9703;
                                    break;
                                case    "No. of Scooters Vehicle Trips (OUT) Vs. No. of Employees Working for Hotel" :
                                    m=0.11;
                                    c=-5.3046;
                                    break;
                                case    "No. of Scooter Vehicle Trips (IN+OUT) Vs. No. of Employees Working for Hotel":
                                    m=0.1958;
                                    c=-3.5403;
                                    break;
                            }
                            break;

                    }
                    double i=Double.valueOf(es);

                    i=(m*i)+c;
                    i=Math.abs(i);
                    String f=String.valueOf(i);

                    t2.setText(s2+" : "+f);
                    t2.setVisibility(View.VISIBLE);
                }




            }
        });



    }
    public  String part1stringdiv(String s){
        char    s1[]=s.toCharArray();
        int a=0;
        for(int i=0;i<s1.length;i++){
            if(s1[i]=='V'){
                if(s1[i+1]=='s'){
                    a=i;
                    break;
                }
            }
        }
        char    r[]=new char[a];
        for(int i=0;i<a;i++){
            r[i]=s1[i];
        }
        String g=String.valueOf(r);
        return  g;
    }

    public  String part2stringdiv(String s){
        char    s1[]=s.toCharArray();
        int a=0;
        for(int i=0;i<s1.length;i++){
            if(s1[i]=='V'){
                if(s1[i+1]=='s'){
                    a=i;
                    break;
                }
            }
        }
        char    r[]=new char[s1.length-a];
        int y=0;
        for(int i=a+3;i<s1.length;i++){

            r[y]=s1[i];
            y++;
        }
        String g=String.valueOf(r);
        return  g;
    }
}
