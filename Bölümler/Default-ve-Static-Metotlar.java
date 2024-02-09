// Arayüzlerde varsayılan ve statik metotlar tanımlamak, kod tekrarını azaltır ve daha okunabilir arayüzler sağlar.
interface MyInterface {
    // Varsayılan metot: Arayüzün bir parçasıdır ve uygulanmasa bile alt sınıflar tarafından kullanılabilir.
    default void defaultMethod() {
        System.out.println("Default method");
    }
    
    // Statik metot: Arayüzün bir parçasıdır ve uygulanması gerekir.
    static void staticMethod() {
        System.out.println("Static method");
    }
}
