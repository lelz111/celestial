1. B
2. C
3. A
4. D
5. A
6. C
7. B
8. C
9. B
10. C
11. Benar
12. Benar
13. Salah
14. Benar
15. Salah
16. RestController adalah gabungan dari controller dan response, sehingga jika sudah menggunakan RestController tidak memerlukan extra step dalam pemrosesan data di setiap method
17. meng generate suatu value, biasanya digunakan untuk otomatis generate value ID dengan menggunakan i++
18. Dengan DTO, data dapat diformat dulu sebelum dikirimkan/diterima sehingga data tersebut lebih aman ketika dikirim/diterima karena data tersebut akan diminimalisasikan.
19. Spring akan mengkonversi kode dalam method menjadi kode query untuk mengambil/mendapatkan data dari repository
20. meng-assign nama column kedalam suatu field

21. Benar

```java
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
```

22. Benar

```java
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}
```

23. Menggunakan anotasi @OnetoMany
24. User Id: 123
25. Menggunakan exception handler, seperti di java ada try catch, spring juga dapat menggunakan exception handlernya sendiri untuk me return error message jika terjadi seuatu error.

