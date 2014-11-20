<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.Post" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="${model.title}">
<div class="post-single">
    <span class="post-edit">
        <form class="delete-post-form" action="/post/delete/${model.id}" method="post">
            <button class="link danger" type="submit">Delete</button>
        </form>
        <a class="action" href="/post/edit/${model.id}">Edit</a>
    </span>
    <h1>${model.title}</h1>
    <span>${model.createdAt}</span>

    <div>
        ${model.body}
    </div>
</div>
</@layout.layout>
