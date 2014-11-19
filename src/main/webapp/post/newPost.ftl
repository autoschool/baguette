<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.Post[]" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="new post">
<div class="row">
    <div class="col-md-12">
        <h2>Create new post</h2>
        <form class="form" role="form" action="/post" method="post">
            <div class="page-header">
                <div class="form-group">
                    <input type="text" class="form-control" id="title" name="title" placeholder="Post Title">
                </div>
            </div>
            <div class="form-group">
                <textarea class="form-control" rows="10" name="body" placeholder="Post Text"></textarea>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <button type="submit" class="btn btn-info pull-right">Save</button>
                </div>
            </div>
        </form>
    </div>
</div>
</@layout.layout>