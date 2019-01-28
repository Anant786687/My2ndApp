package com.andro.anant.my2ndapp;

/*import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends android.app.Activity
{

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et1 = findViewById(R.id.et1);
        final TextView tv1 = findViewById(R.id.tv1);
        Button   bt2 = findViewById(R.id.bt2);
        Button   bt1 = findViewById(R.id.bt1);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(et1.getText().toString());
            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("");
                et1.setText("");

            }
        });





    }

/* xml configuration

 public void getText(View v){
           tv1.setText(et1.getText().toString());

    }

     public void clearText(View v)
     {

         tv1.setText("");
         et1.setText("");
     }
*/

}