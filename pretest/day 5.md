## 📄 Pretest Spring Boot Security & Unit Testing\*\*

### ✅ **A. Pilihan Ganda (12 Soal)**

1. Apa tujuan utama dari Spring Security? 
 Jawaban: agar data menjadi lebih secure

2. Apa anotasi untuk mengaktifkan Web Security di Spring Boot?
 Jawaban: @EnableWebSecurity

3. Apa fungsi `HttpSecurity` dalam konfigurasi Spring Security?
 Jawaban: Sebagai pengatur keamanan data seputar http dan auth

4. Apa itu prinsip _Authentication Principal_ dalam Spring Security?
 Jawaban: Representasi dari user yang sedang login

5. Apa peran dari anotasi `@PreAuthorize("hasRole('ADMIN')")`?
 Jawaban: Untuk Memberikan batasan akses data kepada role admin saja

6. Apa fungsi dari class `UserDetails` di Spring Security?
 Jawaban: Class yang menyimpan detail dari user

7. Apa itu BCrypt?
 Jawaban: Salah satu metode hashing dinamis, dimana setiap kali data di hasing hasil yang dikeluarkan akan selalu berbeda/unik

8. Library utama yang digunakan untuk testing unit di Spring Boot adalah:
 Jawaban: JUnit

9. Apa kegunaan dari `@MockBean` dalam Spring Boot Test?
 Jawaban: Membuat Bean double yang dapat digunakan untuk melakukan testing

10. Apa yang dilakukan oleh anotasi `@WithMockUser`?
 Jawaban: Untuk menyimulasikan test dengan mock user/ role user

11. Apa perbedaan mendasar antara `@WebMvcTest` dan `@SpringBootTest`?
 Jawaban: @WebMvCTest tidak bisa digunakan untuk menguji layer service dan repo, sedangkan @SpringbootTest bisa

12. Apa tujuan dari anotasi `@BeforeEach` dalam unit test?
 Jawaban: Untuk menjalankan suatu fungsi sebelum setiap test

---

### ✅ **B. Benar/Salah (5 Soal)**

13. `BCryptPasswordEncoder` menghasilkan hash yang sama untuk password yang sama.
 Jawaban: Salah

14. Spring Security dapat digunakan untuk endpoint berbasis REST API maupun form login.
 Jawaban: Benar

15. `@WebMvcTest` bisa digunakan untuk menguji layer service dan repository.
 Jawaban: Salah

16. `Principal` adalah representasi dari user yang sedang login.
 Jawaban: Benar

17. `@MockBean` dan `@Mock` memiliki efek yang sama dalam Spring Boot Test.
 Jawaban: Salah

---

### ✅ **C. Isian Singkat (5 Soal)**

18. Apa peran dari `AuthenticationManager` dalam Spring Security?
 Jawaban: Untuk Memanage proses authentikasi yang ada didalam spring security

19. Jelaskan apa yang dilakukan oleh `PasswordEncoder` dan kenapa penting?
 Jawaban: Mengencrypt/hashing password sebelum password tsb dimasukan/simpan ke dalam database, dan penting karena
 data password menjadi lebih secure

20. Apa yang dimaksud dengan "authorization" dalam konteks aplikasi?
 Jawaban: Proses dimana akses yang dimiliki user dikelola, apakah suatu user berhak mengakses suatu data atau tidak

21. Apa itu _test double_, dan apa perbedaannya dengan _mock_ di unit test?
 Jawaban: Test double itu menggunakan objek double/pengganti dalam melakukan testnya, sedangkan mock 

22. Dalam pengujian REST API Spring Boot, apa fungsi utama `MockMvc`?
 Jawaban: Untuk melakukan pengujian interaksi antara controller dengan komponen lainnya dalam suatu project tanpa
 menjalankan server asli dalam pengujiannya

---

### ✅ **D. Koreksi Kode (8 Soal)**

Perhatikan kode berikut dan jelaskan apa yang salah.

23.

```java
@Autowired
private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
```
Jawaban: 
```java
@Bean -> ganti @Autowired dengan @Bean 
private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
```

24.

```java
@WithMockUser(username = "user", roles = "USER")
@Test
void testAccessAdminEndpoint() {
    mockMvc.perform(get("/admin")).andExpect(status().isOk());
}
```
Jawaban: untuk path /admin seharusnya, roles yang dimiliki juga admin

```java
@WithMockUser(username = "user", roles = "ADMIN")
@Test
void testAccessAdminEndpoint() {
    mockMvc.perform(get("/admin")).andExpect(status().isOk());
}
```

25.

```java
@Mock
UserService userService = new UserServiceImpl();
```
Jawaban: initialisasi untuk mock kurang tepat seharusnya:

```java
@Mock
private UserService userService; 
```

26.

```java
@SpringBootTest
@WebMvcTest
public class MyTest {
}
```
Jawaban: tidak bisa menggunakan 2 anotasi tsb sekaligus, pilih salah 1, jiak di controller pakai webMvc, jika dilainnya pakai Springboot

```java
@SpringBootTest
public class MyTest {
}
```

27.

```java
@Test
void testPasswordHash() {
    PasswordEncoder encoder = new BCryptPasswordEncoder();
    assertEquals("mypassword", encoder.encode("mypassword"));
}
```
Jawaban: assertEquals tidak akan bisa digunakan dalam metode BCrypt, karena bcrypt akan selalu menghasilkan hash yang berbeda

```java
@Test
void testPasswordHash() {
    PasswordEncoder encoder = new BCryptPasswordEncoder();
    String hash = encoder.encode("mypassword");
    assertTrue(encoder.matches("mypassword", hash));
}
```


28.

```java
@Test
void testUnauthorizedAccess() {
    mockMvc.perform(get("/secure-data"))
           .andExpect(status().isOk());
}
```
Jawaban: Status isOk hanya mewakili jika user yang mengkases suatu data sudah benar, seharusnya menggunakan pesan error juga

```java
@Test
void testUnauthorizedAccess() {
    mockMvc.perform(get("/secure-data"))
           .andExpect(status().isUnauthorized());
}
```

29.

```java
@BeforeAll
void setup() {
    MockitoAnnotations.openMocks(this);
}
```
Jawaban: Seharusnya pakai @BeforeEach

```java
@BeforeEach
void setup() {
    MockitoAnnotations.openMocks(this);
}
```

30.

```java
@Test
void testLogin() {
    when(authService.login("user", "pass")).thenReturn(null);
    assertNotNull(authService.login("user", "pass"));
}
```
Jawaban: Return null dan NotNull kontradiktif

```java
@Test
void testLogin() {
    when(authService.login("user", "pass")).thenReturn(null);
    assertNull(authService.login("user", "pass"));
}
