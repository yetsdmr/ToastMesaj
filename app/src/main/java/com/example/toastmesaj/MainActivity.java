package com.example.toastmesaj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        islevVer();

    }

    private void tanimla() {
        imageView = findViewById(R.id.img);
        button = findViewById(R.id.btn);
    }

    private void islevVer() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rnd = (int)(Math.random()*3+1);
                degistir(rnd);
                Toast.makeText(MainActivity.this, "" +rnd+ " numaralı resim gösterildi.", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void degistir(int sayi){
        if (sayi ==1){
            imageView.setImageResource(R.drawable.animal_post);
        }
        else if(sayi == 2){
            imageView.setImageResource(R.drawable.post_2);
        }
    }
}