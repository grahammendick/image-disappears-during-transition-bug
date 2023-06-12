package com.example;

import android.view.View;

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

    @Override
    public void addView(GalleryView parent, View child, int index) {
        parent.paintings.add(index, child);
    }

    @Override
    public void removeViewAt(GalleryView parent, int index) {
        parent.paintings.remove(index);
    }

    @Override
    public int getChildCount(GalleryView parent) {
        return parent.paintings.size();
    }

    @Override
    public View getChildAt(GalleryView parent, int index) {
        return parent.paintings.get(index);
    }

    @Override
    protected void onAfterUpdateTransaction(@NonNull GalleryView view) {
        super.onAfterUpdateTransaction(view);
        view.onAfterUpdateTransaction();
    }
}
