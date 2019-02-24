package com.example.android.lang;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class family_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_activity);
        final ArrayList<Word> numb = new ArrayList<Word>();
        numb.add(new Word("Father","apa",R.drawable.family_father,R.raw.family_father));
        numb.add(new Word("Mother", "ata",R.drawable.family_mother,R.raw.family_mother));
        numb.add(new Word("Son", "angsi",R.drawable.family_son,R.raw.family_son));
        numb.add(new Word("Daughter", "tune",R.drawable.family_daughter,R.raw.family_daughter));
        numb.add(new Word("Elder brother", "taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        numb.add(new Word("Elder sister", "chalitti",R.drawable.family_older_sister,R.raw.family_older_sister));
        numb.add(new Word("Younger sister", "tete",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        numb.add(new Word("Younger brother", "kolliti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        numb.add(new Word("Grandmother", "amma",R.drawable.family_grandmother,R.raw.family_grandmother));
        numb.add(new Word("Grandfather", "paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

        WordAdapter wordAdapter=new WordAdapter(this,numb,R.color.category_family);
        ListView listView=(ListView)findViewById(R.id.root);
        listView.setAdapter(wordAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=numb.get(position);
                MediaPlayer mediaplay= MediaPlayer.create(family_activity.this,word.getAudioresourceid());
                mediaplay.start();
            }
        });

    }
}
