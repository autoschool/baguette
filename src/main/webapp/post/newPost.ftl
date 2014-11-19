<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.Post[]" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="new post">
<div>
    <h1>Create new post</h1>

    <form action="/post" method="post">
        <div>
            <label>Title:</label>
            <input name="title" type="text" placeholder="Title">
        </div>
        <div>
            <textarea name="body" rows="10" placeholder="Post Text"></textarea>
        </div>
        <div>
            <button type="submit">Save</button>
        </div>
    </form>
</div>
</@layout.layout>
