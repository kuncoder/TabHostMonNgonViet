package com.example.thang.tabhostmonngonviet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost host = (TabHost) findViewById(R.id.tab);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tóm Tắt");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Tóm Tắt");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Nguyên Liệu");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Nguyên Liệu");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Cách Làm");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Cách Làm");
        host.addTab(spec);
    }
}
