<#-- @ftlvariable name="model" type="ru.qatools.school.baguette.models.Post" -->
<#import "/layouts/main.ftl" as layout />
<@layout.layout title="${model.title}">
<div>
    <h1>${model.title}</h1>
    <span>${model.createdAt}</span>

    <div>
        ${model.body}
    </div>
</div>
</@layout.layout>
