package com.example.radio_button_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton resim1Radio;
    RadioButton resim2Radio;
    RadioButton resim3Radio;
    RadioButton resim4Radio;
    RadioButton resim5Radio;
    ImageView img;
    RadioGroup radioGroup;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        define();
        takeId();
        
    }

    private void define() {
        resim1Radio = (RadioButton) findViewById(R.id.image1);
        resim2Radio = (RadioButton) findViewById(R.id.image2);
        resim3Radio = (RadioButton) findViewById(R.id.image3);
        resim4Radio = (RadioButton) findViewById(R.id.image4);
        resim5Radio = (RadioButton) findViewById(R.id.image5);
        img = (ImageView) findViewById(R.id.imageview);
        radioGroup=(RadioGroup) findViewById(R.id.radioGrp);
        btn=(Button) findViewById(R.id.btn);

    }

    public void takeId(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int incomingId=radioGroup.getCheckedRadioButtonId();
                changePicture(incomingId);
            }
        });
    }

    public void changePicture(int id){
        if (id==R.id.image1){
            img.setImageResource(R.drawable.bir);
            Toast.makeText(getApplicationContext(),resim1Radio.getText(), Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.image2){
            img.setImageResource(R.drawable.iki);
            Toast.makeText(getApplicationContext(),resim2Radio.getText(), Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.image3){
            img.setImageResource(R.drawable.uc);
            Toast.makeText(getApplicationContext(),resim3Radio.getText(), Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.image4){
            img.setImageResource(R.drawable.dort);
            Toast.makeText(getApplicationContext(),resim4Radio.getText(), Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.image5){
            img.setImageResource(R.drawable.bes);
            Toast.makeText(getApplicationContext(),resim5Radio.getText(), Toast.LENGTH_LONG).show();
        }
    }
}