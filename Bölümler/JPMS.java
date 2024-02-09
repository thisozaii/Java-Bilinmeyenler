// JPMS, Java Platform Modüler Sistemi'ni ifade eder ve Java 9 ile birlikte gelen önemli bir özelliktir.
// Burada, bir modülün temel gereksinimleri ve dışa aktarılacak paketler belirtilmektedir.
module com.example.mymodule {
    requires java.base; // Temel Java modülü
    requires java.sql;  // SQL modülü
    exports com.example.mypackage; // Dışa aktarılacak paket
}
