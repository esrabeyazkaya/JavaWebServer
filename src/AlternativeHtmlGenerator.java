
public class AlternativeHtmlGenerator implements HtmlProvider {

    @Override
    public String generate() {

        return """
                <!DOCTYPE html>
                <html lang="tr">
                <head>
                    <meta charset="UTF-8">
                    <title>Esra Beyazkaya</title>
                    <style>
                        body {
                            background-color: #fce7f3;
                            font-family: Arial, sans-serif;
                            text-align: center;
                            padding: 80px;
                        }

                        h1 {
                            color: #be185d;
                        }

                        h2 {
                            color: #9333ea;
                        }

                        p {
                            color: #475569;
                            font-size: 18px;
                        }
                    </style>
                </head>
                <body>
                    <h1>Esra Beyazkaya</h1>
                    <h2>1250505070</h2>
                    <p>Yazilim Mühendisliği öğrencisiyim.</p>
                </body>
                </html>
                """;
    }
}
