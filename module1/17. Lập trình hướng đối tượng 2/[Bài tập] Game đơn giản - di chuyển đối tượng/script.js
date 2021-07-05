/**
 * Created by nhatnk on 4/26/17.
 */

function Hero(image, top, left, size) {
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;

    this.getHeroElement = function () {
        return '<img width="' + this.size + '"' +
            ' height="' + this.size + '"' +
            ' src="' + this.image + '"' +
            ' style="top: ' + this.top + 'px; left:' + this.left + 'px;position:absolute;" />';
    }

    this.moveRight = function () {
        this.left += 100;
        console.log('ok: ' + this.left);
    }
    this.moveLeft = function () {
        this.left -= 100;
        console.log('ok: ' + this.left);
    }

}

var hero = new Hero('conan.jpg', 20, 30, 300);

function start() {
    if (hero.left < window.innerWidth - hero.size) {
        hero.moveRight();
    }
    if (hero.left > window.innerWidth - hero.size) {
        hero.moveLeft();
    }
    document.getElementById('game').innerHTML = hero.getHeroElement();
    setTimeout(start, 500)
}

start();