

var player;

function setup() {
    window.canvas = createCanvas(600,800);
    player = new Player(100, canvas.height / 2);
}


function draw(){
    background(135, 206, 250);
    player.update();
    player.show();
}

function changeBackground(color) {
    document.body.style.background = color;
 }

