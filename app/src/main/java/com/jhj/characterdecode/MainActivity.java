package com.jhj.characterdecode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jhj.decodelibrary.CharacterUtil;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CharacterUtil character = CharacterUtil.getInstance(this);

        final EditText editText = (EditText) findViewById(R.id.editText);
        final TextView tvAllSpelling = (TextView) findViewById(R.id.tv_all_spelling);
        final TextView tvAllAlpha = (TextView) findViewById(R.id.tv_all_alpha);
        final TextView tvFirstSpelling = (TextView) findViewById(R.id.tv_first_spelling);
        final TextView tvFirstAlpha = (TextView) findViewById(R.id.tv_first_alpha);
        final TextView tvArray = (TextView) findViewById(R.id.tv_array);
        Button button = (Button) findViewById(R.id.decode);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                if (!string.isEmpty()) {
                    tvAllSpelling.setText(character.getAllSpelling(string));
                    tvFirstSpelling.setText(character.getFirstSpelling(string));
                    tvAllAlpha.setText(character.getAllAlpha(string));
                    tvFirstAlpha.setText(character.getFirstAlpha(string));
                    tvArray.setText(Arrays.toString(character.getStringArray(string)));


                } else {
                    Toast.makeText(MainActivity.this, "请输入内容", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
