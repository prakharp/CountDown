package com.lifeapp.www.democounter;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.lifeapp.www.democounter.Adapter.OrderAdapter;
import com.lifeapp.www.democounter.Model.orderItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private OrderAdapter orderAdapter;
    private List<orderItem> orderItemList;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.list);


        fillAdapter();
        orderAdapter=new OrderAdapter(getApplicationContext(),orderItemList);
        listView.setAdapter(orderAdapter);
    }


    public void fillAdapter(){
        orderItemList=new ArrayList<>();
        orderItemList.add(new orderItem(1,"Item #1",1180000,00));
        orderItemList.add(new orderItem(2,"Item #2",3420000,00));
        orderItemList.add(new orderItem(3,"Item #3",524000,00));
        orderItemList.add(new orderItem(4,"Item #4",1180000,00));
        orderItemList.add(new orderItem(5,"Item #5",190000,00));
        orderItemList.add(new orderItem(6,"Item #6",18000,00));
        orderItemList.add(new orderItem(7,"Item #7",19000,00));
        orderItemList.add(new orderItem(8,"Item #8",180000,00));
        orderItemList.add(new orderItem(9,"Item #9",19000,00));
        orderItemList.add(new orderItem(10,"Item #10",160000,00));
        orderItemList.add(new orderItem(11,"Item #11",130000,00));
        orderItemList.add(new orderItem(12,"Item #12",160000,00));
        orderItemList.add(new orderItem(13,"Item #13",180000,00));
        orderItemList.add(new orderItem(14,"Item #14",150000,00));
        orderItemList.add(new orderItem(15,"Item #15",170000,00));
        orderItemList.add(new orderItem(16,"Item #16",150000,00));
        orderItemList.add(new orderItem(17,"Item #17",170000,00));
        orderItemList.add(new orderItem(18,"Item #18",170000,00));
        orderItemList.add(new orderItem(19,"Item #19",180000,00));
        orderItemList.add(new orderItem(20,"Item #20",40000,00));
        orderItemList.add(new orderItem(21,"Item #21",160000,00));
        orderItemList.add(new orderItem(22,"Item #22",140000,00));
        orderItemList.add(new orderItem(23,"Item #23",160000,00));
        orderItemList.add(new orderItem(24,"Item #24",130000,00));
        orderItemList.add(new orderItem(25,"Item #25",120000,00));
        orderItemList.add(new orderItem(26,"Item #26",140000,00));
        orderItemList.add(new orderItem(27,"Item #27",170000,00));

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
