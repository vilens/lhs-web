$(function () {

    $('.product-panel .intro .title,.product-panel .intro .author').dotdotdot({
        ellipsis :'... '
    });

    $('.icon-prev,.icon-next').click(function () {
        window.location.reload();
    })

})