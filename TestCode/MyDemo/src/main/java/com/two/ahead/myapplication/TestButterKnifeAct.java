package com.two.ahead.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by ahead on 2014/11/17.
 */
public class TestButterKnifeAct extends Activity {


    @InjectView(R.id.btn)
    Button mBtn;
    @InjectView(R.id.btn2)
    Button mBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        ButterKnife.inject(this);
    }
}
