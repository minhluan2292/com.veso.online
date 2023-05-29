package com.veso.online.features.main;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.util.Calendar;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda0 implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ Calendar f$0;
    public final /* synthetic */ MainActivity f$1;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda0(Calendar calendar, MainActivity mainActivity) {
        this.f$0 = calendar;
        this.f$1 = mainActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        MainActivity.m538selectDate$lambda9(this.f$0, this.f$1, datePicker, i, i2, i3);
    }
}
