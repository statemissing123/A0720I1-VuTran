$(document).ready(function() {
    $('#search').click(function(event) {
        let productName = $('#productName').val();
        $.post('product', {
            name : productName,
            action : "search"
        }, function(responseText) {
            // if (responseText == "Not Found") {
            //     $('#result').html(responseText);
            // } else {
            $('#result').html(responseText);
            // }

        });
    });
});