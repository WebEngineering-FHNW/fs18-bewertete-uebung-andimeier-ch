<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>

<body>

<div class="columns list-screen">

    %{--Events index--}%
    <div class="column is-half">
        <exercise:navbar>
            <div class="navbar-start">
                <div class="navbar-item has-dropdown" onclick="toggleSubnav(event)">
                    <div href="" class="navbar-link">
                        <i class="fa fa-lg fa-user" aria-hidden="true"></i>
                    </div>

                    <div class="navbar-dropdown dropdown-persons">
                        <g:each var="person" in="${persons}">
                            <a class="navbar-item" href="/event?person=${person.id}">
                                <asset:image src="${person}.svg" alt="Avatar" class="dropdown-avatar"/>
                            </a>
                        </g:each>
                        <a href="/event" class="navbar-item">Alle</a>
                    </div>
                </div>
            </div>

            <div class="navbar-end">
                <a href="/event/create" class="navbar-item" title="Ereinis hinzufügen">
                    <i class="fa fa-lg fa-plus" aria-hidden="true"></i>
                </a>
            </div>
        </exercise:navbar>

        <ul class="list">
            <g:render template="listItem" var="event" collection="${events}" model="[activeEvent: activeEvent]"/>
        </ul>
    </div>

    %{--Details panel--}%
    <div id="details" class="column is-half ${activeEvent != 0 ? 'is-active' : ''}">
        <button id="detailsHide" class="delete is-inline-block-mobile"></button>

        <g:if test="${flash.message}">
            <div class="notification is-info" role="status">${flash.message}</div>
        </g:if>

        <div class="is-centered">
            <p class="has-text-centered">
                Du musst noch<br>
                <span class="is-size-1">${remainingDays}</span><br>
                mal schlafen<br>
                bis ${eventTitle}
            </p>
        </div>
    </div>

</div>

</body>
</html>