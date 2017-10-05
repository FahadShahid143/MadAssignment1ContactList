package com.example.fahadshahid.madassignment1contactlist.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.fahadshahid.madassignment1contactlist.R;
import com.example.fahadshahid.madassignment1contactlist.models.Contact;

import java.util.List;

/**
 * Created by Fahad Shahid on 10/1/2017.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {

    class ViewHolder {
        TextView tvName;
        TextView tvPhoneNo;
    }


    private static final String TAG = "MTAG";

    public ContactAdapter(@NonNull Context context, @NonNull List<Contact> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Log.d(TAG, "convertview : " + convertView);
        View view = convertView;
        ViewHolder vh;
        Contact u = getItem(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.contact_item_list, parent, false);

            TextView tvName = (TextView) view.findViewById(R.id.tvName);
            TextView tvPhoneNo = (TextView) view.findViewById(R.id.tvPhoneNo);

            vh = new ViewHolder();
            vh.tvName = tvName;
            vh.tvPhoneNo = tvPhoneNo;
            view.setTag(vh);
        }

        vh = (ViewHolder) view.getTag();

        vh.tvName.setText(u.getName());
        vh.tvPhoneNo.setText(u.getPhone());


        return view;

    }

}
