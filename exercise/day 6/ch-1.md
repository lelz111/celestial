## 📘 **PRETEST **

---

### 🔹 A. **Pilihan Ganda (20 Soal)**

#### ✅ Spring Boot Security

1. Anotasi yang digunakan untuk mengaktifkan Spring Security:
   A. `@EnableSecurity`
   B. `@EnableWebSecurity`
   C. `@EnableSpringBootSecurity`
   D. `@EnableSecureApp`
   Jawaban: B

2. Apa itu `AuthenticationManager` dalam Spring Security?
   A. Komponen untuk mengatur authorization
   B. Class yang memproses autentikasi user
   C. Konfigurasi password encoder
   D. Token parser
      Jawaban: B

3. Apa peran dari `@PreAuthorize("hasRole('ADMIN')")`?
   A. Mengatur login
   B. Menghindari token expiry
   C. Membatasi akses method hanya untuk ADMIN
   D. Menyimpan role ke database
      Jawaban: C

4. Class `UserDetails` diimplementasikan untuk...?
   A. Konfigurasi JPA
   B. Logging REST request
   C. Representasi user dalam security context
   D. Mapping endpoint
   Jawaban: C

5. Library umum untuk hashing password di Spring Security:
   A. AES
   B. MD5
   C. BCrypt
   D. HMAC256
    Jawaban: C


---

#### 🌐 Basic REST API (Spring Web)

6. Anotasi `@RestController` adalah gabungan dari...?
   A. `@Controller` + `@RequestParam`
   B. `@Controller` + `@PathVariable`
   C. `@Controller` + `@ResponseBody`
   D. `@RequestMapping` + `@Service`
      Jawaban: C

7. HTTP method `PUT` biasanya digunakan untuk...?
   A. Menghapus data
   B. Mengupdate atau mengganti resource
   C. Mengambil file
   D. Menyambungkan endpoint
      Jawaban: B

8. Jika Anda ingin mengambil parameter dari `/product/{id}`, Anda akan menggunakan...?
   A. `@RequestParam`
   B. `@RequestHeader`
   C. `@PathVariable`
   D. `@PathParam`
      Jawaban: C

9. Untuk membaca JSON body dan mengonversinya ke object Java, kita gunakan...?
   A. `@RequestMapping`
   B. `@RequestBody`
   C. `@PathVariable`
   D. `@GetMapping`
      Jawaban: B

10. Kode status HTTP yang sesuai untuk `Resource Not Found`:
    A. 200
    B. 201
    C. 404
    D. 500
       Jawaban: C

---

#### 🧩 Spring Data JPA

11. Anotasi `@Entity` di JPA digunakan untuk...?
    A. Mengatur mapping DTO
    B. Menandai class sebagai table di database
    C. Mendaftarkan bean service
    D. Mengatur konfigurasi Spring Boot
    Jawaban: B

12. Apa tujuan dari `@Id` dalam entity class?
    A. Menandai kolom biasa
    B. Menyimpan objek transient
    C. Menandai primary key
    D. Mengatur sorting
    Jawaban: C

13. Anotasi `@GeneratedValue(strategy = GenerationType.IDENTITY)` digunakan untuk...?
    A. Menyimpan record tanpa ID
    B. Membuat kolom unik
    C. Membiarkan database membuat ID otomatis
    D. Mengatur batch update
    Jawaban: C

14. Apa peran `JpaRepository` dalam Spring Data?
    A. Konfigurasi controller
    B. Layer service REST
    C. Abstraksi akses data CRUD
    D. Mapping response JSON
    Jawaban: C

15. Relasi One-to-Many di JPA ditandai dengan...?
    A. `@ManyToMany`
    B. `@OneToOne`
    C. `@OneToMany`
    D. `@Column(unique = true)`
    Jawaban: C

---

#### 🧪 Unit Testing

16. Apa anotasi JUnit 5 untuk membuat method menjadi test unit?
    A. `@Run`
    B. `@TestCase`
    C. `@Test`
    D. `@Execute`
    Jawaban: C

17. Mockito digunakan untuk...?
    A. Menyimpan object ke file
    B. Menguji performance
    C. Membuat object palsu (mock)
    D. Mengatur cache object
    Jawaban: C

18. `@MockBean` biasanya digunakan di...?
    A. Spring Boot Application utama
    B. Test berbasis Spring context
    C. File konfigurasi YAML
    D. Static class
    Jawaban: B

19. `MockMvc` berguna untuk...?
    A. Testing service layer
    B. Membuat dummy API
    C. Menguji controller REST tanpa menjalankan server
    D. Logging request
    Jawaban: C

20. Apa tujuan dari anotasi `@BeforeEach`?
    A. Menjalankan test terakhir
    B. Setup sebelum setiap test method
    C. Cleanup setelah test
    D. Menentukan environment
    Jawaban: B

---

### 🔸 B. **Benar / Salah (10 Soal)**

21. Spring Security secara default memblokir semua endpoint.
Jawaban: Benar

22. `@PathVariable` digunakan untuk membaca data dari query parameter.
Jawaban: Salah

23. `JpaRepository` menyediakan method seperti `findAll()` dan `save()`.
Jawaban: Benar

24. `@GeneratedValue` dapat digunakan bersama `@Id`.
Jawaban: Benar

25. Spring Boot membutuhkan konfigurasi manual untuk mapping JSON ke class.
Jawaban: Salah

26. `@RestController` hanya bisa digunakan untuk GET request.
Jawaban: Salah 

27. `BCryptPasswordEncoder` menghasilkan hash yang konsisten tanpa salt.
Jawaban: Salah

28. Penamaan variable sebaiknya camelCase.
Jawaban:Benar

29. Nama class di Java sebaiknya menggunakan PascalCase.
Jawaban: Benar

30. `assertEquals(expected, actual)` digunakan untuk membandingkan dua nilai dalam unit test.
Jawaban: Benar


---

### 🧾 C. **Isian Singkat (5 Soal)**

31. Apa perbedaan antara `@RestController` dan `@Controller`?
Jawaban: @RestController dapat mengembalikan langsung data berupa json, @Controller harus menambahkan @ResponseBody terlebih dahulu agar bisa mengembalikan data berupa json

32. Jelaskan fungsi `@ManyToOne` dan contoh penggunaannya dalam relasi data.
Jawaban: Fungsi ManytoOne menandakan relasi antara 2 entity/class dimana suatu id dalam salah satu class memiliki relasi 
        dengan banyak id pada class yang satu lagi. cth: entity Student memiliki relasi ManytoOne terhadap entity Sekolah

33. Apa itu `principal` dalam konteks Spring Security?
Jawaban: Representasi dari user yang sedang melakukan login

34. Sebutkan dua konvensi penamaan dalam Java (untuk class dan variable).
Jawaban: camelCase -> penamaan variable, PascalCase -> penamaan class

35. Mengapa penting menggunakan mocking saat membuat unit test?
Jawaban: Agar method/function/class yang di test dapat terisolasi, dimana test tsb tidak akan mempengaruhi server asli dan komponen lainnya

---

### 🔧 D. **Koreksi Kode (5 Soal)**

36.

```java
@Entity
public class Product {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
}
```
Jawaban: 
```java
@Entity
public class Product {
//   --> Menambahkan @Id sebelum @Generate
  @Id  
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
}
```

37.

```java
@GetMapping("/user/{id}")
public User getUser(@RequestParam Long id) {
    ...
}
```
Jawaban:
```java
@GetMapping("/user/{id}")
// utk mengambil id spesifik harusnya menggunakan @PathVariable
public User getUser(@PathVariable Long id) {
    ...
}
```

38.

```java
@PostMapping("/register")
public String registerUser(User user) {
    ...
}
```
Jawaban:
```java
@PostMapping("/register")
// --> harusnya menambahkan @RequestBody sebelum parameter user 
public String registerUser(@RequestBody User user) {
    ...
}
```


39.

```java
@Mock
UserService userService = new UserServiceImpl();
```
Jawaban:
```java
@Mock
// --> untuk initialisasi mock bisanya harus menggunakan Private terlebih dahulu
Private UserService userService = new UserServiceImpl();
```

40.

```java
public class userService {
    public void saveUser(User user) { ... }
}
```
Jawaban:
```java
// --> Seharusnya Nama Class menggunakan PascalCase
public class UserService {
    public void saveUser(User user) { ... }
}
```


---
