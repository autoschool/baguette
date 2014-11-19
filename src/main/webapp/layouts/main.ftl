<#macro layout title="baguette">
<html>
    <script src="/public/jquery/js/jquery.min.js" type="text/javascript"></script>
    <link href="/public/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <script src="/public/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>

    <link href="/public/app/css/main.css" type="text/css" rel="stylesheet"/>

    <title>${title}</title>
</html>
<body>
    <header>
        <nav class="navbar navbar-logo">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <h1>
                            <a class="logo" href="\">Baguette</a>
                        </h1>
                    </div>
                </div>
            </div>
        </nav>
        <nav class="navbar navbar-menu" role="navigation">
            <div class="container">
                <ul class="nav navbar-nav">
                    <li><a class="navbar-link" href="/post/all">Posts</a></li>
                </ul>
                <form class="navbar-form navbar-left" method="GET" action="/post/new">
                    <button type="submit" class="btn btn-default">Create</button>
                </form>
            </div>
        </nav>
    </header>
    <div class="content">
        <div class="container">
            <#nested />
        </div>
    </div>
</body>
</#macro>