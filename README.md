# JDBC Examples

JDBC Examples in Java and NetBeans

Project ini menggunakan JDBC, Java, MySQL dan Netbeans
untuk menjalankan project ini, anda perlu menginstall database testing dan table friend yang ada di file testing-db.sql
cara import database testing dan table friend kedalam mysql server anda, dapat anda ikuti cara dibawah ini :
1. pastikan mysql client dikenali pada sistem anda
2. mysql prompt> mysql -u root -p < testing-db.sql
3. masukan passsword root anda

jika telah selesai project jdbc-examples dapat anda buka melalui netbeans
perhatikan Main class yang dapat dieksekusi adalah JdbcExamples.java

Project ini menggunakan maven untuk pengelola librarynya dan menggunakan library (lihat pom.xml) :
  - mysql-connector-j versi 8.0.33 (https://mvnrepository.com/artifact/com.mysql/mysql-connector-j)
  - gson versi 2.10.1 (https://mvnrepository.com/artifact/com.google.code.gson/gson)


selamat mencoba
