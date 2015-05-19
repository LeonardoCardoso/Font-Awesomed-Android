package com.leocardz.android.fontawesome;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class FontAwesomeTextView extends TextView {

    public FontAwesomeTextView(Context context) {
        super(context);
        setTypeface(FontAwesome.getInstance(context).getTypeFace());
    }

    public FontAwesomeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontAwesome.getInstance(context).getTypeFace());
    }

    public FontAwesomeTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setTypeface(FontAwesome.getInstance(context).getTypeFace());
    }

}