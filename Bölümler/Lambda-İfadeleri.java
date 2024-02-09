// Lambda ifadeleri, fonksiyonel arayüzlerin (SAM) (Single Abstract Method) kısa ve anlaşılır bir şekilde uygulanmasını sağlar.
// Burada, names listesinin her bir elemanı için bir lambda ifadesi kullanarak isimler yazdırılıyor.
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(name -> System.out.println(name));
