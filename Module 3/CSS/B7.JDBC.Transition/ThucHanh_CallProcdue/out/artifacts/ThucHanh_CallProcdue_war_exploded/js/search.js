$(document).ready(function () {
    $('#search').click(function (event) {
        let nameSearch = $('#nameSearch').val();
        $.post('users', {
            nameSearch : nameSearch,
            action : 'search'
        }, function (responseText) {
            $('#result').html(responseText);
        });
    });
});