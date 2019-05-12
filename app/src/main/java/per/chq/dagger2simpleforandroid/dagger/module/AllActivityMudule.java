package per.chq.dagger2simpleforandroid.dagger.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import per.chq.dagger2simpleforandroid.MainActivity;

//Step 2-2 所有的activity和绑定各自的mudule
@Module
public abstract class AllActivityMudule {

    //例子
    @ContributesAndroidInjector(modules = {MainMudule.class})
    abstract MainActivity BinMainActivity();

}
