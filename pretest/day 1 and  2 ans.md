1. B
2. D
3. C
4. A
5. C
6. T
7. T
8. T
9. T
10. T
11. Backend adalah sebuah tempat/proses dimana data yang diklik/direquest oleh user melalui UI akan di proses seperti, saat user mengklik sebuah button, backend yang akan memproses alurnya mulai dari yang di get data apa dari mana, yang di post dan put data dari mana dan kemana, dan interaksi antara front end dan backend adalah interaksi 2 arah.
12. Class itu sebagai rumah dari sebuah object (tempat dimana object berada), Object adalah orang/entity yang berada di dalam sebuah class tersebut.
13. Inheritance adalah salah satu OOP dimana sebuah class bisa diwarisi methodnya oleh class lain, menggunakan command (.extends). Polymorphism itu konsep OOP yang dapat mengubah/manipulasi method dari suatu class menggunakan fungsi @Override
14. RestController digunakan untuk langsung menggabungkan antara Rest API dengan Controller, sehingga controller dapat berjalan lebih smooth.
15. keuntungan springboot: kode tidak terlalu complex
16. Semisal kita ingin menggunakan sebuah database, yang biasanya harus menuliskan DataBase DB = new db();, dengan injection hanya perlu menuliskan @Autowired Database new db;
17. Dengan memisahkan 2 hal tsb, aplikasi dalam bisnis akan menjadi lebih flexible dalam melakukan perubahan/testing yang dimana jika salah satu nya diubah, hal tsb tidak akan mempengaruhi fungsi lainnya.
18. class controller tersebut tidak akan terdeteksi oleh sistem
19. requestparam: metode untuk mengambil suatu input, biasa digunakan ketika ingin mengambil input dari sebuah variable
20. Dengan menggunakan method (/path): GET(/path), dsb

21. 
```java
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello(); // error
    }
}
Kesalahan: helloService belum di deklarasikan class/methodnya sehingga sistem tidak dapat melakukan return pada helloService

Perbaikan:
```java
@RestController
public class HelloController {
    public HelloService helloService;
    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello(); // error
    }
}

22.
```java
public class Person {
    public String name;

    public void Person(String name) {
        this.name = name;
    }
}
```

Kesalahan: Harusnya public Void Person menggunakan public Person saja
Perbaikan:
```java
public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}

23.
```java
@RestController
public class GreetController {
    @PostMapping("/greet")
    public String greet(@RequestBody name) {
        return "Hello, " + name;
    }
}
```
Kesalahan: name tidak memiliki tipe data
Perbaikan:
```java
@RestController
public class GreetController {
    @PostMapping("/greet")
    public String greet(@RequestBody String name) {
        return "Hello, " + name;
    }
}
```

24.

```java
@Service
public class InfoService {
    public String getInfo() {
        return "Info OK";
    }
}

// controller
@RestController
public class InfoController {
    @GetMapping("/info")
    public String get() {
        InfoService info = new InfoService(); // langsung di-new
        return info.getInfo();
    }
}
```
Kesalahan: 
Perbaikan:

25.
```java
@RestController
public class MathController {
    @GetMapping("/add")
    public int addNumbers(int a, int b) {
        return a + b;
    }
}
```
Kesalahan: int tidak menggunakan request
Perbaikan: 
```java
@RestController
public class MathController {
    @GetMapping("/add")
    public int addNumbers(@RequestBody int a, @RequestBody int b) {
        return a + b;
    }
}