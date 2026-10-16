package com.f1challenge.launcher;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Cria um texto simples na tela para testar se o app abriu
        TextView tv = new TextView(this);
        tv.setText("F1 Challenge Launcher - Em Breve!");
        tv.setTextSize(20);
        setContentView(tv);
    }
}
