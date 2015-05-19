package com.leocardz.android.fontawesome;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    private Integer[] mColors = {
            R.color.random0,
            R.color.random1,
            R.color.random2,
            R.color.random3,
            R.color.random4,
            R.color.random5,
            R.color.random6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        String[] icons = getResources().getStringArray(R.array.fontawesome_array);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        IconAdapter iconAdapter = new IconAdapter(this, icons);
        gridview.setAdapter(iconAdapter);

    }

    public class IconAdapter extends BaseAdapter {
        private Context mContext;
        private String[] mIcons;

        public IconAdapter(Context c, String[] icons) {
            mContext = c;
            mIcons = icons;
        }

        public int getCount() {
            return mIcons.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder holder = null;

            if (convertView == null) {
                LayoutInflater vi = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = vi.inflate(R.layout.grid_item, null);

                FontAwesomeTextView fontAwesomeTextView = (FontAwesomeTextView) convertView.findViewById(R.id.icon);
                holder = new ViewHolder(fontAwesomeTextView);

            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.getIcon().setText(mIcons[position]);

            // Set Random Color
            holder.getIcon().setTextColor(mContext.getResources().getColor(mColors[new Random().nextInt(mColors.length)]));

            convertView.setTag(holder);

            return convertView;
        }

    }

    public class ViewHolder {
        FontAwesomeTextView icon;

        public ViewHolder(FontAwesomeTextView icon) {
            setIcon(icon);
        }

        public FontAwesomeTextView getIcon() {
            return icon;
        }

        public void setIcon(FontAwesomeTextView icon) {
            this.icon = icon;
        }

    }

}
