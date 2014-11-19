<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.Post[]" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="Add New Post">
<div>
    <h1>Add new post</h1>

    <form action="/post" method="post">
        <div>
            <label for="input-post-title">Title</label>
            <input id="input-post-title" name="title" type="text" value="">
        </div>
        <div>
            <label for="textarea-post-body">Body</label>
            <textarea id="textarea-post-body" name="body" rows="10" placeholder=""></textarea>
        </div>
        <div class="clearfix">
            <button class="primary pull-right" type="submit">Save</button>
        </div>
    </form>
</div>
</@layout.layout>
