function setTimeOffset() {
    var canvas = document.createElement('canvas');
    canvas.width = 32;
    canvas.height = 32;
    var ctx = canvas.getContext('2d');

    ctx.fillStyle = 'transparent';
    ctx.fillRect(0, 0, canvas.width, canvas.height);

    ctx.font = '20px serif';
    ctx.fillStyle = '#000000';
    var time = new Date().getSeconds().toString();
    ctx.fillText(time, 0, 20);

    var link = document.querySelector("link[rel*='icon']") || document.createElement('link');
    link.type = 'image/x-icon';
    link.rel = 'shortcut icon';
    link.href = canvas.toDataURL("image/x-icon");

    document.getElementsByTagName('head')[0].appendChild(link);
    setInterval(setTimeOffset, 1000);
    console.log("favicon");
}

function calculateTimeOfsset(time) {
    time = new Date().getTimezoneOffset() * -1;
    $("#timeForm\\:timeOffset").val(calculateTimeOfsset(time));
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
