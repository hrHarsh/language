package com.example.android.lang;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class number_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_activity);

        final ArrayList<Word> numb = new ArrayList<Word>();
        numb.add(new Word("one","lutti",R.drawable.number_one,R.raw.number_one));
        numb.add(new Word("two", "otiiko",R.drawable.number_two,R.raw.number_two));
        numb.add(new Word("three", "tolookosu",R.drawable.number_three,R.raw.number_three));
        numb.add(new Word("four", "oyyisa",R.drawable.number_four,R.raw.number_four));
        numb.add(new Word("five", "massokka",R.drawable.number_five,R.raw.number_five));
        numb.add(new Word("six", "temmokka",R.drawable.number_six,R.raw.number_six));
        numb.add(new Word("seven", "kenekaku",R.drawable.number_seven,R.raw.number_seven));
        numb.add(new Word("eight", "kawinta",R.drawable.number_eight,R.raw.number_eight));
        numb.add(new Word("nine", "wo’e",R.drawable.number_nine,R.raw.number_nine));
        numb.add(new Word("ten", "na’aacha",R.drawable.number_ten,R.raw.number_ten));

        WordAdapter wordAdapter=new WordAdapter(this,numb,R.color.category_numbers);
        ListView listView=(ListView)findViewById(R.id.root);
        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Word word=numb.get(position);
               MediaPlayer mediaplay= MediaPlayer.create(number_activity.this,word.getAudioresourceid());
               mediaplay.start();
            }
        });
        }
    }

