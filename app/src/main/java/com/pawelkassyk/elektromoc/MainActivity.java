package com.pawelkassyk.elektromoc;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] myStringArray = new String[]{"poniedziałek", "wtorek", "środa", "czwartek", "piatek", "sobota", "niedziela"};

        ListView myList = findViewById(R.id.listview1);
        myList.setAdapter(new MyAdapter(myStringArray));
    }

    class MyAdapter extends BaseAdapter {
        String[] data;

        public MyAdapter(String[] data) {
            this.data = data;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int index, View view, ViewGroup viewGroup) {
            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.list_element, viewGroup, false);
            }

            String myelement = data[index];
            TextView cokolwiek = view.findViewById(R.id.textview1);
            cokolwiek.setText(myelement);


            return view;
        }
    }
}

