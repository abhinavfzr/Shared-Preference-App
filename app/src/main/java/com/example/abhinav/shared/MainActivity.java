package com.example.abhinav.shared;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText editText,editText2;
    Button button;
    public static final String MyPREFERENCES = "MyPrefs";
    public static final String Name= "nameKey";
    public static final String Password= "PhoneKey";

    SharedPreferences sharedPreferences;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);

        button =(Button)findViewById(R.id.button);
        sharedPreferences=getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n =editText.getText().toString();
                String p =editText2.getText().toString();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(Name,n);
                editor.putString(Password,p);

                editor.commit();
                Toast.makeText(MainActivity.this,"Thanks",Toast.LENGTH_LONG).show();


            }
        });


    }
}
