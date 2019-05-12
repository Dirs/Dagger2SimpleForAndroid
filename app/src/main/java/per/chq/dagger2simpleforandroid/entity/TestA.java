package per.chq.dagger2simpleforandroid.entity;

import javax.inject.Inject;

public class TestA {

    public String text = "A";

    @Inject
    public TestA(){

    }

    public TestA(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}
