//////////////////////////////////////////////////////////////////////////////////////////////

                                    CEVAPLAR EN ALTTADIR

//////////////////////////////////////////////////////////////////////////////////////////////

# ActivityFragmentLifeCycle

# Amaç

1. Git - GitHub becelerinin arttırılmasını sağlamak.
2. Fragment kullanımı öğrenmek.
3. Activity üzerine Fragment'ı ekleme yollarını araştırmak.
4. Activity Fragment Yaşam Döngüsünde (LifeCycle) eklenme sırasında neler değiştiğini kavramak.
5. Activity Fragment kullanım mantığının yerleşmesini sağlamak.

# İsterler

1. Projeyi "Fork" ediniz.
2. Master branch'inden yeni bir branch oluşturunuz.
3. Branch ismine kendi adınızı ve soyadınızı verin. Örn. ("GökhanÖztürk)
4. Bir Activity ve XML oluşturun. Activity ve XML oluştururken isimlendirme standartlarına dikkat ediniz.
5. Activity'nizin içerisine aşağıdaki methodları yazınız - sıralaması önemli değil:
  * onCreate()
  * onStart()
  * onRestoreInstanceState()
  * onResume()
  * onPause()
  * onSaveInstanceState()
  * onStop()
  * onDestroy()
  * onRestart()
  * onAttachFragment()
6. Yukarıdaki methodların içerisine Log.e methodunu kullanarak; ilk string'e kendinizin belirlediği bir String TAG,
ikinci String'e ise method isimlerini yazınız.
7. Üç adet Fragment ve bu Fragment'lara ait XML dosyalarını oluşturun. İsimlendirme standartlarına dikkat ediniz.
8. Fragment'ları aşağıdaki ekran görüntüsünde olduğu gibi yerleştiriniz.

![alt text](https://github.com/AndroidEduIO/ActivityFragmentLifeCycle/blob/master/app/src/main/res/drawable/Fragment.PNG)

9. Bu Fragment düzenini sağlarken A ve B Fragment'ını XML üzerinden C Fragment'ını ise Activity içerisinde, ID kullanarak, 
çalışma zamanında (run time) programmatically olarak ekleyiniz.
10. Eklediğiniz Fragment'ların içerisine aşağıdaki methodları yazınız - sıralaması önemli değil:
  * onCreate()
  * onCreateView()
  * onActivityCreated()
  * onStart()
  * onResume()
  * onPause()
  * onStop()
  * onDestroy()

 11. Yukarıdaki methodların içerisine Log.e methodunu kullanarak; ilk string'e kendinizin belirlediği bir String TAG,
ikinci String'e ise method isimlerini yazınız.
12. Log'ları yorumlayarak bir Fragment'ı XML içerisinde eklemek ile Activity içerisinde, ID kullanarak, çalışma zamanında (run time)
programmatically olarak eklemek arasında nasıl bir fark olduğunu araştırıp, projeniz içerisindeki README.md dosyasının içerisini 
silerek README.md içerisine bu bilgileri yazınız.
13. Hangi durumda Fragment, hangi durumda Activity kullanılması gerektiğini yine bu README.md dosyasına yazınız.
14. Hangi durumda Fragment'ı programmatically, hangi durumda XML içerisinde ekleyeceğimizi yorumlayıp yine README.md içerisine yazınız.
15. Programmatically yüklemek ile XML içerisinde eklemek arasında bir performans farkı olup olmadığını araştırıp README.md içerisine yazınız.
16. Yazdığınzı kodları Push'layınız. Ve bu adres üzerindeki ana projeye Pull Request (PR) atınız.

# En başarılı PR proje'ye "orjinal cevap" olarak kabul edilecektir.

//////////////////////////////////////////////////////////////////////////////////////////////

                                CEVAPLAR

12. Programmatically olarak eklenen Fragmentin methotları, XML içerisinde eklenen Fragmentlerin methotlarına göre 'genellikle' daha önce çalışmaktadır.
Bu da Programmatically eklenen Fragmentin daha önce oluşturulduğunun, daha önce durdurulduğunun vs. göstergesidir.

13. Sayfa yapısının çok fazla değişmediği, yalnızca içeriğin ve basit noktaların değiştiği durumlarda Fragment kullanmak daha doğrudur.
Ancak genel anlamda tasarımın ve yapının değişeceği durumlarda yeni bir Activity oluşturmak daha doğru bir yaklaşım olabilir.
Activity'nin iş yükü, Fragmente göre daha fazladır.

14. Bir Activity içerisinde kaç adet Fragment bulunacağı bilinmiyorsa, en doğru yaklaşım programmatically eklemektir.
Sayfa düzeni belliyse ve dolayısıyla oluşacak Fragment sayısı ve yapısı belliyse XML'den eklemek daha kolay bir yaklaşım olur.

15. Programmatically eklenen fragmentler çağırıldıkları zaman çalışırlar.
XML tarafında oluşturulan Fragmentler ise Activity çalıştığı zaman çalıştırılır.
Dolayısıyla XML tarafındaki Fragmentler kullanılmayacak olsalar bile Activity ile paralel olarak çalışacaklarından zaman kaybına sebep olurlar
Programmatically eklenenler ise ihtiyaç anında oluşturulacağından, Activity ayağa kalkarken zaman kaybına sebep olmazlar
Bunun dışında oluşturulma süresi olarak ikisinin arasında büyük bir fark yoktur.