package per.chq.dagger2simpleforandroid.dagger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import dagger.android.AndroidInjection;

//Step 5:在activity里配置如下，或创建Activity基类，将需要使用Dagger的activity继承该类
//fragment 及 android的其它三个组件类似配置
//fragment 在onAttach()里AndroidSupportInjection.inject(this);
public class DaggerBaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }
}
