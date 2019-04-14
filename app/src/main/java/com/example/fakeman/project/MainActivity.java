package com.example.fakeman.project;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window g=getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.TYPE_STATUS_BAR);
        final   ConstraintLayout    constraintLayout    =   (ConstraintLayout)  findViewById(R.id.cl);
        Typeface mmedium = Typeface.createFromAsset(getAssets(), "fonts/MontserratMedium.ttf");
        Typeface mlight = Typeface.createFromAsset(getAssets(), "fonts/MontserratLight.ttf");
        Typeface mregular = Typeface.createFromAsset(getAssets(), "fonts/MontserratRegular.ttf");
        Animation   stb2 = AnimationUtils.loadAnimation(this, R.anim.stb2);
        final Animation   anim2Anim=AnimationUtils.loadAnimation(this,R.anim.aim2animate);
        final Animation anim3Anim=AnimationUtils.loadAnimation(this,R.anim.aim3animate);
        TextView    tx   =   (TextView)  findViewById(R.id.textView6);




        tx.setText("Trip Generation\nManual India");
        tx.setTypeface(mmedium);
        tx.setTextColor(getResources().getColor(R.color.cool));






        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final Spinner spinner2=(Spinner)  findViewById(R.id.spinner2);
        final Spinner spinner3=(Spinner)  findViewById(R.id.spinner3);
        final Spinner spinner4=(Spinner)  findViewById(R.id.spinner4);




        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.cat1,R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<CharSequence>  adapter2=ArrayAdapter.createFromResource(this,R.array.cat2,R.layout.spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<CharSequence>  adapter3=ArrayAdapter.createFromResource(this,R.array.cat3,R.layout.spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<CharSequence>  adapter4=ArrayAdapter.createFromResource(this,R.array.cat4,R.layout.spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<CharSequence>  adapter5=ArrayAdapter.createFromResource(this,R.array.cat5,R.layout.spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<CharSequence>  adapter6=ArrayAdapter.createFromResource(this,R.array.cat6,R.layout.spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<CharSequence>  adapter7=ArrayAdapter.createFromResource(this,R.array.cat7,R.layout.spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<CharSequence>  adapter8=ArrayAdapter.createFromResource(this,R.array.cat8,R.layout.spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);
        spinner4.setAdapter(adapter4);



        spinner.setTranslationX(800);
        spinner2.setTranslationX(800);
        spinner3.setTranslationX(800);
        spinner4.setTranslationX(800);

        spinner.setAlpha(0);
        spinner2.setAlpha(0);
        spinner3.setAlpha(0);
        spinner4.setAlpha(0);





        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s=(String)parent.getItemAtPosition(position);
                if(s.equals("Institutional")){
                    spinner2.setAdapter(adapter5);
                    spinner4.setAdapter(adapter6);
                }
                if(s.equals("Residential")){
                    spinner2.setAdapter(adapter2);
                    spinner4.setAdapter(adapter4);
                }
                if(s.equals("Commercial")){
                    spinner2.setAdapter(adapter8);
                    spinner4.setAdapter(adapter7);
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s=(String)parent.getItemAtPosition(position);
               if(s.equals("Person Trip")){





                }

                if(s.equals("Vehicular Trip")){




                }
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s = (String) parent.getItemAtPosition(position);
                if (s.equals("Morning Session")) {

                    constraintLayout.setBackgroundResource(R.drawable.morning);
                }
                if (s.equals("Evening Session")) {
                    constraintLayout.setBackgroundResource(R.drawable.night);



                }
                if (s.equals("Afternoon Peak")) {

                    constraintLayout.setBackgroundResource(R.drawable.morning);


                }
                if (s.equals("Evening Peak")) {
                    constraintLayout.setBackgroundResource(R.drawable.night);

                }
                if(s.equals("AM Peak")){

                    constraintLayout.setBackgroundResource(R.drawable.morning);

                }
                if(s.equals("PM Peak")){
                    constraintLayout.setBackgroundResource(R.drawable.night);

                }
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        Button fat=(Button)  findViewById(R.id.button);

        fat.setTypeface(mmedium);
        fat.setTranslationY(400);
        //img.setTranslationX(400);
        fat.setAlpha(0);
        fat.animate().translationY(0).alpha(1).setDuration(400).setStartDelay(500).start();
      //  img.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        spinner.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(200).start();
        spinner2.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(400).start();
        spinner3.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(600).start();
        spinner4.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(800).start();




        fat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sq=spinner.getSelectedItem().toString();
                sq=sq+spinner2.getSelectedItem().toString()+spinner3.getSelectedItem().toString()+spinner4.getSelectedItem().toString();
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("key",sq);
                startActivity(i);
            }
        });
}
}
