package com.example.pierre.androidactivitypratrical;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {


    private Button mbButton;
    private EditText mbText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbButton = (Button)findViewById(R.id.submit);
        mbText= (EditText)findViewById(R.id.editText);
        mbButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view == mbButton){
            String test = mbText.getText().toString();
            Intent intention = new Intent(this,
                    ActiviteSuivante.class);
            intention.putExtra("passedText",test);
                    startActivity(intention);
        }
    }
}
