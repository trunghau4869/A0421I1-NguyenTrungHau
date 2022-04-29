// let sum: number = 0;
function fibonacci(number: number): number {
    if (number < 0) {
        return -1;
    } else if (number == 0 || number == 1) {
        return number;
    } else {
        console.log("day la day fibonacci:"+number);
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}

console.log(fibonacci(10));