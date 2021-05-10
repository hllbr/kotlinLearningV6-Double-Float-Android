package com.hllbr.kotlinlearninv3_double_float

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Kotlinde Kesirli Sayıtlar

        /*
        Double/Float tanımlamaları arasındaki farklar nelerdir ? Neden 2 farklı kesirli ifadenin tanımlamasına ihtiyaç duyarız ?

        İki ifadede hafızada farklı boyutlarda yer tutuyor

        Double > Float diyebiliriz kapladıkları alan açısından double ifadeler float ifadelerden daha büyük bir boyuta sahip diyeilbiriz.

        Uygulamalarda hafıza konusunda titiz olmam gereken durumlarda bu bilgiye başvurarak işlemlerimi yapama gerekebilir.Çok karşılaşılan bir durum olmasada sınırlı hafızalarla çalışırken  büyük önem taşır.Bu bilgimiz

        Float 32 bit Double 64 bitlik bir alana sahip

        float ile virgülden sonra 6-7 değer alabilirken Double 15-16 adet değer alabliyor.

       normal olarak oluşturdğumuz keslirli ifadeler double olarak algılanır eğer özellikle float olarak tanımlamak istiyorsak ifadenin sonuna "f" harfi atmamız yeterli olacaktır.


        
         */

        val pi =3.14

        println(pi*2)//Bazı programlama dillerinde Double bir değer ile integer bir ifadeyi çarpmamıza izin vermeye biliyor bu durumlarda benim örneğimi baz alırsak 2 değilde 2.0 olarak yaazarsak böyle bir sorunla karşılaşmayız

        val myFloat = 3.14f

        println(myFloat*2)

        var myAge : Double
        myAge = 23.0

        println(myAge/2)//Bölüm
        println(myAge % 2)//kalan


        /*TAM SAYILARLA İLGİLİ 4 ADET DEĞİŞKEN TİPİMİZ MEVCUT Byte-->Short-->Integer-->Long şeklinde ifade edebiliriz küçükten büyüğe doğru

        Long 64 bit ve biz bu kadar büyük bir ifadeyi kullanarak işlemler yapmıyoruz Bütün ifadelerimi long olarak tanımlamam anlamsız oluyor ve hafıza içinde büyük bir alan almış/kullanmış oluyorum

        Genelde bu sebeplerden dolayı oluşturduğum tam sayıları ınteger olarak oluşturmam gerekiyor.

        Eğer gerçekten çok büyük rakamlarlas çalışmama gerekirse o zaman Long ile çalışmayı tercih etmem gerekiyor.

        Short ve Byte genellikle kullanılmazlar

        Byte ifademin alabileceği maximum değer 127 minimum değer ise -128 ,

        bunlara kıyasla Integer ve Long daha çok karşılaştığımz veri tipleridir.





         */



        var myLong : Long = 100 //Farklı depolama kapasitesine sahip değişkenlerin olduğunu bilmek yaptığım projeler için büyük bir önem arz ediyor .
        //Üst satırda gerçekleştirilen işlem INITALİZE & DEFINING için iyi bir örnek teşkil etmekte

        //Değişkenler tanımlanırken iki kelime veya daha fazla kelimeden meydana gelen bir ifade kullanılıyorsa 2. kelimenin ilk harfi ve diğer kelimelerin ilk harfleri genellikle büyük yazılır bu Clear Code açısından önemlidir.

        //Bu işleme camelCase adı verilir örnek olarak hllbrConnected

        //Bu tanımlama dışında Snake_case olarak bilinen _ kullanılarak kelimelerin ayrıldığı bir yazım türü bulunmakta örnek vermek gerekirse hllbr_connected

        //Kotlin de genellikle CamelCase olarak bilinen yazım tekniği daha çok tercih edilir.
        



    }
}