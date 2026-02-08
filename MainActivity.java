package com.bakerstreet.cases;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.casesList);
        List<String> cases = new ArrayList<>();
        cases.add("1. Le violon volé\nClient : Adrien Hadlich\nLieu : Londres\nStatut : Ouvert\nDescription : Le Stradivarius a disparu lors d’un concert...");
        cases.add("2. Le chantage au Parliament\nClient : Anonyme\nLieu : Westminster\nStatut : Fermé\nDescription : Des lettres compromettantes ont été retrouvées...");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cases);
        listView.setAdapter(adapter);
    }
}
