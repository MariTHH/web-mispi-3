function setTimeOffset() {
    let offset = calculateTimeOfsset(new Date().getTimezoneOffset() * -1);
    $("#timeForm\\:timeOffset").val(offset);
}

function calculateTimeOfsset(time) {
    let hours = Math.abs(Math.floor(time / 60));
    let minutes = Math.abs(time % 60);

    if (hours < 10) {
        hours = '0' + hours;
    }

    if (minutes < 10) {
        minutes = '0' + minutes;
    }

    let sign = time < 0 ? '-' : '+';

    time = sign + hours + minutes;
    return time;
}