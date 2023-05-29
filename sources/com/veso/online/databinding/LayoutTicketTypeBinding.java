package com.veso.online.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.veso.online.R;
import java.util.Objects;

public final class LayoutTicketTypeBinding implements ViewBinding {
    private final TextView rootView;

    private LayoutTicketTypeBinding(TextView textView) {
        this.rootView = textView;
    }

    public TextView getRoot() {
        return this.rootView;
    }

    public static LayoutTicketTypeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutTicketTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_ticket_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutTicketTypeBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new LayoutTicketTypeBinding((TextView) view);
    }
}
