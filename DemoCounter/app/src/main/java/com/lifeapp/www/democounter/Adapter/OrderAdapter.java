package com.lifeapp.www.democounter.Adapter;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lifeapp.www.democounter.Model.CountDownTextView;
import com.lifeapp.www.democounter.Model.orderItem;
import com.lifeapp.www.democounter.R;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Prakhar on 12/30/2016.
 */

public class OrderAdapter extends  BaseAdapter {
    Context ctx;
    LayoutInflater lInflater;
    List<orderItem> orderItemList;
    ViewHolder holder;
    private Handler customHandler = new Handler();


    public OrderAdapter(Context context, List<orderItem> orderItemList) {
        ctx = context;  //set the context
        this.orderItemList = orderItemList; //set the arraylist
        lInflater = (LayoutInflater) ctx  //set the layout
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        customHandler.postDelayed(updateTimerThread, 0);

    }
    int i=1000;
    private Runnable updateTimerThread = new Runnable() {

        public void run() {

            for(orderItem item : orderItemList){
              int countDown=  (int)(item.getCountDown()-1000);
                if(countDown>-1){
                    item.setCountDown(countDown);
                }

            }
            //  orderAdapter.updateReceiptsList(orderItemList);
            customHandler.postDelayed(this, 1000);
            notifyDataSetChanged();

        }

    };

    public static class ViewHolder{
        public TextView tv_orderName;
        public TextView tv_counter;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        orderItem   e = orderItemList.get(position);
        if (v == null) {
            LayoutInflater vi = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.layout_orderitem, null);
            holder=new ViewHolder();
            holder.tv_orderName = (TextView) v.findViewById(R.id.tv_orderName);
            holder.tv_counter = (TextView) v.findViewById(R.id.tv_counter);
            v.setTag( holder );


        }else{
            holder=(ViewHolder)v.getTag();

        }

        if(orderItemList.size()<=0)
        {
            holder.tv_orderName.setText("No Data");

        }
        else if (e != null) {
            holder.tv_orderName.setText( e.getOrderName());
            holder.tv_counter.setText("Time remaining:"+String.format("%d min, %d sec",
                    TimeUnit.MILLISECONDS.toMinutes( e.getCountDown()),
                    TimeUnit.MILLISECONDS.toSeconds(e.getCountDown()) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(e.getCountDown()))));
        };



        return v;
    }


    @Override
    public Object getItem(int position) {
        return orderItemList.get(position);
    }

    @Override
    public int getCount() {
        return orderItemList.size();
    }

    @Override
    public long getItemId(int position) {
        return orderItemList.get(position).getOrder_id() ;
    }

}
