package com.example.android.lang;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_activity);
        final ArrayList<Word> numb = new ArrayList<Word>();
        numb.add(new Word("black","kululli",R.drawable.color_black,R.raw.color_black));
        numb.add(new Word("brown", "takaakki",R.drawable.color_brown,R.raw.color_brown));
        numb.add(new Word("dusty yellow", "topiise",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        numb.add(new Word("gray", "topoppi",R.drawable.color_gray,R.raw.color_gray));
        numb.add(new Word("green", "chokokki",R.drawable.color_green,R.raw.color_green));
        numb.add(new Word("mustard yellow", "chiwite",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        numb.add(new Word("red", "wetetti",R.drawable.color_red,R.raw.color_red));
        numb.add(new Word("white", "kelelli",R.drawable.color_white,R.raw.color_white));


        WordAdapter wordAdapter=new WordAdapter(this,numb,R.color.category_colors);
        ListView listView=(ListView)findViewById(R.id.root);
        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=numb.get(position);
                MediaPlayer mediaplay= MediaPlayer.create(Colors_activity.this,word.getAudioresourceid());
                mediaplay.start();
            }
        });

    }
}
