package jp.techacademy.akito.shimbo.human_class;

/**
 * Created by Develop on 2017/03/12.
 */
import android.util.Log;

class Human extends Animal implements Thinkable{
    String hobby;

    public Human(String name,int age,String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    public void say()    {
        Log.d("javatest", "私の名前は" + String.valueOf(this.name) + "です。 年は" + String.valueOf(this.age) + "歳です。");
    }
    public void think(){
        Log.d("javatest", "私は" + String.valueOf(this.hobby) + "について考える");
    }
    }
