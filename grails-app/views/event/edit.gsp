<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <title>Ereignis bearbeiten</title>
</head>
<body>

<exercise:navbar>
    <div class="navbar-start">
        <a class="navbar-item" href="/event" title="Zurück">
            <i class="fa fa-lg fa-chevron-left" aria-hidden="true"></i>
        </a>
    </div>
</exercise:navbar>

<main class="section">
    <div class="container">
        <h1 class="title">Ereignis bearbeiten</h1>

        <g:if test="${flash.message}">
            <div class="notification is-success" role="status">${flash.message}</div>
        </g:if>

        <g:hasErrors bean="${this.event}">
            <div class="notification is-danger">
                <ul class="errors" role="alert">
                    <g:eachError bean="${this.event}" var="error">
                    <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                    </g:eachError>
                </ul>
            </div>
        </g:hasErrors>

        <g:form resource="${this.event}" method="PUT">
            <g:hiddenField name="version" value="${this.event?.version}" />

            <f:all bean="event"/>

            <div class="field is-horizontal">
                <div class="field-label"></div>
                <div class="field-body">
                    <div class="field is-grouped">
                        <div class="control">
                            <g:submitButton name="create" class="button is-primary save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
                        </div>
                        <div class="control">
                            <a class="button is-secondary" href="/event">Abbrechen</a>
                        </div>
                    </div>
                </div>
            </div>
        </g:form>
    </div>
</main>

</body>
</html>
