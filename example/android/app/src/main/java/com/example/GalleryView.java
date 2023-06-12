package com.example;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.facebook.react.uimanager.ThemedReactContext;

import java.util.ArrayList;

public class GalleryView extends ViewGroup {
    ArrayList<View> paintings = new ArrayList<>();

    public GalleryView(Context context) {
        super(context);
    }

    void onAfterUpdateTransaction() {
        if (paintings.size() == 0) return;
        FragmentActivity currentActivity = (FragmentActivity) ((ThemedReactContext) getContext()).getCurrentActivity();
        FragmentManager fragmentManager = currentActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setReorderingAllowed(true);
        PaintingFragment fragment = new PaintingFragment(paintings.get(0));
        fragmentTransaction.replace(getId(), fragment);
        fragmentTransaction.commit();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        onAfterUpdateTransaction();
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    public static class PaintingFragment extends Fragment {
        private View painting;

        PaintingFragment(View painting) {
            super();
            this.painting = painting;
        }

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return painting;
        }
    }
}
