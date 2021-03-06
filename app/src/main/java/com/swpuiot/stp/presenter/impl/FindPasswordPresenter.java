package com.swpuiot.stp.presenter.impl;

import android.content.Context;
import android.os.Bundle;

import com.swpuiot.stp.base.BaseActivity;
import com.swpuiot.stp.base.IView;
import com.swpuiot.stp.injector.scrope.ContextLifeCycle;
import com.swpuiot.stp.interfaces.IFindPasswordView;
import com.swpuiot.stp.interfaces.IMainView;
import com.swpuiot.stp.presenter.IPresenter;

import javax.inject.Inject;

/**
 * Created by DELL on 2016/12/8.
 */
public class FindPasswordPresenter implements IPresenter {
    public static final String TAG = "MainPresenter";
    private Context mContext;
    private IFindPasswordView mFindPasswordView;

    @Inject
    public FindPasswordPresenter(@ContextLifeCycle("Activity")Context context){
        mContext = context;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void attachView(IView v) {
        mFindPasswordView = (IFindPasswordView) v;
    }

    public void findPasswordOnClick() {
        mFindPasswordView.findPasswordStart();
    }

    public void hidetext() {
        mFindPasswordView.hidetext();
    }

    public void hidenametext() {
        mFindPasswordView.hideusertext();
    }
}
