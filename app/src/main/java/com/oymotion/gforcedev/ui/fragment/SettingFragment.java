package com.oymotion.gforcedev.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.oymotion.gforcedev.R;

/**
 * Created by MouMou on 2017/5/17.
 */
public class SettingFragment extends BaseFragment {
    @Override
    protected View createView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, null);
        initView(view,R.string.menu_setting);
        return view;
    }
}
