package com.google.firebase.datatransport;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

public class TransportRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.builder(TransportFactory.class).add(Dependency.required(Context.class)).factory(TransportRegistrar$$ExternalSyntheticLambda0.INSTANCE).build(), LibraryVersionComponent.create("fire-transport", BuildConfig.VERSION_NAME)});
    }
}
