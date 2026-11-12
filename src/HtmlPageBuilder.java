
public class HtmlPageBuilder implements PageProvider {

    public String buildPage() {
        return """
                <!DOCTYPE html>
                <html lang="tr">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Nilsu Güven | Portfolio</title>

                    <style>
                        * {
                            box-sizing: border-box;
                            scroll-behavior: smooth;
                        }

                        body {
                            margin: 0;
                            padding: 20px;
                            font-family: Arial, sans-serif;
                            background: #101827;
                            color: #f1f5f9;
                        }

                        .navbar {
                            max-width: 1100px;
                            margin: 0 auto;
                            padding: 20px 10px;
                            display: flex;
                            justify-content: space-between;
                            align-items: center;
                        }

                        .logo {
                            font-size: 22px;
                            font-weight: bold;
                            color: white;
                        }

                        .logo span {
                            color: #a78bfa;
                        }

                        .nav-links {
                            display: flex;
                            gap: 30px;
                        }

                        .nav-links a {
                            color: #cbd5e1;
                            text-decoration: none;
                            transition: color 0.3s;
                        }

                        .nav-links a:hover {
                            color: #a78bfa;
                        }

                        .container {
                            max-width: 1000px;
                            margin: 30px auto;
                            padding: 45px;
                            background: #1e293b;
                            border: 1px solid #334155;
                            border-radius: 20px;
                        }

                        .hero {
                            display: flex;
                            align-items: center;
                            min-height: 350px;
                            padding: 45px 10px;
                        }

                        .hero-content {
                            max-width: 700px;
                        }

                        .welcome {
                            color: #a78bfa;
                            font-size: 12px;
                            letter-spacing: 2px;
                            font-weight: bold;
                        }

                        .hero h1 {
                            font-size: 44px;
                            line-height: 1.2;
                            margin: 20px 0;
                        }

                        .hero h1 span {
                            color: #a78bfa;
                        }

                        .hero h2 {
                            color: #93c5fd;
                            font-size: 20px;
                            font-weight: normal;
                        }

                        p {
                            color: #cbd5e1;
                            font-size: 15px;
                            line-height: 1.8;
                        }

                        .hero p {
                            max-width: 550px;
                        }

                        .hero-button {
                            display: inline-block;
                            margin-top: 15px;
                            padding: 13px 25px;
                            background: linear-gradient(135deg, #6366f1, #a855f7);
                            color: white;
                            text-decoration: none;
                            border-radius: 8px;
                            font-weight: bold;
                        }

                        #about {
                            padding: 35px 10px;
                            scroll-margin-top: 25px;
                        }

                        #about h3 {
                            color: #a78bfa;
                            font-size: 25px;
                        }

                        .section {
                            padding: 45px 10px 25px;
                            scroll-margin-top: 25px;
                        }

                        .section-heading {
                            margin-bottom: 30px;
                        }

                        .section-label {
                            color: #a78bfa;
                            font-size: 12px;
                            font-weight: bold;
                            letter-spacing: 2px;
                        }

                        .section-heading h2 {
                            color: #f1f5f9;
                            font-size: 30px;
                            margin-bottom: 10px;
                        }

                        .section-heading p {
                            color: #94a3b8;
                        }

                        .skills-grid,
                        .projects-grid {
                            display: grid;
                            grid-template-columns: repeat(2, 1fr);
                            gap: 18px;
                        }

                        .skill-card,
                        .project-card {
                            padding: 25px;
                            background: #263449;
                            border: 1px solid #394b63;
                            border-radius: 14px;
                            transition: transform 0.3s, border-color 0.3s;
                        }

                        .skill-card:hover,
                        .project-card:hover {
                            transform: translateY(-5px);
                            border-color: #8b5cf6;
                        }

                        .skill-number {
                            color: #a78bfa;
                            font-size: 13px;
                            font-weight: bold;
                        }

                        .skill-card h3,
                        .project-card h3 {
                            color: #f1f5f9;
                            margin-bottom: 10px;
                        }

                        .skill-card p,
                        .project-card p {
                            color: #cbd5e1;
                            font-size: 14px;
                        }

                        .project-type {
                            color: #93c5fd;
                            font-size: 11px;
                            letter-spacing: 1px;
                        }

                        .project-tag {
                            display: inline-block;
                            margin: 8px 5px 0 0;
                            padding: 6px 12px;
                            background: #373064;
                            color: #c4b5fd;
                            border-radius: 20px;
                            font-size: 12px;
                        }

                        .project-link {
                            display: inline-block;
                            margin-top: 18px;
                            color: #93c5fd;
                            text-decoration: none;
                            font-size: 14px;
                            font-weight: bold;
                        }

                        .project-link:hover {
                            color: #c4b5fd;
                        }

                        .footer {
                            margin-top: 45px;
                            padding-top: 25px;
                            border-top: 1px solid #475569;
                            text-align: center;
                            color: #94a3b8;
                            font-size: 13px;
                        }

                        @media (max-width: 600px) {
                            body {
                                padding: 10px;
                            }

                            .container {
                                margin: 15px auto;
                                padding: 22px;
                            }

                            .navbar {
                                flex-direction: column;
                                gap: 18px;
                            }

                            .nav-links {
                                gap: 15px;
                                flex-wrap: wrap;
                                justify-content: center;
                            }

                            .hero {
                                min-height: auto;
                                padding: 35px 0;
                            }

                            .hero h1 {
                                font-size: 32px;
                            }

                            .skills-grid,
                            .projects-grid {
                                grid-template-columns: 1fr;
                            }
                        }
                    </style>
                </head>

                <body>

                    <nav class="navbar">
                        <div class="logo">Nilsu Güven<span>.</span></div>

                        <div class="nav-links">
                            <a href="#about">Hakkımda</a>
                            <a href="#skills">Yetenekler</a>
                            <a href="#projects">Projeler</a>
                        </div>
                    </nav>

                    <div class="container">

                        <section class="hero">
                            <div class="hero-content">
                                <span class="welcome">
                                    KİŞİSEL PORTFOLYOMA HOŞ GELDİN
                                </span>

                                <h1>Merhaba, ben <span>Nilsu Güven.</span></h1>

                                <h2>Yazılım Mühendisliği Öğrencisi</h2>

                                <p>Öğrenci No: 1250505069</p>

                                <p>
                                    Yazılım geliştirme, problem çözme ve yeni teknolojiler
                                    öğrenme tutkusu ile kendimi sürekli geliştiriyorum.
                                </p>

                                <a href="#about" class="hero-button">Beni Tanı</a>
                            </div>
                        </section>

                        <section id="about">
                            <h3>Hakkımda</h3>

                            <p>
                                Kırklareli Üniversitesi Yazılım Mühendisliği bölümünde
                                öğrenim görüyorum. Yazılım geliştirme alanında kendimi
                                geliştirmeye ve farklı teknolojiler öğrenmeye ilgi duyuyorum.
                            </p>

                            <p>
                                C ve Java programlama dilleri üzerine çalışmalar yapıyor;
                                nesne yönelimli programlama, algoritmalar ve web teknolojileri
                                alanlarında bilgi ve deneyim kazanıyorum.
                            </p>

                            <p>
                                Uygulamalı projeler geliştirerek problem çözme becerilerimi
                                ilerletmeyi, teknik bilgilerimi gerçek projelere aktarmayı
                                ve yazılım alanında kendimi sürekli geliştirmeyi hedefliyorum.
                            </p>
                        </section>

                        <section id="skills" class="section">
                            <div class="section-heading">
                                <span class="section-label">NELER ÖĞRENİYORUM?</span>
                                <h2>Teknik Yeteneklerim</h2>
                                <p>Yazılım alanında geliştirdiğim teknik bilgi ve beceriler.</p>
                            </div>

                            <div class="skills-grid">

                                <div class="skill-card">
                                    <span class="skill-number">01</span>
                                    <h3>C Programlama</h3>
                                    <p>Temel programlama, algoritmalar ve veri yapıları.</p>
                                </div>

                                <div class="skill-card">
                                    <span class="skill-number">02</span>
                                    <h3>Java</h3>
                                    <p>Nesne yönelimli programlama ve Java uygulamaları.</p>
                                </div>

                                <div class="skill-card">
                                    <span class="skill-number">03</span>
                                    <h3>OOP</h3>
                                    <p>Sınıflar, nesneler ve SOLID prensipleri.</p>
                                </div>

                                <div class="skill-card">
                                    <span class="skill-number">04</span>
                                    <h3>Web Teknolojileri</h3>
                                    <p>HTML, CSS ve Socket programlama temelleri.</p>
                                </div>

                            </div>
                        </section>

                        <section id="projects" class="section">
                            <div class="section-heading">
                                <span class="section-label">ÇALIŞMALARIM</span>
                                <h2>Projelerim</h2>
                                <p>Öğrenme sürecimde geliştirdiğim uygulamalar.</p>
                            </div>

                            <div class="projects-grid">

                                <div class="project-card">
                                    <span class="project-type">
                                        JAVA • SOCKET PROGRAMMING
                                    </span>
                                    <h3>Java Socket Web Server</h3>
                                    <p>
                                        Java Socket programlama kullanılarak geliştirilen,
                                        tarayıcıdan HTTP istekleri alan basit bir web sunucusu.
                                    </p>
                                    <span class="project-tag">Java</span>
                                    <span class="project-tag">OOP</span>
                                    <br>
                                    <a class="project-link"
                                       href="https://github.com/nilsuguven/JavaSocketWebServer"
                                       target="_blank">GitHub'da incele →</a>
                                </div>

                                <div class="project-card">
                                    <span class="project-type">
                                        JAVA • CYBERSECURITY
                                    </span>
                                    <h3>CyberSecuritySIEM</h3>
                                    <p>
                                        Güvenlik olaylarını takip etmek, filtrelemek ve
                                        önceliklendirmek amacıyla geliştirilen
                                        nesne yönelimli proje.
                                    </p>
                                    <span class="project-tag">Java</span>
                                    <span class="project-tag">SOLID</span>
                                    <br>
                                    <a class="project-link"
                                       href="https://github.com/nilsuguven/CyberSecuritySIEM"
                                       target="_blank">GitHub'da incele →</a>
                                </div>

                                <div class="project-card">
                                    <span class="project-type">
                                        JAVA • PDF GENERATION
                                    </span>
                                    <h3>Java PDF Resume Generator</h3>
                                    <p>
                                        Java ve PDFBox kullanılarak PDF formatında
                                        özgeçmiş oluşturan uygulama.
                                    </p>
                                    <span class="project-tag">Java</span>
                                    <span class="project-tag">PDFBox</span>
                                    <br>
                                    <a class="project-link"
                                       href="https://github.com/nilsuguven/JavaPdfResumeProject"
                                       target="_blank">GitHub'da incele →</a>
                                </div>

                                <div class="project-card">
                                    <span class="project-type">
                                        C • MEMORY REPRESENTATION
                                    </span>
                                    <h3>TinyTensor</h3>
                                    <p>
                                        FLOAT32, FLOAT16 ve INT8 veri türlerinin
                                        bellek boyutlarını inceleyen C projesi.
                                    </p>
                                    <span class="project-tag">C</span>
                                    <span class="project-tag">Memory</span>
                                    <br>
                                    <a class="project-link"
                                       href="https://github.com/nilsuguven/TinyTensor"
                                       target="_blank">GitHub'da incele →</a>
                                </div>

                            </div>
                        </section>

                        <div class="footer">
                            Designed and developed with Java
                            <br>
                            Nilsu Güven | 2026
                        </div>

                    </div>

                </body>
                </html>
                """;
    }
}
