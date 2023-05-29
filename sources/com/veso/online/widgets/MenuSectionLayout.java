package com.veso.online.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.gridlayout.widget.GridLayout;
import com.veso.online.R;
import com.veso.online.data.model.Menu;
import com.veso.online.data.model.MenuAction;
import com.veso.online.databinding.LayoutMenuItemViewBinding;
import com.veso.online.databinding.LayoutMenuSectionBinding;
import com.veso.online.features.main.OnMenuItemSelected;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ%\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/veso/online/widgets/MenuSectionLayout;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/veso/online/databinding/LayoutMenuSectionBinding;", "populateMenus", "", "menus", "", "Lcom/veso/online/data/model/Menu;", "iconHeightRes", "(Ljava/util/List;Ljava/lang/Integer;)V", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: MenuSectionLayout.kt */
public final class MenuSectionLayout extends CardView {
    private final LayoutMenuSectionBinding binding;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MenuSectionLayout(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MenuSectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MenuSectionLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuSectionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutMenuSectionBinding inflate = LayoutMenuSectionBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MenuSectionLayout);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…leable.MenuSectionLayout)");
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        CharSequence text = obtainStyledAttributes.getText(2);
        int i2 = 0;
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        inflate.tvMenuTitle.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        inflate.tvMenuTitle.setText(text);
        inflate.tvMoveToWeb.setVisibility(z ? 8 : i2);
        obtainStyledAttributes.recycle();
        setCardElevation(getResources().getDimension(R.dimen.card_elevation));
        setRadius((float) getResources().getDimensionPixelSize(R.dimen.card_corner));
    }

    public static /* synthetic */ void populateMenus$default(MenuSectionLayout menuSectionLayout, List list, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        menuSectionLayout.populateMenus(list, num);
    }

    public final void populateMenus(List<Menu> list, Integer num) {
        Intrinsics.checkNotNullParameter(list, "menus");
        LayoutInflater from = LayoutInflater.from(getContext());
        for (Menu menu : list) {
            LayoutMenuItemViewBinding inflate = LayoutMenuItemViewBinding.inflate(from, this.binding.gridMenus, true);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, binding.gridMenus, true)");
            ViewGroup.LayoutParams layoutParams = inflate.getRoot().getLayoutParams();
            GridLayout.LayoutParams layoutParams2 = layoutParams instanceof GridLayout.LayoutParams ? (GridLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            }
            inflate.ivMenuIcon.setImageResource(menu.getIconRes());
            inflate.tvMenuTitle.setText(menu.getTitleRes());
            if (num != null) {
                num.intValue();
                inflate.ivMenuIcon.getLayoutParams().height = getResources().getDimensionPixelSize(num.intValue());
            }
            inflate.getRoot().setOnClickListener(new MenuSectionLayout$$ExternalSyntheticLambda0(this, menu));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: populateMenus$lambda-3$lambda-2  reason: not valid java name */
    public static final void m594populateMenus$lambda3$lambda2(MenuSectionLayout menuSectionLayout, Menu menu, View view) {
        MenuAction action;
        Intrinsics.checkNotNullParameter(menuSectionLayout, "this$0");
        Intrinsics.checkNotNullParameter(menu, "$menu");
        Context context = menuSectionLayout.getContext();
        OnMenuItemSelected onMenuItemSelected = context instanceof OnMenuItemSelected ? (OnMenuItemSelected) context : null;
        if (onMenuItemSelected != null && (action = menu.getAction()) != null) {
            OnMenuItemSelected.DefaultImpls.onMenuSelected$default(onMenuItemSelected, action, (Bundle) null, false, 6, (Object) null);
        }
    }
}
