function icVideoPopup(b, c) {
    $("#video-title").text(c),
        $("#youholder").html('<iframe width="100%" height="100%" src="' + b + '?autoplay=1" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>'),
        $(".icVideo-modal-overlay").fadeIn(),
        $(".icVideo-modal-overlay").addClass("active");
}
$(document).ready(function () {
    $("#videoclose,.icVideo-modal-overlay").click(function () {
        $(".icVideo-modal").click(function (b) {
            b.stopPropagation();
        }),
            $("#youholder").html(""),
            $("#video-title").text(""),
            $(".icVideo-modal-overlay").fadeOut(),
            $(".icVideo-modal-overlay").removeClass("active");
    });
}),
    $(document).ready(function () {
        setTimeout(function () {
            $(".banner").addClass("active");
        }, 3e3),
            $(".testmonial").slick({
                slidesToShow: 2,
                slidesToScroll: 1,
                autoplay: !0,
                autoplaySpeed: 3e3,
                arrows: !1,
                dots: !1,
                pauseOnHover: !0,
                responsive: [
                    { breakpoint: 768, settings: { slidesToShow: 1 } },
                    { breakpoint: 520, settings: { slidesToShow: 1 } },
                ],
            }),
            $(".smart_feature").slick({
                slidesToShow: 7,
                slidesToScroll: 1,
                autoplay: !0,
                autoplaySpeed: 2e3,
                arrows: !1,
                dots: !1,
                pauseOnHover: !0,
                responsive: [
                    { breakpoint: 768, settings: { slidesToShow: 2 } },
                    { breakpoint: 520, settings: { slidesToShow: 1 } },
                ],
            }),
            $(".logos").slick({
                slidesToShow: 7,
                slidesToScroll: 1,
                autoplay: !0,
                autoplaySpeed: 1e3,
                arrows: !1,
                dots: !1,
                pauseOnHover: !0,
                responsive: [
                    { breakpoint: 768, settings: { slidesToShow: 1 } },
                    { breakpoint: 768, settings: { slidesToShow: 3 } },
                ],
            }),
            $(".blog").slick({
                slidesToShow: 2,
                slidesToScroll: 2,
                autoplay: !0,
                autoplaySpeed: 3500,
                arrows: !1,
                dots: !0,
                pauseOnHover: !0,
                responsive: [
                    { breakpoint: 999, settings: { slidesToShow: 1, slidesToScroll: 1 } },
                    { breakpoint: 768, settings: { slidesToShow: 1, slidesToScroll: 1 } },
                ],
            });
    });
var a = 0;
$(window).scroll(function () {
    var b = $("#counter").offset().top - window.innerHeight;
    0 == a &&
        $(window).scrollTop() > b &&
        ($(".counter-value").each(function () {
            var b = $(this),
                c = b.attr("data-count");
            $({ countNum: b.text() }).animate(
                { countNum: c },
                {
                    duration: 4e3,
                    easing: "swing",
                    step: function () {
                        b.text(Math.floor(this.countNum));
                    },
                    complete: function () {
                        b.text(this.countNum);
                    },
                }
            );
        }),
        (a = 1));
});
var figure = $(".video").hover(hoverVideo, hideVideo);
function hoverVideo(b) {
    $("video", this).get(0).play();
}
function hideVideo(b) {
    $("video", this).get(0).pause();
}
$(".menu-btn").click(function () {
    $(".akira_menu").toggleClass("active");
});
const video = document.getElementById("video"),
    circlePlayButton = document.getElementById("circle-play-b");
function togglePlay() {
    video.paused || video.ended ? video.play() : video.pause();
}
circlePlayButton.addEventListener("click", togglePlay),
    video.addEventListener("playing", function () {
        circlePlayButton.style.opacity = 0;
    }),
    video.addEventListener("pause", function () {
        circlePlayButton.style.opacity = 1;
    });
