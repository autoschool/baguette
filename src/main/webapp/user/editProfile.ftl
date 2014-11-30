<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.User" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="Edit User Profile">
<div>
    <form action="/user/edit" method="post">
        <div class="user-avatar">
            <img src="/public/app/img/avatar-finn.png">
        </div>
        <div>
            <label for="input-full-name">Full Name</label>
            <input id="input-full-name" name="full-name" type="text" value="${model.getFullName()!""}"/>
        </div>
        <div>
            <label for="input-email">Email</label>
            <input id="input-email" name="email" type="text" value="${model.getEmail()!""}"/>
        </div>
        <div>
            <label for="input-website">Website</label>
            <input id="input-website" name="website" type="text" value="${model.getWebsite()!""}"/>
        </div>
        <div>
            <label for="input-password">Password</label>
            <input id="input-password" name="password" type="password" value=""/>
        </div>
        <div class="clearfix">
            <button class="primary pull-right" type="submit">Edit</button>
        </div>
    </form>
</div>
</@layout.layout>
