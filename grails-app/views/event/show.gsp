<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <title>Event gespeichert</title>
</head>
<body>

<exercise:navbar>
    <div class="navbar-start">
        <g:link class="navbar-item" action="index" resource="${this.event}">
            <i class="fa fa-lg fa-chevron-left" aria-hidden="true"></i>
        </g:link>
    </div>
</exercise:navbar>

<main class="section">
    <div class="container">
        <h1 class="title">Der Event wurde gespeichert</h1>

        <g:if test="${flash.message}">
            <div class="notification is-success" role="status">${flash.message}</div>
        </g:if>

        <div class="content">
            <f:display bean="event" />
        </div>

        <g:form resource="${this.event}" method="DELETE">
            <div class="level">
                <div class="level-left">
                    <div class="level-item">
                        <g:link class="button is-primary" action="index" resource="">zur Übersicht</g:link>
                    </div>
                </div>

                <div class="level-right">
                    <div class="level-item">
                        <g:link class="button is-secondary" action="edit" resource="${this.event}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
                    </div>
                    <div class="level-item">
                        <input class="button is-light" type="submit" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
                    </div>
                </div>
            </div>
        </g:form>
    </div>
</main>

</body>
</html>
