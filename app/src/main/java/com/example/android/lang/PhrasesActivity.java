package com.example.android.lang;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        final ArrayList<Word> numb = new ArrayList<Word>();
        numb.add(new Word("Where are you going?", "minto wuksus",R.raw.phrase_where_are_you_going));
        numb.add(new Word("What is your name?", "tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        numb.add(new Word("My name is...", "oyaaset...",R.raw.phrase_my_name_is));
        numb.add(new Word("How are you feeling?", "michәksәs?",R.raw.phrase_how_are_you_feeling));
        numb.add(new Word("I’m feeling good.", "kuchi achit",R.raw.phrase_im_feeling_good));
        numb.add(new Word("Are you coming?", "әәnәs'aa?",R.raw.phrase_are_you_coming));
        numb.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        numb.add(new Word("I’m coming.", "әәnәm",R.raw.phrase_im_coming));
        numb.add(new Word("Let’s go.", "yoowutis",R.raw.phrase_lets_go));
        numb.add(new Word("Come here.", "әnni'nem",R.raw.phrase_come_here));

        WordAdapter wordAdapter=new WordAdapter(this,numb,R.color.category_phrases);
        ListView listView=(ListView)findViewById(R.id.root);
        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=numb.get(position);
                MediaPlayer mediaplay= MediaPlayer.create(PhrasesActivity.this,word.getAudioresourceid());
                mediaplay.start();
            }
        });

    }
}