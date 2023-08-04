package com.example.customimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText h= findViewById(R.id.textView2);
        EditText w= findViewById(R.id.textView3);
        ImageView im=findViewById(R.id.imageView);

        Button b1= findViewById(R.id.button);

        im.setVisibility(View.INVISIBLE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int h1,w1;
                h1=Integer.parseInt(h.getText().toString());
                w1=Integer.parseInt(w.getText().toString());
                im.getLayoutParams().height=h1;
                im.getLayoutParams().width=w1;
                im.setVisibility(View.VISIBLE);
                im.requestLayout();
            }
        });





    }
}
