<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.Post[]" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="All Posts">
<div>
    <h1>All posts</h1>

    <div class="page-content">
        <#if !model?has_content>
            <p>Nothing here yet.</p>
        </#if>
        <#list model as post>
            <div class="post-item">
                <span class="post-date">${post.createdAt?string("MMMM dd, yyyy")}</span>
                <a href="/post/${post.id}">${post.title}</a>
            </div>
        </#list>
    </div>
</div>
</@layout.layout>
