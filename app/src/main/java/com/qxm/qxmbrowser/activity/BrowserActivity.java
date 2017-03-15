package com.qxm.qxmbrowser.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qxm.qxmbrowser.R;

import java.util.ArrayList;
import java.util.List;

//TODO 1. 清除界面，仿照作出滑屏组件和下滑组件，左右组件，等
public class BrowserActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewCenter;

    private List<String> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        initData();
        mRecyclerViewCenter = (RecyclerView) findViewById(R.id.recycler_view_center);
        mRecyclerViewCenter.setLayoutManager(new GridLayoutManager(this, 4));
        mRecyclerViewCenter.setAdapter(new HomeAdapter());

    }

    private void initData() {
        mData = new ArrayList<>();
        for(int i ='A'; i< 'Z' ; ++i ) {
            mData.add(String.valueOf(i));
        }
    }


    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>
    {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                    BrowserActivity.this).inflate(R.layout.homeitem, parent,
                    false));
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position)
        {
            holder.tv.setText(mData.get(position));
        }

        @Override
        public int getItemCount()
        {
            return mData.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder
        {

            TextView tv;

            public MyViewHolder(View view)
            {
                super(view);
                tv = (TextView) view.findViewById(R.id.list_item);
            }
        }
    }
}
