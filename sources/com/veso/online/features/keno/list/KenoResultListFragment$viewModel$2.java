package com.veso.online.features.keno.list;

import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/veso/online/features/keno/list/KenoResultListViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: KenoResultListFragment.kt */
final class KenoResultListFragment$viewModel$2 extends Lambda implements Function0<KenoResultListViewModel> {
    final /* synthetic */ KenoResultListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KenoResultListFragment$viewModel$2(KenoResultListFragment kenoResultListFragment) {
        super(0);
        this.this$0 = kenoResultListFragment;
    }

    public final KenoResultListViewModel invoke() {
        return (KenoResultListViewModel) new ViewModelProvider(this.this$0).get(KenoResultListViewModel.class);
    }
}
