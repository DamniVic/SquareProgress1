package com.damni.pythontemp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.damni.pythontemp.R;
import com.damni.pythontemp.constumview.SquareProgress;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    private Button mButton;
    private SquareProgress mSquareProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText= (EditText) findViewById(R.id.edit);
        mButton= (Button) findViewById(R.id.button1);
        mSquareProgress= (SquareProgress) findViewById(R.id.sp);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sData=mEditText.getText().toString();
                int iData=Integer.valueOf(sData);
                mSquareProgress.setCurProgress(iData);
            }
        });
    }
}
