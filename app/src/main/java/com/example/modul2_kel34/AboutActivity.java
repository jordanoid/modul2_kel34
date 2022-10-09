package com.example.modul2_kel34;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    String nameList[] = {"Muhammad Fariz Sidik",
            "Sachiko Fitria Ramandanti",
            "Muhamad Rafdan Maulana",
            "Jordano Iqbal Darmawan"};

    String NIMList[] = {"21120120140038",
            "21120120140103",
            "21120120140139",
            "21120120130073"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        listView = (ListView) findViewById(R.id.listView);
        CustomBaseAdapter CBA = new CustomBaseAdapter(getApplicationContext(),nameList, NIMList);
        listView.setAdapter(CBA);
    }
}