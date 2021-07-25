var xhr = null;

function getXMLHttpRequest() {
	if (window.ActiveXObject) {
		try {
			xhr = ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			xhr = ActiveXObject("Microsoft.XMLHTTP");
		}
		console.log("ActiveXObject : " + xhr);
	} else if (window.XMLHttpRequest) {
		xhr = new window.XMLHttpRequest();
		console.log("window.XMLHttpRequest : " + xhr);
	} else {
		xhr = new XMLHttpRequest();
		console.log("XMLHttpRequest : " + xhr);
	}
}

function sendRequest(url, param, callback, method) {
	getXMLHttpRequest();
	method = (method.toLowerCase() === 'get') ? 'GET' : 'POST';
	param = (param === null || param === '') ? null : param;
	if (method === 'GET' && param != null) {
		url = url + '?' + param;
	}
	xhr.onreadystatechange = callback;
	xhr.open(method, url, true);
	xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	xhr.send(method === 'POST' ? param : null);
}