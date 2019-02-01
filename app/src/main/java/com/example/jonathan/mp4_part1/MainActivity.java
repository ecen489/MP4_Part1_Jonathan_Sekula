package com.example.jonathan.mp4_part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonListener(View view) {
        // access EditText and TextView objects
        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);

        // set text of textView to the contents of editText
        textView.setText(editText.getText().toString());
        // reset editText
        editText.setText("");

    }
}
