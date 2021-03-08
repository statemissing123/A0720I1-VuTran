$(document).ready(function() {
    $('#search').click(function(event) {
        let customerName = $('#customerName').val();
        $.post('search', {
            name : customerName,
            action : "search"
        }, function(responseText) {
            $('#result').html(responseText);
        });
    });
});