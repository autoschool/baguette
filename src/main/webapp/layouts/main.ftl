<#macro layout title="baguette">
<!DOCTYPE html>
<html>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <title>${title}</title>

    <link rel="stylesheet" href="/public/vendor/css/normalize.css">
    <link rel="stylesheet" href="/public/app/css/main.css">
</html>
<body>
    <header>
        <h3>
            <a href="/">%Username</a>
        </h3>
        <ul class="nav">
            <li><a href="/post/all">All posts</a></li>
            <li><a href="#">About</a></li>
        </ul>
    </header>
    <main>
        <#nested />
    </main>
</body>
</#macro>
