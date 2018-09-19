package com.example.supriya.mymate.Adapter;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

import com.github.library.bubbleview.BubbleTextView;
import com.example.supriya.mymate.Models.ChatModel;
import com.example.supriya.mymate.R;

import java.util.List;

/**
 * Created by supriya on 27/7/17.
 */

public class CustomAdapter extends BaseAdapter {
    private List<ChatModel> list_chat_models;
    private Context context;
    private LayoutInflater layoutInflater;

    public CustomAdapter(List<ChatModel> list_chat_models, Context context) {
        this.list_chat_models = list_chat_models;
        this.context = context;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return list_chat_models.size();
    }

    @Override
    public Object getItem(int position) {
        return list_chat_models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view =convertView;
        if(view==null)
        {
            if(list_chat_models.get(position).isSend)//here we just check message is sended or received to inflater layout
            {
                view = layoutInflater.inflate(R.layout.list_message_send,null);
            }
            else
            {
                view = layoutInflater.inflate(R.layout.list_message_receive,null);
            }

            BubbleTextView text_message = (BubbleTextView)view.findViewById(R.id.text_message);
            text_message.setText(list_chat_models.get(position).message);

        }
        return view;
    }

}