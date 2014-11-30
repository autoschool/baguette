<#macro layout title="">
<!DOCTYPE html>
<html>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1">
    <title>
        <#if title?has_content>
            ${title} &mdash;
        </#if>
        Baguette
    </title>

    <link rel="stylesheet" href="/public/vendor/css/normalize.css">
    <link rel="stylesheet" href="/public/app/css/main.css">
</html>
<body>
    <div class="page-container">
        <header class="page-header">
            <h3 class="page-title">
                <a href="/">%Username</a>
            </h3>
            <ul class="nav">
                <li><a href="/post/all">All posts</a></li>
                <li><a class="action" href="/post/new">New post</a></li>
                <li><a class="action" href="/user/edit">Edit Profile</a></li>
            </ul>
        </header>
        <main>
            <#nested />
        </main>
        <footer>
            Powered by <a href="https://github.com/autoschool/baguette">Baguette</a> &ndash; Delicious blog platform
        </footer>
    </div>
</body>
</#macro>
