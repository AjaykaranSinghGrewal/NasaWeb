$('#searchform').submit(function(event){
    event.preventDefault();
    var $searchfield = $('#inputText').val();
    var url = "https://images-api.nasa.gov/search?q=" +$searchfield+ "&media_type=image";
    
    $.ajax({
        url:url,
        dataType: "json",
        success:function (data) {
            //console.log(data);
            //console.log(data.collection.items[0].links[0].href);
        	//as there are 2 arrays in the path to the link for the image, we'll have to use $.each loop twice.
        	
            $.each(data.collection, function(key, value){
            	//console.log("key is " +key+ " & value is " +value);
            	//console.log("key is " +key+ " & value is " +JSON.stringify(value));
            	
                var imageHTML = '<div class="container">';
            	if(key=='items') {
            		$.each(value, function(key1, value1){
            			//console.log("key is " +key1+ " & value is " +JSON.stringify(value1));
            			//console.log(value1.links[0].href);
                        imageHTML += '<div class="col-lg-3 col-md-4 col-6">';
            	        imageHTML += '<a href="#" class="d-block mb-4 h-100">';
            			imageHTML += '<img class="img-fluid img-thumbnail" src="' +value1.links[0].href+ '"></a>';
            			imageHTML += '<button type="button" id="like" class="btn btn-primary btn-sm btn-block">Like</button> <button type="button" id="share" class="btn btn-secondary btn-sm btn-block">Share</button>'
                        imageHTML += '</div>';
            		});
                    imageHTML+='"</div>"';
                    $('#images').html(imageHTML);
            	}
            });
        }
    });
});
