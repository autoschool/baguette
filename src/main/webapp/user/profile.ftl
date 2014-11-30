<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.User" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="User Profile">
<div class="user-profile">
    <div class="user-avatar">
        <img src="/public/app/img/avatar-finn.png">
    </div>
    <h2 class="user-name">${model.getFullName()}</h2>
    <div>${model.getEmail()!""}</div>
    <#if model.getWebsite()?has_content>
        <div><a href="${model.getWebsite()}">${model.getWebsite()}</a></div>
    </#if>
</div>
</@layout.layout>
