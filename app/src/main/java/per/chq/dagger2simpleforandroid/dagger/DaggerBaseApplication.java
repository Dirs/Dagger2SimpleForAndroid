package per.chq.dagger2simpleforandroid.dagger;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.HasBroadcastReceiverInjector;
import dagger.android.HasFragmentInjector;

//Step 2-3 创建含以下内容的application并配置入manifests（或配置它的子类）,其它组件配置类似,可参见dagger.android.DaggerApplication类
public class DaggerBaseApplication extends Application implements
        HasActivityInjector
//        , HasFragmentInjector//
//    , HasBroadcastReceiverInjector//
    //...
{
    @Inject
    DispatchingAndroidInjector<Activity> mActivityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        //Step 4：Build项目（生成DaggerAppComponent）后加入以下代码
        DaggerAppComponent.create().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mActivityInjector;
    }
}
