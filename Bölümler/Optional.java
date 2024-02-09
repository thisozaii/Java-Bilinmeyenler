// Optional, bir nesnenin varlığını veya yokluğunu temsil eden bir konteyner sınıfıdır.
// Burada, null olabilen bir değeri Optional ile işleyerek varsayılan bir değer belirleniyor.
Optional<String> optionalName = Optional.ofNullable(null);
String name = optionalName.orElse("Default Name");
