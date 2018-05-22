<li class="list-item ${activeEvent == event.id ? 'has-background-white-bis' : ''}">
    <a class="list-item-flex-container has-text-grey-dark" href="/event<exercise:listUrl person="${params.person}" event="${event.id}" />">
        <asset:image src="${event.person}.svg" alt="Avatar" class="list-image"/>
        <div class="list-content">
            <h3 class="list-heading has-text-primary">${event.description}</h3>
            <p class="list-description"><g:formatDate format="dd.MM.yyyy" date="${event.date}"/></p>
        </div>
    </a>

    <div class="list-actions">
        <a class="list-action icon" href="/event/edit/${event.id}">
            <i class="fa fa-pencil" aria-hidden="true"></i>
        </a>
        <a class="list-action icon" href="/event/delete/${event.id}">
            <g:form resource="${this.event}" method="DELETE">
                <input type="submit" value="&#xf1f8;" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
            </g:form>
        </a>
    </div>
</li>
