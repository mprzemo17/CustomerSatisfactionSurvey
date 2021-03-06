package com.example.satisfactionsurvey;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class CatGridAdapter extends BaseAdapter {


    private List<String> catList;

    public CatGridAdapter(List<String> catList) {
        this.catList = catList;
    }


    @Override
    public int getCount() {
        return catList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null)
        {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_item_layout, parent, false);
        }
        else
        {
            view = convertView;
        }

        // kod który po wyborze kategorii otwiera okno z wyborem setów

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parent.getContext(), SetsActivity.class); //zamienic categoryactivity na activity z pytaniami!!!!
                intent.putExtra("CATEGORY", catList.get(position));
                parent.getContext().startActivity(intent);
            }
        }); //koniec

        //      ((TextView) view.findViewById(R.id.catName)).setText(catList.get(position));
        //      ((TextView) view.findViewById(R.id.catName)).setText(catList.get(position));

        //  Random rnd = new Random();
        //  int color = Color.argb(255,rnd.nextInt(255),rnd.nextInt(255), rnd.nextInt(255)); //color kategorii się tu ustawia randomowo
        //   view.setBackgroundColor(color);

        return view;
    }
}



