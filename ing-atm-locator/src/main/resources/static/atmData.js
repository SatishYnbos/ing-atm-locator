$(document).ready(function() {
	var table = $('#locationForATM').DataTable({
		"sAjaxSource": "/atmLocations",
		"sAjaxDataProp": "",
		error: fetchDataFailed,
		"aoColumns": [
			{ "mData": "address.street" },
			{ "mData": "address.housenumber" },
			{ "mData": "address.postalcode" },
			{ "mData": "address.city" },
			{ "mData": "address.geoLocation.lat" },
			{ "mData": "address.geoLocation.lng" },
			{ "mData": "distance" },

			{
				"mData": "openingHours", render: function(mData, type, row) {
					return openingHours(mData);
				}
			},
			{ "mData": "functionality" },
			{ "mData": "type" }
		]
	})
});

function openingHours(mData) {
	var txt = '';
	mData.forEach(function(item) {
		if (txt.length > 0) {
			txt += ', '
		}
		let hours = item.hours[0];
		var from = '';
		var to = '';
		var time = '';
		if (hours !== undefined) {
			from = hours.hourFrom;
			to = hours.hourTo;
			time = 'Time:' + from + '-' + to;
		}
		txt += 'Day Of Week: ' + item.dayOfWeek + '.' + time;
	});
	return txt;
}

function fetchDataFailed(result) {
    alert(result.status + ' ' + result.statusText);
}
