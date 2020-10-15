package com.example.week4;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView chosen;
    String[] contactName = {"Nguyen Van A", "Nguyen Van B", "Nguyen Van C", "Nguyen Van D"};
    String[] contactNumber = {"01251502505","01052224731", "03548613029", "03486341793"};
    Integer[] thumbnails = {R.drawable.avatar_male};
    ListView contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chosen = (TextView)findViewById(R.id.txtChosen);
        contact = (ListView)findViewById(R.id.lstContact);
        ContactAdapter adapter = new ContactAdapter(this, R.layout.contactlayout, contactName, contactNumber, thumbnails);

        contact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                chosen.setText("You choose: " + contactName[position]);
            }
        });
        contact.setAdapter(adapter);
    }


}