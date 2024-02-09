// Switch ifadeleri artık bir ifade olarak kullanılabilir, bu da daha temiz ve okunabilir kod sağlar.
// Burada, bir switch ifadesi kullanılarak mevsime göre bir mesaj yazdırılıyor.
int month = 5;
String season = switch (month) {
    case 12, 1, 2 -> "Winter";
    case 3, 4, 5 -> "Spring";
    case 6, 7, 8 -> "Summer";
    case 9, 10, 11 -> "Autumn";
    default -> "Unknown";
};
System.out.println("The current season is: " + season);
