

var getStrParam = function(val) {
    var params = new Object();
    var datas = val.slice(val.indexOf('?')+1).split('&');
    $.each(datas, function(i) {
        var arr = datas[i].split('=');
        params[arr[0]] = arr[1];
    });
    return params;
}