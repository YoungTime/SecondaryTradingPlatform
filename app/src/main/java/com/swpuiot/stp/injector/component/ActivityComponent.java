package com.swpuiot.stp.injector.component;


import android.app.Activity;
import android.content.Context;

import com.swpuiot.stp.injector.module.ActivityModule;
import com.swpuiot.stp.injector.scrope.ActivityScope;
import com.swpuiot.stp.injector.scrope.ContextLifeCycle;
import com.swpuiot.stp.presenter.impl.LoginedPresenter;
import com.swpuiot.stp.views.LoginedActivity;
import com.swpuiot.stp.views.MainActivity;
import com.swpuiot.stp.views.RegisterActivity;

import dagger.Component;


/**
 * Created by wuhaojie on 2016/7/7 10:57.
 */
@ActivityScope
@Component(modules = ActivityModule.class, dependencies = AppComponent.class)
public interface ActivityComponent {

    void inject(MainActivity activity);
    void inject(LoginedActivity activity);
    void inject(RegisterActivity activity);
    Activity activity();

    @ContextLifeCycle("Activity")
    Context activityContext();

    @ContextLifeCycle("App")
    Context appContext();


}