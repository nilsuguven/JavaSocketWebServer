# Java Socket Web Server

Java Socket Programlama kullanılarak geliştirilmiş, herhangi bir üçüncü taraf kütüphane veya framework kullanmayan basit bir web sunucusu projesidir.

## Proje Hakkında

Bu proje, Java programlama dilinin yerleşik ağ programlama özellikleri kullanılarak bir web sunucusunun temel çalışma mantığını göstermeyi amaçlamaktadır.

Sunucu, **1989 portu** üzerinden gelen istemci bağlantılarını dinler, HTTP isteklerini işler ve istemciye HTML ve CSS ile tasarlanmış bir web sayfası gönderir.

## Proje Özellikleri

- Java Socket Programlama kullanılmıştır.
- Java'nın yerleşik ağ ve giriş/çıkış sınıflarından yararlanılmıştır.
- Sunucu 1989 portu üzerinden çalışmaktadır.
- HTTP GET istekleri işlenmektedir.
- HTML ve CSS ile tasarlanmış bir web sayfası sunulmaktadır.
- İstemcinin IP adresi sunucu konsolunda görüntülenmektedir.
- Sınıflar farklı sorumluluklara göre ayrılmıştır.

## Kullanılan Teknolojiler

- Java 21
- ServerSocket
- Socket
- InputStream ve OutputStream
- HTTP
- HTML5
- CSS3

## Proje Yapısı

```text
JavaSocketWebServer/
│
├── src/
│   ├── Main.java
│   ├── WebServer.java
│   ├── ClientHandler.java
│   ├── PageProvider.java
│   ├── HtmlPageBuilder.java
│   └── HttpResponseWriter.java
│
└── .gitignore
```

## Sınıfların Görevleri

| Sınıf | Görevi |
|---|---|
| Main | Uygulamayı başlatır. |
| WebServer | Sunucu soketini oluşturur ve bağlantıları dinler. |
| ClientHandler | İstemciden gelen istekleri işler. |
| PageProvider | Sayfa oluşturma işlemi için arayüz tanımlar. |
| HtmlPageBuilder | HTML sayfasını oluşturur. |
| HttpResponseWriter | HTTP yanıtını istemciye gönderir. |

## Projenin Çalıştırılması

1. Bilgisayarda Java 21 veya uyumlu bir JDK bulunmalıdır.
2. Proje GitHub üzerinden klonlanmalıdır:

```bash
git clone https://github.com/nilsuguven/JavaSocketWebServer.git
```

3. Proje IntelliJ IDEA ile açılmalıdır.
4. `Main.java` dosyası çalıştırılmalıdır.
5. Tarayıcı üzerinden aşağıdaki adrese gidilmelidir:

```text
http://localhost:1989
```

## SOLID Prensipleri

Projede nesne yönelimli tasarım prensiplerinden yararlanılmıştır.

- **Single Responsibility Principle (SRP):** Sınıflar farklı sorumluluklara ayrılarak her sınıfın belirli bir görevi olması sağlanmıştır.
- **Dependency Inversion Principle (DIP):** ClientHandler sınıfı doğrudan somut bir sayfa oluşturma sınıfına değil, PageProvider arayüzüne bağımlı olacak şekilde tasarlanmıştır.

## Geliştirici

**Nilsu Güven**

Yazılım Mühendisliği Öğrencisi

GitHub: [@nilsuguven](https://github.com/nilsuguven)