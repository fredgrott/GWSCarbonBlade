package com.grottworkshop.gwscarbonbladelibrary.fontloading;

import android.app.ActionBar;
import android.text.SpannableString;


/**
 * Helper for setting actionbar title with custom typeface via SpannableString.
 *
 * @author Jakub Skierbiszewski
 * Created by fgrott on 4/13/2015.
 */
public class ActionBarHelper {

    private static final String TAG = ActionBarHelper.class.getSimpleName();

    public static void setTitle(android.support.v7.app.ActionBar actionBar, SpannableString spannableString) {


        actionBar.setTitle(spannableString);

    }

    public static void setTitle(android.support.v7.app.ActionBar actionBar, CharSequence charSequence) {
        actionBar.setTitle(charSequence.toString());
    }

    public static void setTitle(ActionBar actionBar, SpannableString spannableString) {

        actionBar.setTitle(spannableString);

    }

    public static void setTitle(ActionBar actionBar, CharSequence charSequence) {
        actionBar.setTitle(charSequence.toString());
    }


}
