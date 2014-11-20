<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.Post" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="Edit Post">
<div>
    <h1>
        <#if model.isNew()>Add new<#else>Edit</#if> post
    </h1>

    <form action="/post<#if !model.isNew()>/edit/${model.id}</#if>" method="post">
        <div>
            <label for="input-post-title">Title</label>
            <input id="input-post-title" name="title" type="text" value="${model.title!""}">
        </div>
        <div>
            <label for="textarea-post-body">Body</label>
            <textarea id="textarea-post-body" name="body" rows="10" placeholder="">${model.body!""}</textarea>
        </div>
        <div class="clearfix">
            <button class="primary pull-right" type="submit">Save</button>
        </div>
    </form>
</div>
</@layout.layout>
