package per.chq.dagger2simpleforandroid.dagger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;
import per.chq.dagger2simpleforandroid.dagger.module.AllActivityMudule;

//Step 3 将module与component绑定
@Singleton
@Component(modules = {/*必需*/AndroidInjectionModule.class,/*使用support库时需要*/ AndroidSupportInjectionModule.class, /*Step 2-2创建的module*/AllActivityMudule.class})
public interface AppComponent{
     void inject(DaggerBaseApplication app);
}
