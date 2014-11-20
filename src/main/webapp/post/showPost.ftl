<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.Post" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="${model.title}">
<div class="post-single">
    <span class="post-edit"><a class="action" href="/post/edit">Edit</a></span>
    <h1>${model.title}</h1>
    <span>${model.createdAt}</span>

    <div>
        ${model.body}
    </div>
</div>
</@layout.layout>
