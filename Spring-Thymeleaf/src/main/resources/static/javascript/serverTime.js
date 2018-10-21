$(document).ready(function () {
    $.ajax({
        type: 'GET',
        cache: false,
        url: location.href,
        complete: function (req, textStatus) {
            var dateString = req.getResponseHeader('Date');
            if (dateString.indexOf('GMT') === -1) {
                dateString += ' GMT';
            }
            var date = new Date(dateString);
            $('#serverTime').text(date);
        }
    });
 });