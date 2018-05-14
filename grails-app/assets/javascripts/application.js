// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better
// to create separate JavaScript files as needed.
//
//= require jquery-2.2.0.min
//= require bootstrap
//= require_tree .
//= require_self

if (typeof jQuery !== 'undefined') {
    (function ($) {
        $(document).ajaxStart(function () {
            $('#spinner').fadeIn();
        }).ajaxStop(function () {
            $('#spinner').fadeOut();
        });
    })(jQuery);
}

/* Toggle subnav for person filter */
function toggleSubnav(event) {
    $(event.currentTarget).find('.navbar-dropdown').fadeToggle('fast');
}

/* Show details on click */
var listItems = $('.list-item');
console.log(listItems);
listItems.each(function() {
    $(this).click(showDetails);
});

function showDetails() {
    $('#details').show();
}

/* Hide details */
$('#detailsHide').click(function() {
    $('#details').hide();
});