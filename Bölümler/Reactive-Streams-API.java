// Reactive Streams API, arka plan işlemleri ile etkileşimli programlama ve asenkron işlemler için kullanılır.
// Burada, bir yayın akışı oluşturulur ve bir abone bu akışı tüketir.
Flow.Publisher<Integer> publisher = ...; // Yayın akışı
Flow.Subscriber<Integer> subscriber = ...; // Abone
publisher.subscribe(subscriber); // Abone, yayını dinlemeye başlar
