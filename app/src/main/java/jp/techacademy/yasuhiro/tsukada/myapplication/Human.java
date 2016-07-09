package jp.techacademy.yasuhiro.tsukada.myapplication;

import android.util.Log;

    /**
     * Created by tsukadayasuhiro on 2016/07/06.
     */

    class Human extends Animal implements Thinkable {


        int age;
        String name;
        String hobby;

        public Human(String name ,int age, String hobby) {

            this.age = age;
            this.name = name;
            this.hobby = hobby;
        }

        /*public void think() {
            Log.d("javatest", "");
        }*/

        public void think() {
            Log.d("javatest", "私は"  + this.hobby  + "と考えます。");



        }
        public void say() {
            Log.d("javatest","私の名前は" + this.name + "です。歳は" + this.age + "歳です。" );


    }



}
