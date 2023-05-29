package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.veso.online.R;

public final class LayoutPrizeActionsBinding implements ViewBinding {
    public final ImageButton ibPlaySound;
    private final LinearLayout rootView;
    public final TextView tvAction2n;
    public final TextView tvAction3n;
    public final TextView tvActionFull;

    private LayoutPrizeActionsBinding(LinearLayout linearLayout, ImageButton imageButton, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.ibPlaySound = imageButton;
        this.tvAction2n = textView;
        this.tvAction3n = textView2;
        this.tvActionFull = textView3;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutPrizeActionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutPrizeActionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_prize_actions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutPrizeActionsBinding bind(View view) {
        int i = R.id.ib_play_sound;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.ib_play_sound);
        if (imageButton != null) {
            i = R.id.tv_action_2n;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_2n);
            if (textView != null) {
                i = R.id.tv_action_3n;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_3n);
                if (textView2 != null) {
                    i = R.id.tv_action_full;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_full);
                    if (textView3 != null) {
                        return new LayoutPrizeActionsBinding((LinearLayout) view, imageButton, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
