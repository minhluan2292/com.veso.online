package com.veso.online.features.result;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.veso.online.features.result.detail.ResultDetailFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/veso/online/features/result/XosoResultFragmentAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "extraData", "Landroid/os/Bundle;", "initPagePos", "", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;Landroid/os/Bundle;I)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "getItemCount", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: XosoResultFragmentAdapter.kt */
public final class XosoResultFragmentAdapter extends FragmentStateAdapter {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int MAX_PAGE = 100;
    private final Bundle extraData;
    private final int initPagePos;

    public int getItemCount() {
        return 100;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XosoResultFragmentAdapter(FragmentManager fragmentManager, Lifecycle lifecycle, Bundle bundle, int i) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(bundle, "extraData");
        this.extraData = bundle;
        this.initPagePos = i;
    }

    public Fragment createFragment(int i) {
        return ResultDetailFragment.Companion.newInstance$default(ResultDetailFragment.Companion, i - this.initPagePos, i, (String) null, this.extraData, 4, (Object) null);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/veso/online/features/result/XosoResultFragmentAdapter$Companion;", "", "()V", "MAX_PAGE", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: XosoResultFragmentAdapter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
