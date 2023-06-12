package com.example;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

public class GalleryViewManager extends ViewGroupManager<GalleryView> {
    @NonNull
    @Override
    public String getName() {
        return "NativeGallery";
    }

    @NonNull
    @Override
    protected GalleryView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new GalleryView(themedReactContext);
    }
}
