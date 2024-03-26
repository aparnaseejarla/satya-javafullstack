


	$(document).ready(function(){
	    $('.carousel_se_02_carousel').owlCarousel({
	        items: 1,
	        nav: true,
	        loop :true,
	        mouseDrag: true,
	        responsiveClass: true,
          	autoplay: true,
	        autoplayTimeout: 3000,
	        navText : ["<i class='fas fa-arrow-left'></i>","<i class='fas fa-arrow-right'></i>"],
	        responsive: {
	            0:{
	              items: 1
	            },
	            480:{
	              items: 1
	            },
	            767:{
	              items: 1
	            },
	            992:{
	              items: 1
	            },
               768:{
	              items: 2
	            },
	            1200:{
	              items: 1
	            }
	        }
	    });
	});  


	$(document).ready(function(){
	    $('.carousel_se_03_carousel').owlCarousel({
	        items: 4,
	        nav: true,
	        dots: false,
	        loop :true,
	       
	        mouseDrag: true,
	        responsiveClass: true,
	        autoplay: true,
	        autoplayTimeout: 3000,
	        autoplayHoverPause: true,
	        navText : ["<i class='fas fa-arrow-left'></i>","<i class='fas fa-arrow-right'></i>"],
	        responsive: {
	            0:{
	              items: 1
	            },
	            480:{
	              items: 1
	            },
	            767:{
	              items: 1
	            },
	            992:{
	              items: 3
	            },
	            1200:{
	              items: 4
	            }
	        }
	    });
	});  


	



	  

/*
})(jQuery); */
