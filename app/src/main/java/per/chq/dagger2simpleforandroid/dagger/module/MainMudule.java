package per.chq.dagger2simpleforandroid.dagger.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import per.chq.dagger2simpleforandroid.MainActivity;
import per.chq.dagger2simpleforandroid.entity.TestA;

//Step2-1 activity需要使用的mudule;
@Module
public class MainMudule {

    //例子
    @Named("B")
    @Provides
    public TestA provideTest(){
        return new TestA("B");
    }

    @Named("A")
    @Provides
    public TestA provideTest2(){
        return new TestA();
    }
}
