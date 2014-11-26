<#import "/layouts/main.ftl" as layout />
<@layout.layout title="Edit Post">
<div>
    <h1>
        Login
    </h1>

    <form action="/login" method="post">
        <div>
            <label for="input-name">Name</label>
            <input id="input-name" name="name" type="text"/>
        </div>
        <div>
            <label for="input-password">Password</label>
            <input id="input-password" name="password" type="password"/>
        </div>
        <div class="clearfix">
            <button class="primary pull-right" type="submit">Log in</button>
        </div>
    </form>
</div>
</@layout.layout>