package com.example.fakeman.project;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    String  rldaptam[]  =   {   "No. of Total Person Trips (IN) Vs. No. of Persons Staying in Apartment",
                                "No. of Total Person Trips (OUT) Vs. No. of Persons Staying in Apartment",
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Persons Staying in Apartment",
                                "No. of Total Person Trips (IN) Vs. No. of Units in Apartment",
                                "No. of Total Person Trips (OUT) Vs. No. of Units in Apartment",
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Units in Apartment",
                                "No. of Total Person Trips (IN) Vs. Gross Floor Area (sq.m)",
                                "No. of Total Person Trips (OUT) Vs. Gross Floor Area (sq.m)",
                                "No. of Total Person Trips (IN+OUT) Vs. Gross Floor Area (sq.m)",
                                "No. of Total Person Trips (IN) Vs. No. of Employees Working for Apartment",
                                "No. of Total Person Trips (OUT) Vs. No. of Employees Working for Apartment",
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for Apartment"};

    String  rldaptpm[]  =   {   "No. of Total Person Trips (OUT) Vs. No. of Persons Staying in Apartment" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Persons Staying in Apartment" ,
                                "No. of Total Person Trips (IN) Vs. No. of Units in Apartment" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Units in Apartment" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Units in Apartment" ,
                                "No. of Total Person Trips (IN) Vs. Gross Floor Area (sq.m)" ,
                                "No. of Total Person Trips (OUT) Vs. Gross Floor Area (sq.m)" ,
                                "No. of Total Person Trips (IN+OUT) Vs. Gross Floor Area (sq.m)" ,
                                "No. of Total Person Trips (IN) Vs. No. of Employees Working for Apartment" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Employees Working for Apartment" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for Apartment"};

    String  rldavtam[]  =   {   "No. of PCU Trips (IN)  Vs. No. of Employees Working for Apartment",
                                "No. of PCU Trips (OUT) Vs. No. of Employees Working for Apartment",
                                "No. of PCU Trips (IN+OUT) Vs. No. of Employees Working for Apartment",
                                "No. of PCU Trips (IN) Vs. No. of Persons Staying in Apartment",
                                "No. of PCU Trips (IN+OUT) Vs. No. of Persons Staying in Apartment",
                                "No. of PCU Trips (IN) Vs. Gross Floor Area (sq.m)",
                                "No. of PCU Trips (OUT) Vs. Gross Floor Area (sq.m)",
                                "No. of PCU Trips (IN+OUT) Vs. Gross Floor Area (sq.m)"};

    String  rldavtpm[]  =   {   "No. of PCU Trips (IN) Vs. No. of Employees Working for Apartment",
                                "No. of PCU Trips (OUT) Vs. No. of Employees Working for Apartment",
                                "No. of PCU Trips (IN+OUT) Vs. No. of Employees Working for Apartment",
                                "No. of PCU Trips (IN) Vs. No. of Persons Staying in Apartment",
                                "No. of PCU Trips (OUT) Vs. No. of Persons Staying in Apartment",
                                "No. of PCU Trips (IN+OUT) Vs. No. of Persons Staying in Apartment",
                                "No. of PCU Trips (IN) Vs. Gross Floor Area (sq.m)",
                                "No. of PCU Trips (OUT) Vs. Gross Floor Area (sq.m)",
                                "No. of PCU Trips (IN+OUT) Vs. Gross Floor Area (sq.m)"};

    String   rihptam[]  =   {   "No. of Total Person Trips (IN) Vs. No. of Employees Working for House",
                                "No. of Total Person Trips (OUT) Vs. No. of Employees Working for House",
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for House",
                                "No. of Total Person Trips (IN) Vs. No. of Persons Staying in House",
                                "No. of Total Person Trips (OUT) Vs. No. of Persons Staying in House",
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Persons Staying in House",
                                "No. of Total Person Trips (IN) Vs. Gross Floor Area (sq.m)",
                                "No. of Total Person Trips (OUT) Vs. Gross Floor Area (sq.m)"};

    String  rihptpm[]   =   {   "No. of Total Person Trips (IN) Vs. Gross Floor Area (sq.m)",
                                "No. of Total Person Trips (OUT) Vs. Gross Floor Area (sq.m)" ,
                                "No. of Total Person Trips (IN+OUT) Vs. Gross Floor Area (sq.m)" ,
                                "No. of Total Person Trips (IN) Vs. No. of Employees Working for House" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Employees Working for House" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for House" ,
                                "No. of Total Person Trips (IN) Vs. No. of Persons Staying in House" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Persons Staying in House" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Persons Staying in House"};

    String  rihvtam[]   =   {   "No. of PCU Trips (IN) Vs. Gross Floor Area (sq.m)",
                                "No. of PCU Trips (OUT) Vs. Gross Floor Area (sq.m)",
                                "No. of PCU Trips (IN+OUT) Vs. Gross Floor Area (sq.m)",
                                "No. of PCU Trips (IN) Vs. No. of Persons Staying in House",
                                "No. of PCU Trips (OUT) Vs. No. of Persons Staying in House",
                                "No. of PCU Trips (IN+OUT) Vs. No. of Persons Staying in House",
                                "No. of PCU Trips (IN) Vs. No. of Employees Working for House",
                                "No. of PCU Trips (OUT) Vs. No. of Employees Working for House",
                                "No. of PCU Trips (IN+OUT) Vs. No. of Employees Working for House"};

    String rihvtpm[]    =   {   "No. of PCU Trips (IN) Vs. No. of Persons Staying in House",
                                "No. of PCU Trips (OUT) Vs. No. of Persons Staying in House",
                                "No. of PCU Trips (IN+OUT) Vs. No. of Persons Staying in House",
                                "No. of PCU Trips (IN) Vs. No. of Employees Working for House",
                                "No. of PCU Trips (OUT) Vs. No. of Employees Working for House",
                                "No. of PCU Trips (IN+OUT) Vs. No. of Employees Working for House",
                                "No. of PCU Trips (IN) Vs. Gross Floor Area",
                                "No. of PCU Trips (OUT) Vs. Gross Floor Area",
                                "No. of PCU Trips (IN+OUT) Vs. Gross Floor Area"};

    String  rrbptam[]   =   {   "No. of Scooter Person Trips (IN) Vs. No. of Persons Staying in Apartment",
                                "No. of Scooter Person Trips (OUT) Vs. No. of Persons Staying in Apartment",
                                "No. of Scooter Person Trips (IN+ OUT) Vs. No. of Persons Staying in Apartment",
                                "No. of Scooter Person Trips (IN) Vs. No. of Units in Apartment",
                                "No. of Scooter Person Trips (OUT) Vs. No. of Units in Apartment",
                                "No. of Scooter Person Trips (IN+ OUT) Vs. No. of Units in Apartment",
                                "No. of Scooter Person Trips (IN) Vs. Gross Floor Area (Sq.m)",
                                "No. of Scooter Person Trips (OUT) Vs. Gross Floor Area (Sq.m)",
                                "No. of Scooter Person Trips (IN+ OUT) Vs. Gross Floor Area (Sq.m)",
                                "No. of Scooter Person Trips (IN) Vs. No. of Employees Working for Apartment",
                                "No. of Scooter Person Trips (OUT) Vs. No. of Employees Working for Apartment",
                                "No. of Scooter Person Trips (IN+ OUT) Vs. No. of Employees Working for Apartment",
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for Apartment"};

    String  rrbptpm[]   =   {   "No. of Scooter Person Trips (IN) Vs. No. of Persons Staying in Apartment",
                                "No. of Scooter Person Trips (OUT) Vs. No. of Persons Staying in Apartment",
                                "No. of Scooter Person Trips (IN+ OUT) Vs. No. of Persons Staying in Apartment",
                                "No. of Scooter Person Trips (IN) Vs. No. of Units in Apartment",
                                "No. of Scooter Person Trips (OUT) Vs. No. of Units in Apartment",
                                "No. of Scooter Person Trips (IN+ OUT) Vs. No. of Units in Apartment",
                                "No. of Scooter Person Trips (IN) Vs. Gross Floor Area (Sq.m)",
                                "No. of Scooter Person Trips (OUT) Vs. Gross Floor Area (Sq.m)",
                                "No. of Scooter Person Trips (IN+ OUT) Vs. Gross Floor Area (Sq.m)",
                                "No. of Scooter Person Trips (IN) Vs. No. of Employees Working for Apartment"};

    String  rrbvtam[]   =   {   "No. of Car Vehicular Trips (IN) Vs. No. of Employees Working for Apartment",
                                "No. of Car Vehicular Trips (OUT) Vs. No. of Employees Working for Apartment",
                                "No. of Car Vehicle Trips (IN+ OUT) Vs. No. of Employees Working for Apartment",
                                "No. of Car Vehicular Trips (IN) Vs. No. of Persons Staying in Apartment",
                                "No. of Car Vehicle Trips (OUT) Vs.  No. of Persons Staying in Apartment",
                                "No. of Car Vehicle Trips (IN+ OUT) Vs. No. of Persons Staying in Apartment",
                                "No. of Car Vehicle Trips (IN) Vs. Gross Floor Area (Sq.m)",
                                "No. of Car Vehicle Trips (OUT) Vs. Gross Floor Area (Sq.m)",
                                "No. of Car Vehicle Trips (IN+ OUT) Vs. Gross Floor Area (Sq.m)",
                                "No. of Scooter Vehicle Trips (IN) Vs. No. of Employees Working for Apartment",
                                "No. of Scooter Vehicle Trips (OUT) Vs. No. of Employees Working for Apartments",
                                "No. of Scooter Vehicle Trips (IN+ OUT) Vs. No. of Employees Working for Apartment",
                                "No. of Scooter Vehicle Trips (IN) Vs. Gross Floor Area (Sq.m)",
                                "No. of Scooter Vehicle Trips (OUT) Vs. Gross Floor Area (Sq.m)",
                                "No. of Scooter Vehicle Trips (IN+ OUT) Vs. Gross Floor Area (Sq.m)",
                                "No. of Scooter Vehicle Trips (IN) Vs. No. of Persons Staying in Apartment",
                                "No. of Scooter Vehicle Trips (OUT) Vs. No. of Persons Staying in Apartment"};

    String  rrbvtpm[]   =   {   "No. of Car Vehicle Trips (IN+ OUT) Vs. No. of Persons Staying in Apartment",
                                "No. of Car Vehicle Trips (IN+ OUT) Vs. Gross Floor Area (Sq.m)",
                                "No. of Scooter Vehicle Trips (IN+ OUT) Vs. No. of Employees Working for Apartment",
                                "No. of Scooter Vehicle Trips (IN+ OUT) Vs. Gross Floor Area (Sq.m)",
                                "No. of Total Vehicle Trips (IN) = Vs.  (0.2417) No. of Persons Staying in Apartment"};

    String  ipassptms[] =   {   "No. of Pedestrians Vs. Gross Floor Area",
                                "No. of Pedestrians Vs. No. of Class Rooms",
                                "No. of Pedestrians Vs. No. of Employee",
                                "No. of Pedestrians Vs. No. of Persons",
                                "No. of Motor Cycles/ Scooter Person Unit Vs. Gross Floor Area",
                                "No. of Motor Cycles/Scooter Person Unit Vs. No. of Class Rooms",
                                "No. of Motor Cycles/ Scooter Person Unit Vs. No. of Employee",
                                "No. of Motor Cycles/ Scooter Person Unit Vs. No. of Persons",
                                "No. of Cycle Person Unit Vs. Gross Floor Area",
                                "No. of Cycle Person Unit Vs. No. of Class Rooms",
                                "No. of Cycle Person Unit Vs. No. of Employee",
                                "No. of Cycles Person Units Vs. No. of Persons",
                                "Total Person Trips Vs. Gross Floor Area",
                                "Total Person Trips Vs. Number of Class Rooms",
                                "Total Person Unit Vs. No. of Employee",
                                "Total Person Unit Vs. No. of Persons",
                                "No. of Bus Person Unit Vs. Gross Floor Area",
                                "No. of Bus Person Unit Vs. No. of Class Rooms",
                                "No. of Bus Person Unit Vs. No. of Employee",
                                "No. of Standard Buses Person Unit Vs. No. of Persons",
                                "No. of Car/Jeep/Van Person Unit Vs. Gross Floor Area",
                                "No. of Car/Jeep/Van Person Unit Vs. No. of Class Rooms",
                                "No. of Car/Van/Jeep Person Unit Vs. No. of Employee",
                                "No. of Car/Van/Jeep Person Units Vs. No. of Persons"};

    String  ipassptes[] =   {   "No. of Motor Cycle Person Unit Vs. Gross Floor Area",
                                "No. of Motor Cycle Person Unit Vs. No. of Class Rooms",
                                "No. of Motor Cycle Person Unit Vs. No. of Employees",
                                "No. of Motor Cycle Person Vs. No. of Persons",
                                "No. of Cycle Person Unit Vs. Gross Floor Area",
                                "No. of Cycles Person Unit Vs. No. of Class Rooms",
                                "No. of Cycle Person Trips Vs. No. of Employees",
                                "No. of Cycles Person Unit Vs. No. of Persons",
                                "Total Person Trip Vs. Gross Floor Area",
                                "Total Person Trips Vs. No. of Persons",
                                "No. of Buses Person Unit Vs. Gross Floor Area",
                                "No. of Buses Person Unit Vs. No. of Class Rooms",
                                "No. of Bus Person Unit Vs. No. of Employees",
                                "No. of Standard Buses Person Unit Vs. No. of Persons",
                                "No. of Car Person Unit Vs. Gross Floor Area",
                                "No. of Car/Jeep/Van Person Unit Vs. No. of Class Rooms",
                                "No. of Car Person Unit Vs. No. of Employees",
                                "No. of Car Person Unit Vs. No. of Persons",
                                "No. of Pedestrians Vs. Gross Floor Area",
                                "No. of Pedestrians Vs. No. of Employees",
                                "No. of Pedestrians Vs. No. of Persons",
                                "Total Persons Trip Vs. No. of Employees"};

    String  ipassvtms[] =   {   "No. of Car/Van/Jeep Vehicular Unit Vs. Total Gross Floor Area",
                                "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Class Rooms",
                                "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Employees",
                                "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Persons",
                                "No. of Motor Cycles/Scooters Vehicular Unit Vs. Total Gross Floor Area",
                                "No. of Motor Cycle/Scooter Vehicular Unit Vs. Total No. of Class Rooms",
                                "No. of Motor Cycles/ Scooter Vehicular Unit Vs. No. of Employees",
                                "No. of Motor Cycles/Scooter Vehicular Unit Vs. No. of Persons",
                                "No. of Standard Buses Vehicular Unit Vs. Total Gross Floor Area",
                                "No. of Standard Bus Vehicular Unit Vs. No. of Class Rooms",
                                "No. of Standard Bus Vehicular Unit Vs. No. of Employees",
                                "No. of Standard Bus Vehicular Unit Vs. No. of Persons",
                                "No. of Cycle Vehicular Unit Vs. Total Gross Floor Area",
                                "No. of Cycle Vehicular Unit Vs. Total No. of Class Rooms",
                                "No. of Cycle Vehicular Unit Vs. No. of Employees",
                                "No. of Cycle Vehicular Unit Vs. No. of Persons",
                                "No. of PCU Trips Vs. Total Gross Floor Area",
                                "Total No. of PCU Units Vs. Total No. of Class Rooms",
                                "Total No. of PCU Units Vs. No. of Employees",
                                "No. of PCU Units Vs. No. of Persons"};

    String  ipassvtes[] =   {   "No. of Cycle Vehicular Unit Vs. Gross Floor Area",
                                "No. of Cycles Vehicular Unit Vs. No. of Class Rooms",
                                "No. of Cycle Vehicular Unit Vs. No. of Employees" ,
                                "No. of Cycle Vehicular Unit Vs. No. of Persons" ,
                                "No. of Motor Cycles Vehicular Unit Vs. No. of Employees" ,
                                "No. of Motor Cycles Vehicular Unit Vs. No. of Persons" ,
                                "No. of Buses Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Buses Vehicular Unit Vs. No. of Class Rooms" ,
                                "No. of Standard Buses Vehicular Unit Vs. No. of Employees" ,
                                "No. of Standard Buses Vehicular Unit Vs. No. of Persons" ,
                                "No. of PCU Units Vs. Gross Floor Area" ,
                                "No. of PCU Units Vs. No. of Class Rooms" ,
                                "No. of PCU Trips Vs. No. of Employees" ,
                                "No. of PCU Trips Vs. No. of Persons" ,
                                "No. of Car Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Class Rooms" ,
                                "No. of Car Vehicular Unit Vs. No. of Employees" ,
                                "No. of Car Vehicular Unit Vs. No. of Persons"};

    String  iicptms[]   =   {   "No. of Auto Rickshaw Person Unit Vs. Gross Floor Area",
                                "No. of Auto Rickshaw Person Unit Vs. No. of Class Rooms",
                                "No. of Auto Rickshaw Person Unit Vs. No. of Employee",
                                "No. of Auto Rickshaw Person Unit Vs. No. of Persons",
                                "No. of Cycle Person Unit Vs. Gross Floor Area",
                                "No. of Cycles Person Unit Vs. No. of Class Rooms",
                                "No. of Cycles Person Unit Vs. No. of Employee",
                                "No. of Cycles Person Unit Vs. No. of Persons",
                                "Total Person Units Vs. Gross Floor Area",
                                "Total Person Units Vs. No. of Class Rooms",
                                "Total Person Units Vs. No. of Employees",
                                "Total Person Units Vs. No. of Persons",
                                "No. of Pedestrians Vs. Gross Floor Area",
                                "No. of Pedestrians Vs. No. of Class Rooms",
                                "No. of Pedestrians Vs. No. of Employee",
                                "No. of Pedestrians Vs. No. of Persons",
                                "No. of Car/Van/Jeep Person Units Vs. No. of Class Rooms",
                                "No. of Car/Van/Jeep Person Units Vs. No. of Employee",
                                "No. of Car/Van/Jeep Person Units Vs. No. of Persons",
                                "No. of Motor Cycles/ Scooter Person Unit Vs. No. of Class Rooms",
                                "No. of Motor Cycles/Scooters Person Units Vs. No. of Employee",
                                "No. of Motor Cycles/ Scooter Person Unit Vs. No. of Persons"};

    String  iicptes[]   =   {   "No. of Auto Rickshaw Person Unit Vs. Gross Floor Area" ,
                                "No. of Auto Rikshaw Person Unit Vs. No. of Total Units" ,
                                "No. of Auto Rickshaw Person Unit Vs. No. of Employee" ,
                                "No. of Auto Rickshaw Person Unit Vs. No. of Persons" ,
                                "No. of Car/Jeep/Van Person Unit Vs. Gross Floor Area" ,
                                "No. of Car/Jeep/Van Person Unit Vs. No. of Class Rooms" ,
                                "No. of Car/Van/Jeep Person Unit Vs. No. of Employee" ,
                                "No. of Car/Jeep/Van Person Unit Vs. No. of Persons" ,
                                "No. of Cycle Person Unit Vs. Gross Floor Area" ,
                                "No. of Cycle Person Unit Vs. No. of Total Units" ,
                                "No. of Cycle Person Unit Vs. No. of Employee" ,
                                "No. of Cycle Person Unit Vs. No. of Persons" ,
                                "No. of Motor Cycles/Scooter Person Unit Vs. Gross Floor Area" ,
                                "No. of Motor Cycles/Scooter Person Unit Vs. Total Units" ,
                                "No. of Motor Cycles/Scooter Person Unit Vs. No. of Employees" ,
                                "No. of Motor Cycles/Scooter Person Unit Vs. No. of Persons" ,
                                "No. of Pedestrians Vs. Gross Floor Area" ,
                                "No. of Pedestrians Vs. No. of Total Units" ,
                                "No. of Pedestrians Vs. No. of Employees" ,
                                "No. of Pedestrians Vs. No. of Persons" ,
                                "Total Person Units Vs. Gross Floor Area " ,
                                "Total Person Units Vs. No. of Total Units" ,
                                "Total Person Units Vs. No. of Employee" ,
                                "Total Person Units Vs. No. of Persons"};

    String  iicvtms[]   =   {   "No. of Cycle Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Cycles Vehicular Unit Vs. No. of Class Rooms" ,
                                "No. of Cycles Vehicular Unit Vs. No. of Employees" ,
                                "No. of Cycles Vehicular Unit Vs. No. of Persons" ,
                                "No. of Motor Cycles Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Motor Cycles/Scooter Vehicular Unit Vs. No. of Class Rooms" ,
                                "No. of Motor Cycle/Scooter Vehicular Unit Vs. No. of Employee" ,
                                "No. of Motor Cycles/Scooter Vehicular Unit Vs. No. of Persons" ,
                                "No. of Auto Rickshaw Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Auto Rickshaw Vehicular Unit Vs. No. of Class Rooms" ,
                                "No. of Auto Rickshaw Vehicular Unit Vs. No. of Employees" ,
                                "No. of Auto Rickshaw Vehicular Unit Vs. No. of Persons" ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Class Rooms" ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Employees" ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs.   No. of Persons",
                                "Total PCU Trips Vs. Gross Floor Area" ,
                                "Total Vehicular Units Vs. No. of Class Rooms" ,
                                "Total PCU Trips Vs. No. of Employee"};

    String  iicvtes[]   =   {   "Total Vehicular Unit Vs. Gross Floor Area " ,
                                "Total PCU Trips Vs. No. of Class Rooms" ,
                                "Total Vehicular Units Vs. No. of Employee" ,
                                "No. of Motor Cycles/Scooters Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Motor Cycles Scooter Vehicular Units Vs. No. of Total Units" ,
                                "No. of Motor Cycles/ Scooter Vs. No. of Employee " ,
                                "No. of Motor Cycles/Scooters Vehicular Unit Vs. No. of Persons" ,
                                "No. of Cycle Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Cycle Vehicular Unit Vs. Total Units " ,
                                "No. of Cycles Vehicular Unit Vs. No. of Employees" ,
                                "No. of Cycle Vehicular Unit Vs. No. of Persons" ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Class Rooms" ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Employee " ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Persons " ,
                                "No. of Auto Rickshaw Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Auto Rickshaw Vehicular Unit Vs. Total Units" ,
                                "No. of Auto Rickshaw Vehicular Unit Vs. No. of Employee" ,
                                "No. of Auto Rickshaw Person Unit Vs. No. of Persons"};

    String  idcptms[]   =   {   "Total Person Unit Vs. Gross Floor Area" ,
                                "Total Person Unit Vs. Number of Class Rooms" ,
                                "Total Person Unit Vs. No. of Employee" ,
                                "Total Person Unit Vs. Number of Persons" ,
                                "No. of Standard Bus Person Unit Vs. Gross Floor Area" ,
                                "Standard Bus Person Unit Vs. No. of Class Rooms" ,
                                "No. of Standard Bus Person Unit Vs. No. of Employees" ,
                                "No. of Standard Buses Person Unit Vs. No. of Persons" ,
                                "Pedestrians Vs. Gross Floor Area" ,
                                "Pedestrians Vs. No. of Class Rooms " ,
                                "No. of Pedestrians Vs. No. of Persons" ,
                                "No. of Motor Cycles/ Scooter Person Unit Vs. Gross Floor Area" ,
                                "Motorcycles/Scooter Person Unit Vs. No. of Class Rooms" ,
                                "No. of Motor Cycles/ Scooter Person Unit Vs. No. of Persons " ,
                                "No. of Car/Jeep/Van Person Unit Vs. Gross Floor Area" ,
                                "No. of Car/Jeep/Van Person Unit Vs. No. of Class Rooms" ,
                                "No. of Car/Van/Jeep Person Unit Vs. No. of Employees" ,
                                "Car/Van/Jeep Person Unit Vs. No. of Persons "};

    String  idcptes[]   =   {   "No. of Car Person Unit Vs. Gross Floor Area" ,
                                "No. of Car/Jeep/Van Person Unit Vs. No. of Class Rooms" ,
                                "No. of Car/Van/Jeep Person Unit Vs. No. of Employees" ,
                                "No. of Car/Jeep/Van Person Unit Vs. No. of Students ",
                                "No. of Bus Person Unit Vs. Gross Floor Area" ,
                                "No. of Buses Person Unit Vs. No. of Class Rooms " ,
                                "No. of Bus Person Unit Vs. No. of Employee" ,
                                "No. of Buses Person Unit Vs. No. of Students " ,
                                "Total Person Trip Vs. Gross Floor Area" ,
                                "Total Person Unit Vs. No. of Class Rooms" ,
                                "Total Person Trip Vs. No. of Employee" ,
                                "No. of Total Person Unit Vs. No. of Students" ,
                                "No. of Persons Vs. No. of Employees" ,
                                "No. of Persons Vs. No. of Students " ,
                                "Total No. of Pedestrians Vs. No. of Class Rooms" ,
                                "Total No. of Pedestrians Vs. Gross Floor Area" ,
                                "No. of Motor Cycles/ Scooter Person Unit Vs. Gross Floor Area"};

    String  idcvtms[]   =   {   "Total PCU Vs. Gross Floor Area" ,
                                "Total PCU Vs. No. of Class Rooms" ,
                                "Total PCU Vs. No. of Employees" ,
                                "Total PCU Vs. No. of Persons" ,
                                "No. of Motor Cycles/Scooters Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Motor Cycles/Scooter Vehicular Units Vs. No. of Class Rooms" ,
                                "No. of Motor Cycle/Scooter Vehicular Unit Vs. No. of Employees" ,
                                "No. of Motor Cycles/ Scooter Vehicular Unit Vs. No. of Persons" ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Class Rooms" ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Employees" ,
                                "No. of Car/Jeep/Van Vehicular Unit Vs. No. of Persons" ,
                                "No. of Standard Bus Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Standard Buses Vehicular Unit Vs. No. of Class Rooms" ,
                                "No. of Standard Bus Vehicular Unit Vs. No. of Employees" ,
                                "No. of Standard Bus Vehicular Unit Vs. No. of Persons"};

    String  idcvtes[]   =   {   "No. of Car Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Car Vehicular Unit Vs. No. of Class Rooms" ,
                                "No. of Car Vehicular Unit Vs. No. of Employee" ,
                                "No. of Motor Cycles/Scooters Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Motor Cycles Vehicular Unit Vs. No. of Class Rooms" ,
                                "No. of Motor Cycles Vehicular Unit Vs. No. of Employees" ,
                                "No. of PCU Units Vs. Gross Floor Area" ,
                                "No. of PCU Units Vs. No. of Class Rooms" ,
                                "No. of PCU Trips Vs. No. of Employees" ,
                                "No. of PCU Units Vs. No. of Pedestrians" ,
                                "No. of Standard Bus Vehicular Unit Vs. Gross Floor Area" ,
                                "No. of Standard Bus Vehicular Unit Vs. No. of Class Rooms" ,
                                "No. of Standard Bus Vehicular Unit Vs. No. of Employee"};

    String  chptap[]    =   {   "No. of Car Person Trips (IN) Vs. No. of Employees Working" ,
                                "No. of Car Person Trips (OUT) Vs. No. of Employees Working for Hotel" ,
                                "No. of Car Person Trips (IN+OUT) Vs. No. of Employees Working for Hotel" ,
                                "No. of Scooter Person Trips (IN) Vs. No. of Employees Working" ,
                                "No. of Scooters Person Trips (IN+OUT) Vs. No. of Employees Working in Hotel" ,
                                "No. of Scooter Person Trips (OUT) Vs. No. of Persons Visiting Hotel" ,
                                "No. of Scooter Person Trips (IN+OUT) Vs. No. of Person Visiting Hotel" ,
                                "No. of Total Person Trips (IN) Vs. No. of Seats in Hotel" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Seats in Hotel" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Seats in Hotel" ,
                                "No. of Total Person Trips (IN) Vs. No. of Beds in Hotel" ,
                                "No. of Total Person Trips (IN) Vs. Gross Floor Area (acres)" ,
                                "No. of Total Person Trips (OUT) Vs. Gross Floor Area (acres)" ,
                                "No. of Total Person Trips (IN+OUT) Vs. Gross Floor Area (acres)" ,
                                "No. of Total Person Trips (IN) Vs. No. of Rooms in Hotel" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Rooms in Hotel" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Rooms in Hotel" ,
                                "No. of Total Person Trips (IN) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of Total Person Trips (IN) Vs. No. of Employees Working for Hotel" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Employees Working for Hotel" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for Hotel"};

    String  chptep[]    =   {   "No. of Total Person Trips (IN) Vs. No. of Seats in Hotel" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Seats in Hotel" ,
                                "No. of Total Person Trips (IN+OUT) Vs.  No. of Seats in Hotel" ,
                                "No. of Total Person Trips (IN) Vs. No. of Beds in Hotel" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Beds in Hotel" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Beds in Hotel" ,
                                "No. of Total Person Trips (IN) Vs. Gross Floor Area (acres)" ,
                                "No. of Total Person Trips (OUT) Vs. Gross Floor Area (acres)" ,
                                "No. of Total Person Trips (IN+OUT) Vs. Gross Floor Area (acres)" ,
                                "No. of Total Person Trips (IN) Vs. No. of Rooms in Hotel" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Rooms in Hotel" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Rooms in Hotel" ,
                                "No. of Total Person Trips (IN) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of Total Person Trips (IN) Vs. No. of Employees Working for Hotel" ,
                                "No. of Total Person Trips (OUT) Vs. No. of Employees Working for Hotel" ,
                                "No. of Total Person Trips (IN+OUT) Vs. No. of Employees Working for Hotel" ,
                                "No. of Car Person Trips (IN) Vs.  No. of Seats in Hotel" ,
                                "No. of Car Person Trips (OUT) Vs.  No. of Seats in Hotel" ,
                                "No. of Car Person Trips (IN+OUT) Vs. No. of Seats in Hotel" ,
                                "No. of Car Person Trips (IN) Vs.  No. of Beds" ,
                                "No. of Car Person Trips (OUT) Vs.  No. of Beds in The Hotel" ,
                                "No. of Car Person Trips (IN+OUT) Vs. No. of Beds in Hotel" ,
                                "No. of Car Person Trips (IN) Vs.  Gross Floor Area (Acres)" ,
                                "No. of Car Person Trips (OUT) Vs.  Gross Floor Area (Acres)" ,
                                "No. of Car Person Trips (IN+OUT) Vs. Gross Floor Area (Acres)" ,
                                "No. of Car Person Trips (IN) Vs.  No. of Rooms in Hotel" ,
                                "No. of Car Person Trips (OUT) Vs.  No. of Hotel Rooms" ,
                                "No. of Car Person Trips (IN+OUT) Vs. No. of Rooms in The Hotel" ,
                                "No. of Car Person Trips (IN) Vs.  No. of Person Visiting the Hotel" ,
                                "No. of Car Person Trips (OUT) Vs.  No. of Person Visiting Hotel" ,
                                "No. of Car Person Trips (IN+OUT) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of Scooter Person Trips (IN) Vs.  No. of Seats in Hotel" ,
                                "No. of Scooter Person Trips (OUT) Vs.  No. of Seats" ,
                                "No. of Scooter Person Trips (IN+OUT) Vs. No. of Seats" ,
                                "No. of Scooters Person Trips (IN) Vs.  No. of Beds" ,
                                "No. of Scooters Person Trips (OUT) Vs.  No. of Beds" ,
                                "No. of Scooters Person Trips (IN+OUT) Vs. No. of Beds" ,
                                "No. of Scooter Person Trips (IN) Vs.  Gross Floor Area (Acres)" ,
                                "No. of Scooter Person Trips (OUT) Vs. Gross Floor Area (Acres)" ,
                                "No. of Scooter Person Trips (IN+OUT) Vs. Gross Floor Area (Acres)" ,
                                "No. of Scooter Person Trips (IN) Vs.  No. of Rooms in Hotel" ,
                                "No. of Scooters Person Trips (OUT) Vs. No. of Rooms in The Hotel" ,
                                "No. of Scooter Person Trips (IN+OUT) Vs. No. of Rooms in The Hotel"};

    String  chvtap[]    =   {   "No. of PCU Trips (IN) Vs. No. of Employees Working for Hotel" ,
                                "No. of PCU Trips (OUT) Vs. No. of Employees Working for Hotel" ,
                                "No. of PCU Trips (IN+OUT) Vs. No. of Employees Working for Hotel" ,
                                "No. of PCU Trips (IN) Vs. No. of Seats in Hotel" ,
                                "No. of PCU Trips (OUT) Vs. No. of Seats in Hotel" ,
                                "No. of PCU Trips (IN+OUT) Vs. No. of Seats in Hotel" ,
                                "No. of PCU Trips (IN) Vs. No. of Beds in Hotel" ,
                                "No. of PCU Trips (OUT) Vs. No. of Beds in Hotel" ,
                                "No. of PCU Trips (IN+OUT) Vs. No. of Beds in Hotel" ,
                                "No. of PCU Trips (IN) Vs. Gross Floor Area (acres) " ,
                                "No. of PCU Trips (OUT) Vs. Gross Floor Area (acres)" ,
                                "No. of PCU Trips (IN+OUT) Vs. Gross Floor Area (acres) " ,
                                "No. of PCU Trips (IN) Vs. No. of Rooms in Hotel" ,
                                "No. of PCU Trips (OUT) Vs. No. of Rooms in Hotel" ,
                                "No. of PCU Trips (IN+OUT) Vs. No. of Rooms in Hotel" ,
                                "No. of PCU Trips (IN) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of PCU Trips (OUT) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of PCU Trips (IN+OUT) Vs. No. of Persons Visiting the Hotel"};

    String  chvtep[]    =   {   "No. of PCU Trips (IN) Vs. No. of Seats in Hotel" ,
                                "No. of PCU Trips (OUT) Vs. No. of Seats in Hotel" ,
                                "No. of PCU Trips (IN+OUT) Vs. No. of Seats in Hotel" ,
                                "No. of PCU Trips (IN) Vs. No. of Beds in Hotel" ,
                                "No. of PCU Trips (OUT) Vs. No. of Beds in Hotel" ,
                                "No. of PCU Trips (IN+OUT) Vs. No. of Beds in Hotel" ,
                                "No. of PCU Trips (IN) Vs. Gross Floor Area (acres)" ,
                                "No. of PCU Trips (OUT) Vs. Gross Floor Area (acres)" ,
                                "No. of PCU Trips (IN+OUT) Vs. Gross Floor Area (acres)" ,
                                "No. of PCU Trips (IN) Vs. No. of Rooms in Hotel" ,
                                "No. of PCU Trips (OUT) Vs. No. of Rooms in Hotel" ,
                                "No. of PCU Trips (IN+OUT) Vs. No. of Rooms in Hotel" ,
                                "No. of PCU Trips (IN) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of PCU Trips (OUT) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of PCU Trips (IN+OUT) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of PCU Trips (IN+OUT) Vs. No. of Employees Working for Hotel" ,
                                "No. of Car Vehicle Trips (IN) Vs. No. of Seats in Hotel" ,
                                "No. of Car Vehicle Trips (OUT) Vs. No. of Seats in Hotel" ,
                                "No. of Car Vehicle Trips (IN+OUT) Vs. No. of Seats in Hotel" ,
                                "No. of Cars Vehicle Trips (IN) Vs. No. of Beds in Hotel" ,
                                "No. of Car Vehicle Trips (OUT) Vs. No. of Beds in Hotel" ,
                                "No. of Car Vehicle Trips (IN+OUT) Vs. No. of Beds in Hotel " ,
                                "No. of Car Vehicle Trips (IN) Vs. Gross Floor Area (Acres)" ,
                                "No. of Car Vehicle Trips (OUT) Vs. Gross Floor Area (Acres)" ,
                                "No. of Cars Vehicle Trips (IN) Vs. Gross Floor Area (Acres)" ,
                                "No. of Car Vehicles Trips (IN) Vs. No. of Room in The Hotel" ,
                                "No. of Car Vehicles Trips (OUT) Vs. No. of Rooms in The Hotel" ,
                                "No. of Car Vehicles Trips (IN+OUT) Vs. No. of Rooms in The Hotel" ,
                                "No. of Car Vehicles Trips (IN) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of Car Vehicles Trips (OUT) Vs. No. of Persons Visiting Hotel" ,
                                "No. of Car Vehicle Trips (IN+OUT) Vs. No. of Persons Visiting the Hotel" ,
                                "No. of Car Vehicle Trips (IN) Vs. No. of Employees Working for Hotel" ,
                                "No. of Car Vehicle Trips (OUT) Vs. No. of Employees Working for Hotel" ,
                                "No. of Car Vehicle Trips (IN+OUT) Vs. No. of Employees Working for Hotel" ,
                                "No. of Scooters Vehicle Trips (IN) Vs. No. of Seats in Hotel" ,
                                "No. of Scooters Vehicle Trips (OUT) Vs. No. of Seats in Hotel" ,
                                "No. of Scooters Vehicle Trips (IN) Vs. No. of Beds in Hotel" ,
                                "No. of Scooters Vehicle Trips (OUT) Vs. No. of Beds in Hotel " ,
                                "No. of Scooters Vehicle Trips (IN+OUT) Vs. No. of Beds in Hotel" ,
                                "No. of Scooter Vehicles Trips (OUT) Vs. Gross Floor Area (Acres)" ,
                                "No. of Scooter Vehicle Trips (IN+OUT) Vs. Gross Floor Area (Acres)" ,
                                "No. of Scooter Vehicles Trips (IN) Vs. No. of Rooms in The Hotel" ,
                                "No. of Scooter Vehicles Trips (OUT) Vs. No. of Rooms in The Hotel" ,
                                "No. of Scooter Vehicles Trips (IN+OUT) Vs. No. of Rooms in The Hotel" ,
                                "No. of Scooter Vehicle Trips (IN) Vs. No. of Persons Visiting Hotel" ,
                                "No. of Scooter Vehicle Trips (OUT) Vs. No. of Persons Visiting Hotel" ,
                                "No. of Scooter Vehicle Trips (IN+OUT) Vs. No. of Persons Visiting Hotel" ,
                                "No. of Scooters Vehicle Trips (IN) Vs. No. of Employees Working for Hotel" ,
                                "No. of Scooters Vehicle Trips (OUT) Vs. No. of Employees Working for Hotel" ,
                                "No. of Scooter Vehicle Trips (IN+OUT) Vs. No. of Employees Working for Hotel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final String sx=getIntent().getExtras().getString("key");
        final ListView    lv=(ListView)   findViewById(R.id.listview);
        Typeface mmedium = Typeface.createFromAsset(getAssets(), "fonts/MontserratMedium.ttf");
        TextView    t2=(TextView)   findViewById(R.id.textView2);
        t2.setTypeface(mmedium);
        t2.setTextSize(24);
        t2.setTextColor(getResources().getColor(R.color.cool));
        ViewGroup.MarginLayoutParams marginParams = (ViewGroup.MarginLayoutParams) t2.getLayoutParams();
        marginParams.setMargins(0, 0, 0, 0);




        ArrayAdapter<String>    rldaptam_arrayAdapter   =   new ArrayAdapter<String>(this,R.layout.vselementcat,rldaptam);
        ArrayAdapter<String>    rldaptpm_arrayAdapter   =   new ArrayAdapter<String>(this,R.layout.vselementcat,rldaptpm);
        ArrayAdapter<String>    rldavtam_arrayAdapter   =   new ArrayAdapter<String>(this,R.layout.vselementcat,rldavtam);
        ArrayAdapter<String>    rldavtpm_arrayAdapter   =   new ArrayAdapter<String>(this,R.layout.vselementcat,rldavtpm);
        ArrayAdapter<String>    rihptam_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,rihptam);
        ArrayAdapter<String>    rihptpm_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,rihptpm);
        ArrayAdapter<String>    rihvtam_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,rihvtam);
        ArrayAdapter<String>    rihvtpm_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,rihvtpm);
        ArrayAdapter<String>    rrbptam_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,rrbptam);
        ArrayAdapter<String>    rrbptpm_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,rrbptpm);
        ArrayAdapter<String>    rrbvtam_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,rrbvtam);
        ArrayAdapter<String>    rrbvtpm_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,rrbvtpm);
        ArrayAdapter<String>    ipassptms_arrayAdapter  =   new ArrayAdapter<String>(this,R.layout.vselementcat,ipassptms);
        ArrayAdapter<String>    ipassptes_arrayAdapter  =   new ArrayAdapter<String>(this,R.layout.vselementcat,ipassptes);
        ArrayAdapter<String>    ipassvtms_arrayAdapter  =   new ArrayAdapter<String>(this,R.layout.vselementcat,ipassvtms);
        ArrayAdapter<String>    ipassvtes_arrayAdapter  =   new ArrayAdapter<String>(this,R.layout.vselementcat,ipassvtes);
        ArrayAdapter<String>    iicptms_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,iicptms);
        ArrayAdapter<String>    iicptes_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,iicptes);
        ArrayAdapter<String>    iicvtms_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,iicvtms);
        ArrayAdapter<String>    iicvtes_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,iicvtes);
        ArrayAdapter<String>    idcptms_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,idcptms);
        ArrayAdapter<String>    idcptes_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,idcptes);
        ArrayAdapter<String>    idcvtms_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,idcvtms);
        ArrayAdapter<String>    idcvtes_arrayAdapter    =   new ArrayAdapter<String>(this,R.layout.vselementcat,idcvtes);
        ArrayAdapter<String>    chptap_arrayAdapter     =   new ArrayAdapter<String>(this,R.layout.vselementcat,chptap);
        ArrayAdapter<String>    chptep_arrayAdapter     =   new ArrayAdapter<String>(this,R.layout.vselementcat,chptep);
        ArrayAdapter<String>    chvtap_arrayAdapter     =   new ArrayAdapter<String>(this,R.layout.vselementcat,chvtap);
        ArrayAdapter<String>    chvtep_arrayAdapter     =   new ArrayAdapter<String>(this,R.layout.vselementcat,chvtep);

        switch (sx){

            //RESIDENTIAL CASE
            case "ResidentialLow Raised ApartmentsPerson TripAM Peak":
                //Toast.makeText(this,"rldaptam",Toast.LENGTH_SHORT).show();
                lv.setAdapter(rldaptam_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "ResidentialLow Raised ApartmentsPerson TripPM Peak":
                //Toast.makeText(this,"rldaptpm",Toast.LENGTH_SHORT).show();
                lv.setAdapter(rldaptpm_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "ResidentialLow Raised ApartmentsVehicular TripAM Peak":
                //Toast.makeText(this,"rldavtam",Toast.LENGTH_SHORT).show();
                lv.setAdapter(rldavtam_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "ResidentialLow Raised ApartmentsVehicular TripPM Peak":
                //Toast.makeText(this,"rldavtpm",Toast.LENGTH_SHORT).show();
                lv.setAdapter(rldavtpm_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "ResidentialIndependent HousePerson TripAM Peak":
                //Toast.makeText(this,"rihptam",Toast.LENGTH_SHORT).show();
                lv.setAdapter(rihptam_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "ResidentialIndependent HousePerson TripPM Peak":
                //Toast.makeText(this,"rihptpm",Toast.LENGTH_SHORT).show();
                lv.setAdapter(rihptpm_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "ResidentialIndependent HouseVehicular TripAM Peak":
                //Toast.makeText(this,"rihvtam",Toast.LENGTH_SHORT).show();
                lv.setAdapter(rihvtam_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "ResidentialIndependent HouseVehicular TripPM Peak":
                //Toast.makeText(this,"rihvtpm",Toast.LENGTH_SHORT).show();
                lv.setAdapter(rihvtpm_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "ResidentialResidential BuildingsPerson TripAM Peak":
                //Toast.makeText(this,"rrbptam",Toast.LENGTH_SHORT).show();
                lv.setAdapter(rrbptam_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "ResidentialResidential BuildingsPerson TripPM Peak":
                //Toast.makeText(this,"rrbptpm",Toast.LENGTH_SHORT).show();
                lv.setAdapter(rrbptpm_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "ResidentialResidential BuildingsVehicular TripAM Peak":
                //Toast.makeText(this,"rrbvtam",Toast.LENGTH_SHORT).show();
                lv.setAdapter(rrbvtam_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "ResidentialResidential BuildingsVehicular TripPM Peak":
                //Toast.makeText(this,"rrbvtpm",Toast.LENGTH_SHORT).show();
                lv.setAdapter(rrbvtpm_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;


            //INSTITUTIONAL CASE
            case "InstitutionalPrimary And Secondary SchoolsPerson TripMorning Session":
                //Toast.makeText(this,"ipassptms",Toast.LENGTH_SHORT).show();
                lv.setAdapter(ipassptms_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "InstitutionalPrimary And Secondary SchoolsPerson TripEvening Session":
                //Toast.makeText(this, "ipassptes", Toast.LENGTH_SHORT).show();
                lv.setAdapter(ipassptes_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "InstitutionalPrimary And Secondary SchoolsVehicular TripMorning Session":
                //Toast.makeText(this,"ipassvtms",Toast.LENGTH_SHORT).show();
                lv.setAdapter(ipassvtms_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "InstitutionalPrimary And Secondary SchoolsVehicular TripEvening Session":
                //Toast.makeText(this,"ipassvtes",Toast.LENGTH_SHORT).show();
                lv.setAdapter(ipassvtes_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "InstitutionalIntermediate CollegePerson TripMorning Session":
                //Toast.makeText(this,"iicptms",Toast.LENGTH_SHORT).show();
                lv.setAdapter(iicptms_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case"InstitutionalIntermediate CollegePerson TripEvening Session":
                //Toast.makeText(this,"iicptes",Toast.LENGTH_SHORT).show();
                lv.setAdapter(iicptes_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "InstitutionalIntermediate CollegeVehicular TripMorning Session":
                //Toast.makeText(this,"iicvtms",Toast.LENGTH_SHORT).show();
                lv.setAdapter(iicvtms_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "InstitutionalIntermediate CollegeVehicular TripEvening Session":
                //Toast.makeText(this,"iicvtes",Toast.LENGTH_SHORT).show();
                lv.setAdapter(iicvtes_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "InstitutionalDegree CollegePerson TripMorning Session":
                //Toast.makeText(this,"idcptms",Toast.LENGTH_SHORT).show();
                lv.setAdapter(idcptms_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "InstitutionalDegree CollegePerson TripEvening Session":
                //Toast.makeText(this,"idcptes",Toast.LENGTH_SHORT).show();
                lv.setAdapter(idcptes_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "InstitutionalDegree CollegeVehicular TripMorning Session":
                //Toast.makeText(this,"idcvtms",Toast.LENGTH_SHORT).show();
                lv.setAdapter(idcvtms_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "InstitutionalDegree CollegeVehicular TripEvening Session":
                //Toast.makeText(this,"idcvtes",Toast.LENGTH_SHORT).show();
                lv.setAdapter(idcvtes_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;


            //COMMERCIAL CASE
            case "CommercialHotelsPerson TripAfternoon Peak":
                //Toast.makeText(this,"chptap",Toast.LENGTH_SHORT).show();
                lv.setAdapter(chptap_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "CommercialHotelsPerson TripEvening Peak":
                //Toast.makeText(this,"chptep",Toast.LENGTH_SHORT).show();
                lv.setAdapter(chptep_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "CommercialHotelsVehicular TripAfternoon Peak":
                //Toast.makeText(this,"chvtap",Toast.LENGTH_SHORT).show();
                lv.setAdapter(chvtap_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
            case "CommercialHotelsVehicular TripEvening Peak":
                //Toast.makeText(this,"chvtep",Toast.LENGTH_SHORT).show();
                lv.setAdapter(chvtep_arrayAdapter);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s=(String) parent.getItemAtPosition(position);

                        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                        i.putExtra("title",s);
                        i.putExtra("position",position);
                        i.putExtra("sx",sx);
                        startActivity(i);
                        Main2Activity.this.finish();
                    }
                });
                break;
        }
    }
}
