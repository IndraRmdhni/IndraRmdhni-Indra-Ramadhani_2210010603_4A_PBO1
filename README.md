# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mobil`, `MobilDetail`, dan `MobilBeraksi` adalah contoh dari class.

```bash
public class Mobil {
    ...
}

public class MobilDetail extends Mobil {
    ...
}

public class MobilBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mbl[i] = new MobilDetail(nama, plat);` adalah contoh pembuatan object.

```bash
mhs[i] = new MobilDetail(nama, plat);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `plat` adalah contoh atribut.

```bash
String nama;
String plat;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mobil` dan `MobilDetail`.

```bash
public Mobil(String nama, String plat) {
    this.nama = nama;
    this.plat = plat;
}

public MahasiswaDetail(String nama, String plat) {
    super(nama, plat);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setPlat` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setPlat(String plat) {
    this.plat = plat;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getPlat`, `getProvinsi`, `getNomorPlat`, dan `getDaerah` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getPlat() {
    return plat;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `plat` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String plat;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MobilDetail` mewarisi `Mobil` dengan sintaks `extends`.

```bash
public class MobilDetail extends Mobil {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo(String)` di `Mobil` merupakan overloading method `tampilkanInfo` dan `tampilkanInfo` di `MobilDetail` merupakan override dari method `tampilkanInfo` di `Mobil`.

```bash
public String tampilkanInfo(String harga) {
    return tampilkanInfo() + "\nHarga: " + harga;
}

@Override
public String tampilkanInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getProvinsi` dan seleksi `switch` dalam method `getDaerah`.

```bash
public String getProvinsi() {
    if(getNpm().substring(0, 2).equals("DA")){
        return "Kalimantas Selatan";
    } else {
        return "Provinsi Lain";
    }

    //return getPlat().substring(0, 2).equals("DA") ? "Kalimantas Selatan" : "Provinsi Lain";
}

public String getDaerah() {
    switch(getPlat().substring(6)) {
        case "A":
            return "Banjarmasin";
        case "P":
            return "Banjarbaru";
        default:
            return "Daerah Lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < mbl.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Nama Mobil ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Mobil:");
System.out.println(data.tampilkanInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MobilDetail[] mahasiswas = new MobilDetail[2];` adalah contoh penggunaan array.

```bash
MobilDetail[] mbl = new MobilDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Indra Ramadhani
NPM: 2210010603
