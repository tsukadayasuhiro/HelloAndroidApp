package jp.techacademy.yasuhiro.tsukada.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //コメント（無視されるよ）
        /*複数
        行にわたるコメントが
       　書ける
         */


        //整数型の変数をnumという名前で作成して、１０を代入する。
        // int num=10;
        //  Log.d("javatest",String.valueOf(num));

        //numに５０を代入する。
        // num =50;
        // Log.d("javatest", String.valueOf(num));


        // int num1 =10+20;

        //  Log.d("javatest", String.valueOf(num1));

        //int num2 =20;
        //  num2++;


        /*
        A + B   A に B を加える
        A - B   A から B を引く
		A * B   A に B を掛ける
		A / B   A を B で割る
		A % B   A を B で割った余り*/


        //final int MAX_NUM = 100000;
        //String.valueOf関数は、Stringクラスの関数で数値型などの変数を文字列型として返します


        /*	 演算式	              意味
             A && B	      A かつ B がともに true のときに true になる

             A || B	      A または B のどちらか一方でも true のときに true になる

        	 !A	          A が true ならば false を、 false であれば true になる*/





        /*int num1 = 10+5-2*4/2;
        Log.d("javatest","10+5-2*4/2="+String.valueOf(num1));で計算ができる。||     */





        /*int num1 = 10+5-2*4/2;
        Log.d("javatest","10+5-2*4/2="+String.valueOf(num1));

        boolean flag1 = true;
        boolean flag2 =false;
        Log.d("javatest","flag1 && flag2 = " + String.valueOf(flag1 && flag2));
        Log.d("javatest","flag1 || flag2 = " + String.valueOf(flag1 || flag2));


        int num2 = 10;
        int num3 = 20;
        Log.d("javatest","num2 < num3 = " + String.valueOf(num2 < num3));*/



        /* if (条件式)  {
    条件式が true の時に実行される処理

    if (条件式 1) {
         条件式1 が true の時に実行される処理

          } else if (条件式 2) {
          条件式2 が true の時に実行される処理

           } else {
           どの条件式も ture でなかったときに実行される処理
        }
        }*/

        /*int num = 60;

        if (num >= 90) {
            Log.d("javatest","優");
        } else if (num >= 75) {
            Log.d("javatest", "良");
        } else if (num >= 60) {
            Log.d("javatest", "可");
        } else {
            Log.d("javatest", "不可");
        }

        ６０の数値をいっぱいいじって試してみよう！*/


        /*switch (式) {
            case 値 :
                処理 1
                break;
            case 値 :
                処理 2
                break;
            case 値 :
                処理 3
                break;
            default:
                処理4
                break;
        }*/



       /* int drink = 1;


        switch (drink)  {
            case 0:
                Log.d("javatest","コーヒー注文しました。");
                break;
            case 1:
                Log.d("javatest","紅茶注文しました。");
                break;
            case 2:
                Log.d("javatest","ミルク注文しました。");
                break;
            default:
                Log.d("javatest","オーダーミスです。");
                break;
        }*/



       /* for (初期化; 条件 ; 更新) {
            繰り返し行いたい処理
        }*/

        /*for (int i = 0; i < 10; i++) {
            Log.d("javatest", String.valueOf(i));
        }*/


       /* while (条件式)  {
            処理
        }*/



        /*int num = 0;

        while (num < 10) {
            num++;
        }*/





        /*for (int i = 1; i < 6; i++) {
            Log.d("javatest", "for文の " + String. valueOf(i) + "回目");
        }


        int num = 1;

        while (num < 6) {
            Log.d("javatest","while文の " + String. valueOf(num) + "回目");
            num++;
        }*/


        // データ型[] 配列名 = new データ型[要素数];

       /* int[] points = new int [5];
        points[0] = 10;
        points[1] = 6;
        points[2] = 15;
        points[3] = 23;
        points[4] = 17;

        for (int i = 0; i < points.length; i++) {
            Log.d("javatest",String. valueOf(points[i]));
        }*/


       /* 関数の定義は以下のように記述します。

        アクセスコントロール 戻り値の型 関数名(引数の型 引数名) {処理}*/


       /* int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        Log.d("javatest",String.valueOf(sum));*/


        //ここでfirstやlastのこと 引数（ひきすう） と呼びますので覚えておきましょう。



  /* {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       total(50,1000);  数値を変えれば計算できる。



   }

    private void total(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last;  i++)  {
            sum = sum + i;
        }

        Log.d("javatest", String.valueOf(sum));
    }*/


    /*   int t = total(10,100);   // ここでtotalからsumを返してもらう
       Log.d("javatest", String.valueOf(t));
   }

    private int total(int first, int last) {
        int sum = 0;
        for (int i = first; i < last; i++)  {
            sum = sum + i;
        }

        return sum;*/







      /* Dog dog = new Dog("ポチ",3 );     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

       dog.say();  // ポチが吠えます（ログ出力）
       Log.d("javatest", "犬の名前は" + dog.name + "です。");
       Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

       Dog dog2 = new Dog("ハチ", 10);   // 名前をハチ、年齢10歳で、Dogインスタンスを作る
       dog2.say();  // ハチが吠えます（ログ出力）
       Log.d("javatest", "犬の名前は" + dog2.name + "です。");
       Log.d("javatest", "犬の年齢は" + dog2.age + "歳です。");*/



      /* Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

       dog.say();
       Log.d("javatest", "犬の名前は" + dog.name + "です。");
       Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

       BigDog bigdog = new BigDog("ヨーゼフ", 15);     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

       bigdog.say();
       Log.d("javatest", "犬の名前は" + bigdog.name + "です。");
       Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です。");*/


        // Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        // dog.move();




        Human animal = new Human("塚田　康大", 7,"ゲーム");


        animal.think();
        animal.say();



    }

}