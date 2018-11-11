package app.sharp.com.sharpapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simpleListview;
    String strArray[] = {"Preload Package Scan","Preload Smart Scan Setup","SurePost Setup","Bulk Delivery Setup"," Driver Load","iSPA","Beacon Maintenance"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListview = findViewById(R.id.lv_simple);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_item,R.id.tv_name,strArray);
        simpleListview.setAdapter(arrayAdapter);
    }
}
