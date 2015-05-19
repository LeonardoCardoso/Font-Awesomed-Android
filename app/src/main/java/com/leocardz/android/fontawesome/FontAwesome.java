package com.leocardz.android.fontawesome;

import android.content.Context;
import android.graphics.Typeface;

public class FontAwesome {
    private Context context;
    private static FontAwesome instance;

    public FontAwesome(Context context) {
        this.context = context;
    }

    public static FontAwesome getInstance(Context context) {
        synchronized (FontAwesome.class) {
            if (instance == null) {
                instance = new FontAwesome(context);
            }
            return instance;
        }
    }

    public Typeface getTypeFace() {
        return Typeface.createFromAsset(context.getResources().getAssets(), "fontawesome-webfont.ttf");
    }

}
