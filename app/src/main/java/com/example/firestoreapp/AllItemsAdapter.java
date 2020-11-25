package com.example.firestoreapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class AllItemsAdapter extends BaseAdapter {
    ProgressDialog progressDialog;
    List<ItemsPojo> itemsPojos;
    String itemname;
    Context cnt;
    public AllItemsAdapter(List<ItemsPojo> ar, String itemname, Context cnt)
    {
        this.itemsPojos=ar;
        this.itemname=itemname;
        this.cnt=cnt;
    }
    @Override
    public int getCount() {
        return itemsPojos.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int pos, View view, ViewGroup viewGroup)
    {
        LayoutInflater obj1 = (LayoutInflater)cnt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View obj2=obj1.inflate(R.layout.list_all_items,null);

        TextView tv_items_name=(TextView)obj2.findViewById(R.id.tv_item_name);
        tv_items_name.setText("Item Name :"+itemsPojos.get(pos).getItemname());

        Button btn_book=(Button)obj2.findViewById(R.id.btn_buy);
        btn_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cnt, "  "+itemsPojos.get(pos).getItemname() +"  "+"order placed Succussfullly " , Toast.LENGTH_LONG).show();
                cnt.startActivity(new Intent(cnt, ItemsList.class));
                ((Activity)cnt).finish();
            }
        });




        return obj2;
    }

}

