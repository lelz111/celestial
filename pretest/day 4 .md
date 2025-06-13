## 📄 **PRE-TEST** – _Java Spring Boot & Spring Security_

### ✳️ Bagian 1: Pilihan Ganda (Dasar)

1. Apa anotasi yang digunakan untuk mendefinisikan sebuah REST controller?

   - A. `@Service`
   - B. `@Component`
   - C. `@RestController`
   - D. `@Repository`
   Jawaban: C

2. Di Spring, anotasi apa yang digunakan untuk menyuntikkan dependency ke dalam class?

   - A. `@Autowired`
   - B. `@Injectable`
   - C. `@Import`
   - D. `@Mapper`
    Jawaban: A


3. Di lapisan arsitektur Spring, Service berfungsi untuk:

   - A. Menangani permintaan HTTP
   - B. Menyimpan data ke database langsung
   - C. Menyimpan log aplikasi
   - D. Menyimpan logika bisnis
   Jawaban: D


4. Class model di Java Spring biasanya digunakan untuk:

   - A. Menyimpan konfigurasi Spring
   - B. Menyimpan logika controller
   - C. Menyimpan struktur data (seperti data user, produk, dll.)
   - D. Mengatur pemetaan URL
   Jawaban: C

5. Jika kita ingin membuat method yang bisa diakses oleh endpoint `/hello`, anotasi apa yang digunakan?

   - A. `@RestEndpoint("/hello")`
   - B. `@Path("/hello")`
   - C. `@GetMapping("/hello")`
   - D. `@Route("/hello")`
   Jawaban: C

---

### ✳️ Bagian 2: Benar / Salah

6. `@Service` digunakan untuk menandai class sebagai lapisan Controller.
Jawaban: Salah

7. Kita bisa membuat class model tanpa anotasi apapun jika hanya digunakan sebagai POJO.
Jawaban: Benar

8. `@Autowired` bisa digunakan di constructor maupun field.
Jawaban: Benar

9. Spring Boot membutuhkan file `application.yml` agar bisa berjalan.
Jawaban: Salah

10. `@GetMapping` hanya bisa digunakan di class dengan anotasi `@Service`.
Jawaban: Salah
---

### ✳️ Bagian 3: Isian Singkat

11. Anotasi apa yang digunakan agar method bisa menangani permintaan POST? 
Jawaban: @PostMapping

12. Apa nama file konfigurasi default di Spring Boot?
Jawaban: application.properties

13. Apa yang dimaksud dengan Dependency Injection?
Jawaban: menginjeksi suatu dependency dari luar class kedalam class

14. Bagaimana cara mendeklarasikan class `UserService` agar dikenali Spring sebagai Service?
Jawaban: Menambahkan @Service pada class UserService

15. Apa perbedaan `@RestController` dan `@Controller`?
Jawaban: Controller biasanya digunakan untuk mengembalikan view, biasanya untuk view UI
         RestController gabungan dari controller dan response body dimana return yang dikembalikan berupa data json

---

### ✳️ Bagian 4: Perbaiki Kode / Output

16. Perbaiki kode berikut agar dapat dijalankan sebagai Controller:

```java
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
```
Jawaban:

```java
@RestController -> menambahkan restcontroller
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
```

17. Perbaiki kesalahan pada model berikut:

```java
public class Product {
    private String name;
    private int price;
}
```
Jawaban:

```java
@Data ->menambahkan @Data
public class Product {
    private String name;
    private int price;
}
```

18. Apa output dari method berikut?

```java
@GetMapping("/sum")
public int sum() {
    return 2 + 3;
}
```
Jawaban: 5

19. Kode service berikut error. Apa yang salah?

```java
@Service
public class UserService {
    private UserRepository userRepository;
}
```
Jawaban:

20. Apa masalah pada potongan kode berikut?

```java
@RestController
public class BookController {

    @GetMapping
    public String listBooks() {
        return "books";
    }
}
```
Jawaban: GetMapping harus memiliki path untuk me return books -> @GetMapping("/books")

---

### 🔐 Bagian 5: Spring Security

#### Pilihan Ganda

21. Apa anotasi yang digunakan untuk mengaktifkan Spring Security di aplikasi Spring Boot?

- A. `@EnableSecurity`
- B. `@SpringSecurity`
- C. `@EnableWebSecurity`
- D. `@ActivateSecurity`
Jawaban: C

22. Komponen mana yang bertugas mengatur izin akses berdasarkan role atau otorisasi di Spring Security?

- A. `SecurityConfig`
- B. `UserDetailsService`
- C. `AuthenticationManager`
- D. `HttpSecurity`
Jawaban: D

23. Untuk membuat otentikasi berbasis user login yang dikustomisasi, interface apa yang harus diimplementasi?

- A. `UserRepository`
- B. `UserSecurity`
- C. `UserDetailsService`
- D. `SecurityService`
Jawaban: C

#### Benar / Salah

24. Spring Security hanya bisa digunakan untuk REST API yang menggunakan JWT.
Jawaban: Salah

25. `@PreAuthorize("hasRole('ADMIN')")` digunakan untuk membatasi method agar hanya bisa diakses oleh pengguna dengan role ADMIN.
Jawaban: Benar

26. `BCryptPasswordEncoder` digunakan untuk mengenkripsi password agar tidak disimpan dalam bentuk plain text.
Jawaban: Benar

#### Isian Singkat

27. Apa class konfigurasi yang umum dibuat untuk menyesuaikan aturan login, logout, dan authorization di Spring Security?
Jawaban: SecurityConfig

28. Apa anotasi yang digunakan agar method hanya bisa diakses jika pengguna memiliki hak tertentu?
Jawaban: @PreAuthorize

#### Perbaiki Kode / Analisis

29. Perbaiki potongan konfigurasi ini:

```java
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .antMatchers("/admin").hasRole("ADMIN")
        .anyRequest().authenticated()
        .and()
        .formLogin();
    return http.build();
}
```
Jawaban:

```java
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests() -> tambahkan Http
        .antMatchers("/admin").hasRole("ADMIN")
        .anyRequest().authenticated()
        .and()
        .formLogin();
    return http.build();
}
```

30. Apa yang salah dengan konfigurasi login berikut?

```java
http
  .authorizeHttpRequests()
  .anyRequest().permitAll()
  .and()
  .formLogin();
```
Jawaban: jika menggunakan .permitAll() sebelum form login, makan yang terjadi adalah user akan langsung di permit tanpa
         melalui form login terlebih dahulu

---
