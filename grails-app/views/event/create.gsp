<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <title>Neues Ereignis</title>
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
        <h1 class="title">Ereignis hinzufügen</h1>

        <g:form resource="${this.event}" method="POST">
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
