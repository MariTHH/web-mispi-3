function checkHit(event) {
    let x = ((event.pageX - $('#graphic').offset().left - 15 - 150) / 30).toFixed(2);
    let y = ((event.pageY - $('#graphic').offset().top - 15 - 150) / -30).toFixed(2);

    PF("x-spinner").setValue(x);
    $('.y-input').val(y);
    $('#new_form\\:cordsInput').val("true");
    $('#new_form\\:hiddenButton').trigger('click');
}

function setClickOnBtn() {
    $('#new_form\\:cordsInput').val('false');
}

function updateRadius(event) {
    let r = event.target.value;
    if (r > 4 || r < 1)
        return;
    $("#graph-path").removeClass("hidden");
    let path = "M 150 " + (150-r*30) + " L 150 " + (150-r*15) + " L " + (150+r*30) + " " + (150-r*15) +
        " L " + (150+r*30) + " 150 L 150 150 L 150 " + (150+r*30) + " A " + (r*30) + " " + (r*30) +
        " 0 0 1 " + (150-r*30) + " 150 L 150 " + (150-r*30);
    $("#graph-path").attr("d", path);
}