// Metin blokları, çok satırlı metinlerin daha okunabilir bir şekilde yazılmasını sağlar.
// Burada, bir metin bloğu kullanılarak çok satırlı bir SQL sorgusu oluşturuluyor.
String query = """
               SELECT *
               FROM users
               WHERE age > 18
               ORDER BY last_name ASC
               """;
System.out.println("SQL Query: " + query);
