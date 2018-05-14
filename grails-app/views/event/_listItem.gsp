<li class="list-item ${activeEvent == ev.id ? 'has-background-white-bis' : ''}">
  <a class="has-text-grey-dark" href="/event/list?event=${ev.id}">
    <asset:image src="${ev.person}.svg" alt="Avatar" class="list-image" />
    <div class="list-content">
      <h3 class="list-header has-text-primary">${ev.description}</h3>
      <p class="list-description"><g:formatDate format="dd.MM.yyyy" date="${ev.date}" /></p>
    </div>
  </a>
</li>
