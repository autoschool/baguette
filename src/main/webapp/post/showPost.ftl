<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.Post" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="post">
<div class="row">
    <div class="col-md-12">
        <div class="page-header">
            <h2>${model.title}</h2>
        </div>
        <p>${model.body}</p>
    </div>
</div>
</@layout.layout>