// Stream API, veri koleksiyonlarını işlemek ve işlem zincirleri oluşturmak için kullanılır.
// Burada, numbers listesindeki çift sayılar iki katına çıkarılıp toplamı hesaplanıyor.
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
                .filter(n -> n % 2 == 0) // Filtrele: Sadece çift sayıları al
                .mapToInt(n -> n * 2)   // Haritala: Her bir elemanı iki katına çıkar
                .sum();                 // Topla: Elde edilen sonuçları topla
