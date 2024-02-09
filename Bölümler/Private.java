// Arayüzlerde özel metotlar tanımlamak, arayüzün iç detaylarını gizleyerek güvenliği artırır.
interface MyInterface {
    // Arayüz içinde özel bir metot tanımlayarak, sadece arayüz içinde kullanılmasını sağlar.
    private void privateMethod() {
        System.out.println("Private method");
    }
    
    // Varsayılan metot: Arayüzün bir parçasıdır ve uygulanmasa bile alt sınıflar tarafından kullanılabilir.
    default void defaultMethod() {
        System.out.println("Default method");
    }
}
