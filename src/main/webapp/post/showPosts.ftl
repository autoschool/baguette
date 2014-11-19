<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.Post[]" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="posts">
<div class="row">
    <div class="col-md-12">
        <h2>Posts</h2>
        <#list model as post>
            <div class="panel panel-default">
                <div class="panel-body">
                    <a href="/post/${post.id}">${post.title}</a> at ${post.createdAt}<br/>
                </div>
            </div>
        </#list>
    </div>
</div>
</@layout.layout>
