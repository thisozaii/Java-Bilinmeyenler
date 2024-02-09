// instanceof kontrolü artık daha basit ve temiz bir şekilde yapılabilir.
// Burada, bir instanceof kontrolü ile birlikte pattern matching kullanılarak nesne türüne göre işlem yapılıyor.
Object obj = "Hello";
if (obj instanceof String str) {
    System.out.println("Length of the string: " + str.length());
} else {
    System.out.println("Not a string object");
}
