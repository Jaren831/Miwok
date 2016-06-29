package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //Word.("one");
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "tolookosu"));
        words.add(new Word("gray", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("black", "temmakka"));
        words.add(new Word("white", "kenekaku"));
        words.add(new Word("mustard yellow\n", "kawinta"));
        words.add(new Word("dusty yellow\n", "wo'e"));
        words.add(new Word("ten", "na'aacha"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

