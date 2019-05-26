$(document).ready( function() {
    let now = new Date();
    let day = ("0" + now.getDate()).slice(-2);
    let month = ("0" + (now.getMonth() + 1)).slice(-2);

    let today = (day)+"-"+(month)+"-"+ now.getFullYear();
    $('#datePicker').val(today); 
    
    $('#datebtn').click(function(){
    	console.log($('#datePicker').val());
    	let urlPicofTheDay = "https://api.nasa.gov/planetary/apod?api_key=DrN3SHEPaSyW2jBPjDizBhV4ZR5NEK2p57o9swSp&date=" +($('#datePicker').val());
        //console.log(urlPicofTheDay);
        
    	$.ajax({
            url:urlPicofTheDay,
            dataType: "json",
            success:function (data) {
                console.log(data);
            	if (data.media_type=="image") {
            		$("#videoDiv").css("display", "none");
            		$("#imageframe").attr("src", data.url);
            	}
            	else {
            		$("#imageDiv").css("display", "none");
            		$("#videoframe").attr("src", data.url);
            	}
            	$("#title").text(data.title);
            	$('#explanation').text(data.explanation);
            	
            	if("copyright" in data) {
            		$('#credit').text(data.copyright);
            	} else {
            		$('#credit').text("Public Domain");
            	}
                
            }
        });
    });
});