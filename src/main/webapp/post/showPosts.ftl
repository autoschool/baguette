<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.Post[]" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="posts">
<div>
    <h1>All posts</h1>

    <#if !model?has_content>
        <p>Nothing here yet.</p>
    </#if>
    <#list model as post>
        <div>
            <span>${post.createdAt}</span>
            <a href="/post/${post.id}">${post.title}</a>
        </div>
    </#list>
</div>
</@layout.layout>
