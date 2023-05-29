package com.veso.online.features.rate;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.veso.online.R;
import com.veso.online.databinding.FragmentIntroDialogBinding;
import com.veso.online.utils.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/veso/online/features/rate/IntroDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lcom/veso/online/databinding/FragmentIntroDialogBinding;", "listener", "Lcom/veso/online/features/rate/IntroDialogFragment$OnClickListener;", "getListener", "()Lcom/veso/online/features/rate/IntroDialogFragment$OnClickListener;", "setListener", "(Lcom/veso/online/features/rate/IntroDialogFragment$OnClickListener;)V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "", "onStart", "setupAction", "Companion", "OnClickListener", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: IntroDialogFragment.kt */
public final class IntroDialogFragment extends DialogFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private FragmentIntroDialogBinding binding;
    private OnClickListener listener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/veso/online/features/rate/IntroDialogFragment$OnClickListener;", "", "onOK", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: IntroDialogFragment.kt */
    public interface OnClickListener {
        void onOK();
    }

    @JvmStatic
    public static final RatingDialogFragment newInstance() {
        return Companion.newInstance();
    }

    public final OnClickListener getListener() {
        return this.listener;
    }

    public final void setListener(OnClickListener onClickListener) {
        this.listener = onClickListener;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        Window window2 = onCreateDialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        onCreateDialog.setCancelable(false);
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        FragmentIntroDialogBinding inflate = FragmentIntroDialogBinding.inflate(getLayoutInflater(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater, container, false)");
        this.binding = inflate;
        setupAction();
        FragmentIntroDialogBinding fragmentIntroDialogBinding = this.binding;
        if (fragmentIntroDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentIntroDialogBinding = null;
        }
        ConstraintLayout root = fragmentIntroDialogBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    public void onStart() {
        Window window;
        super.onStart();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        int screenWidth = ExtensionsKt.getScreenWidth(requireActivity) - ((int) requireContext().getResources().getDimension(R.dimen.dp_22));
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(screenWidth, -2);
        }
    }

    private final void setupAction() {
        FragmentIntroDialogBinding fragmentIntroDialogBinding = this.binding;
        if (fragmentIntroDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentIntroDialogBinding = null;
        }
        fragmentIntroDialogBinding.tvUnderstand.setOnClickListener(new IntroDialogFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: setupAction$lambda-3$lambda-2  reason: not valid java name */
    public static final void m563setupAction$lambda3$lambda2(IntroDialogFragment introDialogFragment, View view) {
        Intrinsics.checkNotNullParameter(introDialogFragment, "this$0");
        OnClickListener onClickListener = introDialogFragment.listener;
        if (onClickListener != null) {
            onClickListener.onOK();
        }
        introDialogFragment.dismiss();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/veso/online/features/rate/IntroDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/veso/online/features/rate/RatingDialogFragment;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: IntroDialogFragment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RatingDialogFragment newInstance() {
            return new RatingDialogFragment();
        }
    }
}
