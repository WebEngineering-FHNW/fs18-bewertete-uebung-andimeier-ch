<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

<nav class="navbar is-primary">
  <div class="navbar-menu is-active">
    <div class="navbar-start">
      <div class="navbar-item">
        <i class="fa fa-lg fa-birthday-cake" aria-hidden="true"></i>
      </div>
      <div class="navbar-item has-dropdown" onclick="toggleSubnav(event)">
        <div href="" class="navbar-link">
          <i class="fa fa-lg fa-user" aria-hidden="true"></i>
        </div>
        <div class="navbar-dropdown dropdown-persons">
          <g:each var="person" in="${persons}">
            <a class="navbar-item" href="/event/list?person=${person}">
              <asset:image src="${person}.svg" alt="Avatar" class="dropdown-avatar" />
            </a>
          </g:each>
          <a href="/event/list" class="navbar-item">Alle</a>
        </div>
      </div>
    </div>

    <div class="navbar-end">
      <div class="navbar-item">
        <i class="fa fa-lg fa-plus" aria-hidden="true"></i>
      </div>
    </div>
  </div>
</nav>

<ul class="list">
  <g:render template="listItem" collection="${events}" />
</ul>

</body>
</html>