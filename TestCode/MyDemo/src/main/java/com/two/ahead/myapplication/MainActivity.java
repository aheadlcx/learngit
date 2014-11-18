package com.two.ahead.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MainActivity extends Activity {

    public RecyclerView recyclerView;
    /** 为了只显示最后一次Toast,所以加上限制 **/
    private static Toast mToast = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        init();
    }

    private void init() {
        mToast = Toast.makeText(this, "test", Toast.LENGTH_LONG);
       final String temp = "s";
        LinearLayoutManager llManager = new LinearLayoutManager(this);
        llManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llManager);
        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
//                Toast.makeText(this, "Ss", Toast.LENGTH_LONG).show();
//                Toast.makeText(getBaseContext(),"test",12).show();
//                mToast.show();

            }

        });
        List<String> listData = new ArrayList<String>();
        Iterator<String> iterator = listData.iterator();
        for(int i = 0;i<30;i++){
            listData.add("just do it"+i);
        }
        MyAdapter adapter = new MyAdapter(listData);
        recyclerView.setAdapter(adapter);

    }




}
