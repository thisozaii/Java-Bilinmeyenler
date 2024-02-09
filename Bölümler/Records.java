// Records, veri saklamak için kullanılan basit ve değişmez veri yapılarını tanımlamak için kullanılır.
// Burada, bir Record sınıfı tanımlanarak öğrenci bilgilerini temsil eden bir veri yapısı oluşturuluyor.
record Student(String name, int age, String department) {}
Student student = new Student("Alice", 20, "Computer Science");
System.out.println("Student Info: " + student);
